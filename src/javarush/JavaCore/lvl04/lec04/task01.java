package javarush.JavaCore.lvl04.lec04;
/*taskKey="com.javarush.task.task14.task1403"\n\nBuilding и School
1. Расставь правильно наследование между Building(здание) и School(здание школы).
2. Подумай, объект какого класса должны возвращать методы getSchool и getBuilding.
3. Измени null на объект класса Building или School.
P.S. Сигнатуры методов getSchool и getBuilding не меняй.
Требования:
1.	Класс School должен наследоваться от класса Building.
2.	Метод getSchool должен возвращать новую школу(School).
3.	Метод getBuilding должен возвращать новое здание(Building).
4.	Класс School должен быть статическим.
5.	Класс Building должен быть статическим.*/
public class task01 {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {

        return new School();
    }

    public static Building getBuilding() {

        return new Building();
    }

    static class School extends Building {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building  {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
