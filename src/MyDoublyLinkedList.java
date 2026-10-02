
public class MyDoublyLinkedList {

    private Node tail;
    private Node head;

    public void addFirst(Zvire zvire) {
        Node newNode = new Node(zvire);
        if (head == null) {
            head =  newNode;
            tail  =  newNode;
        }
        else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head  =  newNode;
        }
    }

    public void vypisZvirata(){
        if (head == null) {
            System.out.println("list is empty");
            return;
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.getData().toString());
                current = current.getNext();
            }
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        else {
            head = head.getNext();

        }
    }

    public void olderThenFive() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        } else {
            Node current = head;
            while (current != null) {
                if (current.getData().getVek() > 5){
                    System.out.println(current.getData().toString());
                }
                current = current.getNext();
            }
        }
    }

    public void oldest() {
        Node oldest = head;
        if (head == null) {
            System.out.println("list is empty");
            return;
        } else {
            Node current = head;
            while (current != null) {
                if  (current.getData().getVek() > oldest.getData().getVek()) {
                    oldest = current;
                }
                current = current.getNext();
            }
        }
        System.out.println(oldest.getData().toString());
    }

}
