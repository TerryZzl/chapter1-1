package com.kevin.eurekaribbonclient.controller;

import com.kevin.eurekaribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;


    @GetMapping("/hi")
    public String hi(@RequestParam(required = false,defaultValue = "kevin") String name){
        return ribbonService.hi(name);
    }

}
