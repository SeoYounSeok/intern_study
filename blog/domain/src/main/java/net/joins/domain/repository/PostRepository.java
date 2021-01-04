package net.joins.domain.repository;

import net.joins.domain.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // post 형을 주고 받는 것이고 pk는 long 형 인거야
}
