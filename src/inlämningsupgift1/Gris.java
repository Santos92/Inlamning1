package inlämningsupgift1;
import javax.swing.JOptionPane;
public class Gris extends Djur implements IHämtaDjur{
	private int Foder;
	public Gris(String Namn, int Vikt) 
	{
		super(Namn, Vikt);
		Foder = super.Vikt/70;
	}
	public void Mata() 
	{
		JOptionPane.showMessageDialog(null, "Grisen " + Namn + " ska ha " + Foder + " gram grisfoder" );
	}
	public String MataText() 
	{
		return "Grisen " + Namn + " ska ha " + Foder + " gram grisfoder" ;
	}
	public String getAnimal() 
	{
		return this.getClass().getSimpleName();
	}
}
