//LinkedList Implementation by scratch

public class implementation {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedList{
          Node head = null;
          Node tail = null;
          int size=0;

        // inserting a node in end of an ll
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
          }

        // inserting a node at beginning
        void insertAtBeginning(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        //inserting at any pos
        void insertAt(int index,int val){
            Node temp1 = new Node(val);
            if(index == 0){
                insertAtBeginning(val);
                return;
            }
            else if(index == size){
                insertAtEnd(val);
                return;
            }

            else if(index <0 || index > size){
                System.out.println("Wrong index!");
                return;
            }
            if(head == null){
                head = tail = temp1;
            }
            else{
                Node temp = head;
                 for(int i=1;i<index;i++){
                    temp = temp.next;
                 }
                  temp1.next = temp.next;
                  temp.next = temp1; 
            }
            size++;
        }

        // getting element from ll
        int getAt(int index){
            Node temp = head;
            if(index <0 || index > size){
                System.out.println("Wrong index!");
                return -1;
            }
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            return temp.data;
        }
        
        //deleting an element in ll
        void deleteAt(int index){
            Node temp = head;
            if(index <0 || index >= size){
                System.out.println("Wrong index!");
                return;
            }
            if(index==0){
                head = head.next;
                size--;
                return;
            }
            for(int i=1;i<index;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
            size--;
        }

        //displaying a linked list
        void display(){
          Node temp = head;
          while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
        
        //length of a ll
        // int size(){
        //     Node temp = head;
        //     int count=0;
        //     while(temp!=null){
        //      count++;
        //      temp = temp.next;
        //     }
        //     return count;
        // }

    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        // ll.display();
        ll.insertAtEnd(13);
        // ll.display();
        // System.out.println(ll.size);
        ll.insertAtBeginning(8);
        // ll.display();
        // ll.insertAt(3, 10);
        ll.display();
        // System.out.println(ll.getAt(2));
        ll.deleteAt(3);
        ll.display();
        System.out.println(ll.tail.data);   
    }
}
