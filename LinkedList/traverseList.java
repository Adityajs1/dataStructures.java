public class traverseList {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void traverseList(Node head){
        while(head != null){
            System.out.print(head.data);
            if(head.next != null){
                System.out.print(" -> ");
            }
            head = head.next;
        }
    }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        traverseList(head);
    }
}
