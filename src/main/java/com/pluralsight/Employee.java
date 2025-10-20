package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public int getEmployeeId() {
        return employeeId;
    }

    public double getTotalPay() {
        double totalPay = payRate * hoursWorked;
        return totalPay;
    }

    public double getRegularHours() {
        double regularHours = hoursWorked;
        return regularHours;
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40){
            double overtimeHours = hoursWorked - getRegularHours();
            return overtimeHours;
        }
    }
}
