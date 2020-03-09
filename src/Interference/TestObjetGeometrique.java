package Interference;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		ObjetGeometrique [] tab = new ObjetGeometrique[2]; // un tableau de longueur 2
		
		
		tab[0]= new Cercle (3.0);
		tab [1] = new Rectangle (3.2, 5.0);
		
		for (int i = 0;i<tab.length; i ++) {
			System.out.println("Le périmètre du Cercle est : " + tab[0].perimetre());
			System.out.println("La surface du Cercle est : "+ tab[0].surface());
			System.out.println("Le périmètre du Rectangle est : "+ tab[0].perimetre());
			System.out.println("La surface du Rectangle est : "+tab[0]. surface());
			
		}
		

	}

}
