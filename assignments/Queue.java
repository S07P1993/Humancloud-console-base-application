package assignments;

public class Queue {

	    private static int front, rear, capacity; 
	    private static int queue[]; 
	   
	    Queue(int size) { 
	        front = rear = 0; 
	        capacity = size; 
	        queue = new int[capacity]; 
	    } 
	   
	    // insert an element into the queue
	    static void push(int item)  { 
	        // check if the queue is full
	        if (capacity == rear) { 
	            System.out.printf("Queue is full"); 
	            return; 
	        } 
	   
	        // insert element at the rear 
	        else { 
	            queue[rear] = item; 
	            rear++; 
	        } 
	        return; 
	    } 
	   
	    //remove an element from the queue
	    static void remove()  { 
	        // check if queue is empty 
	        if (front == rear) { 
	            System.out.printf("Queue is empty"); 
	            return; 
	        } 
	   
	        // shift elements to the right by one place uptil rear 
	        else { 
	            for (int i = 0; i < rear - 1; i++) { 
	                queue[i] = queue[i + 1]; 
	            }
	            }
	        }
	    public static void queueDisplay() {
	    	 { 
	 	        int i; 
	 	        if (front == rear) { 
	 	            System.out.printf("Queue is Empty\n"); 
	 	            return; 
	 	        } 
	 	   
	 	        // traverse front to rear and print elements 
	 	        for (i = front; i < rear; i++) { 
	 	            System.out.printf(" %d = ", queue[i]); 
	 	        } 
	 	        return; 
	 	    } 
			// TODO Auto-generated method stub
			
		}
	   
	    // print front of queue 
	    static void queueFront() 
	    { 
	        if (front == rear) { 
	            System.out.printf("Queue is Empty"); 
	            return; 
	        } 
	        System.out.printf("Front Element of the queue: ", queue[front]); 
	        return; 
	    } 
	    
//	    public static void main(String[] args, int size) { 
//	        
//	        Queue q = new Queue(size); 
//	   
//	        System.out.println("Initial Queue:");
//	       
//	        Queue.queueDisplay(); 
//	   
//	        q.push(10); 
//	        q.push(30); 
//	        q.push(50); 
//	        q.push(70); 
//	   
//	        System.out.println("Queue after Enqueue Operation:");
//	        q.queueDisplay(); 
//	   
//	        q.queueFront(); 
//	         
//	        q.push(90); 
//	  
//	        q.queueDisplay(); 
//	   
//	        q.remove(); 
//	        q.remove(); 
//	        
//	        System.out.printf("\nQueue after two dequeue operations:"); 
//	        
//	        q.queueDisplay(); 
//	        q.queueFront(); 
	//    } 
	}

	




