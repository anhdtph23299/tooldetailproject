package com.example.demo.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class ProjectMemberId implements Serializable {
    @JoinColumn(name = "IDProject")
    private Long idProject;
    @JoinColumn(name = "IDMember")
    private Long idMember;
    @JoinColumn(name = "IDRole")
    private Long idRole;

}
