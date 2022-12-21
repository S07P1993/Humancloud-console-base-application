package assignments;

                 
import java.util.*;

 public class Stack 
 {		 
	static ArrayList<Integer>list=new ArrayList<>();
	  
	  public static boolean isEmpty()
	  {
		  return list.size()==0;
	  }

	//PUSH
	  public static void push(int data)
	  {
		  list.add(data);
	  }
	  
	  //POP
	  public static int pop()
	  {
		  if(isEmpty())
		  {
			  return -1;
		  }
		  int top=list.get(list.size()-1);
		  list.remove(list.size()-1);
		  return top; 
	  }
	  
	  //PEEK
	  public static int peek()
	  {
		  if (isEmpty())
		  {
			  return -1;
		  }
	 return list.get(list.size()-1);
	  }	  
	 
	  //showStack
	  public static int show() {
		  for(int ele:list)
		  {
			  System.out.print(ele+"-");
		  }
		return 0;
		  
	  }
	  	  
	public static void main (String[] args)
	 	{
	 		
	    Stack stack =new Stack();
	    
	    stack.push(1);
	    stack.push(2);
	    stack.push(3);
	    stack.push(4);
	    	     
	     while(!Stack.isEmpty())
	     {
    	 System.out.println(Stack.peek());
	    	 Stack.pop();
	     }
 	}
 }

		
		
 


	
	