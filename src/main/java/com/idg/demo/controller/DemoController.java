package com.idg.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.idg.common.DemoBean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yehao on 16/7/15.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoBean demo;

    @RequestMapping("/json")
    public Map<String, Object> json() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("hello", "spring4");
        return model;
    }

    @RequestMapping("/index")
    public ModelAndView index() {
        System.out.println(demo.encrypt());
        return new ModelAndView("index");
    }
}
