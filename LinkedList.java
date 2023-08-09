import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{
    class Node{
        T data;
        Node next;
        Node(T val){
            data=val;
            next=null;
        }
        }
    Node head;
    LinkedList(){
            head=null;
        }

    public void insertAtBeginning(T val){
        Node newNode=new Node(val);
        if (head==null)
            head=newNode;
        else{
            newNode.next=head;
            head=newNode;
        }

    }

    public void traversal(){
        Node temp=head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp=temp.next;      
          }
        
    }

    public void reversal(){
        Node prv = null;
        Node current = head;
        Node next = current.next;

        while(current != null){
            next=current.next;
            current.next=prv;
            prv=current;
            current=next;
        }
        head=prv;
    }

    public void insertAtPos(int pos,T val){
        if (pos == 0){
            insertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        
        for(int i=1;i<pos;i++){
            temp=temp.next;
            if (temp==null){
                throw new IndexOutOfBoundsException("Invalid position: "+pos);
            }
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }

    public void deleteAtPos(int pos){
        if (head==null){
            throw new IndexOutOfBoundsException("Delection attemped on empty list:"+pos);
        }
        if (pos==0){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    public void get(int pos){
        Node temp=head;

        for (int i=1;i<=pos;i++){
            temp=temp.next;
            if (temp==null){
            throw new IndexOutOfBoundsException("list:"+pos);
        }
        }
        System.out.println(temp.data);
    }

    public void update(int pos,T val){
        Node temp = head;

        for (int i=1;i<=pos;i++){
            temp=temp.next;
            if (temp==null){
            throw new IndexOutOfBoundsException("list:"+pos);
        }
        }
        temp.data=val;
    }

    public void deleteAtEnd(){
        Node temp=head;
        Node prv=null;
        while(temp.next!=null){
            prv=temp;
            temp=temp.next;
        }
        prv.next=null; 
    }

    public void insertAtEnd(T val){
        Node newNode = new Node(val);
        Node prv=null;
        Node temp=head;
        if (temp==null)
            head=newNode;
        else
            while(temp!=null){
                prv=temp;
                temp=temp.next;
            }
            prv.next=newNode;
    }

    public void search(T val){
        Node temp=head;
        int pos=0;
        while(temp != null){
            if (temp.data == val){
            System.out.println(pos);
        }
            temp=temp.next; 
            pos++;     
          }
    }

    public boolean contains (T val){
        Node temp=head;
        boolean flag=false;
        while(temp != null){
            if (temp.data == val){
            flag=true;
        }
            temp=temp.next;      
          }
          return flag;
    }

    public void length (){
        Node temp = head;
        int len = 0;
        
        while(temp != null){
            temp=temp.next;
            len ++;
        }
        System.out.println(len);
    }


    public Iterator<T> iterator(){
        return new Iterator<T>() {
        Node temp = head;
        public boolean hasNext(){
            return temp !=null;

         }

        public T next(){
            T val = temp.data;
            temp=temp.next;
            return val;
         }

        };
    }

}