package javarush.JavaSyntax.lvl4.lec02;
/*taskKey="com.javarush.task.task04.task0405"
Задаем количество котов
Напишите метод setCatsCount. Метод должен устанавливать количество котов (catsCount).
Требования:
1.	Класс Cat должен содержать только одну переменную catsCount.
2.	Переменная catsCount должна быть статической, иметь модификатор доступа private, тип int и проинициализирована нулем.
3.	Класс Cat должен содержать два метода setCatsCount и main.
4.	Метод setCatsCount класса Cat должен устанавливать значение переменной catsCount равным переданному параметру.
*/
public class task03 {
        private static int catsCount = 0;
        public static void setCatsCount(int catsCount) {
            task03.catsCount = catsCount;
        }
        public static void main(String[] args) {
            System.out.println(catsCount);
        }
    }

