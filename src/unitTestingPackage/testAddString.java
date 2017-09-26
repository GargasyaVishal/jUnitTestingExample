package unitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitTesting testString = new jUnitTesting();
		String result = testString.addString("Hello_","Anurag");
		assertEquals("Hello_Anurag",result);
	}

}
