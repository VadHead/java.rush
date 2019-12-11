package javarush.lvl8.lec08;
import java.util.*;
/*taskKey="com.javarush.task.task08.task0818"\n\nТолько для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: «фамилия» - «зарплата».
Удалить из словаря всех людей, у которых зарплата ниже 500.
Требования:
1.	Программа не должна выводить текст на экран.
2.	Программа не должна считывать значения с клавиатуры.
3.	Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Integer состоящих из 10 записей по принципу &laquo;фамилия&raquo; - &laquo;зарплата&raquo;.
4.	Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.*/
public class task06 {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> contactsMap = new HashMap<String, Integer>();
        contactsMap.put("Gates", 500000);
        contactsMap.put("Jobs", 1);
        contactsMap.put("Wozniak", 40000);
        contactsMap.put("Mask", 1000000);
        contactsMap.put("Duck", 400);
        contactsMap.put("Loshara", 0);
        contactsMap.put("Pupkin", 300);
        contactsMap.put("New", 5674);
        contactsMap.put("Oldman", 150000);
        contactsMap.put("Presley", 99999);
        return contactsMap;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> contactsMap = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> salary : contactsMap.entrySet())
            if (salary.getValue() < 500) map.remove(salary.getKey());
    }

    public static void main(String[] args) {
        Map<String, Integer> contactsCopy = createMap();
        System.out.println(contactsCopy.toString());
        removeItemFromMap(contactsCopy);
        System.out.println(contactsCopy.toString());
    }
}
