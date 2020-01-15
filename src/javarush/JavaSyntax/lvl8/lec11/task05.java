package javarush.JavaSyntax.lvl8.lec11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*taskKey="com.javarush.task.task08.task0823"\n\nОмовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.
Пример ввода:
мама мыла раму.
Пример вывода:
Мама Мыла Раму.
Требования:
1.	Программа должна выводить текст на экран.
2.	Программа должна считывать строку с клавиатуры.
3.	Класс Solution должен содержать один метод.
4.	Программа должна заменять в тексте первые буквы всех слов на заглавные.*/
public class task05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        char[] charArr = string.toCharArray();
        for (int i = 1; i < charArr.length; i++) {
            if (Character.isWhitespace(charArr[i - 1]) && Character.isLowerCase(charArr[i]) && Character.isAlphabetic(charArr[i]))
                charArr[i] = Character.toUpperCase(charArr[i]);
        }
        String result = new String(charArr);
        System.out.println(result);
    }
}
