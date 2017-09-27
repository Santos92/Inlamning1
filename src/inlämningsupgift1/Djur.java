package inlämningsupgift1;

public abstract class Djur {
	protected String Namn;
	protected int Vikt;
	abstract void Mata();
	public Djur(String Namn, int Vikt)
	{
		this.Namn = Namn;
		this.Vikt = Vikt*1000; // kg -> Gram
	}
	public String getName()
	{
		return Namn;
	}
	public int getVikt()
	{
		return Vikt;
	}
}
