class Node {
    int data;
    Node next;
    Node random;
    Node(){
        //this.next = null;
    }

    Node(int data){
        this.data = data;
        //this.next = null;
    }
}

public class class15 {
    public static Node cloneLinkedList(Node head){
        Node original  = head;

        while(original != null && original.next != null){
            Node newNode = new Node(original.data);
            newNode.next = original.next;
            original.next = newNode;
            original = original.next.next;
        }
        original.next = new Node(original.data);
        original = head;
        while(original != null && original.next != null){
            if(original.random != null){
                original.next.random = original.random.next;
            }
            original = original.next.next;
        }
        original = head;
        Node clone = head.next;
        Node cloneHead = clone;
        while(original != null && clone.next != null){
            original.next = original.next.next;
            if(clone.next != null){
                clone.next = clone.next.next;
            }
            original = original.next;
            clone = clone.next;
        }
        original.next = null;
        return cloneHead;
        
    }
    public static void main(String[] args) {
        Node head = NodeUse.createRandomLinkedList(5);
        NodeUse.print(head);
        head = cloneLinkedList(head);
        NodeUse.print(head);
    }
    
}