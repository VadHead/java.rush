package javarush.JavaSyntax.lvl7.lec04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*taskKey="com.javarush.task.task07.task0702"\n\nМассив из строчек в обратном порядке
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
Требования:
1.	Программа должна создавать массив на 10 строк.
2.	Программа должна считывать 8 строк для массива с клавиатуры.
3.	Программа должна выводить на экран 10 строк, каждую с новой строки.
4.	Программа должна выводить на экран массив (10 элементов) в обратном порядке.*/
public class task02 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String[] words = new String[10];
        for (int i = 0; i < words.length - 2; i++){
            words[i] = bf.readLine();
        }
        for (int i = 9; i >= 0; i--){
            System.out.println(words[i]);
        }
    }
}
