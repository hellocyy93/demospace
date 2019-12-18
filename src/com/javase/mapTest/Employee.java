package com.javase.mapTest;

public class Employee {
    //员工号
    private String empno;
    //员工姓名
    private String ename;
    //薪水
    private Integer salary;
    //所属部门号
    private Integer deptno;

    public Employee(String empno, String ename, Integer salary, Integer deptno) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
        this.deptno = deptno;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno='" + empno + '\'' +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", deptno=" + deptno +
                '}';
    }
}
