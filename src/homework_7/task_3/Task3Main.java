package homework_7.task_3;

//Есть строка “Green. red. blue. yellow”. Необходимо заменить все точки на запятые
public class Task3Main {
    public static void main(String[] args) {
        String words = "Green. red. blue. yellow";
        words = words.replace('.', ',');
        System.out.println(words);
    }
}
