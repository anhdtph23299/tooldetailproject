package com.example.demo.entity;

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

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "FrameworkProject")
public class FrameworkProject implements Serializable {
    @EmbeddedId
    private FrameworkProjectId frameworkProjectId;
    @ManyToOne
    @JoinColumn(name = "idFramework",insertable = false,updatable = false)
    private Framework framework;

    @ManyToOne
    @JoinColumn(name = "idProject",insertable = false,updatable = false)
    private Project project;
}
