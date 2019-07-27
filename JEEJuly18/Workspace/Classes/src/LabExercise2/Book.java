package LabExercise2;

public class Book extends WrittenItem {

	public Book() {
		super();
	}
	
	public Book(int uin, String title, int noc, String author){
		super(uin,title,noc,author);
	}
	
	
	
	@Override
	protected String getAuthor() {
		return super.author;
	}

	@Override
	protected void setAuthor(String author) {
		super.author=author;
		
	}

	@Override
	public void addItem(int uin, String title, int noc) {
		this.uin = uin;
		this.title = title;
		this.noc = noc;
		
	}
	
	public void addBook(int uin, String title, int noc,String author) {
		addItem(uin, title, noc);
		this.author=author;
	}

	@Override
	protected int getUin() {
		return this.uin;
	}

	@Override
	protected void setUin(int uin) {
		this.uin = uin;
		
	}

	@Override
	protected int getNoc() {
		return this.noc;
	}

	@Override
	protected void setNoc(int noc) {
		this.noc = noc;
		
	}

	@Override
	protected String getTitle() {
		return this.title;
	}

	@Override
	protected void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void print() {
		System.out.println("Unique Identification Number : "+ uin);
		System.out.println("Title : "+ title);
		System.out.println("Number of copies : "+ noc);
		System.out.println("Author : "+author);
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj == this) return true;
		if(obj == null) return false;
		if (! (obj instanceof Book)) return false;
		//Book itm = (Book)obj;
		return super.equals(obj);
		
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
