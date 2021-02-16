package librarySystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest2 {
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
		
	}

	@Test
	void testGetISBN() {
		Book myBook = new Book();
		myBook.setISBN(iSBNValidTen);
		assertEquals(iSBNValidTen, myBook.getISBN());
		myBook.setISBN(iSBNValidThirteen);
		assertEquals(iSBNValidThirteen, myBook.getISBN());
	}

	@Test
	void testSetISBN() {
		Book myBook = new Book();
		assertThrows(IllegalArgumentException.class, () -> {
			myBook.setISBN(iSBNInvalidBlank);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			myBook.setISBN(iSBNInvalidOtherValue);
		});
	}

	@Test
	void testGetAuthor() {
		Book myBook = new Book();
		myBook.setAuthor(authorValid);
		assertEquals(authorValid, myBook.getAuthor());
	}

	@Test
	void testSetAuthor() {
		Book myBook = new Book();
		assertThrows(IllegalArgumentException.class, () -> {
			myBook.setAuthor(authorInvalid);
		});
	}

	@Test
	void testGetTitle() {
		Book myBook = new Book();
		myBook.setTitle(titleValid);
		assertEquals(titleValid, myBook.getTitle());
	}

	@Test
	void testSetTitle() {
		Book myBook = new Book();
		assertThrows(IllegalArgumentException.class, () -> {
			myBook.setTitle(titleInvalid);
		});
	}

	@Test
	void testGetRating() {
		Book myBook = new Book();
		myBook.setRating(ratingValidLower);
		assertEquals(ratingValidLower, myBook.getRating());
	}
	
	@Test
	void testSetRatingInvalidLower() {
		Book myBook = new Book();
		assertThrows(IllegalArgumentException.class, () -> {
			myBook.setRating(ratingInvalidLower);
		});
	}
	void testSetRatingInvalidUpper() {
		Book myBook = new Book();
		assertThrows(IllegalArgumentException.class, () -> {
			myBook.setRating(ratingInvalidUpper);
		});
	}

	@Test
	void testBookDefaultConstructor() {
		Book myBook = new Book();
		assertNotNull(myBook);
	}

	@Test
	void testBookFullConstructor() {
		Book myBook = new Book(iSBNValidTen, authorValid, titleValid, ratingValidLower);
		assertNotNull(myBook);
		assertEquals(authorValid, myBook.getAuthor());
		assertEquals(titleValid, myBook.getTitle());
		assertEquals(iSBNValidTen, myBook.getISBN());
		assertEquals(ratingValidLower, myBook.getRating());
	}

}
