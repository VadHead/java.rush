package javarush.lvl7.lec04;
import java.io.*;
/*taskKey="com.javarush.task.task07.task0705"\n\nОдин большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
Требования:
1.	Программа должна создавать большой массив на 20 целых чисел.
2.	Программа должна считывать с клавиатуры 20 чисел для большого массива.
3.	Программа должна создавать два маленьких массива на 10 чисел каждый.
4.	Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести второй маленький массив на экран.*/
public class task05 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] numbersArr = new int[20];
        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(bf.readLine());
        }
        int[] firstArr = new int[10];
        int[] secondArr = new int[10];
        for (int i = 0; i < 10; i++) {
            firstArr[i] = numbersArr[i];
        }
        for (int i = 10; i < numbersArr.length; i++) {
            int y = 0;
            secondArr[y] = numbersArr[i];
            System.out.println(secondArr[y]);
            y++;
        }
    }
}

