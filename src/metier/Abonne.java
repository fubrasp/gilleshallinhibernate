package metier;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Abonne implements Serializable {
        @Id
        private String ID;
	private String nom;
	private String prenom;
        private String email;
        private String adresse;

        public Abonne(){
            
        }

    public Abonne(String dupont, String jean, String jeanDupontjifr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

    public String getId() {
        return ID;
    }

    public void setId(String Id) {
        this.ID = Id;
    }

    public void setId(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}