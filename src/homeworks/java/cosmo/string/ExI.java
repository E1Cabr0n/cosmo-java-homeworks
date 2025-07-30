package homeworks.java.cosmo.string;

import java.util.Arrays;

/**
 * Дан массив строк с номерами телефонов {“9806567890”, “89990980644”, “+79005556134”}.
 * Необходимо все номера телефонов отформатировать на вариант с +7-***-***-**-**.
 * 89990980644 -> +7-999-098-06-44
 * <p>
 * Подсказка: используйте методы .format() и .substring() класса String
 */
public class ExI {
    public static void main(String[] args) {
        String[] input = {"9806567890", "89990980644", "+79005556134" };
        int inputLength = input.length;
        String[] results = new String [inputLength];
        for(int i = 0; i < inputLength; i++) {
            results[i] = String.format("+7-%s-%s-%s-%s", input[i].substring(input[i].length()-10, input[i].length()-7),
                    input[i].substring(input[i].length()-7, input[i].length()-4),
                    input[i].substring(input[i].length()-4, input[i].length()-2),
                    input[i].substring(input[i].length()-2, input[i].length()));
        }
        for(String result : results) System.out.println(result);
    }
}