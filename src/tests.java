import javax.swing.JOptionPane;
import java.util.ArrayList;

public class tests {
	 static ArrayList<String> Tests(String[] jautajumi, ArrayList<String[]> jautAtb, String atbilde, int jautNr, char[] pareizsVariants) {
		//Nepareizi atbildēto jautājumu masīva definēšana, lai uzglabātu nepareizos jautājumus
		 ArrayList<String> nepareiziJautajumi = new ArrayList<>();
	     //Masīvs, kas no jautājumu atbilžu masīva paņem atbilstoši jautājumam atbilžu variantam masīvu    
		 String[] atbVar = jautAtb.get(jautNr);
		 //Izvada jautājumu un dod iespēju atbildētu uz to
	        atbilde = (String) JOptionPane.showInputDialog(null, jautajumi[jautNr], "izvele", JOptionPane.PLAIN_MESSAGE, null, atbVar, atbVar[0]);
	       
	        //Ja atbilde nav pareiza, pievieno jauājumu nepareizo atbilžu masīvam
	        if (atbilde.charAt(0) != pareizsVariants[jautNr]) nepareiziJautajumi.add(jautajumi[jautNr]+"\n");
	        //atgriež neparizo jautājumu masīvu
	        return nepareiziJautajumi;
	    }


    public static void main(String[] args) {
      //Pareizo atbilžu skaita un jautājumu nummura mainīgā definēšana
    	int pareizasAtbildes = 0,  jautNr = 0; 
    	//Atbildes un izvēles mainīgais
    	String atbilde = "", izvele;
    	//Nepareizi atbildēto jautājumu masīva definēšana, lai nodotu parametrus
        ArrayList<String> nepareiziJautajumi = new ArrayList<String>();
    	//Masīvs, kas uzglabā izvēli sākt vai apturēt programmu
        String[] darbibas = {"Sākt testu", "Apturēt"};
        //Dod izvēli sākt testu vai aizvērt programmu
        izvele = (String) JOptionPane.showInputDialog(null, "Sveiki elektroniskajā testā!\nIzvēlies darbību", "izvele", JOptionPane.PLAIN_MESSAGE, null, darbibas, darbibas[0]);
        //Ja izvēlēta darbība apturēt, tad programmu aptur
        if(izvele.equals(darbibas[1])) System.exit(0);;
        //Masīvs, kas uzglabā jautājumus
        String[] jautajumi = {"1. Kura Java valodas funkcija tiek izmantota, lai iegūtu simbolu virknes garumu?",
                "2. Kura Java funkcija tiek izmantota, lai apvienotu divas simbolu virknes?",
                "3. Kura funkcija tiek izmantota, lai iegūtu konkrēta simbola pozīciju simbolu virknē?",
                "4. Kāda metode tiek izmantota, lai konvertētu simbolu virkni uz lielajiem burtiem Java programmēšanas valodā?",
                "5. Kura metode tiek izmantota, lai salīdzinātu divas simbolu virknes, ignorējot lieluma atšķirības?",
                "6. Kura funkcija tiek izmantota, lai iegūtu apgrieztu simbolu virkni Java programmēšanas valodā?",
                "7. Kura metode tiek izmantota, lai pārbaudītu, vai simbolu virkne sākas ar konkrētu prefiksu?",
                "8. Kura metode tiek izmantota, lai pārbaudītu, vai simbolu virkne satur konkrētu sufiksu?",
                "9. Kura funkcija tiek izmantota, lai sadalītu simbolu virkni atbilstoši norādītam atdalītājam?",
                "10. Kura funkcija tiek izmantota, lai iegūtu simbolu virknes apakšvirkni?"};
       
        //Jautājumu atbilžu masīvi
        String[] jautajuma1Atbildes = {"a) length()", "b) size()", "c) count()", "d) sizeOf()"};
        String[] jautajuma2Atbildes = {"a) merge()", "b) concat()","c) append()", "d) combine()"};
        String[] jautajuma3Atbildes = {"a) getPosition()", "b) find()","c) indexOf()", "d) search()"};
        String[] jautajuma4Atbildes = {"a) convertToLowerCase()","b) toLowerCase()", "c) convertToUpper()","d) toUpperCase()"};
        String[] jautajuma5Atbildes = {"a) equals()", "b) equalsIgnoreCase()", "c) compare()", "d) compareIgnoreCase()"};
        String[] jautajuma6Atbildes = {"a) reverse()", "b) invert()", "c) flip()", "d) backward()"};
        String[] jautajuma7Atbildes = {"a) checkPrefix()", "b) beginsWith()", "c) startsWith()", "d) hasPrefix()"};
        String[] jautajuma8Atbildes = {"a) hasSuffix()", "b) containsSuffix()", "c) checkSuffix()", "d) endsWith()",};
        String[] jautajuma9Atbildes = {"a) break()", "b) divide()","c) split()", "d) separate()"};
        String[] jautajuma10Atbildes = { "a) subsequence()","b) substring()", "c) subset()", "d) extract()"};
        
        //Masīvs, kas uzglabā pareizo atbildi katram jautājumam
        char[] pareizsVariants = {'a', 'c', 'b', 'd', 'b', 'a', 'c', 'd', 'c', 'b'};
        
        //Jautājumu atbildes masīva dafinēšana, uzglabā katra jautājuma atbildes masīvu
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

        
        //cikls, kas nodod katra jautājuma parametrus testa pildīšanas metodei
        for (int i = 0; i < jautajumi.length; i++) {
            nepareiziJautajumi.addAll(Tests(jautajumi, jautAtb, atbilde, jautNr, pareizsVariants));
            jautNr++;
        }
        //Pareizo atbilžu skaita aprēķināšana
        pareizasAtbildes = jautajumi.length - nepareiziJautajumi.size();
        //Testa rezultāta izvade
        JOptionPane.showMessageDialog(null, "Pareizi atbildētie jautājumi: " + pareizasAtbildes + "\nNepareizi atbildēto jautājumu saraksts:\n " + nepareiziJautajumi+"\n");
        System.exit(0);
    }
}
