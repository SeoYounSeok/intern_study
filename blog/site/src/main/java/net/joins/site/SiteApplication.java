package net.joins.site;

import net.joins.domain.entity.Post;
import net.joins.web.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "net.joins")
public class SiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SiteApplication.class, args);
        System.out.println("=====================");
        System.out.println("Applcation is starting");
        System.out.println("=====================");
        Post post = new Post();

    }

    @Autowired
    BlogService blogService;

    //@Override
    // public void run(String... args) throws Exception {
    //     Post post = new Post();
    //     post.setTitle("joins.net blog");
    //     post.setSubtitle("Simple blog By springboot multi module");
    //     post.setHref("post");
    //     post.setBanner("images/post-bg.jpg");

    //     String content = "<p>Never in all their history have men been able truly to conceive of the world as one: a single sphere, a globe, having the qualities of a globe, a round earth in which all the directions eventually meet, in which there is no center because every point, or none, is center — an equal earth which all men occupy as equals. The airman's earth, if free men make it, will be truly round: a globe in practice, not in theory.</p>";
    //     content += "<h2 class=\"section-heading\">The Final Frontier</h2>";
    //     content += "<img class=\"img-fluid\" src=\"img/post-sample-image.jpg\">";
    //     post.setContent(content);

    //     blogService.addPost(post);

    //     List<Post> list = blogService.getAll();
    //     log.info("list {}", list.size());
    // }
}
