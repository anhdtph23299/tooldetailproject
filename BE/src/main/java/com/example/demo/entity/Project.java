package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Project")
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProject;
    @Column(name = "ProjectName")
    private String projectName;
    private String status;
    private Date startTime;
    private Date endTime;
    private Byte[] images;
    private String description;
    @OneToMany(mappedBy = "project")
    private List<FrameworkProject> frameworkProjects;
    @OneToMany(mappedBy = "project")
    private List<IDEProject> listIdeProjects;
    @OneToMany(mappedBy = "project")
    private List<ProjectMember> listProjectMember;
    @OneToMany(mappedBy = "project")
    private List<ToolProject> listToolProject;

}
