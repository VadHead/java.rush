package javarush.JavaCore.lvl02.lec12;

/*taskKey="com.javarush.task.task12.task1233"\n\nИзоморфы наступают
Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).
Требования:
1.	Класс Solution должен содержать класс Pair.
2.	Класс Solution должен содержать два метода.
3.	Класс Solution должен содержать метод getMinimumAndIndex().
4.	Метод getMinimumAndIndex() должен возвращать минимальное число в массиве и его позицию (индекс).*/
public class task13 {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
//        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
//        int[] sortedArr = Arrays.copyOf(array,array.length );
//        Arrays.sort(sortedArr);
//        int min = sortedArr[0];
//        System.out.println(Arrays.toString(sortedArr));
//        int index = Arrays.binarySearch(array, -2);
//        int index = Collections.singletonList(array).indexOf(-7);
//        List<Integer> sortedArr = Arrays.<Integer>asList(array);
        return new Pair<Integer, Integer>(min, index);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
