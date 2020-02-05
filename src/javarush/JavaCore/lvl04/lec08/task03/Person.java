package javarush.JavaCore.lvl04.lec08.task03;

public interface Person {
    class User implements Person {
        void live() {
            System.out.println("I usually just live.");
        }
    }

    class Loser implements Person {
        void doNothing() {
            System.out.println("I usually do nothing.");
        }
    }

    class Coder implements Person {
        void writeCode() {
            System.out.println("I usually write code.");
        }
    }

    class Proger implements Person {
        void enjoy() {
            System.out.println("It's a wonderful life!");
        }
    }
    class Kirill implements Person {
        void watch() {
            System.out.println("It's a wonderful day for YouTube watching!");
        }
    }

}
