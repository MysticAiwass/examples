package BankSystem;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<BankUser> bankUsers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean workProgram = true;


        System.out.println("Добро пожаловать в программу. Давайте начнем работу");
        while (workProgram) {
            System.out.println("Доступные операции: \n"
                    + "1 -  Добавить пользователя \n"
                    + "2 -  Добавить депозит \n"
                    + "3 -  Проверить баланс \n"
                    + "4 -  Вычесть из депозита \n"
                    + "5 -  Закончить работу в программе");
            int userAnswer = scanner.nextInt();
            scanner.nextLine();
            if (userAnswer == 1) {
                System.out.println("Введите имя пользователя: ");
                String name = scanner.nextLine();
                BankUser user = new BankUser(name);
                bankUsers.add(user);
            } else if (userAnswer == 2) {
                System.out.println("Введите имя пользователя");
                String name = scanner.nextLine();
                System.out.println("Введите сумму, которую необходимо внести");
                int sum = scanner.nextInt();
                addSumToDeposit(bankUsers, name, sum);
            } else if (userAnswer == 3) {
                System.out.println("Введите имя пользователя");
                String name = scanner.nextLine();
                System.out.println("Баланс " + checkBalance(bankUsers, name));
            } else if (userAnswer == 4) {
                System.out.println("Введите имя пользователя");
                String name = scanner.nextLine();
                System.out.println("Введите сумму которую необходимо снять");
                int sum = scanner.nextInt();
                subtractDeposit(name, sum);
            } else {
                workProgram = false;
            }
        }
    }

    private static void subtractDeposit(String name, int sum) {

    }

    private static Double checkBalance(ArrayList<BankUser> bankUser, String name) {
        for (BankUser user : bankUser) {
            if (user.getName().equals(name)) {
                return user.getBalance();
            }
        }
        System.out.println("Нет такого пользователя");
        return null;
    }

    private static void addSumToDeposit(ArrayList<BankUser> bankUser, String name, double sum) {
        for (BankUser user : bankUser) {
            if (user.getName().equals(name)) {
                user.setBalance(user.getBalance() + sum);
                System.out.println("Сумма " + sum + " успешно добавлена на счет пользователя " + name);
                return;
            }
        }
        System.out.println("Нет такого пользователя");
    }
}

