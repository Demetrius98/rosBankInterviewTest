package com.myProj;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Department itDepart = new Department("it Depart");
        Department acctDepart = new Department("accountant Depart");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Smirnov P.P.", itDepart));
        employeeList.add(new Employee("Ivanov A.E.", itDepart));
        employeeList.add(new Employee("Lisova A.D.", itDepart));
        employeeList.add(new Employee("Kadanova T.A.", acctDepart));
        employeeList.add(new Employee("Lukysnova T.S.", acctDepart));
        employeeList.add(new Employee("Abramova A.G.", acctDepart));

        employeeList.get(0).setManagerId(employeeList.get(1).getUserID());
        employeeList.get(1).setManagerId(employeeList.get(2).getUserID());
        employeeList.get(2).setManagerId(null);

        employeeList.get(3).setManagerId(employeeList.get(4).getUserID());
        employeeList.get(4).setManagerId(employeeList.get(5).getUserID());
        employeeList.get(5).setManagerId(null);

        List<Employee> itDepartEmployeeList = itDepart.getListOfDepartmentEmployees(employeeList);
        System.out.println(itDepart.getStrOfEmployees(itDepartEmployeeList));

        List<Employee> acctDepartEmployeeList = acctDepart.getListOfDepartmentEmployees(employeeList);
        System.out.println(acctDepart.getStrOfEmployees(acctDepartEmployeeList));

    }
}
