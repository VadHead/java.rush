package javarush.JavaSyntax.lvl6.lec08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*taskKey="com.javarush.task.task06.task0605"
Контролируем массу тела
Программа должна считывать введенные пользователем вес в килограммах и рост в метрах и выводить на экран сообщение о индексе массы тела.
Реализуй статический метод класса Body. Метод должен определить индекс массы тела, и вывести на экран сообщение:
"Недовес: меньше чем 18.5" - если индекс массы тела меньше 18.5,
"Нормальный: между 18.5 и 25" - если индекс массы тела между 18.5 и 25,
"Избыточный вес: между 25 и 30" - если индекс массы тела между 25 и 309,
"Ожирение: 30 или больше" - если индекс массы тела 30 или больше.
Подсказка: Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)
Пример вывода для 68.4 и 1.77:
Нормальный: между 18.5 и 24.9
Требования:
1.	Метод massIndex должен выводить текст на экран.
2.	Метод massIndex должен выводить "Недовес: меньше чем 18.5" на экран, если индекс массы тела меньше 18.5.
3.	Метод massIndex должен выводить "Нормальный: между 18.5 и 24.9" на экран, если индекс массы тела между 18.5 и 25.
4.	Метод massIndex должен выводить "Избыточный вес: между 25 и 29.9" на экран, если индекс массы тела между 25 и 30.
5.	Метод massIndex должен выводить "Ожирение: 30 или больше" на экран, если индекс массы тела 30 или больше.
*/
public class task01 {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double massIndex = weight / (Math.pow(height, 2));
            String alert;
            if (massIndex < 18.5) alert = "Недовес: меньше чем 18.5";
            else if (massIndex > 18.5 && massIndex < 25) alert = "Нормальный: между 18.5 и 25";
            else if (massIndex > 25 && massIndex < 30) alert = "Избыточный вес: между 25 и 30";
            else alert = "Ожирение: 30 или больше";
            System.out.println(alert);
        }

    }
}
