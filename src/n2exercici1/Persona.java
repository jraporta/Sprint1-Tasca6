package n2exercici1;

public class Persona {

	private String nom;
	private String cognom;
	private int edat;
	
	
	public Persona(String nom, String cognom, int edat) {
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
	}


	@Override
	public String toString() {
		return String.format("%s %s: %d anys", nom, cognom, edat);
	}
	
	
	
}
