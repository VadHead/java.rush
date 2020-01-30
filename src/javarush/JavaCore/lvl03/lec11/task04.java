package javarush.JavaCore.lvl03.lec11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

/*taskKey="com.javarush.task.task13.task1319"
Писатель в файл с консоли
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
Требования:
1.	Программа должна считывать c консоли имя файла.
2.	Создай и используй объект типа BufferedWriter.
3.	Программа не должна ничего читать из файловой системы.
4.	Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
5.	Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
6.	Метод main должен закрывать объект типа BufferedWriter после использования.*/
public class task04 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bf.readLine();
        BufferedWriter bfWriter = new BufferedWriter(new FileWriter("D://" + fileName + ".txt"));

        while (true) {
            String consoleString = bf.readLine();
            bfWriter.write(consoleString);
            bfWriter.newLine();
            if (consoleString.equals("exit")) {
                break;
            }
        }
        bf.close();
        bfWriter.close();
    }
}
