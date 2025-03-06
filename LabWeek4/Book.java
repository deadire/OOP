package LabWeek4;
import java.util.Date;

public class Book {
    	private String title;
    	private String issn;
    	private Date publicationDate;
    	private Person author;

    	public Book(String title, String issn, Date publicationDate, Person author) {
        	this.title = title;
        	this.issn = issn;
        	this.publicationDate = publicationDate;
        	this.author = author;
    	}

    	public Book(Book other) {
        	this.title = other.title;
        	this.issn = other.issn;
        	this.publicationDate = new Date(other.publicationDate.getTime());
        	this.author = new Person(other.author); 
    	}

    	public void showBookDetails() {
        	System.out.println("Title: " + title);
        	System.out.println("ISSN: " + issn);
        	System.out.println("Publication Date: " + publicationDate);
        	System.out.println("Author: " + author.getName());
    	}

    	public boolean equals(Book original) {
		if (this.issn == original.issn){return true;} else {return false;}
    	}

    	public void setTitle(String title) {
        	this.title = title;
    	}
    	public void setIssn(String issn) {
        	this.issn = issn;
    	}

    	public String getTitle() {
        	return title;
    	}
    	public String getIssn() {
        	return issn;
    	}

}
