import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int task = in.nextInt();
        int a, b, c;
        String firstString;
        String secondString;
        switch(task){
            case 1:
                System.out.println("Задание 1");
                System.out.println("Первая строка");
                in.nextLine();
                firstString = in.nextLine();
                System.out.println("Вторая строка");
                secondString = in.nextLine();
                System.out.println(Tasks1.hiddenAnagram(firstString, secondString));
            case 2:
                System.out.println("Задание 2");
                System.out.println("Строка:");
                in.nextLine();
                firstString = in.nextLine();
                System.out.println("Длина слова:");
                a = in.nextInt();
                System.out.println(Arrays.toString(Tasks1.collect(firstString, a)));
            case 3:
                System.out.println("Задание 3");
                System.out.println("Строка: ");
                in.nextLine();
                firstString = in.nextLine();
                System.out.println("Ключ: ");
                secondString = in.nextLine();
                System.out.println(Tasks1.nicoCipher(firstString, secondString));
            case 4:
                System.out.println("Задание 4");
                System.out.println("Введите массив чисел:");
                int[] task4array = new int[8];
                for (int i = 0; i < 8; i++){
                    task4array[i] = in.nextInt();
                }
                System.out.println("Введите произведение:");
                a = in.nextInt();
                System.out.println(Arrays.toString(Tasks1.twoProduct(task4array, a)));
            case 5:
                System.out.println("Задание 5");
                System.out.println("Введите число для проверки:");
                a = in.nextInt();
                System.out.println(Arrays.toString(Tasks1.isExact(a)));
        }
    }
}
