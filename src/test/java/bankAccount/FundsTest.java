package bankAccount;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FundsTest {

	double startingFunds = 1000;
	double expected;
	Account thomas = new Account("Thomas");
	
	
	@Before
	public void setUp() throws Exception {
		thomas.setFunds(startingFunds);
	}

	@Test
	public void testFunds() {
		assertNotNull(thomas.getFunds());
	}
	
	@Test
	public void testFundsNotNull() {
		assertTrue(thomas.getFunds() == startingFunds);
	}
	
	@Test
	public void testDeposit() {
		thomas.deposit(500);
		expected = 1500;
		
		assertTrue(thomas.getFunds() == expected);
	}
	
	@Test
	public void testDepositFail() {
		thomas.deposit(-500);
		expected = 500;
		//should be false, because cannot deposit negative amount
		assertFalse(thomas.getFunds() == expected);
	}
	
	@Test
	public void testWithdraw() {
		thomas.withdraw(500);
		expected = 500;
		
		assertTrue(thomas.getFunds() == expected);
	}
	
	@Test
	public void testWithdrawFail() {
		thomas.withdraw(2000);
		expected = -1000;
		//should be false, because will not allow to withdraw more than you have
		assertFalse(thomas.getFunds() == expected);
	}

}
