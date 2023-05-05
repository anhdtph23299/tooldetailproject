package com.example.demo.entity;

import com.example.demo.entity.base.PrimaryEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "Tool")
public class Tool extends PrimaryEntity implements Serializable {
    @Column(name = "ToolName")
    private String toolName;
    @OneToMany(mappedBy = "tool")
    @JsonManagedReference
    private List<ToolProject> listToolProject;

}
