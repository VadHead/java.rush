package javarush.JavaCore.lvl05.lec12.task04;
/*taskKey="com.javarush.task.task15.task1524"\n\nПорядок загрузки переменных
Разберись, что и в какой последовательности инициализируется. Поставь брейкпойнты и используй дебаггер.
Исправить порядок инициализации данных так, чтобы результат был следующим:
static void init()
Static block
public static void main
Non-static block
static void printAllFields
0
null
task06 constructor
static void printAllFields
6
First name
Требования:
1.	Программа должна выводить данные на экран.
2.	Вывод на экран должен соответствовать условию задачи.
3.	Результатом работы статического инициализатора класса task06 должен быть вывод на экран строк &quot;static void init()&quot; и &quot;Static block&quot;.
4.	Программа не должна считывать данные с клавиатуры.*/
public class task06 {

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";
    static {
        init();
    }

    public task06() {
        System.out.println("task06 constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }
    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        task06 s = new task06();
    }

    public static void printAllFields(task06 obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
