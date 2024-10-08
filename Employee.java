package com.tutorial;

public class Employee{
    public int baseSalary;
    private int hourlyRate;
//    public int extraHours;

    public void setBaseSalary(int baseSalary)
    {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary()
    {
        return baseSalary;
    }

    public int calculateWage(int extraHours)
    {
        return baseSalary + (getHourlyRate() * extraHours);
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }
}
