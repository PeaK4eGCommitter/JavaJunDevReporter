package ru.levelp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@AllArgsConstructor
@Data
@Entity
@Table(name = "RolesToReports")
public class RoleReportLinker {
    @Id
    @GeneratedValue
    private int id;
    /*
    @ManyToOne(optional = false)
    private Role role;
    @ManyToOne(optional = false)
    private int reportId;

     */
}
