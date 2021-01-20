package com.insup.jung;

import com.insup.jung.onlyhibernate.Post;
import com.insup.jung.onlyhibernate.PostRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class PostRepositoryTest {
    @Autowired
    PostRepository postRepository;

    @Test
    @Rollback(false)
    public void crudRepository(){
        //Given
        Post post = new Post();
        post.setTitle("hello insup handsome guy");
        assertThat(post.getId()).isNull();

        //When
        Post newPost = postRepository.save(post);

        //Then
        assertThat(newPost.getId()).isNotNull();

        //When
        List<Post> posts = postRepository.findAll();
        assertThat(posts.size()).isEqualTo(2);
        assertThat(posts).contains(newPost);

        //When
        Page<Post> page = postRepository.findAll(PageRequest.of(0, 10));
    }
}
