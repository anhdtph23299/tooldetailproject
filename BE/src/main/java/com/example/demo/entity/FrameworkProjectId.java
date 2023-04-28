package com.example.demo.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;

import java.io.Serializable;

@Embeddable
public class FrameworkProjectId  implements Serializable {
    @JoinColumn(name = "idFramework")
    private Long idFramework;
    @JoinColumn(name = "idProject")
    private Long idProject;
}
