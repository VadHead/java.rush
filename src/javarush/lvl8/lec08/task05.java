package javarush.lvl8.lec08;
import java.util.*;

/*taskKey="com.javarush.task.task08.task0817"\n\nНам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
Требования:
1.	Программа не должна выводить текст на экран.
2.	Программа не должна считывать значения с клавиатуры.
3.	Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
4.	Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5.	Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().*/
public class task05 {
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
        return contacsMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> contactCopy = new HashMap<String, String>(map);
        for (String firstPair : contactCopy.values()) {
            int count = 0;
            for (String secondPair : contactCopy.values()) {
                if (firstPair.equals(secondPair)) count++;
            }
            if (count > 1) removeItemFromMapByValue(map, firstPair);
        }
    }
    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> qwe = createMap();
        System.out.println(qwe);
        removeTheFirstNameDuplicates(qwe);
        System.out.println(qwe);
    }
}
