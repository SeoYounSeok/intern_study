package net.joins.site.controller;

import lombok.val;
import net.joins.domain.entity.Post;
import net.joins.web.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
            // 이거는 하드 코딩
            val item = new HashMap<String, String>();
            item.put("title", "joins.net blog");
            item.put("subtitle", "Simple blog By springboot multi module");
            item.put("updated", "2021/01.05");
            String contents = "<h1>POST HTML TEST</h1>";
            contents += "<img class=\"img-fluid\" src=\"img/post-sample-image.jpg\" alt=\"\">";
            item.put("content", contents);
            item.put("banner", "images/post-bg.jpg");

            model.addAttribute("item", item);

            Post post = new Post();
            post.setTitle("joins.net blog");
            post.setSubtitle("Simple blog By springboot multi module");
            post.setHref("post");
            post.setBanner("images/post-bg.jpg");

            String content = "<p>Never in all their history have men been able truly to conceive of the world as one: a single sphere, a globe, having the qualities of a globe, a round earth in which all the directions eventually meet, in which there is no center because every point, or none, is center — an equal earth which all men occupy as equals. The airman's earth, if free men make it, will be truly round: a globe in practice, not in theory.</p>";
            content += "<h2 class=\"section-heading\">The Final Frontier</h2>";
            content += "<img class=\"img-fluid\" src=\"img/post-sample-image.jpg\">";
            post.setContent(content);

            blogService.addPost(post);
            blogService.addPost(post);
            // Post List 들어온다.
            List<Post> list = blogService.getAll();
            System.out.println(list);
            return "post";
        }

}
