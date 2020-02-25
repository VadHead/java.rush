package javarush.JavaCore.lvl05.lec06;
/*taskKey="com.javarush.task.task15.task1512"\n\nМаксимально простой код-2
Посмотри, что, связанное с конструкторами, может быть добавлено при компиляции, но в этой программе уже присутствует.
Упрости код - удали все конструкторы и вызовы конструкторов супер-классов, которые создаются и добавляются автоматически.
PS: Взаимосвязь между объектами классов NakedCat и NormalCat, SiamCat - Is-a (наследование): http://en.wikipedia.org/wiki/Is-a
Требования:
1.	Класс NormalCat должен быть потомком класса NakedCat.
2.	Класс SiamCat должен быть потомком класса NormalCat.
3.	Упрости код класса NakedCat.
4.	Упрости код класса NormalCat.*/
public class task02 {
    public static void main(String[] args) {
        SiamCat simka = new SiamCat("Simka");
        NakedCat nakedSimka = simka.shave();
    }

    public static class NakedCat {

    }

    public static class NormalCat extends NakedCat {
        public NormalCat() {
        }

        public NormalCat(String name) {
            System.out.println("My name is " + name);
        }

        public NakedCat shave() {
            return this;
        }
    }

    public static class SiamCat extends NormalCat {
        public SiamCat(String name) {
            super(name);
        }
    }
}
