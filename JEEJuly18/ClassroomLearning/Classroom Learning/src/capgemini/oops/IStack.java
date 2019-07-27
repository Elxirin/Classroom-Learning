package Capgemini.oops;

public interface IStack {
	void push(String name) throws StackFullException;
	
	String pop() throws StackEmptyException;
}