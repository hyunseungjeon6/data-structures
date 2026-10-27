public class Node<E>{
    public E data;
    public Node<E> next;

    public Node(E data){
        this.data = data;
        this.next = null;
    }
    public Node(E data, Node<E> next){
        this.data = data;
        this.next = next;
    }

    public Node<E> getNext(){return this.next;}

    public void setNext(Node<E> next){this.next=next;}

    public E getData(){return this.data;}

    public void setData(E data){this.data=data;}
}
