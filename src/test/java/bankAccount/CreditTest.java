package bankAccount;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreditTest {

	Account thomas = new Account("Thomas");
	
	String bad = "Bad",
		   fair = "Fair",
		   good = "Good",
		   excel = "Excellent";
	
	String invalid = "Invalid Credit Score";
	
	int creditScore;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testExcellentScore() {
		creditScore = 800;
		thomas.setCreditScore(creditScore);
		
		assertEquals(thomas.getCreditStanding(), excel);
	}
	
	@Test
	public void testGoodScore() {
		creditScore = 700;
		thomas.setCreditScore(creditScore);
		
		assertEquals(thomas.getCreditStanding(), good);
	}
	
	@Test
	public void testFairScore() {
		creditScore = 650;
		thomas.setCreditScore(creditScore);
		
		assertEquals(thomas.getCreditStanding(), fair);
	}
	
	@Test
	public void testBadScore() {
		creditScore = 400;
		thomas.setCreditScore(creditScore);
		
		assertEquals(thomas.getCreditStanding(), bad);
	}
	
	@Test
	public void testScoreFail1() {
		creditScore = 1000;
		thomas.setCreditScore(creditScore);
		
		assertEquals(thomas.getCreditStanding(), invalid);
	}
	@Test
	public void testScoreFail2() {
		creditScore = 100;
		thomas.setCreditScore(creditScore);
		
		assertEquals(thomas.getCreditStanding(), invalid);
	}

}
