package com.example.webservicedemo2;

import cn.com.webxml.WeatherWebServiceSoap;
import com.example.webservicedemo2.controller.WSconfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Webservicedemo2ApplicationTests {

    @Test
    public void contextLoads() throws MalformedURLException {
        URL url = new URL("http://www.webxml.com.cn/WebServices/WeatherWebService.asmx?WSDL");
        QName serviceName = new QName("http://WebXml.com.cn/","WeatherWebService");
        Service ws = Service.create(url, serviceName);
        WeatherWebServiceSoap port = ws.getPort(WeatherWebServiceSoap.class);
        cn.com.webxml.ArrayOfString city=port.getSupportCity("北京");
        System.out.println(city.getString());
    }
@Test
    public void contextLoads2() throws IOException {
        WSconfig config = new WSconfig();
        config.link("北京");
    }

}
