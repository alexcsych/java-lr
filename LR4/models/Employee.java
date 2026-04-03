package models;
public class Employee extends Person {
  private String department;
  private String position;
  private int salary;

  public String getDepartment() {return department;};
  public String getPosition() {return position;};
  public int getSalary() {return salary;};

  public void setDepartment(String department) {this.department=department;};
  public void setPosition(String position) {this.position=position;};
  public void setSalary(int salary) {this.salary=salary;};

  public void hire(){System.out.println("Співробітника " + this.getName() + " прийнято!");};

  public void fire(){System.out.println("Співробітника " + this.getName() + " звільнено!");};
  
  public Employee(String name, String surname, String birthday, Boolean sex, String department, String position, int salary) {
    super(name, surname, birthday, sex);

    this.department = department;
    this.position = position;
    this.salary = salary;
  }
}