package ArrayListnQues;
import java.util.ArrayList;

public class arrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(14);
        System.out.println(list);
        System.out.println(list.contains(12));  // boolean tells whether the list contains that certain value
        // list.set(index, value) used to set update or set value at a certain index
        // list.remove(index, value)
    }
}
