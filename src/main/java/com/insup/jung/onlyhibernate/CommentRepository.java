package com.insup.jung.onlyhibernate;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;
import java.util.Optional;

@RepositoryDefinition(domainClass = Comment.class, idClass = Long.class)
public interface CommentRepository {
    Comment save(Comment comment);

    List<Comment> findAll();

    Optional<Comment> findByComment(String comment);

    //List<Comment> findByTitleContains(String keyword); //메서드 이름을 분석해서 쿼리를 만들어줌

    @Query("SELECT c FROM Comment AS c")
    List<Comment> selectQuery(String keyword);
}
