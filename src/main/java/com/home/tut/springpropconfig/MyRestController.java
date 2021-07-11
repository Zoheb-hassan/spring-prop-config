package com.home.tut.springpropconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MyRestController {

    @Value("${my.resp.message}")
    private String respMessage;

    @Value("${my.desc.message}")
    private String descMessage;

    @Value("${my.home}")
    private String myHome;

    @Value("${my.list.values}")
    private List<String> stringValues;

    @Value("#{${my.key.vals}}")
    private Map<String, String> kvValues;

    @Autowired
    private DbConfigBean dbConfigBean;

    @GetMapping("/hello-config-app")
    public String getHello(){
        return respMessage;
    }

    @GetMapping("/config-app-desc")
    public String getDescMessage() {
        return descMessage;
    }

    @GetMapping("/config-list-values")
    private List<String> getListVal(){
        return stringValues;
    }

    @GetMapping("/config-map-values")
    private Map<String, String> getKvPairs(){
        return kvValues;
    }

    @GetMapping("/get-db")
    private String getDbValues(){
        return dbConfigBean.toString();
    }

    @GetMapping("/get-home")
    private String getMyHomeVal(){
        return myHome;
    }
}
