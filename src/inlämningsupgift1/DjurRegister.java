package inlämningsupgift1;
import java.util.ArrayList;
import java.util.List;
public class DjurRegister {
	Hund Hund1 = new Hund("Sixten" , 5);
	Hund Hund2 = new Hund("Dogge" , 10);
	Katt Katt1 = new Katt("Venus" , 5);
	Katt Katt2 = new Katt("Ove" , 3);
	Orm Orm1 = new Orm("Hypno" , 1);
	Orm Orm2 = new Orm("Mangna" , 2);
	Gris Gris1 = new Gris("Babe" , 100);
	public List<Djur> getDjur()
	{
		List<Djur> djur = new ArrayList<>();
		djur.add(Hund1);
		djur.add(Hund2);
		djur.add(Katt1);
		djur.add(Katt2);
		djur.add(Orm1);
		djur.add(Orm2);
		djur.add(Gris1);
		return djur;
	}
	public List<IHämtaDjur> getDjurTyp()
	{
		List<IHämtaDjur> djur = new ArrayList<IHämtaDjur>();
		djur.add(Hund1);
		djur.add(Hund2);
		djur.add(Katt1);
		djur.add(Katt2);
		djur.add(Orm1);
		djur.add(Orm2);
		djur.add(Gris1);
		return djur;
	}
}