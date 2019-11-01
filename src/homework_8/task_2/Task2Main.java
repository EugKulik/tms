package homework_8.task_2;

/*Task 2
Написать метод, который бы парсил строку в число, обработать исключение, которое может быть при неверном формате числа*/
public class Task2Main {
    public static void main(String[] args) {
        String s = "a";
        System.out.println(valueStringinInt(s));
    }

    static int valueStringinInt(String s) {
        int res = 0;
        try {
            res = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Wrong number format");
        }
        return res;
    }
}
