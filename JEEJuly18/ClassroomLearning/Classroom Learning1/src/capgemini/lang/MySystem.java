package capgemini.lang;
import java.lang.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
public class MySystem {
	public static void main(String[] args)
	{
		System.out.println("Current Time in Milliseconds : " + System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");    
		Date date = new Date(System.currentTimeMillis());
		System.out.println(sdf.format(date)); 
		System.out.println("Heap memeory Before : "+ Runtime.getRuntime().freeMemory()); 
		
		for(int i=0;i<10000;i++) {
			new MySystem();
		}
		System.out.println("Heap memeory After : "+ Runtime.getRuntime().freeMemory()); 
		System.gc();
		System.out.println("Garbage Collected");
		System.out.println("Heap memeory After Garbage Collection : "+ Runtime.getRuntime().freeMemory()); 
		
		
		 /*String s = System.lineSeparator(); 
		  
	        for (char c : s.toCharArray()) { 
	            System.out.println("The Current Line seperator :"+(int)c); 
	        }*/
		System.out.println("\n");
		Properties s = System.getProperties();
		//s.list(System.out);
		
		Set<String> keys = s.stringPropertyNames();
	    for (String key : keys) {
	      System.out.println(key + " : " + s.getProperty(key));
	    }
	}
}
