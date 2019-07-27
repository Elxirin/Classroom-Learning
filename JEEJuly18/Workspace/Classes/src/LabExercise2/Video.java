package LabExercise2;

public class Video extends MediaItem {
	
	protected String director, genre;
	protected int releaseYear;
	
	public Video()
	{
		super();
		director=genre=null;
		releaseYear=0;
	}
	
	public Video(int uin, String title, int noc,int runtime, String director, String genre, int releaseYear) {
		super(uin,title,noc,runtime);
		this.director = director;
		this.genre = genre;
		this.releaseYear = releaseYear;
	}

	protected String getDirector() {
		return director;
	}

	protected void setDirector(String director) {
		this.director = director;
	}

	protected String getGenre() {
		return genre;
	}

	protected void setGenre(String genre) {
		this.genre = genre;
	}

	protected int getReleaseYear() {
		return releaseYear;
	}

	protected void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == this) return true;
		if(obj == null) return false;
		if (! (obj instanceof Video)) return false;
		Video itm = (Video)obj;
		if(!(this.director.equals(itm.director) && this.genre.equals(itm.genre) && this.releaseYear==itm.releaseYear)){
			return false;
		}
		else
			return super.equals(obj);
		
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nDirector : "+director+"\nGenre : "+genre+"\nRelaseYear : "+releaseYear;
	}

	@Override
	public int getRuntime() {
		return this.runtime;
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

	public void addVideo(int uin, String title, int noc, int runtime, String director, String genre, int releaseYear) {
		addItem(uin, title, noc);
		this.runtime = runtime;
		this.director = director;
		this.genre = genre;
		this.releaseYear = releaseYear;
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
		System.out.println("Director : "+ director);
		System.out.println("Genre : "+ genre);
		System.out.println("Release Year : "+releaseYear);
	}
}