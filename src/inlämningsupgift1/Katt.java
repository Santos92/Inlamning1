package inlämningsupgift1;
import javax.swing.JOptionPane;
public class Katt extends Djur implements IHämtaDjur{
	private int Foder;
	public Katt(String Namn, int Vikt) 
	{
		super(Namn, Vikt);
		Foder = super.Vikt/150;
	}
	public void Mata() 
	{
		JOptionPane.showMessageDialog(null, "Katten " + Namn + " ska ha " + Foder + " gram kattfoder" );
	}
	public String MataText() 
	{
		return "Katten " + Namn + " ska ha " + Foder + " gram kattfoder" ;
	}
	public String getAnimal()
	{
		return this.getClass().getSimpleName();
	}
}
