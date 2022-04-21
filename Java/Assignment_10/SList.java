package Assignment_10;

public class SList<T> {


    private SList<T> next;
    private T data;

    public SListIterator iterator(){
        return new SListIterator(this);
    }

    public void setData(T data){
        this.data = data;
    }

    public void setNext(SList<T> next){
        this.next = next;
    }

    public SList<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public String toString(){
        return data.toString();
    }

    public static void main(String[] args) {
        SList<Integer> singlyLinkedList = new SList<>();
        SListIterator listIterator  = singlyLinkedList.iterator();

        System.out.println(listIterator.hasNext());
        listIterator.insert(1);
        listIterator.insert(2);
        listIterator.insert(3);
        listIterator.remove(3);
        listIterator.insert(4);
        listIterator.insert(5);

        System.out.println(listIterator.hasNext());
        listIterator.printList();
    }
}

