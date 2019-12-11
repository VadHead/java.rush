package javarush.lvl8.lec08;
import java.util.*;
/*taskKey="com.javarush.task.task08.task0815"\n\nПерепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
Требования:
1.	Программа не должна выводить текст на экран.
2.	Программа не должна считывать значения с клавиатуры.
3.	Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей по принципу &laquo;Фамилия&raquo; - &laquo;Имя&raquo;.
4.	Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5.	Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.*/
public class task03 {
    public static Map<String, String> createMap() {
        Map<String ,String> contacsMap = new HashMap<String, String>();
        contacsMap.put("Gates","Bill");
        contacsMap.put("Jobs","Steve");
        contacsMap.put("Wozniak","Steve");
        contacsMap.put("Mask","Elon");
        contacsMap.put("Duck","Dick");
        contacsMap.put("Loshara","Vasya");
        contacsMap.put("Pupkin","Vasya");
        contacsMap.put("New","Something");
        contacsMap.put("Oldman","Garry");
        contacsMap.put("Presley","Garry");
        System.out.println(contacsMap.toString());
        return contacsMap;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> contact: map.entrySet()) {
            if (contact.getValue().equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> contact: map.entrySet()) {
            if (contact.getKey().equals(lastName)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        createMap();

    }
}
