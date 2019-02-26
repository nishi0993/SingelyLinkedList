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
    }

    @Override
    public String toString() {
        StringBuilder response= new StringBuilder();//toreduce immutability of String

    }
}
