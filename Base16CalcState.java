	/**
	* Class Base16CalcState performs addition/division/multiplication/subtraction operation in a calculator
	**/
public class Base16CalcState{
	
	private int value;

	Base16CalcState() { value = 0;}		// initialized the value to 0
	
	// invoked when the "Clear" button is pressed--is there any other time it should be invoked?
	public void clear() { 
		value = 0; 
		}
	public void setValue(int val){ 
		value=val; 
		}	
	/**
	*the Plus method takes user input and performs addition
	*@param val
	**/
	public void Plus(int val)		// addition method
	{
		value=value+val;
	};
	/**
	*the Minus method takes user input and performs subtraction
	*@param val
	**/
	public void Minus(int val)	// subtraction method
	{
		value=value-val;
	}
	/**
	*the Multiply method takes user input and performs multiplication
	*@param val
	**/
	public void Multiply(int val)	// Multiplication method
	{
		value=value*val;
	}
	/**
	*the divide method takes user input and performs division
	*@param val
	**/
	public void Divid(int val)	// division method
	{
		value=value/val;
	}
	/**
	 * the currentValue method will calculate the user's input
	 * @return output of the calculation
	 */
	public int currentValue() {  // Showing the current value in the text field
		return value; 
		}
}