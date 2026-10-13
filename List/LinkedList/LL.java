

public class LL {

    Node head;
    private int size;

    LL(){
        size = 0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFrist(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return ;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    public void printList(){
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        if (head == null) {
            System.out.println("The list is empty");
        }

        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
        }

        size--;

        if (head.next == null) {
            head = null;
            return ;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }

        secondLastNode.next = null;

    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFrist("a");
        list.addFrist("is");
        list.addFrist("This");
        list.printList();

        list.addLast("list");
        list.printList();

        list.deleteFirst();
        list.printList();;

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

        list.addFrist("This");
        System.out.println(list.getSize());


    }
}
