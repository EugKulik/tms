package homework_7.task_7;

/*Написать benchmark тест, который бы измерял скорость работы String, StringBuilder и StringBuffer*/
public class Task7Main {
    public static void main(String[] args) {
        String text = "";
        String addText = "Java";
        StringBuilder stringBuilderText = new StringBuilder(text);
        StringBuffer stringBufferText = new StringBuffer(text);

        int iterNmber = 100000;


        System.out.println( speedTest(text, addText, iterNmber));
        System.out.println( speedTest(stringBufferText, addText, iterNmber));
        System.out.println(speedTest(stringBuilderText, addText, iterNmber));

    }

    public static long speedTest(String text, String addText,int iterNmber) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterNmber; i++) {
            text = text.concat(addText);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long speedTest(StringBuilder stringBuilderText, String addText, int iterNmber) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterNmber; i++) {
            stringBuilderText.append(addText);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    // лучше чтобы метод возвращал int, а выводить на экран в main()
    public static long speedTest(StringBuffer stringBufferText, String addText, int iterNmber) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterNmber; i++) {
            stringBufferText.append(addText);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
