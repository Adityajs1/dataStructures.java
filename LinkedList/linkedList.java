import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.addFirst(2);
        list.addLast(3);
        display(list);
    }
        public static void display(LinkedList<Integer> list) {
        for (Integer item : list) {
            System.out.print(item + " -> ");
        }
        System.out.println("null");
    }
}
