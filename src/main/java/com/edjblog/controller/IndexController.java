package com.edjblog.controller;

import com.edjblog.exception.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
//        int i = 9/0;
//        String blog = null;
//        if(blog == null){
//            throw new NotFoundException("博客找不到啦");
//        }
        String s = "111";
        System.out.println(s.length());
        System.out.println("===============");
        return "index";
    }
}
