package com.prototype.prototype.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.query.Query;

import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    private int idEmployee;
    @Column(name="employeeName")
    private String Name;
    @Column(name = "employeePassword")
    private String password;
    @Column(name = "idSection")
    private int idSection;
    public Employee(){}

}
