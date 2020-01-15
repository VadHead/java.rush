package javarush.JavaSyntax.lvl3.lec05;
/*taskKey="com.javarush.task.task03.task0312"
Конвертируем время
Добавь метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызови его дважды в методе main с любыми параметрами. Результаты выведи на экран, каждый раз с новой строки.
Требования:
1.	Добавь метод convertToSeconds, он должен быть public static, возвращать и принимать int.
2.	Метод convertToSeconds должен переводить переданные часы в секунды.
3.	Метод main должен дважды вызывать метод convertToSeconds.
4.	Метод main должен выводить результаты вызова на экран, каждый раз с новой строки.
5.	Метод convertToSeconds не должен ничего выводить на экран.
*/
public class task02 {
    public static int convertToSeconds(int hour){
        int sec;
        return sec= hour * 3600;
    }
    public static void main(String[] args) {
        System.out.println(convertToSeconds(2));
        System.out.println(convertToSeconds(3));

    }
}
