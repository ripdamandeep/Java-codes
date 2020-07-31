public class CircularBeg
{  
        public class Node
        {  
            int data;  
            Node next;  
            public Node(int data) 
            {  
                this.data = data;  
            }  
        }  
         public static void main(String[] args) 
         {  
            CircularBeg list= new CircularBeg();  
            list.insert(1); 
            list.insert(2);
            list.insert(3);
            list.insert(4);  
            list.display();
        }  
  
        public Node head = null;  
        public Node tail = null;  
  
        public void insert(int data)
        {  

            Node newNode = new Node(data);  
            if(head == null) 
            {  
                head = newNode;  
                tail = newNode;  
                newNode.next = head;  
            }  
            else 
            {  
                Node temp = head;  
                newNode.next = temp;
                head = newNode;  
                tail.next = head;  
            }  
        }  
  
        public void display()
        {  
            Node current = head;  
            if(head == null)
            {  
                System.out.println("Empty list");  
            }  
            else 
            {  
                 do
                 {  
                    System.out.print(" "+ current.data);  
                    current = current.next;  
                 }
                while(current != head);  
                System.out.println();  
            }  
        }  
  
       
}  