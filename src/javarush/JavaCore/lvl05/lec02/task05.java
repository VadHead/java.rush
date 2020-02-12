package javarush.JavaCore.lvl05.lec02;

import java.util.ArrayList;
import java.util.List;

/*taskKey="com.javarush.task.task15.task1505"\n\nООП - исправь ошибки в наследовании
Исправь метод containsBones и всю связанную с ним логику так, чтобы:
1. Поведение программы осталось прежним.
2. Метод containsBones должен возвращать тип Object и значение "Yes" вместо true, "No" вместо false

Требования:
1.	Метод containsBones в классе BodyPart должен иметь тип возвращаемого значения Object.
2.	Класс Finger должен быть потомком класса BodyPart.
3.	Метод containsBones в классе Finger должен иметь тип возвращаемого значения Object.
4.	Метод containsBones в классе BodyPart должен возвращать строку &quot;Yes&quot;.
5.	Метод containsBones в классе Finger должен возвращать строку &quot;Yes&quot;, если метод containsBones в классе BodyPart возвращает &quot;Yes&quot; и флаг isArtificial равен false, если приведенное условие не выполняется - вернуть &quot;No&quot;.
6.	Метод toString в классе BodyPart должен возвращать строку формата &quot;name(имя части тела) содержит кости&quot;, если метод containsBones возвращает &quot;Yes&quot; для этой части тела, а если &quot;No&quot;, то строку формата &quot;name(имя части тела) не содержит кости&quot;.
*/
public class task05 {
    public static interface LivingPart {
        Object containsBones();
    }

    public static class BodyPart implements LivingPart {
        private String name;

        public BodyPart(String name) {
            this.name = name;
        }

        public Object containsBones() {
            return "Yes";
        }

        public String toString() {
            return containsBones().equals("Yes") ? name + " содержит кости" : name + " не содержит кости";
        }
    }

    public static class Finger extends BodyPart {
        private boolean isArtificial;

        public Finger(String name, boolean isArtificial) {
            super(name);
            this.isArtificial = isArtificial;
        }

        public Object containsBones() {
            return super.containsBones().equals("Yes") && !isArtificial ? "Yes" : "No";
        }
    }

    public static void main(String[] args) {
        printlnFingers();
        printlnBodyParts();
        printlnLivingParts();
    }

    private static void printlnLivingParts() {
        System.out.println(new BodyPart("Рука").containsBones());
    }

    private static void printlnBodyParts() {
        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
        bodyParts.add(new BodyPart("Рука"));
        bodyParts.add(new BodyPart("Нога"));
        bodyParts.add(new BodyPart("Голова"));
        bodyParts.add(new BodyPart("Тело"));
        System.out.println(bodyParts.toString());
    }

    private static void printlnFingers() {
        List<Finger> fingers = new ArrayList<Finger>(5);
        fingers.add(new Finger("Большой", true));
        fingers.add(new Finger("Указательный", true));
        fingers.add(new Finger("Средний", true));
        fingers.add(new Finger("Безымянный", false));
        fingers.add(new Finger("Мизинец", true));
        System.out.println(fingers.toString());
    }
}
