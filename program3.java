import java.util.Scanner;
import java.util.LinkedList;

public class program3 {
    public static void main(String[] args) {
    
        /* Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа ->
В калькулятор добавьте возможность отменить последнюю операцию.*/

        Scanner iScanner = new Scanner(System.in, "Cp866");
        LinkedList<Double> num = new LinkedList();
        LinkedList<String> znak = new LinkedList();
        double n1;
        double n2;
        String z = "";

        System.out.println("Калькулятор");
        System.out.print("Введите первое число n1: ");
        n1 = iScanner.nextDouble();
        num.add(n1);
        boolean flag = true;
        while (flag) {
        System.out.print("Что будем делать? Введите знак операции (+, -, *, /; для отмены предыдущей операции наберите -1; конец работы stop): ");
        z = iScanner.next();
        znak.add(z);
        switch (z) {
            case "+":
                System.out.print("Введите следующее число: ");
                n2 = iScanner.nextDouble();
                System.out.println(n1 + n2);
                num.add(n1 + n2);
                break;
            case "-":
            System.out.print("Введите следующее число: ");
            n2 = iScanner.nextDouble();
                System.out.println(n1 - n2);
                num.add(n1 - n2);
                break;
            case "*":
            System.out.print("Введите следующее число: ");
                n2 = iScanner.nextDouble();
                System.out.println(n1 * n2);
                num.add(n1 * n2);
                break;
            case "/":
            System.out.print("Введите следующее число: ");
                n2 = iScanner.nextDouble();
                if (n2 == 0) {
                    System.out.println("Делить на ноль нельзя!");
                    num.add(num.getLast());
                } else {
                    System.out.println(n1 / n2);
                    num.add(n1 / n2);}
                break;
            case "stop":
                flag = false;
                break;
            case "-1":
                    if (num.size()>1) {
                        num.removeLast();
                    } else { 
                        System.out.println("Отмена невозможна"); 
                    }
                    if (znak.size()>0) {
                    znak.removeLast();
                } else { 
                    System.out.println("Отмена невозможна"); 
                }
                break;
            default:                
                System.out.println("Такой операции нет");
                break;
        }
        n1 = num.getLast(); 
    }
    }
}       
