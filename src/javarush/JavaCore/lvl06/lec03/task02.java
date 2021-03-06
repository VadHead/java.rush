package javarush.JavaCore.lvl06.lec03;
/*taskKey="com.javarush.task.task16.task1602"\n\nMy second thread

1. Создать public static класс TestThread, унаследованный от класса Thread.
2. Создать статик блок внутри TestThread, который выводит в консоль "it's a static block inside TestThread".
3. Метод run должен выводить в консоль "it's a run method".

Требования:
1.	Добавь в класс Solution публичный статический класс TestThread.
2.	Класс TestThread должен быть унаследован от класса Thread.
3.	Класс TestThread не должен реализовывать какие-либо дополнительные интерфейсов.
4.	Создать статик блок внутри TestThread, который выводит в консоль &quot;it&#39;s a static block inside TestThread&quot;.
5.	Метод run класса TestThread должен выводить &quot;it&#39;s a run method&quot;.
6.	Метод main не изменять.*/
public class task02 {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }

    public static class TestThread extends Thread {
        @Override
        public void run() {
            System.out.println("it's a run method");
        }

        static {
            System.out.println("it's a static block inside TestThread");
        }
    }
}
