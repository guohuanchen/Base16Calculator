import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
/**
* A class create buttons, slider, and text field to the panel
* @author Guohuan Chen
**/
public class Base16Panel extends JPanel implements ActionListener  {
	private static final long serialVersionUID = 1L;
	private Base16CalcState calc = new Base16CalcState();		//creating an calc object to access all
    private int base=0;		// the class methods in Base9CalcState, initialized base to 0
    private final String[] buttonValue = { "0", "1", "2", "3", "4", "5", "6",
    "7", "8", "9" ,"10", "11", "12", "13", "14", "15"};  // create a string array
    JButton but[], plus, minus, multiply, divide, equal,clear; 
    JTextArea textfield;		// creating a field to display the text
    private String operation="";			// Setting the operation to an empyty string
/**
 * A method that builds a calculator in a base 16. 
 */
    Base16Panel() {
        this.setLayout(new FlowLayout());
        
        JSlider sliderbase = new JSlider(JSlider.VERTICAL, 2, 16, 2);  	// making a slider with designed
        sliderbase.setMinorTickSpacing(1);  // setting one space whenever user drag the slider each time
        sliderbase.setMajorTickSpacing(2);	// setting range appear on the slider bar 
        sliderbase.setPaintTicks(true);  	// setting the ticks visible
        sliderbase.setPaintLabels(true);
        sliderbase.addChangeListener(new sliderbaseListener());
        textfield= new JTextArea(2, 20); 		//
        but = new JButton[16];
        for (int i = 0; i < buttonValue.length; i++) { // A loop to create buttons from 0-9, and A-F
            if(i==10){
                but[i]=new JButton("A");
            }else if(i==11)
                but[i]=new JButton("B");
            else if(i==12)
                but[i]=new JButton("C");
            else if(i==13)
                but[i]=new JButton("D");
            else if(i==14)
                but[i]=new JButton("E");
            else if(i==15)
                but[i]=new JButton("F");
            else
                but[i] = new JButton(String.valueOf(i));
        }
        plus = new JButton("+");
        minus = new JButton("-");
        multiply = new JButton("x");
        divide = new JButton("/");
        equal = new JButton("=");
        clear = new JButton("Clear");
        
        add(textfield);		// adding all the buttons to the panel
        add(sliderbase);
        add(clear);
        add(equal);
        add(plus);
        add(minus);
        add(multiply);
        add(divide);
        for (int i = 0; i < buttonValue.length; i++) {	// A loop to add all the button from 
        	// 0-9 to the panel, and set them all disable, and sign up to listener 
            add(but[i]);
            but[i].setEnabled(false);
            but[i].addActionListener(this);
        }
        divide.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        equal.addActionListener(this);
        clear.addActionListener(this);
    }
    // one inner class with one method that implements ChangneListener
class sliderbaseListener implements ChangeListener{
/**
 * The method used for creating buttons. The user can activate the base by dragging
 * the slider, some buttons will be enabled or disable depending on user's option.
 * @param event an event object carry data back to the listener
 */
public void stateChanged(ChangeEvent event) {
	JSlider sliderbase = (JSlider) event.getSource(); // When user drag the slider bar, it will automatically activate the base
      if (sliderbase.getValue()==2){		// base 2
    	  base=2;
    	  for(int i=0; i<buttonValue.length; i++){
    		  if(i<base)
    			  but[i].setEnabled(true);
                    else
                        but[i].setEnabled(false);
                }
            }
      if(sliderbase.getValue()==3){
    	  base=3;
    	  for(int i=0; i<buttonValue.length; i++){
    		 if(i<base)
      			but[i].setEnabled(true);
    		 else
    			 but[i].setEnabled(false);
            	}
            }
      if(sliderbase.getValue()==4){
    	  base=4;
    	  for(int i=0; i<buttonValue.length; i++){
     		if(i<base)
     			but[i].setEnabled(true);
     		else
      			but[i].setEnabled(false);
    	  		}
            }
      if(sliderbase.getValue()==5){
    	  base=5;
    	  for(int i=0; i<buttonValue.length; i++){
    		  if(i<base)
    			  but[i].setEnabled(true);
    		  else
    			  but[i].setEnabled(false);
            	}
            }
      if(sliderbase.getValue()==6){
    	  base=6;
    	  for(int i=0; i<buttonValue.length; i++){
    		  if(i<base)
    			  but[i].setEnabled(true);
    		  else
    			  but[i].setEnabled(false);
            	}
            }

      if(sliderbase.getValue()==7){
    	  base=7;
    	  for(int i=0; i<buttonValue.length; i++){
    		  if(i<base)
    			  but[i].setEnabled(true);
    		  else
    			  but[i].setEnabled(false);
            	}
            }
      if(sliderbase.getValue()==8){
    	  base=8;
    	  for(int i=0; i<buttonValue.length; i++){
    		  if(i<base)
    			  but[i].setEnabled(true);
    		  else
    			  but[i].setEnabled(false);
            	}
            }
      if(sliderbase.getValue()==9){
    	  base=9;
    	  for(int i=0; i<buttonValue.length; i++){
    		  if(i<base)
    			  but[i].setEnabled(true);
    		  else
    			  but[i].setEnabled(false);
            	}
            }
      if(sliderbase.getValue()==10){
    	  base=10;
    	  for(int i=0; i<buttonValue.length; i++){
    		  if(i<base)
    			  but[i].setEnabled(true);
    		  else
    			  but[i].setEnabled(false);
            	}
            }
      if(sliderbase.getValue()==11){
    	  base=11;
    	  for(int i=0; i<buttonValue.length; i++){
    		  if(i<base)
    			  but[i].setEnabled(true);
    		  else
    			  but[i].setEnabled(false);
            	}
      }
      if(sliderbase.getValue()==12){
    	  base=12;
    	  for(int i=0; i<buttonValue.length; i++){
    		  if(i<base)
    			  but[i].setEnabled(true);
    		  else
    			  but[i].setEnabled(false);
            	}
            }
      if(sliderbase.getValue()==13){
    	  base=13;
    	  for(int i=0; i<buttonValue.length; i++){
    		  if(i<base)
    			  but[i].setEnabled(true);
    		  else
    			  but[i].setEnabled(false);
            	}
            }
      if(sliderbase.getValue()==14){
    	  base=14;
    	  for(int i=0; i<buttonValue.length; i++){
    		  if(i<base)
    			  but[i].setEnabled(true);
    		  else
    			  but[i].setEnabled(false);
    	  }
      }
     if(sliderbase.getValue()==15){
    	 base=15;
    	 for(int i=0; i<buttonValue.length; i++){
    		 if(i<base)
    			 but[i].setEnabled(true);
    		 else
    			 but[i].setEnabled(false);
    	 }
     }
            if(sliderbase.getValue()==16){
            	base=16;
            	for(int i=0; i<buttonValue.length; i++){
            		but[i].setEnabled(true);
            	}
            }
        }
    }
/**
 * This method is told to do the operation operation, and sending back the result to the operation 
 * function. 
 * @param event an event object carry data back to the listener
 */
public void actionPerformed(ActionEvent event){		//This method actually do the works
    for(int i=0; i<buttonValue.length; i++)			
    	if(event.getSource()==but[i]){					// method carries the information about events.
    		textfield.replaceSelection(buttonValue[i]);		// Whenever you click the button, it will concatenating
    }															// and display in the text field as String type											// and display in the text field as String type
    if(event.getSource()==plus || event.getSource()==minus ||
    		event.getSource()==divide || event.getSource()==multiply){		// Decide which operation you want to process
    	if(base==2){
    		calc.setValue(Integer.parseInt(textfield.getText(),2));  //then, we parse String into Integer type to do the calculation
    	}else if (base==3){
    		calc.setValue(Integer.parseInt(textfield.getText(),3));	// The setValue is being called and value is sent to
    	}else if (base==4){
    		calc.setValue(Integer.parseInt(textfield.getText(),4));	//the class method in Base9CalcState
    	}else if (base==5){
    		calc.setValue(Integer.parseInt(textfield.getText(),5));
    	}else if (base==6){
    		calc.setValue(Integer.parseInt(textfield.getText(),6));
    	}else if (base==7){
    		calc.setValue(Integer.parseInt(textfield.getText(),7));
    	}else if (base==8){
    		calc.setValue(Integer.parseInt(textfield.getText(),8));
    	}else if (base==9){
    		calc.setValue(Integer.parseInt(textfield.getText(),9));
    	}else if (base==10){
    		calc.setValue(Integer.parseInt(textfield.getText(),10));
    	}else if (base==11){
    		calc.setValue(Integer.parseInt(textfield.getText(),11));
    	}else if (base==12){
    		calc.setValue(Integer.parseInt(textfield.getText(),12));
    	}else if (base==13){
    		calc.setValue(Integer.parseInt(textfield.getText(),13));
    	}else if (base==14){
    		calc.setValue(Integer.parseInt(textfield.getText(),14));
    	}else if (base==15){
    		calc.setValue(Integer.parseInt(textfield.getText(),15));
    	}else if (base==16){
    		calc.setValue(Integer.parseInt(textfield.getText(),16));
    	}
    	textfield.setText("");
    	if(event.getSource()==plus)	{
    		operation="+";
           }else if(event.getSource()==minus){
        	   operation="-";
           }else if(event.getSource()==multiply){
        	   operation="*";
           }else if(event.getSource()==divide){
        	   operation="/";
           }
    	}						// After the first number is chosen, you can click the operation
        // that you want to process
        if(event.getSource()==clear){
            calc.setValue(0);
            textfield.setText("");
        }
        
        if(event.getSource()==equal){
            if(operation=="+")	 // You have chosen addition, when the calculation is done,
            {					// the integer immediately converted into String
                if(base==2){
                    calc.Plus(Integer.parseInt(textfield.getText(),2));
                    textfield.setText(Integer.toString(calc.currentValue(),2));
                }
                else if(base==3){
                    calc.Plus(Integer.parseInt(textfield.getText(),3));
                    textfield.setText(Integer.toString(calc.currentValue(),3));
                }
                else if(base==4){
                    calc.Plus(Integer.parseInt(textfield.getText(),4));
                    textfield.setText(Integer.toString(calc.currentValue(),4));
                }
                else if(base==5){
                    calc.Plus(Integer.parseInt(textfield.getText(),5));
                    textfield.setText(Integer.toString(calc.currentValue(),5));
                }
                else if(base==6){
                    calc.Plus(Integer.parseInt(textfield.getText(),6));
                    textfield.setText(Integer.toString(calc.currentValue(),6));
                }
                else if(base==7){
                    calc.Plus(Integer.parseInt(textfield.getText(),7));
                    textfield.setText(Integer.toString(calc.currentValue(),7));
                }
                else if(base==8){
                    calc.Plus(Integer.parseInt(textfield.getText(),8));
                    textfield.setText(Integer.toString(calc.currentValue(),8));
                }
                else if(base==9){
                    calc.Plus(Integer.parseInt(textfield.getText(),9));
                    textfield.setText(Integer.toString(calc.currentValue(),9));
                }
                else if(base==10){
                    calc.Plus(Integer.parseInt(textfield.getText(),10));
                    textfield.setText(Integer.toString(calc.currentValue(),10));
                }
                else if(base==11){
                    calc.Plus(Integer.parseInt(textfield.getText(),11));
                    textfield.setText(Integer.toString(calc.currentValue(),11));
                }
                else if(base==12){
                    calc.Plus(Integer.parseInt(textfield.getText(),12));
                    textfield.setText(Integer.toString(calc.currentValue(),12));
                }
                else if(base==13){
                    calc.Plus(Integer.parseInt(textfield.getText(),13));
                    textfield.setText(Integer.toString(calc.currentValue(),13));
                }
                else if(base==14){
                    calc.Plus(Integer.parseInt(textfield.getText(),14));
                    textfield.setText(Integer.toString(calc.currentValue(),14));
                }
                else if(base==15){
                    calc.Plus(Integer.parseInt(textfield.getText(),15));
                    textfield.setText(Integer.toString(calc.currentValue(),15));
                }
                else if(base==16){
                    calc.Plus(Integer.parseInt(textfield.getText(),16));
                    textfield.setText(Integer.toString(calc.currentValue(),16));
                }
            }
            if(operation=="-"){
                if(base==2){
                    calc.Minus(Integer.parseInt(textfield.getText(),2));
                    textfield.setText(Integer.toString(calc.currentValue(),2));
                }
                else if(base==3){
                    calc.Minus(Integer.parseInt(textfield.getText(),3));
                    textfield.setText(Integer.toString(calc.currentValue(),3));
                }
                else if(base==4){
                    calc.Minus(Integer.parseInt(textfield.getText(),4));
                    textfield.setText(Integer.toString(calc.currentValue(),4));
                }
                else if(base==5){
                    calc.Minus(Integer.parseInt(textfield.getText(),5));
                    textfield.setText(Integer.toString(calc.currentValue(),5));
                }
                else if(base==6){
                    calc.Minus(Integer.parseInt(textfield.getText(),6));
                    textfield.setText(Integer.toString(calc.currentValue(),6));
                }
                else if(base==7){
                    calc.Minus(Integer.parseInt(textfield.getText(),7));
                    textfield.setText(Integer.toString(calc.currentValue(),7));
                }
                else if(base==8){
                    calc.Minus(Integer.parseInt(textfield.getText(),8));
                    textfield.setText(Integer.toString(calc.currentValue(),8));
                }
                else if(base==9){
                    calc.Minus(Integer.parseInt(textfield.getText(),9));
                    textfield.setText(Integer.toString(calc.currentValue(),9));
                }
                else if(base==10){
                    calc.Minus(Integer.parseInt(textfield.getText(),10));
                    textfield.setText(Integer.toString(calc.currentValue(),10));
                }
                else if(base==11){
                    calc.Minus(Integer.parseInt(textfield.getText(),11));
                    textfield.setText(Integer.toString(calc.currentValue(),11));
                }
                else if(base==12){
                    calc.Minus(Integer.parseInt(textfield.getText(),12));
                    textfield.setText(Integer.toString(calc.currentValue(),12));
                }
                else if(base==13){
                    calc.Minus(Integer.parseInt(textfield.getText(),13));
                    textfield.setText(Integer.toString(calc.currentValue(),13));
                }
                else if(base==14){
                    calc.Minus(Integer.parseInt(textfield.getText(),14));
                    textfield.setText(Integer.toString(calc.currentValue(),14));
                }
                else if(base==15){
                    calc.Minus(Integer.parseInt(textfield.getText(),15));
                    textfield.setText(Integer.toString(calc.currentValue(),15));
                }
                else if(base==16){
                    calc.Minus(Integer.parseInt(textfield.getText(),16));
                    textfield.setText(Integer.toString(calc.currentValue(),16));
                }
            }
            if(operation=="*")
            {
                if(base==2){
                    calc.Multiply(Integer.parseInt(textfield.getText(),2));
                    textfield.setText(Integer.toString(calc.currentValue(),2));
                }
                else if(base==3){
                    calc.Multiply(Integer.parseInt(textfield.getText(),3));
                    textfield.setText(Integer.toString(calc.currentValue(),3));
                }
                else if(base==4){
                    calc.Multiply(Integer.parseInt(textfield.getText(),4));
                    textfield.setText(Integer.toString(calc.currentValue(),4));
                }
                else if(base==5){
                    calc.Multiply(Integer.parseInt(textfield.getText(),5));
                    textfield.setText(Integer.toString(calc.currentValue(),5));
                }
                else if(base==6){
                    calc.Multiply(Integer.parseInt(textfield.getText(),6));
                    textfield.setText(Integer.toString(calc.currentValue(),6));
                }
                else if(base==7){
                    calc.Multiply(Integer.parseInt(textfield.getText(),7));
                    textfield.setText(Integer.toString(calc.currentValue(),7));
                }
                else if(base==8){
                    calc.Multiply(Integer.parseInt(textfield.getText(),8));
                    textfield.setText(Integer.toString(calc.currentValue(),8));
                }
                else if(base==9){
                    calc.Multiply(Integer.parseInt(textfield.getText(),9));
                    textfield.setText(Integer.toString(calc.currentValue(),9));
                }
                else if(base==10){
                    calc.Multiply(Integer.parseInt(textfield.getText(),10));
                    textfield.setText(Integer.toString(calc.currentValue(),10));
                }
                else if(base==11){
                    calc.Multiply(Integer.parseInt(textfield.getText(),11));
                    textfield.setText(Integer.toString(calc.currentValue(),11));
                }
                else if(base==12){
                    calc.Multiply(Integer.parseInt(textfield.getText(),12));
                    textfield.setText(Integer.toString(calc.currentValue(),12));
                }
                else if(base==13){
                    calc.Multiply(Integer.parseInt(textfield.getText(),13));
                    textfield.setText(Integer.toString(calc.currentValue(),13));
                }
                else if(base==14){
                    calc.Multiply(Integer.parseInt(textfield.getText(),14));
                    textfield.setText(Integer.toString(calc.currentValue(),14));
                }
                else if(base==15){
                    calc.Multiply(Integer.parseInt(textfield.getText(),15));
                    textfield.setText(Integer.toString(calc.currentValue(),15));
                }
                else if(base==16){
                    calc.Multiply(Integer.parseInt(textfield.getText(),16));
                    textfield.setText(Integer.toString(calc.currentValue(),16));
                }
            }
            if(operation=="/"){
                if(base==2){
                    calc.Divid(Integer.parseInt(textfield.getText(),2));			
                    textfield.setText(Integer.toString(calc.currentValue(),2));
                }
                else if(base==3){
                    calc.Divid(Integer.parseInt(textfield.getText(),3));	
                    textfield.setText(Integer.toString(calc.currentValue(),3));
                }
                else if(base==4){
                    calc.Divid(Integer.parseInt(textfield.getText(),4));	
                    textfield.setText(Integer.toString(calc.currentValue(),4));
                }
                else if(base==5){
                    calc.Divid(Integer.parseInt(textfield.getText(),5));
                    textfield.setText(Integer.toString(calc.currentValue(),5));
                }
                else if(base==6){
                    calc.Divid(Integer.parseInt(textfield.getText(),6));
                    textfield.setText(Integer.toString(calc.currentValue(),6));
                }
                else if(base==7){
                    calc.Divid(Integer.parseInt(textfield.getText(),7));
                    textfield.setText(Integer.toString(calc.currentValue(),7));
                }
                else if(base==8){
                    calc.Divid(Integer.parseInt(textfield.getText(),8));
                    textfield.setText(Integer.toString(calc.currentValue(),8));
                }
                else if(base==9){
                    calc.Divid(Integer.parseInt(textfield.getText(),9));
                    textfield.setText(Integer.toString(calc.currentValue(),9));
                }
                else if(base==10){
                    calc.Divid(Integer.parseInt(textfield.getText(),10));
                    textfield.setText(Integer.toString(calc.currentValue(),10));
                }
                else if(base==11){
                    calc.Divid(Integer.parseInt(textfield.getText(),11));
                    textfield.setText(Integer.toString(calc.currentValue(),11));
                }
                else if(base==12){
                    calc.Divid(Integer.parseInt(textfield.getText(),12));
                    textfield.setText(Integer.toString(calc.currentValue(),12));
                }
                else if(base==13){
                    calc.Divid(Integer.parseInt(textfield.getText(),13));
                    textfield.setText(Integer.toString(calc.currentValue(),13));
                }
                else if(base==14){
                    calc.Divid(Integer.parseInt(textfield.getText(),14));
                    textfield.setText(Integer.toString(calc.currentValue(),14));
                }
                else if(base==15){
                    calc.Divid(Integer.parseInt(textfield.getText(),15));
                    textfield.setText(Integer.toString(calc.currentValue(),15));
                }
                else if(base==16){
                    calc.Divid(Integer.parseInt(textfield.getText(),16));
                    textfield.setText(Integer.toString(calc.currentValue(),16));
                }
            }
        }	
    }
}

