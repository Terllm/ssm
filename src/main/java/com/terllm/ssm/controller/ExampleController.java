package com.terllm.ssm.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController {

    Logger log = LoggerFactory.getLogger(ExampleController.class);


    @RequestMapping("hello")
    @ResponseBody
    public String example(){

        log.info("fghjk");

        return "hello world";

    }






}
