package javarush.JavaSyntax.lvl7.lec04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*taskKey="com.javarush.task.task07.task0703"\n\nОбщение одиноких массивов
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
Требования:
1.	Программа должна создавать массив на 10 строк.
2.	Программа должна создавать массив на 10 целых чисел.
3.	Программа должна считывать строки для массива с клавиатуры.
4.	Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран.*/
public class task03 {
    public static void main(String[] args) throws Exception{
        String[] words = new String[10];
        int[] numbers = new int[10];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < words.length; i++){
            words[i] = bf.readLine();
            numbers[i] = words[i].length();
        }
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
    }
}
