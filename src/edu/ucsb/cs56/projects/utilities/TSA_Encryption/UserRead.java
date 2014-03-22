package edu.ucsb.cs56.projects.utilities.TSA_Encryption;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;

public class UserRead{
    public int[] stringToIntArray(String input){
		String[] stringArray = input.split(",");

		int[] intArray = new int[stringArray.length];

		int i = 0;
		for(String intString:stringArray)
	  	  {
			 int x = Integer.parseInt(intString);
			 intArray[i] = x;
			 i++;
	   	 }
		return intArray;
	}// end of stringToIntArray
}