import java.util.HexFormat;

 abstract class LinkedList { 
    class Node{
                int data;
                 Node next;
          public Node (){
             data=0;
           next=null;
       } 
          public Node(int data){
              this.data=data;
              next =null;
       }
    } 
abstract void addNode(int data);
abstract void insertAtLast(int data);
abstract void insertAtStart(int data);
abstract void insertAtPosition(int pos,int data);
 
abstract void display();
    }  
class Singlylinkedlist extends LinkedList{
    Node head;
    Node tail; 
    Singlylinkedlist(){
        head=null;
        tail=null;
    }
    void addNode(int data){
        insertAtLast(data);
    }
    int length(){
        int length=0;
        Node temp=head;
        while(temp!=null){
           length++;
           temp=temp.next;
        }
        return length;

    }
        public void display()  
     {  
         Node n = head;  
            while (n != null)  
              {  
                System.out.print(n.data+" \n");  
                 n = n.next;   
         }  

    }  
    void insertAtLast(int data){
        Node n1= new Node(data);
        if(head==null){
            head =n1;
            tail=n1;
        }
        else{
        tail.next=n1;
        tail=n1;  
        } 
    }
    void insertAtStart(int data){
        Node n1= new Node(data);
        if(head==null){
            head =n1;
            tail=n1;
        }
        else{
            n1.next=head;
            head=n1;
        }
        
    }
    void insertAtPosition(int pos,int data){
        if(pos==1){
             insertAtStart(data);
        }
        else if (pos==length()) {
            insertAtLast(data);
        } else {
          
            
        }
    }

 public static void main(String[] args) {
    LinkedList L1= new Singlylinkedlist();
    L1.addNode(10);
    L1.addNode(20);
    L1.display();
 }   
} 
class DoublyLinkedList extends LinkedList{
    Node head;
    Node next;
    Node previous;
    DoublyLinkedList(){
       head=null;
       next=null;
       previous=null;
    }

    void addNode(int data){
       insertAtLast(data);
    }
    void insertAtLast(int data){
        Node n1= new Node(data);

        if (head==null){
            head=n1;
            head.next=null;
            head.previous=null;
        }
             else{ 
                
               Node temp=head;
               while(temp!=null){
                temp=temp.next;
               }
               temp.next=n1;
               n1.previous=temp;
               n1.next=null;
    }
    
    }

}
    
