package servlet;

import java.util.ArrayList;
import java.util.List;


	public class etud {
		private static List<etud> etudinat;
		public etud() {
			etudinat=new ArrayList<>();
		}
    private int id;
    private String nom;
    private String prenom;
    private int age;
    public etud(int id, String nom, String prenom, int age) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    public static void ajouterPersonne(etud personne) {
    	etudinat.add(personne);
    }

    public static void modifierPersonne(int id, etud personneModifiee) {
        for (etud p : etudinat) {
            if (p.getId() == id) {
                p.setNom(personneModifiee.getNom());
                p.setPrenom(personneModifiee.getPrenom());
                p.setAge(personneModifiee.getAge());
                break;
            }
        }
    }

    public static void supprimerPersonne(int id) {
    	etudinat.removeIf(p -> p.getId() == id);
    }

    public List<etud> getPersonnes() {
        return etudinat;
    }
   
  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

   
}

