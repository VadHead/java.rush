package javarush.lvl9.lec11;
/*taskKey="com.javarush.task.task09.task0925"\n\nСтатики не на своем месте
Расставь модификаторы static так, чтобы пример скомпилировался.
Требования:
1.	В классе должна быть переменная A.
2.	В классе должна быть переменная B.
3.	В классе должна быть переменная C.
4.	Метод main не изменять.
5.	Метод getA не изменять.
6.	В классе должно быть 3 статических поля.*/
public class task07 {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static  int D = A * B;

    public static void main(String[] args) {
        task07 room = new task07();
        room.A = 5;

        task07.D = 5;
    }

    public int getA() {
        return A;
    }

}
