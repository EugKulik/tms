package homework_2.task_5;

public class Task5 {
    public static void main(String[] args) {
        float centimeter = 2.54f;
        int inch = 20;
        for (int i = 1; i <= inch ; i++) {
            float res = i* centimeter;
            System.out.println( i + " inch = " + res + " centimeter");
        }
    }
}
