package javarush.JavaSyntax.lvl8.lec11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*taskKey="com.javarush.task.task08.task0829"
Модернизация ПО
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи
Требования:
1.	Программа должна выводить текст на экран.
2.	Программа должна считывать значения с клавиатуры.
3.	Класс Solution должен содержать один метод.
4.	Программа должна вывести фамилию семьи по введенному городу.
*/
public class task11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }

        // Read the house number
        String city = reader.readLine();

        if (!city.isEmpty()) {
            String familyCity = list.get(list.indexOf(city)+1);
            System.out.println(familyCity);
        }
    }
}
