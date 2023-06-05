import java.util.InputMismatchException;
import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//        и возвращает введенное значение. Ввод текста вместо числа не должно приводить
//        к падению приложения, вместо этого, необходимо повторно запросить у пользователя
//        ввод данных.
//        2. Если необходимо, исправьте данный код
//        (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
//
//        Дан следующий код, исправьте его там, где требуется
//        (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
//
//        Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую
//        строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Main {
    // task1
    public static float inputF(){
        float res;
        while (true){
            try{
                Scanner cs = new Scanner(System.in);
                System.out.println("input float number: ");
                res = cs.nextFloat();
                return res;
            }catch (InputMismatchException e){
                System.out.println("Format Error. Please repeat input: ");
            }

        }

    }
    //task2
//    try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d; при обращении к массиву неизвестна длина
//        System.out.println("catchedRes1 = " + catchedRes1);
//    } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//    }catch (IndexOutOfBoundsException e) {
//        System.out.println("Catching exception: " + e);
//    }

//    task3
//public static void main(String[] args) throws Exception {
//    try {
//        int a = 90;
//        int b = 3;
//        System.out.println(a / b);
//        printSum(23, 234);
//        int[] abc = {1, 2};
//        abc[3] = 9;
//    } catch (NullPointerException ex) {
//        System.out.println("Указатель не может указывать на null!");
//    } catch (IndexOutOfBoundsException ex) {
//        System.out.println("Массив выходит за пределы своего размера!");
//    }catch (ArithmeticException ex){
//        System.out.println("деление на ноль!"); // если b может меняться
//    }
//    }catch (Exception ex) {
//        System.out.println("Что-то пошло не так...");
//}
//    public static void printSum(Integer a, Integer b) {
//        System.out.println(a + b);
//    }
public static void inputAll(){
        while (true){
            String line;
            try{
                System.out.println("Input text: ");
                Scanner sc = new Scanner(System.in);
                line = sc.nextLine();
                if (!line.isEmpty()){
                    System.out.println(line);
                return;}
                else throw new RuntimeException();
            }catch (RuntimeException e){
                System.out.println("You input is " + e.getMessage()+ ". Line is empty. Repeat input!");
            }
        }
}
    public static void main(String[] args) {
        //task1
        inputF();
        //task4
        inputAll();
    }
}