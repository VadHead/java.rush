package javarush.lvl3.lec06;
/*taskKey="com.javarush.task.task03.task0314"
Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
Требования:
1.	Программа должна выводить текст.
2.	Выведенный текст должен содержать 10 строк.
3.	Каждая выведенная строка должна содержать 10 чисел, разделенных пробелом.
4.	Выведенные числа должны быть таблицей умножения.*/
public class task02 {
    public static void main(String[] args) {
        for (int x =1; x <= 10; x++){
            for (int y=1; y<= 10;y++){
                int z = x*y;
                System.out.print(z + " ");
            }
            System.out.println();
        }

    }
}
