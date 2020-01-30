package javarush.JavaCore.lvl03.lec11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*taskKey="com.javarush.task.task13.task1326"
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
Требования:
1.	Программа должна считывать данные с консоли.
2.	Программа должна создавать FileInputStream для введенной с консоли строки.
3.	Программа должна выводить данные на экран.
4.	Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
5.	Программа должна закрывать поток чтения из файла(FileInputStream).*/
public class task11 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bf.readLine();
        BufferedReader fileStream = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\vadhe\\Desktop\\javarush\\test\\Javarush\\2. JavaCore\\task13\\task1326\\" + fileName + ".txt")));
        ArrayList<Integer> numberArr = new ArrayList<Integer>();
        while (fileStream.ready()) {
            int number = Integer.parseInt(fileStream.readLine());
            if (number % 2 == 0) numberArr.add(number);
        }
        Collections.sort(numberArr);
        for (Integer i : numberArr) {
            System.out.println(i);
        }
        fileStream.close();
    }
}
