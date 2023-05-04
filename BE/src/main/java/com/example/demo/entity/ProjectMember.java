package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Date;
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "projectmember")
public class ProjectMember implements Serializable {
    @EmbeddedId
    private ProjectMemberId projectMemberId;
    @ManyToOne
    @JoinColumn(name = "idProject",insertable = false,updatable = false)
    private Project project;
    @ManyToOne
    @JoinColumn(name = "idMember",insertable = false,updatable = false)
    private Member member;
    @ManyToOne
    @JoinColumn(name = "idRole",insertable = false,updatable = false)
    private Role role;
    private Date startJoin;
    private String task;


}
