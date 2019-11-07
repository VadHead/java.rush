package javarush.lvl3.lec12;
/*taskKey="com.javarush.task.task03.task0324"
Меркантильные намерения
Вывести на экран десять раз надпись "Я хочу большую зарплату, и для этого изучаю Java"
Требования:
1.	Программа не должна считывать данные с клавиатуры.
2.	Программа должна выводить текст.
3.	Текст должен начинаться с "Я хочу".
4.	Текст должен заканчиваться на "изучаю Java".
5.	Текст должен состоять из 10 строк.
6.	Выводимый текст должен соответствовать заданию.
*/
public class task01 {
    public static void main(String[] args) {
        for (int i=0; i<10;i++){
        System.out.print("Я");
        System.out.print(" хочу ");
        System.out.print("большую ");
        System.out.print("зарплату");
        System.out.print(", ");
        System.out.print("и ");
        System.out.print("для ");
        System.out.print("этого ");
        System.out.print("изучаю ");
        System.out.println("Java");
    }}
}
