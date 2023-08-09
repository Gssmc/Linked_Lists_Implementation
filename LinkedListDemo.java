import java.util.Iterator;

public class LinkedListDemo{
    public static void main (String arg[]){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insertAtBeginning(9);
        list.insertAtBeginning(27);
        list.insertAtBeginning(5);
        //list.insertAtPos(2,9);
        //list.deleteAtPos(0);
        //list.get(4);
        //list.update(1,1);
        //list.deleteAtEnd();
        //list.insertAtEnd(8);
        //list.search(9);
        //boolean cont = list.contains(9);
        //System.out.println(cont);
        //list.length();
        list.reversal();
        //list.traversal();

        //for(int a:list){
        //    System.out.print(a+" ");
        //}
        
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        
    }
}