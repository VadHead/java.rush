package javarush.JavaCore.lvl06.lec07;
/*taskKey="com.javarush.task.task16.task1611"\n\nЧасы
1. Разберись, что делает программа.
2. Реализуй логику метода printTikTak:
2.1. Через первые полсекунды должна выводиться в консоль фраза: Tik
2.2. Через вторые полсекунды должна выводиться в консоль фраза: Tak
Требования:
1.	Метод printTikTak должен выводить две строчки: &quot;Tik&quot; и &quot;Tak&quot;.
2.	Метод printTikTak должен работать примерно секунду.
3.	Метод printTikTak должен два раза заснуть на полсекунды. Используй метод Thread.sleep(500).
4.	В консоли не должно быть сообщений после фразы &quot;Double-check&quot;.
5.	Метод main должен создавать объект типа Clock.*/
public class task01 {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        System.out.println("The clock has to be stopped");
        Thread.sleep(2000);
        System.out.println("Double-check");
    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTikTak();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTikTak() throws InterruptedException {
           Thread.sleep(500);
           System.out.println("Tik");
           Thread.sleep(500);
           System.out.println("Tak");
        }
    }
}
