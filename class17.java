public class class17 {
    class Node{
        int data;
        int min;
        Node next;
        public Node(int data,int min){
            this.data=data;
            this.min=min;
            next=null;

        }
    }
    Node head;
    public void push(int x){
        if(head==null){
            Node n = new Node(x,x);
            head = n;
        }else{
            Node n = new Node(x,Math.min(x,head.min));
            n.next=head;
            head=n;
        }
    }
    public void pop(){
        if(head!=null){
            head=head.next;
        }
    }
    public int top(){
        if(head!=null){
            return head.data;
            
        }
        return -1;
    }
    public int getMin(){
        if(head!=null){
            return head.min;
            
        }
        return -1;
    }
    public static void main(String[] args) {
        class17 s = new class17();
        s.push(2);
        s.push(21);
        s.push(12);
        s.push(32);
        s.push(28);
        System.out.println(s.getMin());
    }
}