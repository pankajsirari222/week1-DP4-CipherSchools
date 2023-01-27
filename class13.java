import java.util.*;

public class class13 {
    Scanner sc = new Scanner(System.in);
    Node head;
    Node k;
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            next=null;
        }
        
    }
    public void createList(int n){
        int c;
        for(int i=0;i<n;i++){
            if(i==0){
                c=sc.nextInt();
                Node d = new Node(c);
                d.next=head;
                head=d;
                k=head;
            }else{
                c=sc.nextInt();
                Node d = new Node(c);
                k.next=d;
                k=d;
                
            }
        }
    }
    public void insertBeg(int v){
         Node c =new Node(v);
         c.next=head;
         head=c;
    }
    public void insertMid(int v,int pos){
         Node c =new Node(v);
         Node f =head;
         int i=1;
         while(f!=null){
             if(i==pos){
                 c.next=f.next;
                 f.next=c;
             }
             i=i+1;
             f=f.next;
         }
         
         
    }
     public void insertEnd(int v){
         Node c =new Node(v);
         Node f =head;
         while(f!=null){
             if(f.next==null){
                 f.next=c;
                 c.next=null;
             }
             f=f.next;
         }
         
    }
    public void deleteBeg(){
        head=head.next;
    }
    public void deleteMid(int post){
        int i=1;
        Node f= head;
        while(f!=null){
            if(i==post-1){
                f.next=f.next.next;
            }
            i=i+1;
            f=f.next;
        }
        
    }
    public void sort(){
        Node i=head;
        int t;
        Node j = i.next;
        while(i!=null){
            j=i.next;
            while(j!=null){
                if(i.data>j.data){
                    t=i.data;
                    i.data=j.data;
                    j.data=t;
                }
                j=j.next;
            }
            i=i.next;
        }
    }
    public void deleteEnd(){
        Node f = head;
        while(f!=null){
            if(f.next.next==null){
                f.next=null;
                break;
            }
            f=f.next;
        }
    }
    public void search(int r){
        int l=0;
        Node f = head;
        while(f!=null){
            if(f.data==r){
                System.out.println("Date Found");
                l=1;
                break;
            }
            f=f.next;
        }
        if(l==0){
            System.out.println("Data Not Found");
        }
        
    }
    public void printList(){
        System.out.println("The list is:");
        Node f = head;
        while(f!=null){
            System.out.print(f.data+" ");
            f=f.next;
        }
    }
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	   
		class13 m = new class13();
		System.out.println("Insert The Elements---");
		int g = s.nextInt();
		m.createList(g);
		System.out.println("1 for Insertion AT the Begininning"+"\n"+"2 for Insertion AT the Middle"+"\n"+"3 for Insertion AT the End");
		System.out.println("4 for Deletion AT the Begininning"+"\n"+"5for Deletion AT the Middle"+"\n"+"6 for Deletion AT the End");
		System.out.println("7 for Searching"+"\n"+"8 for Traversal"+"\n"+"9 for Sorting");
		int requirement = s.nextInt();
		
switch (requirement) {
  case 1:
      System.out.println("Enter Data TO BE Inserted :");
      int q = s.nextInt();
    m.insertBeg(q);
    
    
    break;
  case 2:
      System.out.println("Enter Data TO BE Inserted :");
      int q2 = s.nextInt();
      System.out.println("Enter the position where it has TO BE Inserted :");
      int position=s.nextInt();
      
      //m.insertEnd(q1);
      m.insertMid(q2,position);
      
    break;
  case 3:
       System.out.println("Enter Data TO BE Inserted :");
      int q1 = s.nextInt();
      m.insertEnd(q1);
      m.printList();
    break;
  case 4:
    m.deleteBeg();
    break;
  case 5:
      System.out.println("Enter Position TO BE Deleted :");
      int q4 = s.nextInt();
    m.deleteMid(q4);
    break;
  case 6:
   m.deleteEnd();
    break;
  case 7:
      int q5=s.nextInt();
    m.search(q5);
    break;
  case 8:
      m.printList();
      break;
  case 9:
      m.sort();
      break;
}
	m.printList();	
}
}
