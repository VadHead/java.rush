package javarush.lvl8.lec06;
import java.util.*;
import java.io.*;
/*taskKey="com.javarush.task.task08.task0812"\n\nCамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
Требования:
1.	Программа должна выводить число на экран.
2.	Программа должна считывать значения с клавиатуры.
3.	В методе main объяви переменную типа ArrayList с типом элементов Integer и сразу проинициализируй ee.
4.	Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5.	Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.*/
public class task06 {
    public static void main(String[] args) throws IOException{
        List<Integer> listArr = new ArrayList<Integer>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            listArr.add(Integer.parseInt(bf.readLine()));
        }
        /*int max = 1, count = 1;
        for (int i = 1; i < listArr.size(); i++) {
            if (listArr.get(i) == listArr.get(i - 1)) {
                count++;
                if (max < count) max = count;
            } else count = 1;
        }*/
        int number = listArr.get(0);
        int count = 0;
        int maxCount = 0;
        for (Integer item : listArr) {
            if (number == item) {
                count++;
                if (count > maxCount) maxCount = count;
            } else {
                number = item;
                count = 1;
            }
        }
        System.out.println(maxCount);
    }

}


