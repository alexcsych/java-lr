package models;
public class Person {
  private String name;
  private String surname;
  private String birthday;
  private Boolean sex;

  public String getName() {return name;};
  public String getSurname() {return surname;};
  public String getBirthday() {return birthday;};
  public Boolean getSex() {return sex;};

  public void setName(String name) {this.name=name;};
  public void setSurname(String surname) {this.surname=surname;};
  public void setBirthday(String birthday) {this.birthday=birthday;};
  public void setSex( Boolean sex) {this.sex=sex;};

  public Person(String name, String surname, String birthday, Boolean sex) {
    this.name = name;
    this.surname = surname;
    this.birthday = birthday;
    this.sex = sex;
  }
}