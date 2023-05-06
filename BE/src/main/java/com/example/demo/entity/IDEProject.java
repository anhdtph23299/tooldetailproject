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
@Table(name = "ideproject")
public class IDEProject implements Serializable {
    @EmbeddedId
    @JsonIgnore
    private IDEProjectId ideProjectId;
    @ManyToOne
    @JoinColumn(name = "id_ide",insertable = false,updatable = false)
//    @JsonBackReference
    @JsonIgnoreProperties("listIdeProject")
    private IDE ide;


    @ManyToOne
    @JoinColumn(name = "id_project",insertable = false,updatable = false)
//    @JsonBackReference
    @JsonIgnoreProperties("listIdeProject")
    private Project project;

}
