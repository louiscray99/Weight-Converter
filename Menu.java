package calculator;

import java.util.Scanner;

public class Menu {
	public String title;
	public String options [];
	
	//Constructor for Menu Class
	public Menu(String title, String options[]) {
		this.title = title;
		copyOptions(options);
	}

	//Initialise options array by copying contents of data
	//Data is an array of strings which the user can select a choice of.
	private void copyOptions(String data[]) {
		if ( data != null) {
			options = new String[data.length];
			for(int index=0;index<data.length;index++) {
				options[index] = data[index];
			}
		}
		else {
			options = null;
		}
	}
	
	public int getChoice() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please Select A Weight To Convert From: ");
		int choice = input.nextInt();
		return choice;
	}
	
	//Displays Menu Title followed by a list of options
	public void display() {
		if (title != null && options !=null) {
			// title and options are valid
			// display title and underline with '+'
			System.out.println(title);
			for(int i=0;i<title.length();i++) {
				System.out.print("+");
			}
			System.out.println("\n");
			// display the menu options
			// prefix each with an int starting at 1
			int count = 1;
			for(String str  : options) {
				System.out.println(count+". "+str);
				count++;
			}
			System.out.println();
		}
		else {
			// title and/or options are not valid
			System.out.println("Menu not defined.");
		}
	}
	
}
