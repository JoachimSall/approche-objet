package interfaces;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjetGeometrique[] tab = new ObjetGeometrique[2];
		Cercle cercle = new Cercle(3);
		Rectangle rectangle = new Rectangle(2, 5);
		//ObjetGeometrique[] tab = {cercle, rectangle};
		tab[0] = cercle;
		tab[1] = rectangle;
		for(int i = 0; i < tab.length; i++) {
			System.out.println("Le périmètre de l'objet géomètrique stocké à l'index " + i + " est de " + tab[i].perimetre());
			System.out.println("La surface de l'objet géomètrique stocké à l'index " + i + " est de " + tab[i].surface());
		}
	}

}
