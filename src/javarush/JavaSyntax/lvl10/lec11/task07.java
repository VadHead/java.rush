package javarush.JavaSyntax.lvl10.lec11;
/*taskKey="com.javarush.task.task10.task1014"
Расставьте минимум static-ов
Расставьте как можно меньше модификаторов static так, чтобы пример скомпилировался.
Требования:
1.	В классе должна быть переменная A.
2.	В классе должна быть переменная B.
3.	В классе должна быть переменная C.
4.	В классе должна быть переменная D.
5.	Метод main не изменять.
6.	Метод getA не изменять.*/
public class task07 {
        public int A = 5;
        public static int B = 5;
        public static int C = 5;
        public static int D = 5;

        public static void main(String[] args) {
            task07 task07 = new task07();
            task07.A = 5;
            task07.B = 5 * B;
            task07.C = 5 * C * D;
            task07.D = 5 * D * C;

            task07.D = 5;
        }
    public int getA() {
        return A;
    }
}

