package homework_9.task_5;

import static homework_9.task_4.Task4Main.FILE_NAME;
import static homework_9.task_4.Task4Main.readEmployee;

/*Продолжение Task_4. А теперь поменяйте любое приватное поле Work/Employee на паблик.
Создайте новый класс для метода мейн и попробуйте прочитать файл, который вы туда записали.
Попробуйте найти решение в интернете*/
public class Task5Main {
    public static void main(String[] args) {
        readEmployee(FILE_NAME);
    }
}
