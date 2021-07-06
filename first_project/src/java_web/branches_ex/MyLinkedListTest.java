package java_web.branches_ex;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<Integer> ll = new MyLinkedList<Integer>(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        System.out.println(ll.toString());
        System.out.println("\n\n\n--------End Code--------");
    }
}
