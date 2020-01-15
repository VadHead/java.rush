package javarush.JavaSyntax.lvl4.lec02;
/*taskKey="com.javarush.task.task04.task0404"
Учет котов
Напиши код в методе addNewCat, чтобы при его вызове количество котов увеличивалось на 1.
За количество котов отвечает переменная catsCount.
Требования:
1.	Класс Cat должен содержать только одну переменную catsCount.
2.	Переменная catsCount должна быть статической, иметь модификатор доступа private, тип int и проинициализирована нулем.
3.	Класс Cat должен содержать два метода addNewCat и main.
4.	Метод addNewCat класса Cat должен увеличивать количество котов на 1.
*/
public class task02 {
        private static int catsCount = 0;
        public static void addNewCat() {
            task02.catsCount++;
        }
        public static void main(String[] args) {
        }
    }
