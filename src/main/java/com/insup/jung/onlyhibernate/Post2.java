package com.insup.jung.onlyhibernate;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post2 {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @Lob
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
}
