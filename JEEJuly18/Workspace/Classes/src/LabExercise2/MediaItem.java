package LabExercise2;

public abstract class MediaItem extends Item {

	protected int runtime;
	

	public MediaItem() {
		super();
		runtime=0;
	}

	public MediaItem(int uin, String title, int noc,int runtime){
		super(uin, title, noc);
		this.runtime=runtime;
	}
	
	public abstract int getRuntime();

	public abstract void setRuntime(int runtime);
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == this) return true;
		if(obj == null) return false;
		if (! (obj instanceof MediaItem)) return false;
		MediaItem itm = (MediaItem)obj;
		if(!(this.runtime==itm.runtime)){
			return false;
		}
		else
			return super.equals(obj);
		
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nRunning Time : "+runtime;
	}
	

	public void addMediaItem(int uin, String title, int noc, int runtime){
		addItem(uin,title,noc);
		this.runtime=runtime;
	}
}
