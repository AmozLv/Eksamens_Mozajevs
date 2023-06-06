import java.util.ArrayList;

import javax.swing.JOptionPane;

public class tests {

	public static void main(String[] args) {
	int nepareizasAtbildes=0;	
	String[] jautajumi = {"","","","","","","","","",""};
	ArrayList<Integer> nepareiziJautajumi = new ArrayList<Integer>();
	String atbilde;
	
	String[] jautajuma1Atbildes = {"a","b","c","d"};
	atbilde =(String) JOptionPane.showInputDialog(null, jautajumi[0], "izvele",JOptionPane.PLAIN_MESSAGE, null, jautajuma1Atbildes, jautajuma1Atbildes[0]	);
	if(atbilde.equalsIgnoreCase("a")) {
		nepareizasAtbildes++;
		nepareiziJautajumi.add(0);
	}
	
		String[] jautajuma2Atbildes = {"","","",""};
		atbilde =(String) JOptionPane.showInputDialog(null, jautajumi[1], "izvele",JOptionPane.PLAIN_MESSAGE, null, jautajuma1Atbildes, jautajuma1Atbildes[0]	);
		if(atbilde.equalsIgnoreCase("a")) {
			nepareizasAtbildes++;
			nepareiziJautajumi.add(1);
		}		
		String[] jautajuma3Atbildes = {"","","",""};
		atbilde =(String) JOptionPane.showInputDialog(null, jautajumi[1], "izvele",JOptionPane.PLAIN_MESSAGE, null, jautajuma1Atbildes, jautajuma1Atbildes[0]	);
		if(atbilde.equalsIgnoreCase("a")) {
			nepareizasAtbildes++;
			nepareiziJautajumi.add(2);
		}		
		String[] jautajuma4Atbildes = {"","","",""};
		atbilde =(String) JOptionPane.showInputDialog(null, jautajumi[1], "izvele",JOptionPane.PLAIN_MESSAGE, null, jautajuma1Atbildes, jautajuma1Atbildes[0]	);
		if(atbilde.equalsIgnoreCase("a")) {
			nepareizasAtbildes++;
			nepareiziJautajumi.add(3);
		}		
		System.out.println(nepareiziJautajumi);
		String[] jautajuma5Atbildes = {"","","",""};
		atbilde =(String) JOptionPane.showInputDialog(null, jautajumi[1], "izvele",JOptionPane.PLAIN_MESSAGE, null, jautajuma1Atbildes, jautajuma1Atbildes[0]	);
		if(atbilde.equalsIgnoreCase("a")) {
			nepareizasAtbildes++;
			nepareiziJautajumi.add(3);
		}				
		String[] jautajuma6Atbildes = {"","","",""};
		atbilde =(String) JOptionPane.showInputDialog(null, jautajumi[1], "izvele",JOptionPane.PLAIN_MESSAGE, null, jautajuma1Atbildes, jautajuma1Atbildes[0]	);
		if(atbilde.equalsIgnoreCase("a")) {
			nepareizasAtbildes++;
			nepareiziJautajumi.add(3);
		}				
		String[] jautajuma7Atbildes = {"","","",""};
		atbilde =(String) JOptionPane.showInputDialog(null, jautajumi[1], "izvele",JOptionPane.PLAIN_MESSAGE, null, jautajuma1Atbildes, jautajuma1Atbildes[0]	);
		if(atbilde.equalsIgnoreCase("a")) {
			nepareizasAtbildes++;
			nepareiziJautajumi.add(3);
		}				
		String[] jautajuma8Atbildes = {"","","",""};
		atbilde =(String) JOptionPane.showInputDialog(null, jautajumi[1], "izvele",JOptionPane.PLAIN_MESSAGE, null, jautajuma1Atbildes, jautajuma1Atbildes[0]	);
		if(atbilde.equalsIgnoreCase("a")) {
			nepareizasAtbildes++;
			nepareiziJautajumi.add(3);
		}				
		String[] jautajuma9Atbildes = {"","","",""};
		atbilde =(String) JOptionPane.showInputDialog(null, jautajumi[1], "izvele",JOptionPane.PLAIN_MESSAGE, null, jautajuma1Atbildes, jautajuma1Atbildes[0]	);
		if(atbilde.equalsIgnoreCase("a")) {
			nepareizasAtbildes++;
			nepareiziJautajumi.add(3);
		}				
		String[] jautajuma10Atbildes = {"","","",""};
		atbilde =(String) JOptionPane.showInputDialog(null, jautajumi[1], "izvele",JOptionPane.PLAIN_MESSAGE, null, jautajuma1Atbildes, jautajuma1Atbildes[0]	);
		if(atbilde.equalsIgnoreCase("a")) {
			nepareizasAtbildes++;
			nepareiziJautajumi.add(3);
		}				
		
		


	}

}
