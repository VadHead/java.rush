package javarush.JavaCore.lvl05.lec09;
/*taskKey="com.javarush.task.task15.task1516"\n\nЗначения по умолчанию
1. Создать 7 public полей класса. Убедитесь, что они инициализируются дефолтными значениями.
intVar типа int
doubleVar типа double
DoubleVar типа Double
booleanVar типа boolean
ObjectVar типа Object
ExceptionVar типа Exception
StringVar типа String
2. В методе main вывести их значения в заданном порядке.

Требования:
1.	В классе Solution должно быть объявлено поле intVar типа int.
2.	В классе Solution должно быть объявлено поле doubleVar типа double.
3.	В классе Solution должно быть объявлено поле DoubleVar типа Double.
4.	В классе Solution должно быть объявлено поле booleanVar типа boolean.
5.	В классе Solution должно быть объявлено поле ObjectVar типа Object.
6.	В классе Solution должно быть объявлено поле ExceptionVar типа Exception.
7.	В классе Solution должно быть объявлено поле StringVar типа String.
8.	Метод main должен выводить значения полей на экран(каждое с новой строки или через пробел) в заданном порядке. Инициализировать переменные не нужно.*/
public class task03 {
    public int intVar;
    public double doubleVar;
    public Double staticDoubleVar;
    public boolean staticbooleanVar;
    public Object staticObjectVar;
    public Exception staticExceptionVar;
    public String staticStringVar;

    public static void main(String[] args) {
        task03 task = new task03();

        System.out.println(task.intVar);
        System.out.println(task.doubleVar);
        System.out.println(task.staticDoubleVar);
        System.out.println(task.staticbooleanVar);
        System.out.println(task.staticObjectVar);
        System.out.println(task.staticExceptionVar);
        System.out.println(task.staticStringVar);

    }
}
