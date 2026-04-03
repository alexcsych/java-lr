package org;
import java.util.ArrayList;
import java.util.List;

import models.Employee;

public class Position extends Department implements ManagerActions{
  private String positionName;
  private String listOfDuties;
  private List<Employee> subordinates;

  public String getPositionName() {return positionName;};
  public String getListOfDuties() {return listOfDuties;};
  public List<Employee> getSubordinates() {return subordinates;};

  public void setPositionName(String positionName) {this.positionName=positionName;};
  public void setListOfDuties(String listOfDuties) {this.listOfDuties=listOfDuties;};
  public void setSubordinates(List<Employee> subordinates) {this.subordinates=subordinates;};

  @Override
  public void giveOrder(String order, Employee emp){System.out.println("Співробітник: " + emp.getName() + " Виконати: " + order);};
  @Override
  public void callEmployee(Employee emp){System.out.println("Викливається співробітник " + emp.getName());};

  public Position(String name, String surname, String birthday, Boolean sex, String department, String position, int salary, String departmentName, int amountOfPeople, int workTime, String positionName, String listOfDuties, List<Employee> subordinates) {
    super(name, surname, birthday, sex, department, position, salary, departmentName, amountOfPeople, workTime);

    this.positionName = positionName;
    this.listOfDuties = listOfDuties;
    if (subordinates == null) this.subordinates = new ArrayList<>();
  }
} 