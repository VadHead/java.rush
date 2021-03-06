package javarush.JavaSyntax.lvl9.lec06;
/*taskKey="com.javarush.task.task09.task0909"\n\nИсключение при работе с массивами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
Требования:
1.	Программа должна выводить сообщение на экран.
2.	В программе должен быть блок try-catch.
3.	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
4.	Выведенное сообщение должно содержать тип возникшего исключения.
5.	Имеющийся код в методе main не удалять.*/
public class task03 {
    public static void main(String[] args) {
        try {
            int[] m = new int[2];
            m[8] = 5;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
