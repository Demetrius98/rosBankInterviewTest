package com.myProj;

public class Employee {
    private static int count = 1;
    private int userID;
    /** If employee doesn't have manager,
     * managerId field will equal to null */
    private Integer managerId;
    private String fio;
    private Department userDepartment;

    Employee (String fio) {
        count++;
        this.userID = count;
        this.fio = fio;
    }

    Employee (String fio, Department userDepartment) {
        count++;
        this.userID = count;
        this.fio = fio;
        this.userDepartment = userDepartment;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public int getUserID() {
        return userID;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public String getFio() {
        return fio;
    }


    public Department getUserDepartment() {
        return userDepartment;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setUserDepartment(Department userDepartment) {
        this.userDepartment = userDepartment;
    }
}
