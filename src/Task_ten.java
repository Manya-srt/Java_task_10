// Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную.
// Результат вывести на экран.

import java.util.Scanner;

public class Task_ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите какое-нибудь сообщение");
        String sms = scanner.nextLine();
        System.out.println("Вы ввели: " + sms);
    }
}
