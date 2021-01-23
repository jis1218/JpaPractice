package com.insup.jung.onlyhibernate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Post2Repository extends JpaRepository<Post2, Long>, PostCustomRepository {
}
