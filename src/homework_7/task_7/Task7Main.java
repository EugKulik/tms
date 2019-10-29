package homework_7.task_7;

/*Написать benchmark тест, который бы измерял скорость работы String, StringBuilder и StringBuffer*/
public class Task7Main {
    public static void main(String[] args) {
        String text = "";
        String addText = "Java";
        StringBuilder stringBuilderText = new StringBuilder(text);
        StringBuffer stringBufferText = new StringBuffer(text);

        int iterNmber = 100000;

        long start = System.currentTimeMillis();
        for (int i = 0; i < iterNmber; i++) {
            text = text.concat(addText);
        }
        long finish = System.currentTimeMillis();
        System.out.println("String concat time in milliseconds = " + (finish - start));

        speedTest(stringBufferText, addText, iterNmber);
        speedTest(stringBuilderText, addText, iterNmber);
    }

    public static void speedTest(StringBuilder stringBuilderText, String addText, int iterNmber) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterNmber; i++) {
            stringBuilderText.append(addText);
        }
        long finish = System.currentTimeMillis();
        System.out.println("StringBuilder append time in milliseconds = " + (finish - start));
    }

    public static void speedTest(StringBuffer stringBufferText, String addText, int iterNmber) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterNmber; i++) {
            stringBufferText.append(addText);
        }
        long finish = System.currentTimeMillis();
        System.out.println("StringBuffer append time in milliseconds = " + (finish - start));
    }
}
