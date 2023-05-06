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
@Table(name = "toolproject")
public class ToolProject implements Serializable {
    @EmbeddedId
    @JsonIgnore
    private ToolProjectId toolProjectId;
    @ManyToOne
    @JoinColumn(name = "id_tool",insertable = false,updatable = false)
//    @JsonBackReference
    @JsonIgnoreProperties("listToolProject")
    private Tool tool;

    @ManyToOne
    @JoinColumn(name = "id_project",insertable = false,updatable = false)
//    @JsonBackReference
    @JsonIgnoreProperties("listToolProject")
    private Project project;

}
