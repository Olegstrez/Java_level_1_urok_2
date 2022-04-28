package ru.gb.strezhnev;



public class LESSON_2 {
        public static void main(String[] args) {

                System.out.println("Проверка суммы 1 задание: " + SumOt10do20(0, 9));
                System.out.print("Проверка числа 2 задание: ");
                isPositiveOrNegative(9);
                System.out.println();
                System.out.println("Число отрицательное 3 задание: " + isNegative(0));
                NumberWord("пошел", 10);

        }

        public static boolean SumOt10do20(int a, int b) {
                int sum = a + b;
                if (sum >= 10 & sum <= 20)
                        return true;
                else
                        return false;

        }

        public static void isPositiveOrNegative(int a) {
                if (a >= 0) {
                        System.out.printf("Положительное");
                } else
                        System.out.print("Отрицательное");
        }

        public static boolean isNegative(int number) {
                return number <= 0;
        }

        public static void NumberWord(String word, int a) {
                for (int i = 0; i <= a; i++) {
                        System.out.println(word);

                }
        }
}










