package ch2a1;

import javax.swing.JOptionPane;

public class ch2a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String tickets;
		
		final int price = 75;
		final int processing_fee = 20;
		final double sales_tax = 0.07;
		
		tickets = JOptionPane.showInputDialog(null, "number of tickets?");
		
		final double tax = 75 * 0.07;
		double cost = Double.parseDouble(tickets) * price + Double.parseDouble(tickets) * processing_fee + tax;
	
		
		JOptionPane.showMessageDialog(null, "the total is " + cost);
	}

}
