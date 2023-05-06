package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "frameworkproject")
public class FrameworkProject implements Serializable {
    @EmbeddedId
    @JsonIgnore
    private FrameworkProjectId frameworkProjectId;
    @ManyToOne
    @JoinColumn(name = "id_framework",insertable = false,updatable = false)
//    @JsonBackReference
    @JsonIgnoreProperties("listFrameworkProject")
    private Framework framework;

    @ManyToOne
    @JoinColumn(name = "id_project",insertable = false,updatable = false)
//    @JsonBackReference
    @JsonIgnoreProperties("listFrameworkProject")
    private Project project;

}
