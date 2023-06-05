//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
//        Посмотрите на код, и подумайте сколько разных типов исключений
//        вы тут сможете получить?
//        Реализуйте метод, принимающий в качестве аргументов два целочисленных
//        массива, и возвращающий новый массив, каждый элемент которого равен разности
//        элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
//        необходимо как-то оповестить пользователя.
//        * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//        и возвращающий новый массив, каждый элемент которого равен частному элементов
//        двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
//        как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
//        которое пользователь может увидеть - RuntimeException, т.е. ваше.

import static java.lang.Integer.parseInt;

public class Main {
    // task1
    public static double divide(int x, int y){
        return x/y;
    }
    public static void foreach(int [] array){
        for(int i = 0; i < 100; i ++){
            System.out.println(array[i]);
        }
    }
    public static int myParseInt(String s){
        return parseInt(s);
    }
    //task3, 4
    public static int[] diffOrDiv(int [] ar1, int [] ar2, boolean flag) {
        try {
            int l = 0;
            if (ar1.length < ar2.length) {
                l = ar2.length;
            } else {
                l = ar1.length;
            }
            int[] res = new int[l];
            if (!flag) {
                for (int i = 0; i < res.length; i++) {
                    res[i] = ar1[i] - ar2[i];
                }
                return res;
            } else {
                for (int i = 0; i < res.length; i++) {
                    res[i] = ar1[i] /ar2[i];
                }
                return res;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("arrays of different lengths");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
       return new int[0];
    }
    public static void main(String[] args) {
        // task1
        System.out.println(myParseInt("6"));
        int [] array = {1,2,3};
        foreach(array);
        divide(1,0);

        //task2
        // NumberFormatException, ArrayIndexOutOfBoundsException

        // task3 and 4
        int [] ar1 = {1,2,3,4,5,6};
        int []ar2 = {3,1,5,6,7};
        int [ ] res = diffOrDiv(ar1,ar2,true);
        for (int el:res) {
            System.out.print(el+" ");
        }
    }
}