package W4_Exercises;

public class Stack {

    int size;
    Node first;

    public void push(int x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public int pop() {
        int a = (first.data);
        first = first.next;
        return a;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void print() {
        Node tmp = first;
        while (tmp != null) {

            System.out.print(tmp.data + ", ");
            tmp = tmp.next;
        }
        System.out.println("");
    }

    public void swap(Stack a) {
        LinkedList x = new LinkedList();
        x.add(a.pop());
        x.add(a.pop());
        a.push(x.first.data);
        a.push(x.first.next.data);
        System.out.println("----------");
        print();
        System.out.println("----------");
    }

    public int greatest(Stack x) {
        Stack newStack = new Stack();
        int max = 0;
        while (!x.isEmpty()) {

            int current = x.pop();
            newStack.push(current);
            if (current > max) {
                max = current;
            }
        }
        while (!newStack.isEmpty()) {
            int depo = newStack.pop();
            x.push(depo);
        }
        return max;
    }
    
    public void doubles(Stack x){
        Stack newStack = new Stack();
        while(!x.isEmpty()){
            int current = x.pop();
            newStack.push(current);
            newStack.push(current);
        }
        while(!newStack.isEmpty()){
            int current2 = newStack.pop();
            x.push(current2);
        }
        System.out.println("-------");
        x.print();
        System.out.println("-------");
    }

}
