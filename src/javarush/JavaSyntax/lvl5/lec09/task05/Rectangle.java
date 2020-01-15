package javarush.JavaSyntax.lvl5.lec09.task05;
/*taskKey="com.javarush.task.task05.task0520"
Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
Требования:
1.	У класса Rectangle должны быть переменные top, left, width и height с типом int.
2.	У класса должен быть хотя бы один конструктор.
3.	У класса должно быть хотя бы два конструктора.
4.	У класса должно быть хотя бы три конструктора.
5.	У класса должно быть хотя бы четыре конструктора.*/
public class Rectangle {
    public int top, left, width, height;

    public Rectangle(int top, int left, int width, int height) {
        this.height = height;
        this.left = left;
        this.top = top;
        this.width = width;
    }

    public Rectangle(int top, int left) {
        this.height = 0;
        this.left = left;
        this.top = top;
        this.width = 0;
    }

    public Rectangle(int top, int left, int width) {
        this.height = width;
        this.left = left;
        this.top = top;
        this.width = width;
    }

    public Rectangle(Rectangle rectangle) {
        this.height = rectangle.height;
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
    }
    public static void main(String[] args) {

    }
}
