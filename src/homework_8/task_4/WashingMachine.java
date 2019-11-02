package homework_8.task_4;

import java.util.Random;

/*Task 4
Есть стиральная машина, которая работает от электричества, но у нее есть небольшой блок питания, мощности
которого хватает чтобы слить воду, если эл-во пропало. Предположим, что произошел сбой и эл-во пропало,
тем самым спровоцировав в программе работы машинки исключение. Нужно написать программу, которая бы обязательно
запускала программу слива воды, если произошел такой сбой
*/

// +
public class WashingMachine {

    public void work() {
        System.out.println("working");
    }

    public void draining() {
            System.out.println("Washing machine drains water");
    }

    public void wash(Boolean electricity) throws ElectricityException {
        if (electricity) {
            System.out.println("Washing machine washing");
        } else {
            throw new ElectricityException("not electricity");
        }
    }

    public void rinsing(Boolean electricity) throws ElectricityException {
        if (electricity) {
            System.out.println("Washing machine rinsing");
        } else {
            throw new ElectricityException("not electricity");
        }
    }
}

