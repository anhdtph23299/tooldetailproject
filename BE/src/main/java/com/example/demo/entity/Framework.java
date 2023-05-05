package com.example.demo.entity;

import com.example.demo.entity.base.PrimaryEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Framework")
public class Framework extends PrimaryEntity implements Serializable {
    private String frameworkName;
    @OneToMany(mappedBy = "framework")
    @JsonManagedReference
    private List<FrameworkProject> frameworkProjects;
}
