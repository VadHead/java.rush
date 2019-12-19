package javarush.lvl9.lec08;

import java.io.IOException;
import java.rmi.RemoteException;

/*taskKey="com.javarush.task.task09.task0916"\n\nПерехват checked-исключений
В методе handleExceptions обработайте все checked исключения.
Нужно вывести на экран возникшее checked исключение.
Можно использовать только один блок try..catch
Требования:
1.	Метод handleExceptions должен вызывать метод method1.
2.	Метод handleExceptions должен вызывать метод method2.
3.	Метод handleExceptions должен вызывать метод method3.
4.	Метод handleExceptions должен использовать только один блок try..catch.
5.	Метод handleExceptions должен отлавливать и выводить на экран все возникающие checked исключения.
6.	Программа должна выводить на экран текст.*/
public class task04 {
    public static void main(String[] args) {
            handleExceptions(new task04());
    }

    public static void handleExceptions(task04 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }catch (RemoteException re){
            System.out.println(re);
        }catch (IOException ioe){
            System.out.println(ioe);
        }catch (NoSuchFieldException nsf){
            System.out.println(nsf);
        }
    }
    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }
    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
