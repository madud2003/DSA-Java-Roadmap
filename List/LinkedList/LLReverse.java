public class LLReverse {
    Node head;
    private int size;

    LLReverse(){
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

    public void reverseIterate(){

        if (head == null || head.next == null) {
            return ;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nexNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nexNode;

        }

        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head){

        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }


    public static void main(String[] args) {
        LLReverse list = new LLReverse();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}
