package com.example.demo.entity;

import com.example.demo.entity.base.PrimaryEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "Role")
public class Role extends PrimaryEntity implements Serializable {

    private String roleName;

    private String description;
    @OneToMany(mappedBy = "role")
//    @JsonManagedReference
    @JsonIgnoreProperties("role")
    private List<ProjectMember> listProjectMember;

}
