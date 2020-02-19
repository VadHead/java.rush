package javarush.JavaCore.lvl05.lec12;
/*taskKey="com.javarush.task.task15.task1527"\n\nПарсер реквестов
Считать с консоли URL-ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double: 3.14

Требования:
1.	Программа должна считывать с клавиатуры только одну строку.
2.	Класс Solution не должен содержать статические поля.
3.	Программа должна выводить данные на экран в соответствии с условием.
4.	Программа должна вызывать метод alert с параметром double в случае, если значение параметра obj может быть корректно преобразовано в число типа double.
5.	Программа должна вызывать метод alert с параметром String в случае, если значение параметра obj НЕ может быть корректно преобразовано в число типа double.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class task08 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String urlLink = null;
        ArrayList<String> paramName = new ArrayList<>();
        ArrayList<String> paramValue = new ArrayList<>();
        urlLink = bf.readLine();
        if (urlLink != null) {
            ArrayList<String> paramsArr = new ArrayList<>(Arrays.asList(urlLink.substring(urlLink.indexOf("?") + 1).split("&")));
            System.out.println(paramsArr.toString());
            for (String param : paramsArr) {
                if (param.contains("=")) {
                    String temp = param.substring(0, param.indexOf("="));
                    if (temp.equals("obj")) paramValue.add(param.substring(param.indexOf("=") + 1));
                    paramName.add(temp);
                } else paramName.add(param);
            }
            for (String name : paramName) {
                System.out.print(name + " ");
            }
            System.out.println();
            for (String value : paramValue) {
                try {
                    alert(Double.parseDouble(value));
                } catch (NumberFormatException e) {
                    alert(value);
                }
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

