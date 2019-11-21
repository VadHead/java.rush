package javarush.lvl4.lec10;
/*taskKey="com.javarush.task.task04.task0431"\n\nОт 10 до 1
Вывести на экран числа от 10 до 1 используя цикл while. Каждое значение с новой строки.
Требования:
1.	Программа не должна считывать числа c клавиатуры.
2.	Программа должна выводить числа на экран.
3.	Каждое значение должно быть выведено с новой строки.
4.	Программа должна выводить числа от 10 до 1.
5.	В программе должен использоваться цикл while.*/
public class task02 {
    public static void main(String[] args) {
        int number = 10;
        while (number >= 1){
            System.out.println(number);
            number--;
        }
    }
}
