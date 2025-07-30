package homeworks.java.cosmo.string;

/**
 * Дана строка: ”Где мои деньги?”.
 * Необходимо собрать предложение в обратном порядке: “Деньги мои где?”.
 * Где мои деньги? -> Деньги мои где?
 * <p>
 * Подсказка: используйте методы .split(), .trim(), .replace() и .replaceFirst() класса String
 */
public class ExG {
    public static void main(String[] args) {
        String input = "Где мои деньги?";
        String [] words = input.toLowerCase().substring(0, input.length() -1).split(" ");
        StringBuffer result = new StringBuffer("");
        for(int i = words.length -1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        System.out.println(result.toString().trim().replaceFirst("д", "Д") + "?");
    }
}