package javarush.lvl7.lec09;
import java.util.*;
/*taskKey="com.javarush.task.task07.task0716"\n\nР или Л
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
Требования:
1.	Программа не должна считывать данные с клавиатуры.
2.	Метод fix должен удалять из списка строк все слова, содержащие букву &quot;р&quot;. Исключение: слова содержащие и букву &quot;р&quot; и букву &quot;л&quot; - их нужно оставить.
3.	Метод fix должен удваивать слова, содержащие букву &quot;л&quot; (добавлять еще один элемент с этим словом). Исключение: слова содержащие и букву &quot;л&quot; и букву &quot;р&quot; - их не нужно удваивать.
4.	Метод fix не должен ничего делать со словами, содержащими и букву &quot;л&quot; и букву &quot;р&quot;.
5.	Метод fix не должен ничего делать со словами, которые не содержат ни букву &quot;л&quot;, ни букву &quot;р&quot;.*/
public class task04 {
    public static void main(String[] args){
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }
    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size();i++) {
            if (strings.get(i).contains("р") && !strings.get(i).contains("л")) {
                strings.remove(i);
                i--;
            } else if (strings.get(i).contains("л") && !strings.get(i).contains("р")) {
                strings.add(i+1,strings.get(i));
                i++;
            }
        }
        return strings;
        }
}
