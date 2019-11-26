package javarush.lvl6.lec08.task05;
import java.io.*;
/*taskKey="com.javarush.task.task06.task0610"\n\nКласс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.
Требования:
1.	Метод readString должен считывать и возвращать строку(тип String).
2.	Метод readInt должен считывать и возвращать число(тип int).
3.	Метод readDouble должен считывать и возвращать дробное число(тип double).
4.	Метод readBoolean должен считывать и возвращать логическую переменную(тип boolean).*/
public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bf.readLine();
        return inputString;
    }

    public static int readInt() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int inputInt = Integer.parseInt(bf.readLine());
        return inputInt;
    }
    public static double readDouble() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double inputDouble = Double.parseDouble(bf.readLine());
        return inputDouble;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Boolean inputBoolean = Boolean.parseBoolean(bf.readLine());
        return inputBoolean;
    }

    public static void main(String[] args) throws Exception {

    }
}
