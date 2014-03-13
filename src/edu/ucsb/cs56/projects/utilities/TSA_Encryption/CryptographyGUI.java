package edu.ucsb.cs56.projects.utilities.TSA_Encryption;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;


/**
Cryptography GUI

@author Gary Mak, Rishabh Jha
@version CS56 W14 02/28/2014

**/

public class CryptographyGUI{
    EncryptMethods encryptMethods = new EncryptMethods();				// instance of encryptMethods to let us call them
    UserRead userRead = new UserRead();
    
    JFrame frame = new JFrame();										// main window
    JTextField textField = new JTextField(20);							// textfield to enter numbers in
    JPanel panel = new JPanel();;						        		// panel to hold our first screen organized together
    JPanel encryptedNumberPanel = new JPanel();					        // panel to hold our second screen organized together
    JLabel encryptedNumberLabel = new JLabel("");				        // label that holds our encrypted number
    JButton backButton = new JButton("Back");							// button for the user to return to the main screen
    JPanel backButtonPanel = new JPanel();
    JButton encryptButton = new JButton("Encrypt");				        // button on second screen to submit
    
    JPanel title = new JPanel();											
    JLabel pageTitle = new JLabel("Choose an encryption method");		
    JPanel length = new JPanel();						        		// string on second screen telling us length restrictions
    JLabel lengthRestriction = new JLabel();
    JPanel number = new JPanel();								        // string on second screen telling us numbers we can input
    JLabel numberRestriction = new JLabel();
    
    // buttons on the initial screen for our 3 methods
    JButton button1 = new JButton("Method 1");
    JButton button2 = new JButton("Method 2");
    JButton button3 = new JButton("Method 3");
    
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    
    //buttons and panels for our "numpad" configuration
    JPanel numberInputterPanel = new JPanel(); 	

    JButton numpad1 = new JButton("1");
    JButton numpad2 = new JButton("2");
    JButton numpad3 = new JButton("3");
    JButton numpad4 = new JButton("4");
    JButton numpad5 = new JButton("5");
    JButton numpad6 = new JButton("6");
    JButton numpad7 = new JButton("7");
    JButton numpad8 = new JButton("8");
    JButton numpad9 = new JButton("9");
    JButton numpadComma = new JButton(", ");
    JButton numpad0 = new JButton("0");
    JButton numpad_ = new JButton("  ");

    JPanel numpad147Comma = new JPanel();
    JPanel numpad2580 = new JPanel();
    JPanel numpad369_ = new JPanel();


    //our initial screen button listeners

    class Method1Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
	    
		    panel.removeAll();
		    panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

		    encryptButton = new JButton("Encrypt");
		    encryptButton.addActionListener(new Encrypt1Listener());
		    
		    textField.setText("");
		    panel1.removeAll();
		    panel1.add(textField);
		    
		    panel2.removeAll();
		    panel2.add(encryptButton);
		    
		    pageTitle.setText("Input a list of integers to encrypt (separated by comma's with no spaces)");
		    title.add(pageTitle);
		    
		    lengthRestriction.setText("Length of list between 2 and 50 inclusive");
		    length.add(lengthRestriction);
		    
		    numberRestriction.setText("Numbers must be between 1 and 1000 inclusive");
		    number.add(numberRestriction);
		    
		    encryptedNumberLabel.setText("");
		    
		    panel.add(title);
		    panel.add(length);
		    panel.add(number);
		    panel.add(panel1);
		    panel.add(panel2);
		    panel.add(encryptedNumberPanel);
		    panel.add(numberInputterPanel);
		    panel.add(backButtonPanel);
		    
		    numberInputterPanel.setVisible(true);
		    
		    frame.repaint();
		    frame.getContentPane().add(panel);
		    
		    frame.invalidate();
		    frame.validate();
		}	
    }//end of first method listener inner class
    
    class Method2Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
		    
		    panel.removeAll();
		    panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		    
		    encryptButton = new JButton("Encrypt");
		    encryptButton.addActionListener(new Encrypt2Listener());
		    
		    textField.setText("");
		    panel1.removeAll();
		    panel1.add(textField);
		    
		    panel2.removeAll();
		    panel2.add(encryptButton);
		    
		    pageTitle.setText("Input a list of integers to encrypt (separated by comma's with no spaces)");
		    title.add(pageTitle);
		    
		    lengthRestriction.setText("Length of list between 2 and 10 inclusive");
		    length.add(lengthRestriction);
		    
		    numberRestriction.setText("Numbers must be between -50 and 50 inclusive");
		    number.add(numberRestriction);
		    
		    encryptedNumberLabel.setText("");
		    
		    panel.add(title);
		    panel.add(length);
		    panel.add(number);
		    panel.add(panel1);
		    panel.add(panel2);
		    panel.add(encryptedNumberPanel);
		    panel.add(numberInputterPanel);
		    panel.add(backButtonPanel);
		    
		    frame.repaint();
		    frame.getContentPane().add(panel);
		    
		    frame.invalidate();
		    frame.validate();
		}
    }//end of second method listener inner class  
    
    class Method3Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){

		    panel.removeAll();
		    panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

		    encryptButton = new JButton("Encrypt");		    
		    encryptButton.addActionListener(new Encrypt3Listener());
		    
		    textField.setText("");
		    panel1.removeAll();
		    panel1.add(textField);
		    
		    panel2.removeAll();
		    panel2.add(encryptButton);
		    
		    pageTitle.setText("Input a list of integers to encrypt (separated by comma's with no spaces)");
		    title.add(pageTitle);
		    
		    lengthRestriction.setText("Length of list between 2 and 10 inclusive");
		    length.add(lengthRestriction);

		    numberRestriction.setText("Numbers must be between -1000 and 1000 inclusive");
		    number.add(numberRestriction);
		    
		    encryptedNumberLabel.setText("");

		    panel.add(title);
		    panel.add(length);
		    panel.add(number);
		    panel.add(panel1);
		    panel.add(panel2);
		    panel.add(encryptedNumberPanel);
		    panel.add(numberInputterPanel);
		    panel.add(backButtonPanel);
		    
		    frame.repaint();
		    frame.getContentPane().add(panel);
		    
		    frame.invalidate();
		    frame.validate();
		    
		}
    }//end of third method listener inner class

    
    //listeners for our second screen   
    class Encrypt1Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
		    encryptedNumberPanel.setVisible(true);
		    	try{
			    String input = textField.getText();
			    int[] intArray = userRead.stringToIntArray(input);
			    long encryptedValue = encryptMethods.encrypt1(intArray);
			    
			    encryptedNumberLabel.setText(Long.toString(encryptedValue));
			    encryptedNumberPanel.add(encryptedNumberLabel);
			    
			    frame.invalidate();
			    frame.validate();
			}
			catch (NumberFormatException ex) {//hard coded to print out error if error
			    encryptedNumberLabel.setText("Error! Please check your input and try again.");
			    encryptedNumberPanel.add(encryptedNumberLabel);
			    
			    frame.invalidate();
			    frame.validate();
			}
		}
    }// end of Encrypt1Listener
    
    class Encrypt2Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
		    encryptedNumberPanel.setVisible(true);
		    try{
			String input = textField.getText();
			int[] intArray = userRead.stringToIntArray(input);
			long encryptedValue = encryptMethods.encrypt2(intArray);
			
			encryptedNumberLabel.setText(Long.toString(encryptedValue));
			encryptedNumberPanel.add(encryptedNumberLabel);
			
			frame.invalidate();
			frame.validate();
		    }
		    catch (NumberFormatException ex) {//hard coded to print out error if error
		    	encryptedNumberLabel.setText("Error! Please check your input and try again.");
		    	encryptedNumberPanel.add(encryptedNumberLabel);
			
			frame.invalidate();
			frame.validate();
		    }   
     	}	
    }// end of Encrypt2Listener
    
    class Encrypt3Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
		    encryptedNumberPanel.setVisible(true);
		    try{
			String input = textField.getText();
			int[] intArray = userRead.stringToIntArray(input);
			long encryptedValue = encryptMethods.encrypt3(intArray);
			
			encryptedNumberLabel.setText(Long.toString(encryptedValue));
			encryptedNumberPanel.add(encryptedNumberLabel);
			
			frame.invalidate();
			frame.validate();
		    }
		    catch (NumberFormatException ex) {//hard coded to print out error  if error
		    	encryptedNumberLabel.setText("Error! Please check your input and try again.");
		    	encryptedNumberPanel.add(encryptedNumberLabel);
			
			frame.invalidate();
			frame.validate();
		    }	    
     	}	
    }// end of Encrypt3Listener
    
       
    class numpad1Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
	    	textField.setText(textField.getText()+"1");
		}
    }
    
    class numpad2Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
		    textField.setText(textField.getText()+"2");
		}
    }
    
    class numpad3Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
		    textField.setText(textField.getText()+"3");
		}
    }
    
    class numpad4Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
		    textField.setText(textField.getText()+"4");
		}
    }
    
    class numpad5Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
		    textField.setText(textField.getText()+"5");
		}
    }
    
    class numpad6Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
		    textField.setText(textField.getText()+"6");
		}
    }
    
    class numpad7Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
		    textField.setText(textField.getText()+"7");
		}
    }
    
    class numpad8Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
		    textField.setText(textField.getText()+"8");
		}
    }
    
    class numpad9Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
		    textField.setText(textField.getText()+"9");
		}
    }
    
    class numpad0Listener implements ActionListener{
		public void actionPerformed(ActionEvent event){
		    textField.setText(textField.getText()+"0");
		}
    }

    class numpadCommaListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			textField.setText(textField.getText()+",");
		}
    }
    
    
    // calls our remake of the initial screen when pressed
    class backButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
		    initialization();
		    
		}
    }
    
    // remakes the initial screen for our back button
    public void initialization(){
	
		frame.repaint();

		pageTitle.setText("Choose an encryption method");
		title.removeAll();
		title.add(pageTitle);
		
		button1.addActionListener(new Method1Listener());
		button2.addActionListener(new Method2Listener());
		button3.addActionListener(new Method3Listener());
		
		panel1.removeAll();
		panel2.removeAll();
		panel3.removeAll();
		
		panel1.add(button1);
		panel2.add(button2);
		panel3.add(button3);
			
		panel.removeAll();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
			
		panel.add(title);
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);

		frame.getContentPane().add(panel);
		frame.invalidate();
		frame.validate();

	}
    
    // our first screen being made and setting a few things up for later
    public void initialSetup(){
		encryptedNumberPanel.setVisible(false);

		backButton.addActionListener(new backButtonListener());
		backButtonPanel.add(backButton);

		title.add(pageTitle);

		//Linking the buttons to action listeners

		numpad1.addActionListener(new numpad1Listener());
		numpad2.addActionListener(new numpad2Listener());
		numpad3.addActionListener(new numpad3Listener());
		numpad4.addActionListener(new numpad4Listener());
		numpad5.addActionListener(new numpad5Listener());
		numpad6.addActionListener(new numpad6Listener());
		numpad7.addActionListener(new numpad7Listener());
		numpad8.addActionListener(new numpad8Listener());
		numpad9.addActionListener(new numpad9Listener());
		numpad0.addActionListener(new numpad0Listener());
		numpadComma.addActionListener(new numpadCommaListener());

		//placing the buttons into a "numpad" kind of format
		numberInputterPanel.setLayout(new BoxLayout(numberInputterPanel,BoxLayout.X_AXIS));
		numpad147Comma.setLayout(new BoxLayout(numpad147Comma,BoxLayout.Y_AXIS));
		numpad2580.setLayout(new BoxLayout(numpad2580,BoxLayout.Y_AXIS));
		numpad369_.setLayout(new BoxLayout(numpad369_,BoxLayout.Y_AXIS));

		numpad147Comma.add(numpad1);
		numpad147Comma.add(numpad4);
		numpad147Comma.add(numpad7);
		numpad147Comma.add(numpadComma);

		numpad2580.add(numpad2);
		numpad2580.add(numpad5);
		numpad2580.add(numpad8);
		numpad2580.add(numpad0);

		numpad369_.add(numpad3);
		numpad369_.add(numpad6);
		numpad369_.add(numpad9);
		numpad369_.add(numpad_);

		numberInputterPanel.add(numpad147Comma);
		numberInputterPanel.add(numpad2580);
		numberInputterPanel.add(numpad369_);


		initialization();

		frame.setSize(720,480);
		frame.setTitle("Encryption");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}


    public static void main(String[] args){
		CryptographyGUI gui = new CryptographyGUI();
		gui.initialSetup();

    }//end of main

}//end of class
