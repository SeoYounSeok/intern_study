package net.joins.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import net.joins.domain.entity.Post;
import net.joins.domain.repository.PostRepository;

@RequiredArgsConstructor
@Service
public class BlogService {

    final PostRepository postRepository;

    public void addPost(Post post) {
        postRepository.save(post);
    }

    public List<Post> getAll() {
        return postRepository.findAll();
    }

    public Post getById(Long postId) {
        return postRepository.findById(postId).orElseThrow(NullPointerException::new);
    }
}
