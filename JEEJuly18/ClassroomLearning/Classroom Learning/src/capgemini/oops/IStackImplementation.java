package Capgemini.oops;
import java.util.*;


class StackEmptyException extends Exception {
	public StackEmptyException(String message){
		super(message);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage()+"Stack is Empty";
	}
	
}
class StackFullException extends Exception {
	public StackFullException(String message){
		super(message);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage()+"Stack is Full";
	}
}

public class IStackImplementation implements IStack{

	/*ArrayList a = new ArrayList();
	
	@Override
	public void push(String name){	
		a.add(name);
	}
	
	@Override
	public String pop(){
		String name = (String)a.get(a.size()-1);
		a.remove(a.size()-1);
		return name;
	}
	
	public void display(){
		System.out.println(a);
	}
	public static void main(String[] args){
		IStackImplementation i = new IStackImplementation();
		i.push("Piyush");
		i.display();
		i.push("Aditya");
		i.display();
		System.out.println(i.pop());
		i.display();
	}*/

	    static final int MAX = 2; 
	    int top; 
	    String a[] = new String[MAX];
	  
	   
	    IStackImplementation() 
	    { 
	        top = -1; 
	    } 
	  
	    public void push(String name) throws StackFullException
	    { 
	        if (top >= (MAX - 1)) { 
	            System.out.println("Stack Overflow");
	            throw new StackFullException("Stack Overflow Exception");
	            
	        } 
	        else { 
	            a[++top] = name; 
	            System.out.println(name + " pushed into stack"); 
	            
	        } 
	    } 
	  
	    public String pop() throws StackEmptyException
	    { 
	        if (top < 0) { 
	            System.out.println("Stack Underflow"); 
	            throw new StackEmptyException("Stack Underflow Exception");
	        } 
	        else { 
	            String name = a[top--]; 
	            return name; 
	        } 
	    } 
	  
	    String display() 
	    { 
	        if (top < 0) { 
	            System.out.println("Stack Underflow"); 
	            return null; 
	        } 
	        else { 
	            String x = a[top]; 
	            return x; 
	        } 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	    	try{
	    	IStackImplementation s = new IStackImplementation();
	    	s.push("Piyush");
	        s.push("Aditya"); 
	        s.push("HEllo"); 
	        System.out.println(s.pop() + " Popped from stack");
	    	}
	    	catch(StackFullException e){
	    		e.getMessage();
	    	}
	    	catch(StackEmptyException e){
	    		e.getMessage();
	    	}
	    } 

	
}
