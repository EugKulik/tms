package homework_14.task_1;

import java.util.Scanner;

/*Есть приветственное предложение:
"Hello, my name is Alex. I'm java developer and I'm glad to become a part of your company."
Необходимо сделать так, чтобы можно было подставить любое имя и язык программирования.
Напишите программу, которая бы позволяла вводить имя и язык программирования с консоли и затем выводила на экран
полученное предложение
*/
public class Task1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("What language do you write?");
        String lang = scanner.next();
        System.out.format("Hello, my name is %s. I'm %s developer and I'm glad to become a part of your company.",name,lang);
    }
}
