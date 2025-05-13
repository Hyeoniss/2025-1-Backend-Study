package com.example.todo_api.member;

import jakarta.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    public Long id;

    @Column(name = "member_email", columnDefinition = "varchar(30)")
    private String email;

    @JoinColumn(name = "member_password", columnDefinition = "varchar(30)")
    private String password;

    @JoinColumn(name = "member_name", columnDefinition = "varchar(10)")
    private String name;
}

