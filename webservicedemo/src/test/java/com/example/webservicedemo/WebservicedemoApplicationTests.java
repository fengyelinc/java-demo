package com.example.webservicedemo;

import cn.com.webxml.WeatherWebServiceSoap;
import com.example.webservicedemo.controller.WSconfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebservicedemoApplicationTests {

    @Test
    public void contextLoads() throws MalformedURLException {
        URL url = new URL("http://www.webxml.com.cn/WebServices/WeatherWebService.asmx?WSDL");
        QName serviceName = new QName("http://WebXml.com.cn/","WeatherWebService");
        Service ws = Service.create(url, serviceName);
        WeatherWebServiceSoap port = ws.getPort(WeatherWebServiceSoap.class);
        cn.com.webxml.ArrayOfString city = port.getSupportCity("江苏");
        System.out.println(city.getString());


    }

    @Test
    public void contextLoads2() throws IOException {
        WSconfig ws = new WSconfig();
        ws.link("北京");

    }

}
