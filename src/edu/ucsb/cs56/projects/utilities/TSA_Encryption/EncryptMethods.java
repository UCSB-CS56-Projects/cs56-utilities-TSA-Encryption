package edu.ucsb.cs56.projects.utilities.TSA_Encryption;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;

public class EncryptMethods{

    /**
       The encrypt function receives an array of integers and transforms it into a long value.
       @return a long with the resulting value
       @param numlist an int[] (list on integers) that gets iterated through throughout the function, the integers must be greater than or equal to 1 and less than or equal to 1000, and the length of the list must be greater than or equal to 2 and less than or equal to 50.
     */
    
	public long encrypt1(int[] numList) {
	    long totalCheck = 0;
	    long total = 1;
	    
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
       The encrypt function receives an array of integers and transforms it into a long value.
       @return a long with the resulting value
       @param numlist an int[] (list on integers) that gets iterated through throughout the function, the integers must be greater than or equal to -50 and less than or equal to 50, and the length of the list must be greater than or equal to 2 and less than or equal to 10.
     */
	
	public long encrypt2(int[] numList){
	    long totalCheck = 0;
	    long total = 1;
	    
	    for (int r=0; r < numList.length; r++){
			if (numList[r] < -50 || numList[r] > 50){
		    	System.out.println("Number Error; Integer x must follow: -50 <= x <= 50");
		    	return 0;
			}	
	    }
	    
	    if (numList.length > 10){
			System.out.println("Number List Error; List length must be less than 10 inclusive");
			return 0;
	    }
	    
	    
	    for (int i = 0; i < numList.length; i++){
			numList[i]++;
			total *= numList[i];
			numList[i]--;
	    }

	    return total;
	    
	}

    /**
       The encrypt function receives an array of integers and transforms it into a long value.
       @return a long with the resulting value
       @param numlist an int[] (list on integers) that gets iterated through throughout the function, the integers must be greater than or equal to -1000 and less than or equal to 1000, and the length of the list must be greater than or equal to 2 and less than or equal to 10.
     */
	public long encrypt3(int[] numList){
	    long totalCheck = 0;
	    long total = 1;

	    for (int r=0; r < numList.length; r++){
			if (numList[r] < 1 || numList[r] > 1000){
		    	System.out.println("Number Error; Integer x must follow: -1000 <= x <= 1000");
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
}