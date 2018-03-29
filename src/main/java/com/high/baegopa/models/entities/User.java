package com.high.baegopa.models.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Created by high on 2017. 7. 2..
 */
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private String email;
    @Column
    private String name;

    @Column(name = "use_yn")
    private String useYn;
    @Column(name = "sns_use")
    private String snsUse;
    @Column(name = "recomended_use_yn")
    private String recomendedUseYn;

    @Column(name = "recomended_time")
    private Integer recomendedTime;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    public User(){}

    public User(String email, String name){
        this.email = email;
        this.name = name;
        this.useYn = "Y";
        this.snsUse = "N";
        this.recomendedUseYn = "Y";
        this.createdAt = Timestamp.valueOf(LocalDateTime.now());
    }

    public User(String email, String name, String snsUse){
        this.email = email;
        this.name = name;
        this.useYn = "Y";
        this.snsUse = snsUse;
        this.recomendedUseYn = "Y";
        this.createdAt = Timestamp.valueOf(LocalDateTime.now());
    }
}
