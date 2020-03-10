package javarush.JavaCore.lvl06.lec13.task12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new ClassOne());
        threads.add(new ClassTwo());
        threads.add(new ClassThree());
        threads.add(new ClassFour());
        threads.add(new ClassFive());
    }

    public static void main(String[] args) {
        for (Thread th: threads){
            th.start();
        }
    }

    public static class ClassOne extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }


    public static class ClassTwo extends Thread {
        @Override
        public void run() {
            try {
                this.join();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ClassThree extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class ClassFour extends Thread implements Message {
        @Override
        public void showWarning() {
            this.interrupt();
        }

        @Override
        public void run() {
            while (!this.isInterrupted()) {
            }
        }
    }

    public static class ClassFive extends Thread {
        @Override
        public void run() {
            try {
                BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
                String s;
                int sum = 0;
                while (!(s = bf.readLine()).equals("N")) {
                    sum += Integer.parseInt(s);
                }
                System.out.println(sum);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
