package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history;
  
  //Initialize the total and history string
  public AddingMachine () {
    total = 0;  //initialize the total to 0
    history = "0";  //initialize the history string to ' 0 '
  }
  
  //returns the total
  public int getTotal () {
    return total;   //return total
  }
  
  //adds value to total and updates history accordingly
  public void add (int value) {
	  total = total + value;   //adds value to total
	  history = history + " + " + value;   //updates history
  }

  //subtracts value from total and updates history accordingly
  public void subtract (int value) {
	  total = total - value;   //subtracts value from total
	  history = history + " - " + value;   //updates history
  }

  //returns the history string
  public String toString () {
    return history;   //returns history
  }

  public void clear() {
	  System.gc();
  }
}
