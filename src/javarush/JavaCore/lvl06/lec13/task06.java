package javarush.JavaCore.lvl06.lec13;
/*taskKey="com.javarush.task.task16.task1626"\n\nСоздание по образцу

Разберись, как работает программа.
По образу и подобию CountdownRunnable создай нить CountUpRunnable, которая выводит значения в нормальном порядке - от 1 до number.

Требования:
1.	Класс CountUpRunnable должен реализовывать интерфейс Runnable.
2.	Класс CountUpRunnable должен иметь публичный метод run без параметров.
3.	Метод run класса CountUpRunnable должен работать примерно 2,5 секунды.
4.	Метод run класса CountUpRunnable должен каждые полсекунды выводить имя потока, двоеточие и значение счетчика от 1 до 5 (например: &quot;Увеличиваем: 1&quot;).
5.	Метод run класса CountUpRunnable должен вызывать Thread.sleep(500).*/
public class task06 {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = task06.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }

    public static class CountUpRunnable implements Runnable {
        private int countIndexUp = 1;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexUp += 1;
                    Thread.sleep(500);
                    if (countIndexUp -1  == task06.number) return;
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp;
        }
    }

    }
