package com.insup.jung.onlyhibernate;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity //Account table에 매핑, entity의 이름과 table이 매핑이 됨
public class Account {

    @Id
    @GeneratedValue //자동으로 생성됨
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    //@Column 어노테이션 생략되어있음
    private String password;

    @OneToMany
    private Set<Study> studies = new HashSet<>();

    public Set<Study> getStudies() {
        return studies;
    }

    public void setStudies(Set<Study> studies) {
        this.studies = studies;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getYes() {
        return yes;
    }

    public void setYes(String yes) {
        this.yes = yes;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Temporal(TemporalType.TIMESTAMP)
    private Date date = new Date();

    @Transient
    private String yes;

//    @Embedded
//    private Address homeAddress;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="street", column=@Column(name = "home_street"))
    })
    private Address address;

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
