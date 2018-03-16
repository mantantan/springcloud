package yonyou.esn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yonyou.esn.service.TestService;

import java.util.List;

/**
 * Created by mantantan on 2018/2/2.
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private CounterService counterService;

    @Autowired
    GaugeService gaugeService;

    @RequestMapping("/test")
    public String test(){
        counterService.increment("yonyou.esn.openapi.test");
        gaugeService.submit("yonyou.esn.openapi.test1", 222);
        return "200ok";
    }

    @RequestMapping("/mantantan")
    public String mantantan(){
        counterService.increment("yonyou.esn.openapi.mantantan");
        return testService.getSomething();
    }

    @RequestMapping("/mantantan/test")
    public String testZuul(){
        return "testZuul";
    }
}
