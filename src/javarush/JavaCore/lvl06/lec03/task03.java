package javarush.JavaCore.lvl06.lec03;

import java.util.ArrayList;
import java.util.List;

/*taskKey="com.javarush.task.task16.task1603"\n\nСписок и нити

В методе main добавить в статический объект list 5 нитей. Каждая нить должна быть новым объектом класса Thread, работающим со своим объектом класса SpecialThread.

Требования:
1.	В методе main создай 5 объектов типа SpecialThread.
2.	В методе main создай 5 объектов типа Thread.
3.	Добавь 5 разных нитей в список list.
4.	Каждая нить из списка list должна работать со своим объектом класса SpecialThread.
5.	Метод run класса SpecialThread должен выводить &quot;it&#39;s a run method inside SpecialThread&quot;.*/
public class task03 {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread th = new Thread(new SpecialThread());
            list.add(th);
            list.get(i).run();
        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
