package javarush.lvl4.lec10;
/*taskKey="com.javarush.task.task04.task0433"\n\nГадание на долларовый счет
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
Пример вывода на экран:
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
Требования:
1.	Программа не должна считывать текст c клавиатуры.
2.	Программа должна выводить текст на экран.
3.	Программа должна выводить квадрат из 10х10 букв S.
4.	В программе должен использоваться цикл while.
*/
public class task04 {
    public static void main(String[] args) {
        int i = 1, y = 1;
        while (y <= 10) {
            while (i <= 10) {
                System.out.print("S");
                i++;
            }
            System.out.println();
            y++;
            i = 1;
        }
    }
}
