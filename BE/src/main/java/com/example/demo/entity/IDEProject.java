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
@Table(name = "IDEProject")
public class IDEProject implements Serializable {
    @EmbeddedId
    private IDEProjectId ideProjectId;
    @ManyToOne
    @JoinColumn(name = "IDIDE",insertable = false,updatable = false)
    private IDE ide;

    @ManyToOne
    @JoinColumn(name = "IDProject",insertable = false,updatable = false)
    private Project project;

}
