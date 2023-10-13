package GameGuessTheNumber;

import java.util.Scanner;


public class DefaultGameGuessTheNumber {

    public void startGame (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру \"Угадай число\".\n" +
                "Выбери уровень сложности: \n" +
                "1 - EASY\n" +
                "2 - MEDIUM\n" +
                "3 - HARD\n"+
                "0 - ВЫЙТИ ИЗ ИГРЫ");
        boolean start = true;
        while (start) {
            int userAnswer = scanner.nextInt();
            try {
                switch (userAnswer) {
                    case 1:
                        System.out.println("Легкий уровень");
                        guessTheNumber(Difficulty.EASY);
                        start = false;
                        break;
                    case 2:
                        System.out.println("Средний уровень");
                        guessTheNumber(Difficulty.MEDIUM);
                        start = false;
                        break;
                    case 3:
                        System.out.println("Трудный уровень");
                        guessTheNumber(Difficulty.HARD);
                        start = false;
                        break;
                    case 0:
                        System.out.println("Игра окончена");
                        start = false;
                        break;
                    default:
                        System.out.println("Нет такого уровня сложности");
                }
            } catch (Exception e) {
                System.out.println("Ой-ой, кажется ты вводишь не то что нужно");
            }
        }
    }

    public void guessTheNumber(Difficulty difficulty) {

        Scanner scanner = new Scanner(System.in);

        int count = difficulty.maxTries;
        int aiNumber = generateNumber(difficulty.maxNumberValue);

        System.out.println("Количество попыток: " + count + "\nУгадай цифру от 0 до " + difficulty.maxNumberValue);


        while (count >= 1) {
            System.out.println("Введи ответ");
            int userAnswer = scanner.nextInt();
            if (userAnswer == aiNumber) {
                System.out.println("Ты угадал(а)");
                return;
            } else {
                System.out.println("Количество попыток: " + (count - 1));
                giveClue(aiNumber, userAnswer);
                count--;
            }
        }
        if (count == 0) {
            System.out.println("Очень жаль. Ты проиграл. Загаданная цифра: " + aiNumber);
        }
    }

    public int generateNumber(int max) {
        return (int) (Math.random() * (max + 1));
    }

    public void giveClue(int aiNumber, int userAnswer) {
        if (userAnswer > aiNumber) {
            System.out.println("Загаданное число меньше " + userAnswer);
        } else {
            System.out.println("Загаданное число больше " + userAnswer);
        }
    }

    public enum Difficulty {
        EASY(9, 5),
        MEDIUM(15, 5),
        HARD(20, 3);

        Difficulty(int maxNumberValue, int maxTries) {
            this.maxNumberValue = maxNumberValue;
            this.maxTries = maxTries;
        }

        private final int maxNumberValue;
        private final int maxTries;
    }
}

