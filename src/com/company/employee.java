package com.company;

public class employee {
    private int emp_id, salary;
    private String FristName;
    private String LastName;
    private int dep_id;
    Department dep;


    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setFristName(String fristName) {
        FristName = fristName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }


    public int getEmp_id() {
        return emp_id;
    }

    public int getSalary() {
        return salary;
    }

    public String getFristName() {
        return FristName;
    }

    public String getLastName() {
        return LastName;
    }

    @Override
    public String toString() {
        return "[ id = " +
                emp_id +
                " , name = " +
                FristName +
                " " +
                LastName +
                " , salary = " +
                salary +
                " , Department ID = "
                + dep_id +
                " ] ";
        //return "[ id = " + emp_id  ;
    }


}
