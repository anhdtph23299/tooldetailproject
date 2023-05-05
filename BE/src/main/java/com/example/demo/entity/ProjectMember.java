package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @JoinColumn(name = "id_project",insertable = false,updatable = false)
    @JsonBackReference
    private Project project;
    @ManyToOne
    @JoinColumn(name = "id_member",insertable = false,updatable = false)
    @JsonBackReference
    private Member member;
    @ManyToOne
    @JoinColumn(name = "id_role",insertable = false,updatable = false)
    @JsonBackReference
    private Role role;
    private Date startJoin;
    private String task;


}
