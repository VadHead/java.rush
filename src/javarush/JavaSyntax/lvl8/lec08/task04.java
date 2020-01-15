package javarush.JavaSyntax.lvl8.lec08;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/*taskKey="com.javarush.task.task08.task0816"\n\nДобрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
Требования:
1.	Программа не должна выводить текст на экран.
2.	Программа не должна считывать значения с клавиатуры.
3.	Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4.	Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.*/
public class task04 {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Вадим", dateFormat.parse("MARCH 13 1990"));
        map.put("Яна", dateFormat.parse("FEBRUARY 3 1993"));
        map.put("Шварц", dateFormat.parse("DECEMBER 1 1949"));
        map.put("Жан", dateFormat.parse("JANUARY 17 1950"));
        map.put("Кек", dateFormat.parse("AUGUST 29 1800"));
        map.put("Чебурек", dateFormat.parse("MAY 6 2000"));
        map.put("Вася", dateFormat.parse("OCTOBER 19 1920"));
        map.put("Маша", dateFormat.parse("JULY 4 2022"));
        map.put("Няша", dateFormat.parse("MAY 17 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        HashMap<String, Date> mapCopy = new HashMap<String, Date>(map);
        for (Map.Entry<String, Date> human : mapCopy.entrySet()) {
            if (human.getValue().getMonth() > 4 && human.getValue().getMonth() < 8) {
                map.remove(human.getKey());
                System.out.println(human.toString());
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> temp = createMap();
        System.out.println(temp.toString());
        removeAllSummerPeople(temp);
        System.out.println(temp.toString());
    }
}
