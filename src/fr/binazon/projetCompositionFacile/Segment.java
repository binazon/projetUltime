package fr.binazon.projetCompositionFacile;

public class Segment {
	private int cote;
	public Segment() {
		// TODO Auto-generated constructor stub
	}
	public Segment(int cote) {
		super();
		this.cote = cote;
	}
	public int getCote() {
		return cote;
	}
	public void setCote(int cote) {
		this.cote = cote;
	}

	public double surface() {
		return cote*cote;
	}
	public double perimetre() {
		return 4*cote;
	}

}
