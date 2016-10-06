import javax.swing.JOptionPane;
import java.text.DecimalFormat;

//Conor Russell Section 02

public class DiscountCalc 
{
	public static void main(String [] args)
	{
		final double DIS_1 = 0.2; //20% Discount
		final double DIS_2 = 0.3; //30% Discount
		final double DIS_3 = 0.4; //40% Discount
		final double DIS_4 = 0.5; //50% Discount
		final double COST = 99.0; //Cost of 1 Package
		double grossCost, packTotal, disTotal, netCost;
		String input;
		
		DecimalFormat formatter = new DecimalFormat("0.00"); //Used to format discTotal and netCost into output for use with JOptionPane
		
		input = JOptionPane.showInputDialog("Enter the number of packages for purchase: ");
		packTotal = Double.parseDouble(input);
		
		grossCost = packTotal * COST; //Calculate initial cost before discount
		
		if(packTotal < 10)
		{
			netCost = grossCost; //For this case there is no discount so the final cost is the initial cost
			
			javax.swing.JOptionPane.showMessageDialog(null, "No Discount Applied" + "\nYour Total Cost is: $" + formatter.format(netCost));
			System.exit(0);
		}
		else if(packTotal <= 19)
		{
			disTotal = grossCost * DIS_1; //Calculate Discount Amount at 20%
			netCost = grossCost - disTotal; //Calculate final cost after discount
			
			javax.swing.JOptionPane.showMessageDialog(null, "20% Discount Applied" + "\nYou saved: $" + formatter.format(disTotal) + "\nYour Total Cost is: $" + formatter.format(netCost));
			System.exit(0);
		}
		else if(packTotal <= 49)	
		{
			disTotal = grossCost * DIS_2; //Calculate Discount Amount at 30%
			netCost = grossCost - disTotal; //Calculate final cost after discount
			
			javax.swing.JOptionPane.showMessageDialog(null, "30% Discount Applied" + "\nYou saved: $" + formatter.format(disTotal) + "\nYour Total Cost is: $" + formatter.format(netCost));
			System.exit(0);
		}
		else if(packTotal <= 99)	
		{ 
			disTotal = grossCost * DIS_3; //Calculate Discount Amount at 40%
			netCost = grossCost - disTotal; //Calculate final cost after discount
			
			javax.swing.JOptionPane.showMessageDialog(null, "40% Discount Applied" + "\nYou saved: $" + formatter.format(disTotal) + "\nYour Total Cost is: $" + formatter.format(netCost));
			System.exit(0);
		}
		else
		{
			disTotal = grossCost * DIS_4; //Calculate Discount Amount at 50%
			netCost = grossCost - disTotal; //Calculate final cost after discount
			
			javax.swing.JOptionPane.showMessageDialog(null, "50% Discount Applied" + "\nYou saved: $" + formatter.format(disTotal) + "\nYour Total Cost is: $" + formatter.format(netCost));
			System.exit(0);
		}
		
		System.exit(0);
	}//End of main
}//End of class
