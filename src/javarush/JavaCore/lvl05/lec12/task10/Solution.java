package javarush.JavaCore.lvl05.lec12.task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*taskKey="com.javarush.task.task15.task1529"\n\nОсваивание статического блока
1. В отдельных файлах создать классы Plane и Helicopter, реализующие интерфейс CanFly.
2. Класс Plane должен иметь конструктор с параметром int - количество перевозимых пассажиров.
3. В статическом методе reset класса Solution:
3.1. Считать с консоли параметр типа String.
3.2. Если параметр равен "helicopter", то статическому объекту CanFly result присвоить объект класса Helicopter.
3.3. Если параметр равен "plane", то считать второй параметр типа int(количество пассажиров), статическому объекту CanFly result присвоить объект класса Plane.
4. В статическом блоке инициализировать CanFly result вызвав метод reset.
5. Закрыть поток ввода методом close().
Требования:
1.	Класс Plane должен быть создан в отдельном файле и реализовывать интерфейс CanFly.
2.	Класс Helicopter должен быть создан в отдельном файле и реализовывать интерфейс CanFly.
3.	Класс Plane должен иметь конструктор с параметром int.
4.	В классе Solution должен быть реализован метод public static void reset().
5.	Метод reset должен считывать строки с клавиатуры.
6.	Если введенная строка равна &quot;helicopter&quot;, в переменную result должен быть сохранен объект типа Helicopter.
7.	Если введенная строка равна &quot;plane&quot;, в переменную result должен быть сохранен объект типа Plane.
8.	Поле result класса Solution должно быть инициализировано в статическом блоке путем вызова метода reset.*/
public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String transport = bf.readLine();
            if (transport.equals("helicopter")) result = new Helicopter();
            else if (transport.equals("plane")) {
                int passengersQuantity = Integer.parseInt(bf.readLine());
                result = new Plane(passengersQuantity);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
