package com.insup.jung.onlyhibernate;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class JPARunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager; //JPA의 핵심

    @Autowired
    PostRepository postRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        postRepository.findAll().forEach(System.out::println);
//        TypedQuery<Post> query = entityManager.createQuery("SELECT p FROM Post AS p", Post.class); //Post는 Entity 이름
//        List<Post> posts = query.getResultList();
//
//        //접근 시 무조건 가져옴
//        posts.forEach(a -> {
//            a.getComments().forEach(b -> System.out.println(b.getComment()));
//        });

        //posts.forEach(System.out::println);

        /*
        ** hibernate 방법
         */
//        Post post = new Post();
//
//        post.setTitle("첫번째 고고고고");
//
//        Comment comment1 = new Comment();
//        comment1.setComment("와우 진짜 잘했네요요");
//        post.addComment(comment1);
//
//        Comment comment2 = new Comment();
//        comment2.setComment("진짜에요 진짜 짱짱");
//        post.addComment(comment2);
//
//        Session session = entityManager.unwrap(Session.class);
//
//        session.save(post);
//        Post post2 = session.get(Post.class, 4l);
//        System.out.println("===================");
//        post2.getComments().forEach(a -> System.out.println(a.getComment()));
    }
}
