package fr.binazon.projetCompositionFacile;


public interface InterfaceFront {
	public int nombreCarre();
	public int nombreCercle();
	public int nombreTriangle();
	public boolean testPresenceCarre(Carre carre);
	public boolean testPresenceCercle(Cercle cercle);
	public boolean testPresenceTriangle(Triangle triangle);
}
