package javarush.JavaCore.lvl05.lec12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*taskKey="com.javarush.task.task15.task1519"\n\nРазные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. меньше либо равно нулю или больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
Требования:
1.	Программа должна считывать данные с клавиатуры.
2.	Программа должна прекращать считывать данные с клавиатуры после того, как была введена строка &quot;exit&quot;.
3.	Если введенная строка содержит точку(&quot;.&quot;) и может быть корректно преобразована в число типа Double - должен быть вызван метод print(Double value).
4.	Если введенная строка может быть корректно преобразована в число типа short и полученное число больше 0, но меньше 128 - должен быть вызван метод print(short value).
5.	Если введенная строка может быть корректно преобразована в число типа Integer и полученное число меньше или равно 0 или больше или равно 128 - должен быть вызван метод print(Integer value).
6.	Во всех остальных случаях должен быть вызван метод print(String value).*/
public class task01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String data = bf.readLine();
            try {
                if (data.equals("exit")) break;
                if (data.contains(".")) print(Double.parseDouble(data));
                else if (Integer.parseInt(data) > 0 && Integer.parseInt(data) < 128) print(Short.parseShort(data));
                else if (Integer.parseInt(data) <= 0 || Integer.parseInt(data) >= 128) print(Integer.parseInt(data));
                else print(data);
            } catch (Exception e) {
                print(data);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
