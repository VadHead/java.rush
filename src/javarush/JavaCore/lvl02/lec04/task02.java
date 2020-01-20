package javarush.JavaCore.lvl02.lec04;
/*taskKey="com.javarush.task.task12.task1207"\n\nInt и Integer
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
Требования:
1.	Класс Solution должен содержать статический метод main().
2.	Класс Solution должен содержать статический void метод print() с параметром типа int.
3.	Класс Solution должен содержать статический void метод print() с параметром типа Integer.
4.	Метод main() должен вызывать метод print() с параметром типа int.
5.	Метод main() должен вызывать метод print() с параметром типа Integer.*/
public class task02 {
    public static void main(String[] args) {
        print(13);
        print((Integer) 2);
    }
    public static void print(int n){
        System.out.println("int Number " + n);
    }
    public static void print(Integer i){
        System.out.println("Integer " + i);
    }
}
