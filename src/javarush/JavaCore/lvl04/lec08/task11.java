package javarush.JavaCore.lvl04.lec08;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/*taskKey="com.javarush.task.task14.task1419"\n\nНашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.
Требования:
1.	Список exceptions должен содержать 10 элементов.
2.	Все элементы списка exceptions должны быть исключениями(потомками класса Throwable).
3.	Все элементы списка exceptions должны быть уникальны.
4.	Метод initExceptions должен быть статическим.*/
public class task11 {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println(arr[10]);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int i = Integer.parseInt("sadf");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NullPointerException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NegativeArraySizeException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchFieldException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchMethodException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchElementException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IOException();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new FileNotFoundException();
        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}
