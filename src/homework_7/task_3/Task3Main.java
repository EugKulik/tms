package homework_7.task_3;

//Есть строка “Green. red. blue. yellow”. Необходимо заменить все точки на запятые
public class Task3Main {
    public static void main(String[] args) {
        String s = "Green. red. blue. yellow";
        s = s.replace('.', ',');
        System.out.println(s);
    }
}
