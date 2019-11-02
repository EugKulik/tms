package homework_8.task_1;

/*Task 1
Создать метод, который бы делил одно число на другое, обработать исключение при делении на 0.
И вывести пользователю сообщение о том, что на 0 делить нельзя*/
public class Task1Main {
    public static void main(String[] args) {
        int divisible, divisor;
        divisible = 5;
        divisor = 0;
        System.out.println(div(divisible, divisor));
    }

    static int div(int divisible, int divisor) {
// пустая строка не нужна
        int res = 0;
        try {
            res = divisible / divisor;
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
        return res;
    }
}
