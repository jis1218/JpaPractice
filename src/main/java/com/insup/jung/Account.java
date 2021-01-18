package com.insup.jung;

import javax.persistence.*;
import java.util.Date;

@Entity //Account table에 매핑, entity의 이름과 table이 매핑이 됨
public class Account {

    @Id
    @GeneratedValue //자동으로 생성됨
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    //@Column 어노테이션 생략되어있음
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date = new Date();

    @Transient
    private String yes;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
