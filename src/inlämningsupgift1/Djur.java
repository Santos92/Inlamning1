package inlämningsupgift1;

public abstract class Djur {
	protected String Namn;
	protected int Vikt;
        public static int Antal;
	public void Mata()
        {
            System.out.println("Djur behöver mat!");
        }
	public Djur(String Namn, int Vikt)
	{
		this.Namn = Namn;
		this.Vikt = Vikt*1000; // kg -> Gram
                this.Antal++;
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
