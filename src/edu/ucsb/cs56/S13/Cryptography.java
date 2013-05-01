/**
Cryptography class. Only 2 methods: the constructor, and encrypt. 

@author Trevor Adelman


 */



public class Cryptography{

    /**
       basic class constructor
       @return nothing (void function)
     */

    public void Cryptography(){}




    long totalCheck = 0;
    long total = 1;


    /**
       @return a long with the resulting long value
       @param an int[] (list on integers) that gets iterated through 
              throughout the function
     */

    public long encrypt(int[] numList) {
    
	for (int r=0; r < numList.length; r++){
	    if (numList[r] < 1 || numList[r] > 1000){
		System.out.println("Number Error; Integer x must follow: 1 <= x <= 1000");
	    return totalCheck;}
	}

	if (numList.length > 50 || numList.length < 2){
	    System.out.println("Number List Error; List length must be between 2 and 50 inclusive");
	    return totalCheck;
	}


	for (int i=0; i < numList.length; i++){
	    numList[i]++;
	    total = 1;

	    for (int t=0; t < numList.length; t++){
		total = total * numList[t];
		if (total > totalCheck){
		    totalCheck = total;}
	    }
	    //    System.out.println(total);
	    numList[i]--;
		}

	//System.out.println(totalCheck);

	return totalCheck;



    }
    




    public static void main(String[] args){
	Cryptography c1 = new Cryptography();
	int[] ex1 = {1,2,3};
	c1.encrypt(ex1);
	System.out.println("\n");
	System.out.println("\n");
	
	Cryptography c2 = new Cryptography();
	int[] ex2 = {1,3,2,1,1,3};
	c2.encrypt(ex2);
	System.out.println("\n");
	System.out.println("\n");
	

	Cryptography c3 = new Cryptography();	
	int[] ex3 = {1000,999,998,997,996,995};
	c3.encrypt(ex3);
	System.out.println("\n");
	System.out.println("\n");
	
	
	Cryptography c4 = new Cryptography();
	int[] ex4 = {4,4,4,4,4,4,4,4,4};
	c4.encrypt(ex4);
	System.out.println("\n");
	System.out.println("\n");


	Cryptography c5 = new Cryptography();
	int[] ex5 = {1,1,1,1};
	c5.encrypt(ex5);
	System.out.println("\n");
	System.out.println("\n");


	Cryptography c6 = new Cryptography();
	int[] ex6 = {4,12,45,5,42,3,11,8,98};
	c6.encrypt(ex6);
	System.out.println("\n");
	System.out.println("\n");
	
	

    }

    

}
