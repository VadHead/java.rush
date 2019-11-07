package javarush.lvl3.lec04;
/*taskKey="com.javarush.task.task03.task0307"
Привет Starcraft!
Создать 5 зергов, 3 протоссов и 4 терран.
Дать им всем уникальные имена.
Требования:
1.	Нужно создать 5 объектов типа Zerg и каждому из них дать свое имя.
2.	Нужно создать 3 объектов типа Protoss и каждому из них дать свое имя.
3.	Нужно создать 4 объектов типа Terran и каждому из них дать свое имя.
4.	Нельзя изменять классы Zerg, Protoss и Terran.
*/
public class task03 {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.name = "Tipok";//напишите тут ваш код
        Zerg zerg2 = new Zerg();
        zerg2.name = "Tipo4ek";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Tipulya";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Tiponya";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Tiputi4ka";

        Protoss prot1 = new Protoss();
        prot1.name = "Protik";
        Protoss prot2 = new Protoss();
        prot2.name = "Protya";
        Protoss prot3 = new Protoss();
        prot3.name = "Protan";

        Terran terr1 = new Terran();
        terr1.name = "Terrik";
        Terran terr2 = new Terran();
        terr2.name = "Terrya";
        Terran terr3 = new Terran();
        terr3.name = "Terran";
        Terran terr4 = new Terran();
        terr4.name = "Terrun";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}

