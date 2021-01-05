package net.joins.domain.repository;

import net.joins.domain.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // 첫번째 인자인, POST 형으로 주고 받는 것
    // 두번째 인자인, PK = LONG
}
