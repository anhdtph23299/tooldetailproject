package com.example.demo.entity;

import com.example.demo.entity.base.PrimaryEntity;
import jakarta.persistence.Column;
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
import java.sql.Date;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "accountproject")
public class AccountProject implements Serializable {

    @EmbeddedId
    private AccountProjectId id;
    @ManyToOne
    @JoinColumn(name = "id_account", referencedColumnName = "id")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "id_project", referencedColumnName = "id")
    private Project project;

    @Column(name = "description")
    private String description;

    @Column(name = "edit_time")
    private Date editTime;

}
