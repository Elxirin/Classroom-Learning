package LabExercise2;

public class JournalPaper extends WrittenItem{
	
	protected int publishYear;
	
	public JournalPaper(int uin, String title, int noc, String author,int publishYear){
		super(uin, title, noc, author);
		this.publishYear=publishYear;

	}

	protected int getPublishYear() {
		return publishYear;
	}

	protected void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == this) return true;
		if(obj == null) return false;
		if (! (obj instanceof WrittenItem)) return false;
		WrittenItem itm = (WrittenItem)obj;
		if(!(this.author==itm.author))
			return false;
		else
			return super.equals(obj);
		
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nPublished Year : "+publishYear;
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

	public void addJournalPaper(int uin, String title, int noc, String author, int publishYear) {
		addItem(uin,title,noc);
		this.author = author;
		this.publishYear = publishYear;
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
}
