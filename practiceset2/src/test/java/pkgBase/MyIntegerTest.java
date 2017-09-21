package pkgBase;

import static org.junit.Assert.*;

import org.junit.Test;

import base.MyInteger;

public class MyIntegerTest {
	
	@Test
	public void testEven() {
		MyInteger myInt= new MyInteger(2);
				assertTrue(myInt.isEven());
	}
	
	
	
	@Test			
	public void testOdd() {
		MyInteger myInt= new MyInteger(3);
			    assertTrue(myInt.isOdd());
	}
	
	
	@Test
	public void testisPrime() {
		MyInteger myInt= new MyInteger(6);
			    assertEquals(myInt.isPrime(),false);
	}
	
	@Test
	public void testisEquals() {
		MyInteger myInt= new MyInteger(3);
			assertTrue(myInt.isEquals(3));
	}

}
