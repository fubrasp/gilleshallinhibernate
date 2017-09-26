package metier;

import java.io.Serializable;
import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.AUTO;
import javax.persistence.Id;

@Entity
public class Abonne implements Serializable {
        @Id
        @GeneratedValue(strategy = AUTO)
        private int ID;
	private String nom;
	private String prenom;
        private String email;
        private String adresse;
        private Date dateNaissance;
        @Enumerated(EnumType.STRING)
        private EnumGenre sexe;

        public Abonne(){
            
        }

    public Abonne(String nom, String prenom, String email, String adresse, Date dateNaissance, EnumGenre sexe ) {
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.adresse=adresse;
        this.dateNaissance=dateNaissance;
        this.sexe=sexe;
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

    /*public String getId() {
        return ID;
    }

    public void setId(String Id) {
        this.ID = Id;
    }*/

    public void setId(int i) {
        this.ID=i;
    }
    
    public int getId() {
        return this.ID;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public EnumGenre getSexe() {
        return sexe;
    }

    public void setSexe(EnumGenre sexe) {
        this.sexe = sexe;
    }
}