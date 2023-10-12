package SteudentMenedmentSystem;

import java.util.ArrayList;

public class StudentRegister {
    ArrayList<Student> registerStudent = new ArrayList<>();

    public void addStudent(String name) {
        registerStudent.add(new Student(name));
    }

    public void addStudentfinalMark(String name, Double finalMark) {
        for (Student student : registerStudent) {
            if (student.getName().equals(name)) {
                student.setFinalMark(finalMark);
                System.out.println("Оценка добавлена");
                return;
            }
        }
        System.out.println("Студент не найден");
    }

    public void deleteStudent(String name) {
        for (Student student : registerStudent) {
            if (student.getName().equals(name)) {
                registerStudent.remove(student);
                System.out.println("Студент удален");
                return;
            }
        }
        System.out.println("Студент не найден");
    }

    public void searchStudent(String name) {
        for (Student student : registerStudent) {
            if (student.getName().equals(name)) {
                System.out.println("Студент: " + name + " Оценка " + student.getFinalMark());
                return;
            }
        }
        System.out.println("Студент не найден");
    }

    public void allStudent() {
        for (Student student : registerStudent) {
            System.out.println(student.getName() + " - " + student.getFinalMark());
        }
    }
}

