package org;
import models.Employee;

public class Department extends Employee{
  private String departmentName;
  private int amountOfPeople;
  private int workTime;

  public String getDepartmentName() {return departmentName;};
  public int getAmountOfPeople() {return amountOfPeople;};
  public int getWorkTime() {return workTime;};

  public void setDepartmentName(String departmentName) {this.departmentName=departmentName;};
  public void setAmountOfPeople(int amountOfPeople) {this.amountOfPeople=amountOfPeople;};
  public void setWorkTime(int workTime) {this.workTime=workTime;};

  public Department(String name, String surname, String birthday, Boolean sex, String department, String position, int salary, String departmentName, int amountOfPeople, int workTime) {
    super(name, surname, birthday, sex, department, position, salary);

    this.departmentName = departmentName;
    this.amountOfPeople = amountOfPeople;
    this.workTime = workTime;
  }
}