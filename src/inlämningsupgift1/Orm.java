package inlämningsupgift1;
import javax.swing.JOptionPane;
public class Orm extends Djur implements IHämtaDjur{
	private int Foder;
	public Orm(String Namn, int Vikt) 
	{
		super(Namn, Vikt);
		Foder = 20;
	}
	public void Mata() 
	{
		JOptionPane.showMessageDialog(null, "Ormen " + Namn + " ska ha " + Foder + " gram ormpellets" );
	}
	public String MataText() 
	{
		return "Ormen " + Namn + " ska ha " + Foder + " gram ormpellets" ;
	}
	public String getAnimal() 
	{
		return this.getClass().getSimpleName();
	}
}
