package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    private double REGULAR_HOURS = 40;
    private double OVERTIME_PAYRATE = 1.15;

    public int getEmployeeId() {
        return employeeId;
    }

    public double getTotalPay() {
//        double totalPay = payRate * hoursWorked;
//        return totalPay;
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * (payRate * OVERTIME_PAYRATE);
        return regularPay + overtimePay;
    }

    public double getRegularHours() {
        if (hoursWorked <= REGULAR_HOURS) {
            return hoursWorked;
        } else {
            return REGULAR_HOURS;
        }
    }

    public double getOvertimeHours() {
        if (hoursWorked > REGULAR_HOURS) {
            double overtimeHours = hoursWorked - REGULAR_HOURS;
            return overtimeHours;
        } else {
            return 0;
        }
    }
}
