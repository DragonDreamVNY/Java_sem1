package source;

import javax.swing.JOptionPane;

public class ProductPrices {

    public static void main(String[] args) {
        double productArray[] = new double[10];
		
	
		String input = "";
		
		//get input
		for(int i =0; i < 10; i++) {
			input = JOptionPane.showInputDialog("Enter Price ");
			productArray[i] = Double.parseDouble(input);
		}//end for
		
		//increase prices by 10%
		for(int i =0; i < 10; i++) {
			productArray[i] *= 1.1; 
		}//end  for
		
		
		for(int i =0; i < 10; i++) {
                        JOptionPane.showMessageDialog(null, "New Price For Product is " + productArray[i]);
		}//end for
    }
    
}

