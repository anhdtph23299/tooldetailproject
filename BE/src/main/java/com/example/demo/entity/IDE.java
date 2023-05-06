package com.example.demo.entity;

import com.example.demo.entity.base.PrimaryEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "IDE")
public class IDE extends PrimaryEntity implements Serializable {
    @Column(name = "ide_name")
    private String ideName;
    @OneToMany(mappedBy = "ide")
//    @JsonManagedReference
    @JsonIgnoreProperties("ide")
    private List<IDEProject> listIdeProject;

}
