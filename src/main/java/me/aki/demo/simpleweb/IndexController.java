package me.aki.demo.simpleweb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author akis on 2020/1/16
 */
@RestController
@Slf4j
public class IndexController {

    @Value("${app.name:demo-web}")
    private String appName;


    @GetMapping("/index")
    public String index() {
        log.info("this is a info log, web site name is [{}]", appName);
        log.debug("this is a debug log, web site name is [{}]", appName);
        return String.format("web site name is [%s]", appName);
    }

    @GetMapping("/health")
    public String health() {
        log.debug("this is a debug log, request has hit /health");
        return "OK";
    }
}
