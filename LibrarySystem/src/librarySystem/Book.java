package librarySystem;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Book class - represents a book in the system
 * 
 * @author Jason McKillen
 */
public class Book {

	/**
	 * The book's ISBN
	 */
	private String ISBN;

	/**
	 * The author of the book
	 */
	private String author;

	/**
	 * The title of the book
	 */
	private String title;
	
	/**
	 * The book's rating
	 */
	private int rating;
	
	/**
	 * Gets the ISBN number
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Sets the ISBN number
	 * 
	 * @param iSBN
	 *            10 or 13 chars
	 * @throws Exception 
	 */
	public void setISBN(String iSBN)  {
		if(iSBN.length() == 10 || iSBN.length() == 13) {
			this.ISBN = iSBN;
		} else {
			throw new IllegalArgumentException("The ISBN must be a value of either 10 or 13 characters.");
		}
		
	}

	/**
	 * Get the book's author
	 * 
	 * @return
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the book's author
	 * 
	 * @param author
	 */
	public void setAuthor(String author) throws IllegalArgumentException {

		if(author.length() >= 1 && author.length() <= 40) {
			this.author = author;
		} else {
			throw new IllegalArgumentException("Author's name must be between 1 and 40 characters.");
		}
	}

	/**
	 * Gets the book's title
	 * 
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the books title
	 * 
	 * @param title
	 */
	public void setTitle(String title) throws IllegalArgumentException {
		if(title.length() >= 1 && title.length() <=40) {
			this.title = title;
		} else {
			throw new IllegalArgumentException("Title must be between 1 and 40 characters.");
		}
			
		
	}
	
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) throws IllegalArgumentException {
		if(rating >= 1 && rating <= 5) {
			this.rating = rating;
		} else {
			throw new IllegalArgumentException("Rating must be between 1 and 5 (inclusive.)");
		}
	}

	/**
	 * Default constructor
	 */
	public Book() {

	}

	public Book(String ISBN, String author, String title, int rating) {
		this.setISBN(ISBN); 
		this.setAuthor(author);
		this.setTitle(title);
		this.setRating(rating);
	}
}
