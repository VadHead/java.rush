package javarush.lvl8.lec11;
import java.io.*;
import java.util.*;
/*taskKey="com.javarush.task.task08.task0822"\n\nМинимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
Требования:
1.	Программа должна выводить текст на экран.
2.	Программа должна считывать значения с клавиатуры.
3.	Класс Solution должен содержать только три метода.
4.	Метод getIntegerList() должен считать с клавиатуры число N, потом вернуть список размером N элементов, заполненный числами с клавиатуры.
5.	Метод getMinimum() должен вернуть минимальное число среди элементов списка.
6.	Метод main() должен вызывать метод getIntegerList().
7.	Метод main() должен вызывать метод getMinimum().*/
public class task04 {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        return Collections.min(array);
    }
    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        List<Integer> integerList = new LinkedList<Integer>();
        for (int i = 0; i < N; i++) {
            integerList.add(Integer.parseInt(bf.readLine()));
        }
        return integerList;
    }
}