
public class Membre {

	private int Id_Membre;
	private String NomMembre;
	
	
	public Membre() {
		
	}

		public Membre(int Id_Membre, String NomMembre) {
			this.Id_Membre = Id_Membre;
			this.NomMembre = NomMembre;
	}

		public int getId_Membre() {
			return Id_Membre;
	}

		public void setId_Membre(int Id_Membre) {
			this.Id_Membre = Id_Membre;
	}

		public String getNomMembre() {
			return NomMembre;
	}

		public void setNomMembre(String NomMembre) {
			this.NomMembre = NomMembre;
	}

	@Override
		public String toString() {
			return "Membre [Id_Membre=" + Id_Membre + ", NomMembre=" + NomMembre + "]";
	}
	
	
}