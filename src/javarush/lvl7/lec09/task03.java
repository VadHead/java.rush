package javarush.lvl7.lec09;
import java.util.*;
/*taskKey="com.javarush.task.task07.task0715"\n\nПродолжаем мыть раму
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Вывести результат на экран, каждый элемент списка с новой строки.
Требования:
1.	Программа не должна считывать данные с клавиатуры.
2.	Объяви переменную типа список строк и сразу проинициализируй ee.
3.	Добавь в список слова: &laquo;мама&raquo;, &laquo;мыла&raquo;, &laquo;раму&raquo;.
4.	После каждого слова добавь в список строку, содержащую слово &laquo;именно&raquo;.
5.	Выведи элементы списка на экран, каждый с новой строки.*/
public class task03 {
    public static void main(String[] args)  throws  Exception{
        String[] phrase = {"мама", "мыла", "раму"};
        ArrayList<String> phrasesArr = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            phrasesArr.add(phrase[i]);
            phrasesArr.add("именно");
        }
        for (String s : phrasesArr) {
            System.out.println(s);
        }
    }
}
