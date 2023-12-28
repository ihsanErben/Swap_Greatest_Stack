
package W4_Exercises;


public class LinkedList {
    Node first;
    Node last;
    
    public void add(int data){
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
        }else{
            last.next = newNode;
        }
        last = newNode;
    }
    
    public void print(){
        Node tmp = first;
        while(tmp != null){
            System.out.print(tmp.data + ", ");
            tmp = tmp.next;
        }
        System.out.println();
    }
}
