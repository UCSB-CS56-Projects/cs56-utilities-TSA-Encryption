package edu.ucsb.cs56.projects.utilities.TSA_Encryption;

/**
Cryptography class. Only 2 methods: the constructor, and encrypt. 

@author Callum Steele, Miranda Aperghis, Trevor Adelman
@version CS56 S13, 05/09/2013

 */

public class Cryptography{

    private long totalCheck = 0;
    private long total = 1;

    /**
       basic class constructor
     */

    public Cryptography() {}

    /**
       The encrypt function receives an array of integers and transforms it into a long value.
       @return a long with the resulting value
       @param numlist an int[] (list on integers) that gets iterated through throughout the function, the integers must be greater than or equal to 1 and less than or equal to 1000, and the length of the list must be greater than or equal to 2 and less than or equal to 50.
     */

    public long encrypt1(int[] numList) {

	for (int r=0; r < numList.length; r++){
	    if (numList[r] < 1 || numList[r] > 1000){
		System.out.println("Number Error; Integer x must follow: 1 <= x <= 1000");
		return totalCheck;
	    }
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
		    totalCheck = total;
		}
	    }
	    numList[i]--;
	 }

	return totalCheck;
    }

    /** 
	Comment
    */
    public long encrypt2(int[] numList){


	for (int r=0; r < numList.length; r++){
	    if (numList[r] < -50 || numList[r] > 50){
		System.out.println("Number Error; Integer x must follow: -1000 <= x <= 1000");
		return 0;
	    }
	}

	if (numList.length > 10){
	    System.out.println("Number List Error; List length must be less than 20 inclusive");
	    return 0;
	}

	

	for (int i = 0; i < numList.length; i++){
	    numList[i]++;
	    total *= numList[i];
	    numList[i]--;
	}

	return total;
    }

    public long encrypt3(int[] numList){

	for (int r=0; r < numList.length; r++){
	    if (numList[r] < -1000 || numList[r] > 1000){
		System.out.println("Number Error; Integer x must follow: -100 <= x <= 100");
		return 0;
	    }
	}

	if (numList.length > 10){
	    System.out.println("Number List Error; List length must be less than 10 inclusive");
	    return 0;
	}
	
	for (int i=0; i < numList.length; i++){
	    if (i%2 == 0) {
		totalCheck += (numList[i] + i*i);
	    }
	    else {
		totalCheck -= (numList[i] + i*i);
	    }
	}
	
	return totalCheck;
    }



    /**
       Sets up a Cryptography object and uses it to encrypt an int array of {1,2,3}, outputting the result
       @param args the command line arguments
     */

    public static void main(String[] args){
	Cryptography c1 = new Cryptography();
	int[] ex1 = {1,2,3};
	int[] ex2 = {2,3,4};
	int[] ex3 = {3,4,5};

	long output1 = c1.encrypt1(ex1);
	System.out.println(output1);

	long output2 = c1.encrypt2(ex2);
	System.out.println(output2);

	long output3 = c1.encrypt3(ex3);
	System.out.println(output3);
    }
}
