package LabExercise2;

public class CD extends MediaItem {

	protected String artist, genre;
	
	public CD() {
		super();
		artist=genre=null;
	}
	
	public CD(int uin, String title, int noc,int runtime, String artist, String genre) {
		super(uin,title,noc,runtime);
		this.artist = artist;
		this.genre = genre;
	}

	protected String getArtist() {
		return artist;
	}

	protected void setArtist(String artist) {
		this.artist = artist;
	}

	protected String getGenre() {
		return genre;
	}

	protected void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == this) return true;
		if(obj == null) return false;
		if (! (obj instanceof CD)) return false;
		CD itm = (CD)obj;
		if(!(this.artist.equals(itm.artist) && this.genre.equals(itm.genre))){
			return false;
		}
		else
			return super.equals(obj);
		
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nArtist : "+ artist + "\nGenre : " + genre;
	}

	@Override
	public int getRuntime() {
		return runtime;
	}

	@Override
	public void setRuntime(int runtime) {
		this.runtime = runtime;
		
	}

	@Override
	public void addItem(int uin, String title, int noc) {
		this.uin = uin;
		this.title = title;
		this.noc = noc;
		
	}

	public void addCD(int uin, String title, int noc, int runtime, String artist, String genre) {
		addItem(uin, title, noc);
		this.runtime = runtime;
		this.artist = artist;
		this.genre = genre;
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
		System.out.println("Runtime : "+ runtime);
		System.out.println("Artist : "+ artist);
		System.out.println("Genre : "+ genre);
	}
}