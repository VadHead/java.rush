package javarush.lectures.classes;
/*Вы создаете базу данных пользователей для сайта знакомств.
Да вот беда — вы подзабыли в каком порядке их нужно указывать, а технического задания под рукой нет.
Спроектируйте класс User,  у которого будут поля — имя (String) возраст (short) и рост (int).
Создайте для него необходимое количество конструкторов, чтобы имя, возраст и рост можно было указывать в любом порядке.*/
public class User {
    String name;
    short age;
    int height;
    public User(String name, short age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public User (String name, int height, short age){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public User (short age, String name, int height){
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public User (short age, int height, String name){
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public User (int height, short age, String name){
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public User (int height, String name, short age){
        this.age = age;
        this.name = name;
        this.height = height;
    }
    public static void main(String[] args) {
        User user1 = new User("Kirill", 180, (short)32);
        User user2 = new User(182,"Vadya",(short)29);
        User user3 = new User((short)34,"Yura", 179);
        User user4 = new User("Dasha",(short) 34,160);
        User user5 = new User((short) 30,163, "Viko");
        User user6 = new User(172,(short) 26, "Yana");

        System.out.println("Name:" + user1.name + " | Height:" + user1.height + " | Age:" + user1.age);
        System.out.println("Name:" + user2.name + " | Height:" + user2.height + " | Age:" + user2.age);
        System.out.println("Name:" + user3.name + " | Height:" + user3.height + " | Age:" + user3.age);
        System.out.println("Name:" + user4.name + " | Height:" + user4.height + " | Age:" + user4.age);
        System.out.println("Name:" + user5.name + " | Height:" + user5.height + " | Age:" + user5.age);
        System.out.println("Name:" + user6.name + " | Height:" + user6.height + " | Age:" + user6.age);
    }
}
