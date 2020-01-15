package javarush.JavaSyntax.lvl10.lec11;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*taskKey="com.javarush.task.task10.task1012"\n\nКоличество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 маленьких букв алфавита). Результат вывести на экран в алфавитном порядке.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
Требования:
1.	Программа должна 10 раз считывать данные с клавиатуры.
2.	Программа должна выводить текст на экран.
3.	Выведенный текст должен содержать 33 строки.
4.	Каждая строка вывода должна содержать букву русского алфавита, пробел и сколько раз буква встречалась в введенных строках.*/
public class task05 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 2; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        for (Character ch : alphabet) {
            int count = 0;
            for (String phrase : list) {
                for (int k = 0; k < phrase.length(); k++) {
                    if (ch.equals(phrase.charAt(k))) count++;
                }
            }
            System.out.println(ch + " " + count);
        }
    }
}
