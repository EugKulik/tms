package homework_7.task_6;

import java.util.ArrayList;

/*Есть массив слов. Нужно отфильтровать его так, чтобы в выходном массиве оказались слова, которые начинаются с буквы “W”/”w”*/
public class Task6Main {
    public static void main(String[] args) {
        String[] arrayWords = {"adfs", "fwefwe", "dwefw", "qwrdfg", "wfsrg", "Wgronmjk"};
        String startLitterinUpCase = "W";
        ArrayList<String> outArray = new ArrayList<>();
        for (int i = 0; i < arrayWords.length; i++) {
            if (arrayWords[i].startsWith(startLitterinUpCase) || arrayWords[i].startsWith(startLitterinUpCase.toLowerCase())) {
                outArray.add(arrayWords[i]);
            }
        }
        System.out.println(outArray);
    }
}
