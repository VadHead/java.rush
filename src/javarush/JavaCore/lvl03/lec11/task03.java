package javarush.JavaCore.lvl03.lec11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*taskKey="com.javarush.task.task13.task1318"\n\nЧтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
Требования:
1.	Программа должна считывать c консоли имя файла.
2.	Программа должна выводить на экран содержимое файла.
3.	Поток чтения из файла (FileInputStream) должен быть закрыт.
4.	BufferedReader также должен быть закрыт.*/
public class task03 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bf.readLine();
        bf.close();

        FileInputStream fileStream = new FileInputStream(fileName);
        while (fileStream.available() > 0) {
            System.out.write(fileStream.read());
        }
        fileStream.close();
    }
}
