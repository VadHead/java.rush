package javarush.JavaSyntax.lvl8.lec11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*taskKey="com.javarush.task.task08.task0828"
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is the 5 month».
Используйте коллекции.
Требования:
1.	Программа должна считывать одно значение с клавиатуры.
2.	Программа должна выводить текст на экран.
3.	Программа должна использовать коллекции.
4.	Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.*/
public class task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine().toLowerCase();
        String monthName = input.substring(0, 1).toUpperCase() + input.substring(1);
        int monthIndex = 0;

        String[] monthsNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        /*HashMap<String, Integer> monthsMap = new HashMap<String, Integer>();
        for (int i = 0; i < 12; i++) {
            monthsMap.put(monthsNames[i], i + 1);
        }
        if (monthsMap.containsKey(monthName)) {
            monthIndex = monthsMap.get(monthName);
        }*/

        ArrayList<String> monthsList = new ArrayList<String>();
        Collections.addAll(monthsList, monthsNames);
        if (monthsList.contains(monthName)){
            monthIndex = monthsList.indexOf(monthName) + 1;
        }
//        System.out.println(monthsList.toString());
        System.out.println(monthName + " is the " + monthIndex + " month");
    }
}
