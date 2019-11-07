package javarush.lectures.classes;
/*
Музей древностей.
Твоя задача — спроектировать класс Artifact.
Артефакты, которые хранятся в музее, бывают трех видов.
Первый — о которых неизвестно ничего, кроме порядкового номера, присвоенному музеем (например: 212121).
Второй — о которых известен порядковый номер и культура, которой он был создан (например: 212121, "Ацтеки").
Третий вид — о которых известен порядковый номер, культура, которой он был создан, и точный век его создания (например: 212121, "Ацтеки", 12).

Создай класс Artifact, описывающий хранящиеся в музее древности, и напиши необходимое количество конструкторов для него. В методе main() создай по одному артефакту каждого вида.*/
public class Artifact {
    String a_culture;
    int a_age;
    int a_id;

    static int count  = 0;

    public Artifact(){
        count++;
        this.a_id= count;
    }
    public Artifact(String a_culture){
        count++;
        this.a_id= count;
        this.a_culture=a_culture;
    }
    public Artifact(String a_culture, int a_age){
        count++;
        this.a_id= count;
        this.a_culture=a_culture;
        this.a_age=a_age;
    }
    public static void main(String[] args) {
        Artifact cap = new Artifact();
        Artifact sword = new Artifact("Sweden");
        Artifact bow = new Artifact("Apache", 5);
        System.out.println("#id:"+ cap.a_id + " | Culture:" + cap.a_culture + " | Age:" + cap.a_age);
        System.out.println("#id:"+ sword.a_id + " | Culture:" + sword.a_culture + " | Age:" + sword.a_age);
        System.out.println("#id:"+ bow.a_id + " | Culture:" + bow.a_culture + " | Age:" + bow.a_age);
    }
}
