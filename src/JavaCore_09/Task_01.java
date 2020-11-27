package JavaCore_09;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя студента:");
        String studentName = scanner.nextLine();
        System.out.println("Введите название учебной группы:");
        String studentGroup = scanner.nextLine();
        System.out.println("Введите имя преподователя:");
        String teacherName = scanner.nextLine();
        System.out.println("Введите название предмета:");
        String itemName = scanner.nextLine();

        human1.setName(studentName);
        human2.setName(teacherName);
        Student student1 = new Student(studentGroup, human1);
        student1.printInfo(human1);
        Teacher teacher = new Teacher(itemName, human2);
        teacher.printInfo(human2);

    }
}
