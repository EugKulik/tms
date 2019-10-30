package homework_7.task_9;

/*Есть массив строк, вывести на экран все строки, длина которых больше 5 символов*/
// +
public class Task9Main {
    public static void main(String[] args) {
        int size = 5;
        String[] arrayWords = {"vkhbdf", "veirlno", "vufek", "ofernlerfnl"};
        for (int i = 0; i < arrayWords.length; i++) {
            if (arrayWords[i].length() > size) {
                System.out.println(arrayWords[i]);
            }
        }
    }
}
