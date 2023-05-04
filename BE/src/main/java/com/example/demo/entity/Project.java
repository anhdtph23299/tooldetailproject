package com.example.demo.entity;

import com.example.demo.entity.base.PrimaryEntity;
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
public class Project extends PrimaryEntity implements Serializable {
    private String projectName;
    private String status;
    private Date startTime;
    private Date endTime;
    private Byte[] images;
    private String description;
    @OneToMany(mappedBy = "project")
    private List<FrameworkProject> listFrameworkProject;
    @OneToMany(mappedBy = "project")
    private List<IDEProject> listIdeProjects;
    @OneToMany(mappedBy = "project")
    private List<ProjectMember> listProjectMember;
    @OneToMany(mappedBy = "project")
    private List<ToolProject> listToolProject;

}
