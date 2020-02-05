package javarush.JavaSyntax.lvl6.lec11;
/*taskKey="com.javarush.task.task06.task0617"\n\nБлокнот для новых идей
1. В классе Solution создать public static класс Idea
2. В классе Idea создать метод public String getDescription(), который будет возвращать любой непустой текст
3. В классе Solution создай статический метод public void printIdea(Idea idea), который будет выводить
на экран описание идеи - это то, что возвращает метод getDescription
Требования:
1.	В классе Solution создать public static класс Idea.
2.	В классе Idea создать метод public String getDescription().
3.	Метод getDescription должен возвращать любой непустой текст.
4.	В классе Solution создайте метод public static void printIdea(Idea idea).
5.	Метод printIdea должен выводить описание идеи на экран.*/
public class task05 {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static class Idea{
        public String getDescription(){
            return "Hi there!";
        }
    }

    public static void printIdea(Idea idea){
        String ideaS = idea.getDescription();
        System.out.println(ideaS);
    }
}