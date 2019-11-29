package com.example.webservicedemo2.controller;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class WSconfig {
    public void link(String city) throws IOException {
        //第一步：创建服务地址
        URL url = new URL("http://www.webxml.com.cn/WebServices/WeatherWebService.asmx?WSDL");
        //第二步：打开一个通向服务地址的连接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //第三步：设置参数
        //3.1发送方式设置：POST必须大写
        connection.setRequestMethod("POST");
        //3.2设置数据格式：content-type
        connection.setRequestProperty("content-type","application/soap+xml; charset=utf-8");
        connection.setRequestProperty("content-length","1024");
        //3.3设置输入输出，因为默认新创建的connection没有读写权限，
        connection.setDoInput(true);
        connection.setDoOutput(true);
        //第四步：组织SOAP数据，发送请求
        String soapXML = getXML(city);
        //将信息以流的方式发送出去
        OutputStream os = connection.getOutputStream();
        os.write(soapXML.getBytes());
//        os.write(soapXML.getBytes("UTF-8"));
        //第五步：接收服务端响应，打印
        int responseCode = connection.getResponseCode();
        System.out.println(responseCode);
        if(responseCode==200){//表示服务端响应成功
            //获取当前连接请求返回的数据流
            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            StringBuilder sb = new StringBuilder();
            String temp = null;
            while((temp=br.readLine())!=null){
                sb.append(temp);
            }

            System.out.println(sb.toString());

            is.close();
            isr.close();
            br.close();
        }
        os.close();


    }

    public String getXML(String city){
        String soapXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                +"<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">"
                +"<soap12:Body>"
                +"<getSupportCity xmlns=\"http://WebXml.com.cn/\">"
                +"<byProvinceName>"+city+"</byProvinceName>"
                +" </getSupportCity>"
                +" </soap12:Body>"
                +"</soap12:Envelope>";
        return soapXML;
    }
}
