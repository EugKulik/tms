package homework_8.task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Попросите пользователя ввести число размера будущего массива, но не больше размера Y (задайте сами).
Если пользователь ввел число больше Y или отрицательное, то выбросьте собственное исключение и
попросите пользователя ввести число заново.*/
public class Task3Main {
    // SIZE -> MAX_SIZE
    public static final int SIZE = 7;

    public static void main(String[] args) throws IOException {
        int userSize;
        boolean iterloop = true;
        do {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("Enter array size. Array size must be positive and<= " + SIZE);
                userSize = Integer.parseInt(reader.readLine());
                int i = 0;
                if (userSize > SIZE | userSize < i) { // 0 в константу или переменную
                    throw new WrongArraySizeException("The entered value does not meet the condition");
                }
                iterloop = false;
            } catch (WrongArraySizeException | NumberFormatException e) {
                System.err.println(e.getMessage());
                System.out.println("Try again");
            }
        } while (iterloop);
        System.out.println("Successfully");
    }
}





