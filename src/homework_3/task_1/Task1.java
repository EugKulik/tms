package homework_3.task_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] intsArray = new int[3];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < intsArray.length; i++) {
            intsArray[i] = scanner.nextInt();
            sum += intsArray[i];
        }

        Arrays.sort(intsArray);
        System.out.println("min =" + intsArray[0]);
        System.out.println("max =" + intsArray[intsArray.length-1]);
        System.out.println(sum);
    }
}
