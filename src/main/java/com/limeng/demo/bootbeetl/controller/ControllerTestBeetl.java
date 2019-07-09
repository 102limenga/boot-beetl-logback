package com.limeng.demo.bootbeetl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ControllerTestBeetl {

    private Logger logger = LoggerFactory.getLogger(ControllerTestBeetl.class);

    @RequestMapping("t")
    public String test4(HttpServletRequest req) {
        logger.info("测试{}日志","info");
        logger.debug("测试{}日志","debug");
        req.setAttribute("v"," This is a test ");
        return "testBeetl";
    }
}
