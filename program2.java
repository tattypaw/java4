import java.util.Scanner;
import java.util.LinkedList;

public class program2 {
    public static void main(String[] args) {
    /* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя. */
    
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(getRandomNumber());
        }
        System.out.println(list);

        Scanner iScanner = new Scanner(System.in, "Cp866");
        
        System.out.print("Выберите действие: \n 1) - помещает элемент в конец очереди, \n 2) - возвращает первый элемент из очереди и удаляет его, \n 3) - возвращает первый элемент из очереди, не удаляя.\n");
        int choise = iScanner.nextInt();
        switch (choise) {
            case 1:
                System.out.print("Введите число: ");
                int n = iScanner.nextInt();
                enqueue(list, n);
                break;
            case 2:
                System.out.println(dequeue(list));
                break;
            case 3:
                System.out.println(first(list));
                break;
            default:                
                System.out.print("Такой операции нет");
                break;
        }
        System.out.println(list);
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = list.get(0);
        return num;
    }

    public static int getRandomNumber() { 
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}