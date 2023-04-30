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
@Table(name = "ProjectMember")
public class ProjectMember implements Serializable {
    @EmbeddedId
    private ProjectMemberId projectMemberId;
    @ManyToOne
    @JoinColumn(name = "IDProject")
    private Project project;
    @ManyToOne
    @JoinColumn(name = "IDMember")
    private Member member;
    @ManyToOne
    @JoinColumn(name = "IDRole")
    private Role role;
    @Column(name = "StartJoin")
    private Date startJoin;
    private String task;


}
