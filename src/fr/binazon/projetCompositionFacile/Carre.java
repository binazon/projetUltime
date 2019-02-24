package fr.binazon.projetCompositionFacile;

import java.util.ArrayList;
import java.util.List;

public class Carre implements InterfaceFront{
	private boolean pleine = false;
	private List<Carre> carres;
	private List<Cercle> cercles;
	private List<Triangle> triangles;
	private List<Segment> segments;
	
	public Carre() {
		// TODO Auto-generated constructor stub
		carres = new ArrayList<>();
		cercles = new ArrayList<>();
		triangles = new ArrayList<>();
		segments = new ArrayList<>();
	}
	public Carre(boolean pleine) {
		super();
		this.pleine = pleine;
		carres = new ArrayList<>();
		cercles = new ArrayList<>();
		triangles = new ArrayList<>();
		segments = new ArrayList<>();
	}
	public boolean isPleine() {
		return pleine;
	}
	public void setPleine(boolean pleine) {
		this.pleine = pleine;
	}
	
	public List<Carre> getCarres() {
		return carres;
	}
	public void setCarres(List<Carre> carres) {
		this.carres = carres;
	}
	public void addCarre(Carre carre) {
		carres.add(carre);
	}
	public void removeCarre(Carre carre) {
		carres.remove(carre);
	}
	public List<Cercle> getCercles() {
		return cercles;
	}
	public void setCercles(List<Cercle> cercles) {
		this.cercles = cercles;
	}
	public void addCercle(Cercle cercle) {
		cercles.add(cercle);
	}
	public void removeCercle(Cercle cercle) {
		cercles.remove(cercle);
	}
	public List<Triangle> getTriangles() {
		return triangles;
	}
	public void setTriangles(List<Triangle> triangles) {
		this.triangles = triangles;
	}
	public void addTriangle(Triangle triangle) {
		triangles.add(triangle);
	}
	public void removeTriangle(Triangle triangle) {
		triangles.remove(triangle);
	}
	public List<Segment> getSegments() {
		return segments;
	}
	public void setSegments(List<Segment> segments) {
		this.segments = segments;
	}
	public int nombreCarre() {
		return carres.size();
	}
	public int nombreCercle() {
		return cercles.size();
	}
	public int nombreTriangle() {
		return triangles.size();
	}
	
	public boolean testPresenceCarre(Carre carre) {
		return carres.contains(carre);
	}
	public boolean testPresenceCercle(Cercle cercle) {
		return cercles.contains(cercle);
	}
	public boolean testPresenceTriangle(Triangle triangle) {
		return triangles.contains(triangle);
	}
}