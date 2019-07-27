package LabExercise2;

public abstract class WrittenItem extends Item{
	
	protected String author;
	
	public WrittenItem() {
		super();
		author=null;
	}
	
	public WrittenItem(int uin, String title, int noc, String author) {
		super(uin,title,noc);
		this.author=author;
	}

	protected abstract String getAuthor();

	protected abstract void setAuthor(String author);
	
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
		return super.toString()+"\nAuthor : "+this.author;
	}

	@Override
	public void addItem(int uin, String title, int noc) {
		this.uin = uin;
		this.title = title;
		this.noc = noc;
		
	}
	
	public void addWrittenItem(int uin, String title, int noc, String author) {
		addItem(uin, title, noc);
		// rest impl...
		this.author=author;
	}
	
}
