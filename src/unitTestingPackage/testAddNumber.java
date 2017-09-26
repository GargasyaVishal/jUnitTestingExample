package unitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumber {

	@Test
	public void test() {
		jUnitTesting test = new jUnitTesting();
		int result = test.addNumber(400, 40);
		assertEquals(440,result);
		
			
		
		
	}

}
