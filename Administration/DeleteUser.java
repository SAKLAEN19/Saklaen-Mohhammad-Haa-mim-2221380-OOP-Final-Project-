package com.example.administration_saklaenhaamim_2221380;

import java.time.LocalDate;

public class DeleteUser {
    private String name, department;
    private int id;
    private LocalDate doj;

    public DeleteUser() {

    }

    public DeleteUser(String name, String department, int id, LocalDate doj) {
        this.name = name;
        this.department = department;
        this.id = id;
        this.doj = doj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "EditUser{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", id=" + id +
                ", doj=" + doj +
                '}';
    }
}
