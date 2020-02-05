package javarush.JavaCore.lvl04.lec02;
/*taskKey="com.javarush.task.task14.task1405"
Food
1. Реализовать интерфейс Selectable в классе Food.
2. Метод onSelect() должен выводить на экран фразу "food was selected".
3. Подумай, какие методы можно вызвать для переменной food и какие для selectable.
4. В методе foodMethods вызови методы onSelect, eat, если это возможно.
5. В методе selectableMethods вызови методы onSelect, eat, если это возможно.
6. Явное приведение типов не использовать.
Требования:
1.	Интерфейс Selectable должен быть реализован в классе Food.
2.	Метод onSelect() в классе Food должен выводить на экран фразу "food was selected".
3.	В методе foodMethods должны вызываться методы объекта типа Food.
4.	В методе selectableMethods должны вызываться методы доступные у любого объекта реализующего интерфейс Selectable.*/
public class task03 {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        food.onEat();
        food.onSelect();
    }

    public static void selectableMethods(Selectable selectable) {
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable{
        @Override
        public void onSelect() {
            System.out.println("The food was selected");
        }

        public void onEat() {
            System.out.println("The food was eaten");
        }
    }
}
