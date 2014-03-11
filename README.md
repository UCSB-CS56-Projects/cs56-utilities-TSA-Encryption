cs56-utilities-TSA-Encryption
=============================

TopCoder Security Agency (TSA, established today) has just invented a new encryption system! This encryption system takes as its input a list of numbers to encrypt and outputs a single long. 









# cs56-utilities-TSA-Encryption

This is a encryptor application that currently only takes in arrays of integers. It is created in such a way so that it could be appended to in decent fashion.

![](http://i.imgur.com/DxDBcAr.png)
![](http://i.imgur.com/9viUiH2.png)

## Documentation

* The code for reading in the file is located in the `UserRead` class which currently holds only one method that reads the input into an array, as shown below.

```java
    public int[] stringToIntArray(String input){
		String[] StringArray = input.split(",");

		int[] intArray = new int[StringArray.length];

		int i = 0;
		for(String intString:StringArray)
	  	  {
			 int x = Integer.parseInt(intString);
			 intArray[i] = x;
			 i++;
	   	 }
		return intArray;
	}
```
* The `EncryptMethods` class contains all of our encryption methods that will be used.
* The `CryptographyGUI` class contains the screen for our program.

## How to run 
To start the game, use `ant run`. 