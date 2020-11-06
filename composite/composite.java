package composite;

import java.util.ArrayList;
import java.util.List;


interface Component{
	
	void afficherInfo();
	void calculerSize();
}


class Fichier implements Component{

	long size;
	String name;

	public Fichier(int size, String name) {

		super();
		this.size = size;
		this.name = name;

	}

	public void afficherInfo() {

		System.out.println(“Name:”+name+” Size: ”+size);

	}

	public long calculerSize() {

		return this.size;

	}

}


class Repertoire implements Component{	

	String name;
	List<Component> list=new ArrayList<>();

	public Repertoire(String name) {

		super();
		this.name = name;
	}

	public void ajouterComposant(Component composant) {

		list.add(composant);

	}

	public void afficherInfo() {

		System.out.println(“Name :”+name);

		for(Component x : list) {

			x.afficherInfo();
 			x.calculerSize();

			}

	}

	public long calculerSize() {

		long s=0;

		for(Component com : list){
			s=s+calculerSize();
		}
		return s;

	}
}
