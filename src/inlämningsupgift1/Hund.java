package inlämningsupgift1;
import javax.swing.JOptionPane;
public class Hund extends Djur implements IHämtaDjur{
	private int Foder;
	public Hund(String Namn, int Vikt) 
	{
		super(Namn, Vikt);
		Foder = super.Vikt/100;
	}
	public void Mata() 
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
