package com.myProj;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Department {
    private static int count = -1;
    private int depId;
    private String depName;

    Department (String depName) {
        count++;
        this.depId = count;
        this.depName = depName;
    }

    public List<Employee> getListOfDepartmentEmployees (List<Employee> employeeList) {
        return employeeList
                .stream()
                .filter(x -> this.equals(x.getUserDepartment()) )
                .collect(Collectors.toList());
    }

    public String getStrOfEmployees (List<Employee> employeeList) {
        StringBuilder strResult = new StringBuilder();
        for (Employee employee : employeeList) {
            String managerFio = null;
            if (employee.getManagerId() != null) {
                managerFio = employeeList
                        .stream()
                        .filter(x -> x.getUserID() == employee.getManagerId())
                        .findFirst()
                        .orElse(null)
                        .getFio();
            }
            strResult.append(employee.getUserDepartment().getDepName());
            strResult.append(" -- ");
            strResult.append(employee.getFio());
            strResult.append(" -- ");
            strResult.append(managerFio);
            strResult.append("\n");
        }

        return strResult.toString();
    }

    public int getDepId() {
        return depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return depId == that.depId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(depId);
    }
}
