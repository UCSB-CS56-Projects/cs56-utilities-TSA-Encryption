package edu.ucsb.cs56.projects.utilities.TSA_Encryption;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/** test class for DerivativeSequence

@author Trevor Adelman
@see DerivativeSequence

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
   
}

