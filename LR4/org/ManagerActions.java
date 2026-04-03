package org;
import models.Employee;

public interface ManagerActions {
    void giveOrder(String order, Employee emp);
    void callEmployee(Employee emp);
}