public class Node {

    private  Zvire data;
    private Node next;
    private Node previous;

    public Node(Zvire data) {
        this.data = data;
        this.next = null;
        this.next = null;
    }
    public Node getPrev() {
        return previous;
    }
    public void setPrev(Node head) {
        this.previous = head;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Zvire getData() {
        return data;
    }
    public void setData(Zvire data) {
        this.data = data;
    }
}
