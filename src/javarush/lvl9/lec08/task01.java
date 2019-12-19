package javarush.lvl9.lec08;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
/*taskKey="com.javarush.task.task09.task0913"\n\nИсключения. Просто исключения.
Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных от RuntimeException:
NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.
Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
ArithmeticException и URISyntaxException. Как это сделать?
Требования:
1.	Метод main должен вызывать метод method1.
2.	Метод main должен перехватывать исключение NullPointerException.
3.	Метод main должен перехватывать исключение FileNotFoundException.
4.	Метод main не должен перехватывать исключение ArithmeticException.
5.	Метод main не должен перехватывать исключение URISyntaxException.
6.	Метод method1 не изменять.*/
public class task01 {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        }catch (NullPointerException e){

        }catch (FileNotFoundException e){

        }
    }
    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0) {
            throw new NullPointerException();
        } else if (i == 1) {
            throw new ArithmeticException();
        } else if (i == 2) {
            throw new FileNotFoundException();
        } else if (i == 3) {
            throw new URISyntaxException("", "");
        }
    }
    }
