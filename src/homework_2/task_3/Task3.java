package homework_2.task_3;

public class Task3 {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 0; i <= 8; i++) {
            res += (int)Math.pow(2,i);
        }
        System.out.println(res);
    }
}
