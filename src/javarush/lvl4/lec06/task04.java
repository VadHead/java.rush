package javarush.lvl4.lec06;
import java.io.*;
/*taskKey="com.javarush.task.task04.task0421"\n\nНастя или Настя?
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны».
Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
Если имена и длины имен разные - ничего не выводить.
Требования:
1.	Программа должна считывать две строки c клавиатуры.
2.	Программа должна содержать System.out.println() или System.out.print()
3.	Если имена одинаковые вывести сообщение &quot;Имена идентичны&quot;
4.	Если имена разные, но их длины равны , вывести сообщение &quot;Длины имен равны&quot;
5.	Если имена и длины имен разные - ничего не выводить.*/
public class task04 {
    public static void main(String[] args) throws Exception{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first name: ");
        String firstName = buffer.readLine();
        System.out.print("Enter second name: ");
        String secondName = buffer.readLine();

        if (firstName.equals(secondName)) {
            System.out.println("Имена идентичны");
        } else if (firstName.length() == secondName.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
