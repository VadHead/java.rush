package javarush.lvl8.lec06;
import java.text.DateFormat;
import java.util.*;
/*taskKey="com.javarush.task.task08.task0809"\n\nВремя для 10 тысяч вставок
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getInsertTimeInMs должен вернуть время своего исполнения в миллисекундах.
Требования:
1.	Программа должна выводить числа на экран.
2.	Метод main должен вызывать метод getInsertTimeInMs только два раза.
3.	Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
4.	Метод getInsertTimeInMs должен вызывать метод insert10000 только один раз.
5.	Метод getInsertTimeInMs должен вернуть время в миллисекундах, которое занимает 10 тысяч вставок в список.*/
public class task03 {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        Date startTime = new Date();
        insert10000(list);
        Date finishTime = new Date();
        long calcTime = finishTime.getTime() - startTime.getTime();
        return calcTime;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}

