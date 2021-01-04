package net.joins.site.controller;

import lombok.val;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index(Model model, String msg) {
        model.addAttribute("msg", msg);
        // index.html
        // webmvc 에 dispatch 과정
        model.addAttribute("title","younseok's blog");
        model.addAttribute("subtitle","multimodule");

        val item = new HashMap<String, String>();
        item.put("title", "joins.net blog");
        item.put("subtitle", "Simple blog By springboot multi module");
        item.put("href", "post");
        item.put("updated", "2020/01/04");

        val itemList = new ArrayList<>();
        itemList.add(item);
        itemList.add(item);
        itemList.add(item);
        System.out.println(itemList);
        model.addAttribute("itemList",itemList);
        return "index";

        }
        @GetMapping("/post")
        public String post(Model model){

        val item = new HashMap<String, String>();
        item.put("title", "joins.net blog");
        item.put("subtitle", "Simple blog By springboot multi module");
        item.put("href", "post");

        item.put("updated", "2020/01/04");
        item.put("content", "");

        val info = new HashMap<String, String>();
        info.put("title", "joins.net blog");
        info.put("subtitle", "Simple blog By springboot multi module");
        model.addAttribute("info", info);
        model.addAttribute("banner", "images/post-bg.jpg");
        return "post";

        }

}
