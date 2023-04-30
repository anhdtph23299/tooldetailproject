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
@Table(name = "ToolProject")
public class ToolProject implements Serializable {
    @EmbeddedId
    private ToolProjectId toolProjectId;
    @ManyToOne
    @JoinColumn(name = "IDTool",insertable = false,updatable = false)
    private Tool tool;

    @ManyToOne
    @JoinColumn(name = "IDProject",insertable = false,updatable = false)
    private Project project;

}
