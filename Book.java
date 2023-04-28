
public class Book {
	 private String name;
	 private String author;
	 private double copies;
	    public Book(String name, String author, double copies) {
	        this.name = name;
	        this.author = author;
	        this.copies = copies;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public double getCopies() {
	        return copies;
	    }

	    public void setCopies(double copies) {
	        this.copies = copies;
	    }
	}
	
