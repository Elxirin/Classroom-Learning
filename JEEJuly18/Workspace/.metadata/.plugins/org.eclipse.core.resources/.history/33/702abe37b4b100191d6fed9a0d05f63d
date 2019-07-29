package LabExercise2;
import java.util.*;
public class Lab2_Ex_Library_Test {

	public static void main(String[] args) {
		
		Book b1 = new Book(010,"Harry Potter",3435,"J.K. Rowlings");
		JournalPaper j1 = new JournalPaper(98,"Science Today",546,"Headman Fields",2019);
		Video v1 = new Video(1019,"ME",748560,5,"Taylor Swift","Bubblegum pop",2019);
		CD c1 = new CD(56,"Good Blessings",6743,180,"Joel little","Fiction");
		
		b1.print();
		System.out.println("=============================");
		j1.print();
		System.out.println("=============================");
		v1.print();
		System.out.println("=============================");
		c1.print();
	
/*		System.out.println(b1.toString()+"\n===================================");
		System.out.println(j1.toString()+"\n===================================");
		System.out.println(v1.toString()+"\n===================================");
		System.out.println(c1.toString()+"\n===================================");
*/	
		Scanner sc = new Scanner(System.in);
		int ch=0;
		Book[] b = new Book[100];
		int bc=0;
		while(ch!=9){
			System.out.println("Welcome to Library\nPlease Choose from the Following Menu");
			System.out.println("1.Books\n2.Journal Paper\n3.Videos\n4.CD's\n9.Exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1 :
				System.out.println("Books \n1.Add Book\n2.View Book details\n3.Go back\n9.Exit");
				int chb = sc.nextInt();
				switch(chb) {
				case 1:
					b[bc].addBook(sc.nextInt(),sc.next(),sc.nextInt(),sc.next());
					bc++;
					break;
				case 2:
					int id = sc.nextInt();
					for(int i=0;i<100;i++)
					{
						if(b[i].getUin()==id)
							b[i].print();
					}
					break;
				case 3:
					break;
				case 9:
					System.exit(0);
				}
				break;
			case 2 :
				break;
			case 3 :
				break;
			case 4 :
				break;
			case 9 :
				System.exit(0);
			default :
				System.out.println("Wrong choice Please Enter again");
				
			}
			
		}
		
	}
}
