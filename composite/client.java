package composite;

public class Client {

	public static void main(String[] args) {
	
		Component fichier1 = new Fichier(400,"rapportSingleton");
		Component fichier2 = new Fichier(100,"rapportComposite");
		Component rep = new Repertoire("TP Design pattern");

		Component repINE2 = new Repertoire("INE2");
		Component rep2 = new Repertoire("INE2 S1");
		Component rep22 = new Repertoire("INE2 S2");

		Component repINE1 = new Repertoire("INE1");
		Component rep1 = new Repertoire("INE1 S1");
		Component rep11 = new Repertoire("INE1 S2");

		Component inpt = new Repertoire("INPT");

		rep.ajouterComposant(fichier1);
		rep.ajouterComposant(fichier2);

		repINE2.ajouterComposant(rep2);
		repINE2.ajouterComposant(rep22);

		repINE1.ajouterComposant(rep1);
		repINE1.ajouterComposant(rep11);

		inpt.ajouterComposant(repINE1);
		inpt.ajouterComposant(repINE2);


		System.out.println(inpt.afficherInfo());
	}

}