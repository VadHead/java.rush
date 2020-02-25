package javarush.JavaCore.lvl06.lec03;
/*taskKey="com.javarush.task.task16.task1601"\n\nMy first thread
Создать public static class TestThread - нить с интерфейсом Runnable.
TestThread должен выводить в консоль "My first thread".

Требования:
1.	Добавь в класс Solution публичный статический класс TestThread.
2.	Класс TestThread должен реализовывать интерфейс Runnable.
3.	Метод run класса TestThread должен выводить &quot;My first thread&quot;.
4.	Программа должна вывести &quot;My first thread&quot;.
5.	Метод main не изменять.*/
public class task01 {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }

    public static class TestThread implements Runnable {
        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }
}
