package com.insup.jung.onlyhibernate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> { //entity type, pk type

    Page<Post> findByTitleContains(String title, Pageable pageable);


}
