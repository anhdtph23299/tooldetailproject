package com.example.demo.core.user.model.response;

import com.example.demo.entity.FrameworkProject;
import com.example.demo.entity.IDE;
import com.example.demo.entity.IDEProject;
import com.example.demo.entity.Member;
import com.example.demo.entity.Project;
import com.example.demo.entity.ProjectMember;
import com.example.demo.entity.ToolProject;
import com.example.demo.entity.base.Status;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;
import java.util.List;

@Projection(types = {Project.class})
public interface UserFindProjectResponse {
    @Value("#{target.id}")
    @JsonIgnoreProperties(value = { "sensitiveInformation" }, allowGetters = true)
    String getId();
    @Value("#{target.projectName}")
    String getProjectName();
    @Value("#{target.startTime}")
    Date getStartTime();
    @Value("#{target.endTime}")
    Date getEndTime();
    @Value("#{target.status}")
    String getStatus();
    @Value("#{target.description}")
    String getDescription();
    @Value("#{target.listIdeProject}")
    List<IDEProject> getListIde();
    @Value("#{target.listToolProject}")
    List<ToolProject> getListTool();
    @Value("#{target.listFrameworkProject}")
    List<FrameworkProject> getListFramework();
    @Value("#{target.listProjectMember}")
    List<ProjectMember> getListMember();

}
