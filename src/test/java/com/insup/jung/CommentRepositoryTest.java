package com.insup.jung;

import com.insup.jung.onlyhibernate.Comment;
import com.insup.jung.onlyhibernate.CommentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CommentRepositoryTest {

    @Autowired
    CommentRepository commentRepository;

    @Test
    public void crud(){
        Comment comment = new Comment();
        comment.setComment("Hello Comment");
        commentRepository.save(comment);

        assertThat(commentRepository.findByComment("Hello Comment").get().getId()).isEqualTo(1L);


    }
}
