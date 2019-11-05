package homework_8.task_4;

import java.util.Random;

/*Task 4
Есть стиральная машина, которая работает от электричества, но у нее есть небольшой блок питания, мощности
которого хватает чтобы слить воду, если эл-во пропало. Предположим, что произошел сбой и эл-во пропало,
тем самым спровоцировав в программе работы машинки исключение. Нужно написать программу, которая бы обязательно
запускала программу слива воды, если произошел такой сбой
*/
public class Task4Main {
    public static void main(String[] args) {
        Random random = new Random();
        boolean electricity = random.nextBoolean();
        WashingMachine washingMachine = null;
        try {
            washingMachine = new WashingMachine();
            washingMachine.work();
            washingMachine.wash(electricity);
            washingMachine.rinsing(electricity);
        } catch (ElectricityException e) {
            System.out.println(e.getMessage());
        } finally {
            washingMachine.draining();
        }
    }
}
