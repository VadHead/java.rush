package javarush.JavaCore.lvl04.lec08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*taskKey="com.javarush.task.task14.task1420"
НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
Требования:
1.	Программа должна считывать с клавиатуры 2 строки.
2.	В случае если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
3.	Программа должна выводить данные на экран.
4.	Программа должна выводить на экран наибольший общий делитель(НОД) чисел считанных с клавиатуры и успешно завершаться.*/
public class task12 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int first = 0;
        int second = 0;
        try {
            first = Integer.parseInt(bf.readLine());
            second = Integer.parseInt(bf.readLine());
            if (first <= 0 || second <= 0) throw new Exception();

        } catch (Exception e) {
            throw e;
        }

        int div1 = first % second;
        int div2 = second % first;
        int max = Math.max(div1, div2);
        System.out.println(max);

//        while (second !=0) {
//            int tmp = first%second;
//            first = second;
//            second = tmp;
//        }
//        System.out.println(first);

    }
}
