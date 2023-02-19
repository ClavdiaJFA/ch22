package test.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.generation.bank.Bank;

class BankTest {
	Bank bank;
	
	@BeforeEach
	public void setUp() {
		bank = new Bank(10_000);
	}
	
	@Test
	@DisplayName("Retiros exitosos")
	public void retiroExitoso() {
		assertEquals (9_000 , bank.retiro(1_000), "Retiro de $1,000");
	}

}
