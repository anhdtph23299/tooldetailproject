package com.example.demo.core.user.model.response;

import com.example.demo.entity.IDE;
import com.example.demo.entity.Member;
import com.example.demo.entity.Project;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;
import java.util.List;

@Projection(types = {Project.class})
public interface UserFindProjectResponse {
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

    @Value("#{target.listIdeProjects}")
    List<IDE> getListIde();

    @Value("#{target.listToolProject}")
    List<IDE> getListTool();

    @Value("#{target.listFrameworkProject}")
    List<Member> getListFramework();
    @Value("#{target.listProjectMember}")
    List<Member> getListMember();
}
