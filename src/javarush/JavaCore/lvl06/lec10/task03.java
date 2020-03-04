package javarush.JavaCore.lvl06.lec10;
/*taskKey="com.javarush.task.task16.task1618"\n\nСнова interrupt

Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().

Требования:
1.	Класс TestThread должен быть унаследован от Thread.
2.	Класс TestThread должен иметь public void метод run.
3.	Метод main должен создавать объект типа TestThread.
4.	Метод main должен вызывать метод start у объекта типа TestThread.
5.	Метод main должен вызывать метод interrupt у объекта типа TestThread.*/
public class task03 {
    public static void main(String[] args) throws InterruptedException {
        TestThread test = new TestThread();
        test.start();
        test.interrupt();
    }

    //Add your code below
    public static class TestThread extends Thread {
        @Override
        public void run() {

        }
    }
}
