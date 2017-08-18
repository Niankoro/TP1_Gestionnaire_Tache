
public class Assigne {

	private int ID_Assigne;
	private Membre membre;
	private Tache tache;
	
	public Assigne(int iD_Assigne, Membre membre, Tache tache) {
		super();
		ID_Assigne = iD_Assigne;
		this.membre = membre;
		this.tache = tache;
	}

	public Assigne() {
		super();
	}

	public int getID_Assigne() {
		return ID_Assigne;
	}

	public void setID_Assigne(int iD_Assigne) {
		ID_Assigne = iD_Assigne;
	}

	public Membre getMembre() {
		return membre;
	}

	public void setMembre(Membre membre) {
		this.membre = membre;
	}

	public Tache getTache() {
		return tache;
	}

	public void setTache(Tache tache) {
		this.tache = tache;
	}
	
	public String show(){
		return  "ID Assigne: " + ID_Assigne  + "\n" +
				"Membre: " + membre.toString() + "\n" +
				"Tache: " + tache.toString() + "\n";
		
	}
}