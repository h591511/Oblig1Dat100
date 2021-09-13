package no.hvl.dat100.O3;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Fakultet {
 
public static void main(String[] args) {
		
		int n = Integer.parseInt(showInputDialog("Skriv inn et positivt heltall:"));
		int svar = 1;
		
		if (n > 0) {
			
			for (int i = 1; i <= n; i++) {
				svar = svar * i; 
			}
			
	
			showMessageDialog(null, svar); 
		
		}
		
		else { showMessageDialog(null, "Tallet må være større enn 0");
		
		}
	}
}
