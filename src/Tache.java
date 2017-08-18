
public class Tache {

	private int Id_tache;
	private String Nom;
	private String Description;
	private String Status;
	
	// constructeurs
	public Tache() {
		
	}

	public Tache(int Id_tache, String Nom, String Description, String Status) {
		this.Id_tache = Id_tache;
		this.Nom = Nom;
		this.Description = Description;
		this.Status = Status;
	}

	public int getId_tache() {
		return Id_tache;
	}

	public void setId_tache(int Id_tache) {
		this.Id_tache = Id_tache;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String Nom) {
		this.Nom = Nom;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}
	

	public String getStatus() {
		return Status;
	}

	public void setStatus(String Status) {
		this.Status = Status;
	}
	
	@Override
	public String toString() {
		return "Tache [Id_tache=" + Id_tache + ", Nom=" + Nom + " , Description=" + Description + " , Status=" + Status + "]";
	}
	
	
}