import java.util.ArrayList;
import java.util.List;

import org.*;
import geometry.*;
import models.*;

public class LR4 {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Іван", "Петров", "01.05.1990", true, "IT", "Developer", 50000);
        Employee worker2 = new Employee("Олена", "Сидоренко", "15.03.1995", false, "IT", "Designer", 45000);

        List<Employee> team = new ArrayList<>();
        team.add(worker1);
        team.add(worker2);

        Position manager = new Position(
            "Олексій", "Сич", "02.05.2005", true,
            "IT Департамент", "Team Lead", 80000,
            "Розробка ПЗ", 15, 40,
            "Senior Manager", "Керування командою", team
        );

        System.out.println("--- Перевірка даних ---");
        System.out.println("Менеджер: " + manager.getName() + " " + manager.getSurname());
        System.out.println("Підрозділ: " + manager.getDepartmentName());
        
        System.out.println("\n--- Перевірка дій ---");
        manager.callEmployee(worker1);
        manager.callEmployee(worker2);
        manager.giveOrder("Написати звіт по Java", worker1);
        manager.giveOrder("Написати звіт по Java", worker2);
        
        worker1.hire();
        worker2.fire();

        System.out.println("--- Індивідуальне завдання варіант 5 ---");
        Circle myCircle = new Circle(0, 0, 5);

        Point internalPoint = new Point(3, 3);
        Point externalPoint = new Point(6, 0);

        System.out.println("Точка (3,3) в колі? " + myCircle.containsPoint(internalPoint));
        System.out.println("Точка (6,0) в колі? " + myCircle.containsPoint(externalPoint));

        myCircle.updateRadius(7);
        System.out.println("Після збільшення радіуса до 7, точка (6,0) в колі? " 
                            + myCircle.containsPoint(externalPoint));
    }
}