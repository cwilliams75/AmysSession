import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {

    public static void main(String[] args) {
        //ArrayList example
        ArrayList alist = new ArrayList();
        alist.add(45);
        alist.add("Kindson");
        alist.add("A");
        System.out.println(alist);


        ArrayList list2 = new ArrayList();
        list2.add("Staff");
        list2.add(100);

        System.out.println(list2);

// the addAll method will add the list from one and add it to your destination list
        alist.addAll(list2);
        System.out.println(alist);

        System.out.println(alist.indexOf("A"));

        System.out.println(alist.lastIndexOf("A"));

        alist.remove(0);
        System.out.println(alist);


//        //LinkedList example
//        LinkedList llist = new LinkedList();
//        llist.add(45);
//        llist.add("Kindson");
//        llist.add("A");
//        System.out.println(llist);
    }
}
