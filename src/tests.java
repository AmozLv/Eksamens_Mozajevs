import java.util.ArrayList;

import javax.swing.JOptionPane;

public class tests {
	static ArrayList<String>Tests(String[] jautajumi, ArrayList Jautatbildes,String atbilde, int pareizasAtbildes, int indekss, int jautNr){
		ArrayList<String> nepareiziJautajumi = new ArrayList<String>();
		String[] atbVar={""};
		atbilde =(String) JOptionPane.showInputDialog(null, jautajumi[jautNr], "izvele",JOptionPane.PLAIN_MESSAGE, null, atbVar, atbVar[jautNr]	);
		if(atbilde.equalsIgnoreCase("a")) 
			pareizasAtbildes++;
		else {
			nepareiziJautajumi.add(jautajumi[indekss]);
			indekss++;
		}
		return nepareiziJautajumi;
		
		
	}
	

	public static void main(String[] args) {
	int pareizasAtbildes=0, indekss=0, jautNr=0;;	
	String[] jautajumi = {"1.","2.","3.","4.","5.","6.","7.","8.","9.","10."};
	ArrayList<String> nepareiziJautajumi = new ArrayList<String>();
	String atbilde="";
	String[] jautajuma1Atbildes = {"a","b","c","d"};
	String[] jautajuma2Atbildes = {"a","","",""};
	String[] jautajuma3Atbildes = {"a","","",""};
	String[] jautajuma4Atbildes = {"a","","",""};
	String[] jautajuma5Atbildes = {"a","","",""};
	String[] jautajuma6Atbildes = {"a","","",""};
	String[] jautajuma7Atbildes = {"a","","",""};
	String[] jautajuma8Atbildes = {"a","","",""};
	String[] jautajuma9Atbildes = {"a","","",""};
	String[] jautajuma10Atbildes = {"a","","",""};
	ArrayList<String[]> jautAtb = new ArrayList<String[]>();
	
	jautAtb.add(jautajuma1Atbildes);
	jautAtb.add(jautajuma2Atbildes);
	jautAtb.add(jautajuma3Atbildes);
	jautAtb.add(jautajuma4Atbildes);
	jautAtb.add(jautajuma5Atbildes);
	jautAtb.add(jautajuma6Atbildes);
	jautAtb.add(jautajuma7Atbildes);
	jautAtb.add(jautajuma8Atbildes);
	jautAtb.add(jautajuma9Atbildes);
	jautAtb.add(jautajuma10Atbildes);
	
	
	
	for (int i = 0; i < jautajumi.length; i++) {
	tests.Tests(jautajumi, jautAtb,atbilde,pareizasAtbildes, indekss, jautNr);
	jautNr++;
	
	}
	/*
						
		
		
						
		String[] jautajuma10Atbildes = {"a","","",""};
		atbilde =(String) JOptionPane.showInputDialog(null, jautajumi[9], "izvele",JOptionPane.PLAIN_MESSAGE, null, jautajuma10Atbildes, jautajuma10Atbildes[0]	);
		if(atbilde.equalsIgnoreCase("a")) 
			pareizasAtbildes++;
		else
			nepareiziJautajumi.add(jautajumi[9]);
						
		JOptionPane.showMessageDialog(null, "Nepareizi atbildētie jautājumi: "+nepareiziJautajumi);*/
		


	}
	

}
