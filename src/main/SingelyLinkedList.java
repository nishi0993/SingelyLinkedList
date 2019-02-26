package main;

public class SingelyLinkedList {
    private class Node
    {
        private int data;
        private Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = null;
        }

    }
    private Node head=null;
    private int size=0;

    public static void main(String[] args) {
        SingelyLinkedList linkedList=new SingelyLinkedList();
        System.out.println(linkedList);
        linkedList.insert(66);
       linkedList.insert(42);
       /* for (int i = 0; i < 5; i++) {
            linkedList.insert(i+1);
        }*/
        System.out.println(linkedList);
    }

    @Override
    public String toString() {
        StringBuilder response= new StringBuilder();//toreduce immutability of String
        response.append("[");//to have brackets while printing
        Node temp=this.head;//copy so that actual head do not change
        while(temp !=null)
        {
            response.append(temp.getData());//add data in response
            if(temp.next!=null)
            {
                response.append(" ==> ");
            }
            temp=temp.next;
        }
        response.append("]");
        return response.toString();
    }
    private void insertHead(int data)
    {
      Node newNode=new Node(data,this.head);
      this.head=newNode;
      size++;
    }


    }
}
