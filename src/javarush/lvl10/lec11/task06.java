package javarush.lvl10.lec11;

/*taskKey="com.javarush.task.task10.task1013"
Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
Требования:
1.	Программа не должна считывать данные с клавиатуры.
2.	В классе Human должно быть 6 полей.
3.	Все поля класса Human должны быть private.
4.	В классе Human должно быть 10 конструкторов.
5.	Все конструкторы класса Human должны быть public.*/
public class task06 {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String race;
        private boolean sex;
        private int age;
        private int height;
        private int weight;

        public Human(String name, String race, boolean sex, int age, int weight, int height){
            this.age = age;
            this.name = name;
            this.race = race;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }
        public Human(String name, int age){
            this.age = age;
            this.name = name;
        }
        public Human(String name, String race){
            this.name = name;
            this.race = race;
        }
        public Human(String name, int age, int height, int weight ){
            this.age = age;
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
        public Human(){
            this.age = 0;
            this.name = null;
            this.race = null;
            this.sex = true;
            this.height = 0;
            this.weight = 0;
        }
        public Human(String name){
            this.name = name;
            this.weight = this.height = this.age = 0;
        }
        public Human(String name, String race, int age){
            this(name,race);
            this.age =age;
        }
        public Human(String name, boolean sex, int age){
            this(name, age);
            this.sex = sex;
        }
        public Human(String race, int age, int weight){
            this.name = null;
            this.age = age;
            this.weight = weight;
        }
        public Human(int age, int height, int weight){
            this.name = null;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }
    }
}
