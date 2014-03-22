package edu.ucsb.cs56.projects.utilities.TSA_Encryption;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/** test class for EncryptMethods
@author Gary Mak
@author Rishabh Jha
@version CS56 W14 02/28/2014

@author Trevor Adelman
@author Miranda Apergis
@author Callum Steele
@version CS56 S13 05/09/2013
@see EncryptMethods

*/

public class EncryptMethodsTest {

    public static final double tolerance=0.00000001;
    
    /** encrypt1 tests */
    @Test
	public void encrypt1Test1() {
    	   int[] ex1num = {1,2,3};
    	EncryptMethods ex1 = new EncryptMethods();
    	assertEquals(12,ex1.encrypt1(ex1num), tolerance);
    }
    
  	@Test
	public void encrypt1Test2() {
	    int[] ex2num = {1,3,2,1,1,3};
	    EncryptMethods ex2 = new EncryptMethods();
	    assertEquals(36,ex2.encrypt1(ex2num), tolerance);
	}

    @Test
    public void encrypt1Test3() {
    	int[] ex3num = {1,1,1,1};
    	EncryptMethods ex3 = new EncryptMethods();
    	assertEquals(2, ex3.encrypt1(ex3num), tolerance);
    }

    @Test
	public void encrypt1Test4() {
    	int[] ex4num = {1,2,3};
    	EncryptMethods ex4 = new EncryptMethods();
    	assertEquals(12,ex4.encrypt1(ex4num), tolerance);
    }
    
    /**
     *Test for integer less than 1 	
     */
    @Test
    public void encrypt1TestLessThan1() {
    	int[] ex6num = {0,1,2,6};
    	EncryptMethods ex6 = new EncryptMethods();
    	assertEquals(0,ex6.encrypt1(ex6num), tolerance);
	}
    
    /**
     *Test for integer greater than 1000
     */
    @Test 	
    public void encrypt1TestGreaterThan1000() {
    	int[] ex7num = {5,100,6,1001,2};
    	EncryptMethods ex7 = new EncryptMethods();
    	assertEquals(0,ex7.encrypt1(ex7num), tolerance);
    }
    
    /**
     *Test for length of list less than 2
     */ 
    @Test
    public void encrypt1TestLengthLessThan2(){
    	int[] ex8num = {5};
    	EncryptMethods ex8 = new EncryptMethods();
    	assertEquals(0,ex8.encrypt1(ex8num), tolerance);
    }
    
    /**
     *Test for length of list greater than 50
     */
    @Test
        public void encrypt1TestLengthGreaterThan50(){
    	int[] ex9num = new int[51];
    	for(int i=0; i<ex9num.length; i++) ex9num[i]=5;
    	EncryptMethods ex9 = new EncryptMethods();
    	assertEquals(0,ex9.encrypt1(ex9num), tolerance);
    } 

    
    
    
        
    /**  encrypt 2 tests */
    @Test
    public void encrypt2Test1() {
    	int[] ex1num = {1,2,3};
    	EncryptMethods ex1 = new EncryptMethods();
    	assertEquals(24, ex1.encrypt2(ex1num), tolerance);
    }

    @Test
    public void encrypt2Test2() {
    	int[] ex2num = {1,3,2,1,1,3};
    	EncryptMethods ex2 = new EncryptMethods();
    	assertEquals(384, ex2.encrypt2(ex2num), tolerance);
    }

    @Test
    public void encrypt2Test3() {
    	int[] ex3num = {1, 1, 1, 2, 2, 2, 3, 3, 3};
    	EncryptMethods ex3 = new EncryptMethods();
    	assertEquals(13824, ex3.encrypt2(ex3num), tolerance);
    }

    @Test
    public void encrypt2Test4() {
    	int[] ex4num = {1,2,-3};
    	EncryptMethods ex4 = new EncryptMethods();
    	assertEquals(-12, ex4.encrypt2(ex4num), tolerance);
    }
    
    @Test
    public void encrypt2Test5() {
    	int[] ex5num = {50, 49 , 48 , 47 , 46};
    	EncryptMethods ex5 = new EncryptMethods();
    	assertEquals(281887200, ex5.encrypt2(ex5num), tolerance);
    }
    
    @Test
    public void encrypt2LessThanNegative50() {
    	int[] ex6num = {5, 10, 15, -100, 0};
    	EncryptMethods ex6 = new EncryptMethods();
    	assertEquals(0, ex6.encrypt2(ex6num), tolerance);
    }

    @Test
    public void encrypt2GreaterThan50(){
    	int[] ex7num = {5, 10, 15, 20 , 25 , 55 , 100};
    	EncryptMethods ex7 = new EncryptMethods();
    	assertEquals(0, ex7.encrypt2(ex7num), tolerance);
    }

    @Test
    public void encrypt2Negative1(){
    	int[] ex8num = {-5, -4 , -3, -2 , -1 , 0};
    	EncryptMethods ex8 = new EncryptMethods();
    	assertEquals(0,ex8.encrypt2(ex8num), tolerance);
    }

    @Test
    public void encrypt2TestLengthGreaterThan10(){
    	int[] ex9num = new int[11];
    	for(int i=0; i<ex9num.length; i++)
    	    ex9num[i]=i;
    	EncryptMethods ex9 = new EncryptMethods();
    	assertEquals(0,ex9.encrypt2(ex9num), tolerance);
    } 

    



    /** encrypt3 tests */
    @Test
    public void encrypt3Test1(){
    	int[] ex1num = {1,2,3};
    	EncryptMethods ex1 = new EncryptMethods();
    	assertEquals(5,ex1.encrypt3(ex1num), tolerance);
    }

    @Test
    public void encrypt3Test2(){
    	int[] ex2num = {100, 150, 125, 575, -250, 50};
    	EncryptMethods ex2 = new EncryptMethods();
    	assertEquals(0,ex2.encrypt3(ex2num), tolerance);
    }
    
     @Test
    public void Encrypt3Test3(){
        int [] ex3num = {-50, -25, 17, 40, 50};
        EncryptMethods ex3 = new EncryptMethods();
        assertEquals(0,ex3.encrypt3(ex3num), tolerance);
     }
    
    @Test
    public void encrypt3SizeTest(){
    	int [] ex4num = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11};
    	EncryptMethods ex4 = new EncryptMethods();
    	assertEquals(0,ex4.encrypt3(ex4num), tolerance);
    }

    @Test
    public void encrypt3GreaterThan1000(){
    	int [] ex5num = {1001,1,10};
    	EncryptMethods ex5 = new EncryptMethods();
    	assertEquals(0,ex5.encrypt3(ex5num), tolerance);
    }

    @Test
    public void encrypt3LessThan1000(){
    	int [] ex6num = {-1001,1,154};
    	EncryptMethods ex6 = new EncryptMethods();
    	assertEquals(0,ex6.encrypt3(ex6num), tolerance);
    }


}

