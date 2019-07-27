package LabExercise2;

public abstract class Item {

	protected int uin, noc;
	protected String title;

	public Item(){
		this.uin=this.noc=0;
		this.title=null;
	}
	
	public Item(int uin, String title, int noc) {
		this.uin = uin;
		this.noc = noc;
		this.title = title;
	}

	protected abstract int getUin();

	protected abstract void setUin(int uin);

	protected abstract int getNoc();
	
	protected abstract void setNoc(int noc);

	protected abstract String getTitle();

	protected abstract void setTitle(String title);
		
	public abstract void print();
	
	public abstract void addItem(int uin, String title, int noc);

	@Override
	public boolean equals(Object obj) {
		
		if(obj == this) return true;
		if(obj == null) return false;
		if (! (obj instanceof Item)) return false;
		Item itm = (Item)obj;
		if(!(this.uin==itm.uin && this.noc==itm.noc && this.title.equals(itm.title))){
			return false;
		}
		else
			return true;
	}
	
	@Override
	public String toString() {
		return String.format("Uinique Identification Number : %d\nTitle : %s\nNumber of Copies : %d", uin,title,noc);
	}

}
