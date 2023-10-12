package SteudentMenedmentSystem;

import java.util.Scanner;

public class ManagementSystem {
    StudentRegister studentRegister = new StudentRegister();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean startProgram = true;

        System.out.println("Добро пожаловать в программу \"Студент\"");

        while (startProgram) {
            try {
                System.out.println(
                "Доступные операции:\n " +
                        "1 - Добавить студента\n " +
                        "2 - Удалить студента\n " +
                        "3 - Добавить итоговую оценку студенту\n " +
                        "4 - Вывести итоговую оценку студента \n " +
                        "5 - Вывести всех студентов\n " +
                        "6 - Закрыть программу\n ");
                System.out.println("Введите номер необходимой операции");
                int userAnswer = scanner.nextInt();
                scanner.nextLine();

                switch (userAnswer) {
                    case 1:
                        System.out.println("Введите имя студента");
                        studentRegister.addStudent(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Введите имя студента");
                        studentRegister.deleteStudent(scanner.nextLine());
                        break;
                    case 3:
                        System.out.println("Введите имя студента");
                        String name = scanner.nextLine();
                        System.out.println("Введите оценку");
                        Double mark = scanner.nextDouble();
                        studentRegister.addStudentfinalMark(name, mark);
                        break;
                    case 4:
                        System.out.println("Введите имя студента");
                        studentRegister.searchStudent(scanner.nextLine());
                        break;
                    case 5:
                        studentRegister.allStudent();
                        break;
                    case 6:
                        System.out.println("Программа закрыта");
                        startProgram = false;
                        break;
                    default:
                        System.out.println("Нет такой операции");
                }
            } catch (Exception e) {
                System.out.println("Необходимо ввести число");
                scanner.next();
            }
        }
    }
}
