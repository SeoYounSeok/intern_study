package net.joins.site.controller;

import lombok.val;
import net.joins.web.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class IndexController {

    final BlogService blogService;

    @GetMapping
    public String index(Model model, String msg) {
        model.addAttribute("msg", msg);
        // index.html
        // webmvc 에 dispatch 과정
        model.addAttribute("title","YounSeok's blog");
        model.addAttribute("subtitle","Spring Boot + JPA + Hibernate");

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
        // @PathVariable("post") String post
        @GetMapping("/post")
        public String post(Model model) {
            val item = new HashMap<String, String>();

            item.put("title", "joins.net blog");
            item.put("subtitle", "Simple blog By springboot multi module");
            item.put("updated", "2021/01.05");

            String content = "<h1>POST HTML TEST</h1>";
            content += "<img class=\"img-fluid\" src=\"img/post-sample-image.jpg\" alt=\"\">";
            item.put("content", content);

            item.put("banner", "images/post-bg.jpg");

            model.addAttribute("item", item);
            return "post";
        }

}
