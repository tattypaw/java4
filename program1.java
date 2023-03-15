import java.util.LinkedList;

public class program1 {
    public static void main(String[] args) {
    //Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), 
    //который вернет “перевернутый” список.

    LinkedList<Integer> list = new LinkedList<>();

    for (int i = 0; i < 10; i++) {
        list.add(getRandomNumber());
    }
    System.out.println(list);

    System.out.print(reverse(list));
    
}
    public static LinkedList reverse(LinkedList<Integer> list) {
        LinkedList<Integer> list_new = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list_new.add(list.getLast());   
            list.removeLast(); 
        }
        return list_new;
    }

    public static int getRandomNumber() { 
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }   
    
}

