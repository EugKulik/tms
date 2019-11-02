package homework_7.task_1;

//Игра в слова. Есть строка “engineering”. Нужно выделить подстроку так, чтобы получилось два слова “engine” и “ring”.

//+
public class Task1Main {
    public static void main(String[] args) {
        String string = "engineering";
        String engineer = string.substring(0, 6);
        String ring = string.substring(7);

        System.out.println(engineer);
        System.out.println(ring);
    }
}
