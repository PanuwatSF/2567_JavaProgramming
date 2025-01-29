
public class book {
	private String title;
	private Author author;
	private int page;
	
	book(String title, Author author, int page){
		this.title = title;
		this.author = author;
		this.page = page;
	}
	book(String title,Author author){
		this(title,author,0);
	}
	book(){
		this(null,null,0);
	}
	public String getTitle () {
		return this.title;
	}
	public Author getAuthor() {
		return this.author;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPage() {
		return this.page;
	}
	public String toString() {
		return getTitle()+ " has " + getPage()+" pages write by " + getAuthor();		
	}
	
}
