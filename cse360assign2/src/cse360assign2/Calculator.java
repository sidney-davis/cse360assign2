/* Name: Sidney Davis
 * Class ID: 360
 * Program Purpose: This program allows you to do basic calculator functions like addition, subtraction, multiplication and division.
 */

package cse360assign2;

/**
 * @author Sidney Davis
 * This class consists of methods that represent calculator operations and manipulate the total based on the operation and parameters
 * entered. 
 */

public class Calculator {

	private int total;
	private String history;
	/**
	 * Class Constructor
	 * Initializes the total to 0 and history to it's initial value of 0.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0 ";
	}
	
	/**
	 * This method gets the total and returns that value.
	 * @return Returns total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method adds the parameter value to the total. It also updates the history string with the new addition 
	 * operation that was computed.
	 * @param value An integer value that adds to total
	 */
	public void add (int value) {
		total += value;
		history += "+ " + value + " ";
	}
	
	/**
	 * This method subtracts the parameter value from the total. It also updates the history string with the new subtraction
	 * operation that was computed.
	 * @param value An integer value that subtracts from total
	 */
	public void subtract (int value) {
		total -= value;
		history += "- " + value + " ";
	}
	
	/**
	 * This method multiplies the total by the parameter value. It also updates the history string with the new multiplication
	 * operation that was computed.
	 * @param value An integer value that multiplies the total.
	 */
	public void multiply (int value) {
		total *= value;
		history += "* " + value + " ";
	}
	
	/**
	 * This method represents the division operator and divides the total by an integer value using integer division.
	 * If the parameter is zero, the total is set to zero. It also updates the history string with the new division
	 * operation that was computed.
	 * @param value An integer that divides the total by this parameter
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		} else {
			total /= value;
		}
		history += "/ " + value + " ";
	}
	
	/**
	 * This method returns a string of the history of calculator operations.
	 * @return Returns history String variable 
	 */
	public String getHistory () {
		return history;
	}
}
