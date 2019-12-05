package javarush.lvl7.lec12;
import java.io.*;
import java.util.*;
/*taskKey="com.javarush.task.task07.task0722"\n\nЭто конец
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
Требования:
1.	Объяви переменную типа список строк и сразу проинициализируй ee.
2.	Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку &quot;end&quot;.
3.	Саму строку &quot;end&quot; не нужно добавлять в список.
4.	Выведи список на экран, каждое значение с новой строки.
5.	Используй цикл for.*/
public class task04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringsArr = new ArrayList<String>();
        while (true) {
            String entry = reader.readLine();
            if (entry.equals("end")) {
                break;
            }
            stringsArr.add(entry);
        }
        for (int i = 0; i < stringsArr.size(); i++) {
            System.out.println(stringsArr.get(i));
        }
    }
}
