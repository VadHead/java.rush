package javarush.JavaCore.lvl06.lec10;
/*taskKey="com.javarush.task.task16.task1619"\n\nА без interrupt слабо?

Разберись, как работает программа.
Сделай так, чтобы в методе ourInterruptMethod можно было сделать так, чтобы нить TestThread завершилась сама.
Нельзя использовать метод interrupt.

Требования:
1.	В классе Solution должен быть публичный статический метод ourInterruptMethod без параметров.
2.	Метод run должен выводить надпись &quot;he-he&quot; каждые пол секунды, пока не будет вызван метод ourInterruptMethod.
3.	Необходимо изменить условие цикла while в методе run.
4.	Метод main должен создавать объект типа Thread передавая в конструктор объект типа TestThread.
5.	Метод main должен вызывать метод start у объекта типа Thread.
6.	Метод main должен вызывать метод ourInterruptMethod.*/
public class task04 {
    private static boolean isCancel = false;
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        isCancel = true;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (!isCancel) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
