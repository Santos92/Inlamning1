package inlämningsupgift1;
import javax.swing.JOptionPane;
public class Hund extends Djur implements IHämtaDjur{
	private int Foder; // ett exempel på inkaspling.
                           // jag vill ha kontroll över hur denna variabel används därför tillåter jag ej andra klasser att komma åt den.
                           // Man kan använda sig utav getter och setters eller också initera variabeln i en konstruktor för att komma åt/ändra den.
	public Hund(String Namn, int Vikt) 
	{
		super(Namn, Vikt);
		Foder = super.Vikt/100;
	}
	public void Mata()// exempel på dynamisk bindning, Metoden finns med i superklassen men skrivs om här!
	{
		JOptionPane.showMessageDialog(null, "Hunden " + Namn + " ska ha " + Foder + " gram hundfoder" );
	}
	public String MataText()
	{
		return "Hunden " + Namn + " ska ha " + Foder + " gram hundfoder" ;
	}
	public String getAnimal() 
	{
		return this.getClass().getSimpleName();
	}
}
