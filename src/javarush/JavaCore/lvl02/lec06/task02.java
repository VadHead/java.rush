package javarush.JavaCore.lvl02.lec06;
/*taskKey="com.javarush.task.task12.task1212"\n\n«Исправь код», часть 1
Исправь код, чтобы программа компилировалась.
Подсказка: метод getChild должен остаться абстрактным.
Требования:
1.	Класс Pet должен быть статическим.
2.	Класс Pet должен иметь два метода.
3.	Метод getChild() должен быть абстрактным.
4.	Класс Pet должен быть объявлен с модификатором, который запрещает создавать конкретные объекты этого класса.*/
public class task02 {
    public static void main(String[] args) {

    }

    public abstract static class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract void getChild();
    }
}