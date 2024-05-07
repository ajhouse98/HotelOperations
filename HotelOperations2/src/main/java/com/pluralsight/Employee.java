package com.pluralsight;

import java.security.PublicKey;
import java.util.Scanner;

public class Employee {
    Scanner userInput = new Scanner(System.in);
    int employeeId;
    String name;
    String department;
    double payRate;
    double hoursWorked;
    double time;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return payRate * hoursWorked;
    }

    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return payRate * hoursWorked;
        }
        return 0;
    }

    public double overTimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked;
        } return 0;
    }
    public void punchIn (double time) {
        this.time = time;
    }


    public void punchOut (double time) {
        this.time = time;

    }
}
