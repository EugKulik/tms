package homework_7.task_1;

//Игра в слова. Есть строка “engineering”. Нужно выделить подстроку так, чтобы получилось два слова “engine” и “ring”.
// +
public class Task1Main {
    public static void main(String[] args) {
        String string = "engineering";
        String substring1 = string.substring(0, 6);
        String substring2 = string.substring(7);

        System.out.println(substring1);
        System.out.println(substring2);
    }
}
