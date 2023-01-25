package fixacao12;

import java.util.ArrayList;
import java.util.List;

public class AppBandas {
  public static void main(String[] args) {
		
	List<Bandas> listas = new ArrayList<>();
	
	listas.add(new Bandas("U2"));
	listas.add(new Bandas("Pearl_Jam"));
	listas.add(new Bandas("Coldplay"));
	listas.add(new Bandas("Bon_Jovi"));
	listas.add(new Bandas("Nickelback"));
	
	for(Bandas banda: listas) {
		System.out.println(banda);
	}
}
}
