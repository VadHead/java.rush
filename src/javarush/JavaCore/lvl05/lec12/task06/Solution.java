package javarush.JavaCore.lvl05.lec12.task06;
/*taskKey="com.javarush.task.task15.task1525"\n\nФайл в статическом блоке
1. Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по-отдельности в List lines.
Требования:
1.	Константа FILE_NAME не должна быть пустой.
2.	В статическом блоке все строки из файла с именем FILE_NAME должны быть добавлены по-отдельности в список lines.
3.	Поле FILE_NAME НЕ должно быть final.
4.	Класс Solution должен содержать список lines.*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(Statics.FILE_NAME));
            String line;
            while ((line = bf.readLine()) != null) {
                lines.add(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println(lines);
    }
}