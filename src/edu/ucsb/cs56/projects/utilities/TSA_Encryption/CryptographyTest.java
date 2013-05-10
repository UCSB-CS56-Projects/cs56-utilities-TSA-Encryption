package edu.ucsb.cs56.projects.utilities.TSA_Encryption;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/** test class for Cryptography

@author Trevor Adelman
@author Miranda Apergis
@author Callum Steele
@version CS56 S13 05/09/2013
@see Cryptography

*/

public class CryptographyTest {

	public static final double tolerance=0.00000001;


    	/** first basic test */
    	@Test
	public void test1() {
		int[] ex1num = {1,2,3};
		Cryptography ex1 = new Cryptography();
		assertEquals(12,ex1.encrypt(ex1num), tolerance);
    	}

      	@Test
	public void test2() {
		int[] ex2num = {1,3,2,1,1,3};
		Cryptography ex2 = new Cryptography();
		assertEquals(36,ex2.encrypt(ex2num), tolerance);
    	}

    	/*
    	@Test
	public void test3() {
		int[] ex3num = {1000,999,998,997,996,995};
		Cryptography ex3 = new Cryptography();
		assertEquals(986074810223904000,ex3.encrypt(ex3num),tolerance);
    	}
    	*/

	@Test
	public void test4() {
		int[] ex4num = {1,1,1,1};
		Cryptography ex4 = new Cryptography();
		assertEquals(2, ex4.encrypt(ex4num), tolerance);
    	}
 
	@Test
	public void test5() {
		int[] ex5num = {1,2,3};
		Cryptography ex5 = new Cryptography();
		assertEquals(12,ex5.encrypt(ex5num), tolerance);
    	}

	/**
 	*Test for integer less than 1 	
 	*/
	@Test
	public void testLessThan1() {
		int[] ex6num = {0,1,2,6};
		Cryptography ex6 = new Cryptography();
		assertEquals(0,ex6.encrypt(ex6num), tolerance);
	}

	/**
 	*Test for integer greater than 1000
 	*/
	@Test 	
   	public void testGreaterThan1000() {
		int[] ex7num = {5,100,6,1001,2};
		Cryptography ex7 = new Cryptography();
		assertEquals(0,ex7.encrypt(ex7num), tolerance);
	}

	/**
 	*Test for length of list less than 2
 	*/ 
	@Test
	public void testLengthLessThan2(){
		int[] ex8num = {5};
		Cryptography ex8 = new Cryptography();
		assertEquals(0,ex8.encrypt(ex8num), tolerance);
	}

	/**
 	*Test for length of list greater than 50
	*/
	@Test
	public void testLengthGreaterThan50(){
		int[] ex9num = new int[51];
		for(int i=0; i<ex9num.length; i++) ex9num[i]=5;
		Cryptography ex9 = new Cryptography();
		assertEquals(0,ex9.encrypt(ex9num), tolerance);
	} 
}

