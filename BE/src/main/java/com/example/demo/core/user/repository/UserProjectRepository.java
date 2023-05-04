package com.example.demo.core.user.repository;

import com.example.demo.core.user.model.response.UserFindProjectResponse;
import com.example.demo.repository.ProjectRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProjectRepository extends ProjectRepository {
    @Query(value = "select pr from Project pr where pr.id=:id")
    UserFindProjectResponse findProjectById(@Param("id")String id);
}
