package librarySystem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibrarySearchTest {
	Book b1 = new Book();
	Book b2 = new Book();
	Book b3 = new Book();
	ArrayList<Book> books = new ArrayList<Book>();
	int ratingValidLower, ratingValidUpper, ratingInvalidLower, ratingInvalidUpper;
	String iSBNValidTen, iSBNValidThirteen, iSBNInvalidBlank, iSBNInvalidOtherValue, authorValid, authorInvalid, titleValid, titleInvalid;
	
	@BeforeEach
	void setUp() throws Exception {
		iSBNValidTen = "1234567890";
		iSBNValidThirteen = "1234567890123";
		iSBNInvalidBlank = "";
		iSBNInvalidOtherValue = ("12345678");
		authorValid = "Author Valid";
		authorInvalid = "";
		titleValid = "Title Valid";
		titleInvalid = "";
		ratingValidLower = 1;
		ratingValidUpper = 5;
		ratingInvalidLower = 0;
		ratingInvalidUpper = 6;
		b1 = new Book(iSBNValidTen, authorValid,titleValid,ratingValidLower);
		books.add(b1);
	}

	@Test
	void testSearchByTitle() {
		ArrayList<Book> results = LibrarySearch.searchByTitle(books, "Title Valid");
		assertTrue(results.contains(b1));
	}

	@Test
	void testSearchByAuthor() {
		ArrayList<Book> results = LibrarySearch.searchByAuthor(books, "Author Valid");
		assertTrue(results.contains(b1));
	}

	@Test
	void testSearchByRating() {
		ArrayList<Book> results = LibrarySearch.searchByRating(books, 1);
		assertTrue(results.contains(b1));
	}

	@Test
	void testSearchByISBN() {
		ArrayList<Book> results = LibrarySearch.searchByISBN(books, "1234567890");
		assertTrue(results.contains(b1));
	}

}
