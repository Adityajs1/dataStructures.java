public class traverseRec {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void traverseRec(Node head){

        if(head == null){
            System.out.println();
            return;
        }

        System.out.println(head.data);

        if(head.next != null){
            System.out.println("->");
            head = head.next;
        }
        traverseRec(head.next);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);
    }
}
