package com.example.demo.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class FrameworkProjectId  implements Serializable {
    @JoinColumn(name = "id_framework")
    private Long idFramework;
    @JoinColumn(name = "id_project")
    private Long idProject;

}
