package com.lion.sbbprac.answer;

import java.time.LocalDateTime;
import java.util.Set;

import com.lion.sbbprac.question.Question;

import com.lion.sbbprac.siteuser.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    private LocalDateTime modifyDate;

    @ManyToOne
    private Question question;

    @ManyToOne
    private SiteUser author;

    @ManyToMany
    private Set<SiteUser> voter;
}