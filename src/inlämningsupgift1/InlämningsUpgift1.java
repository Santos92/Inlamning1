package inlämningsupgift1;
import java.util.*;
import javax.swing.JOptionPane;
public class InlämningsUpgift1 {
	public static boolean check(List<Djur> l, String s) 
	{
		for (Djur x : l)
			if (x.getName().equalsIgnoreCase(s))
				return true;
		return false;
	}
	// Metoden kollar att DjurTypen man angivit finns med i programmet
	// Detta gör det mycket enklare att lägga till fler Djur
	public static boolean checkDjurTyp(List<IHämtaDjur> l, String s) 
	{
		for (IHämtaDjur x : l)
			if (x.getAnimal().equalsIgnoreCase(s))
				return true;
		return false;
	}
	public static void inlämningUpgift1()
	{
            String s;
            String ListaDjur = "";
            DjurRegister DR = new DjurRegister();
            List<Djur> djur = DR.getDjur(); // Hämtar en lista på djur utifrån Superklassen "Djur"
            List<IHämtaDjur> djurTyp = DR.getDjurTyp();// Hämtar en lista på djur utifrån Interfacet "IHämtaDjur"
            do
            {
                ListaDjur = ""; // ser till att strängen som innehåller alla djur och deras foder nollställs
                s = JOptionPane.showInputDialog("Djursjukhuset har totalt " + DR.getAntalDjur() + " antal djur\n"
                                                + "Vilket djur ska få mat?\n"
                                                + "Skriv Namnet på djur typen för att visa alla av den typen.\n"
                                                + "Skriv \"alla\" för att visa alla djur");
                if (checkDjurTyp(djurTyp, s)  || "alla".equalsIgnoreCase(s))// kollar om man skrivit en djur typ eller "alla"
                {
                    for (IHämtaDjur i : djurTyp)
                        if (i.getAnimal().equalsIgnoreCase(s) || "alla".equalsIgnoreCase(s))
                                ListaDjur+=i.MataText()+"\n";
                    JOptionPane.showMessageDialog(null, ListaDjur);
                }
                else if ("".equals(s) || !check(djur, s) && s != null) // Om varken djurtypen eller djur med namnet man skrivit in finns
                    JOptionPane.showMessageDialog(null, "Djuret finns ej med i registret!");
                else
                    for (Djur x : djur)
                        if (x.getName().equalsIgnoreCase(s)) // hämtar metoden Mata från djuret med namnet man skrivit in
                            x.Mata();
        } while(s != null);// loopar tills man clickar avbryt eller X
    }
}
