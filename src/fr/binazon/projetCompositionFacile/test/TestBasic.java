package fr.binazon.projetCompositionFacile.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import fr.binazon.projetCompositionFacile.Carre;
import fr.binazon.projetCompositionFacile.Cercle;
import fr.binazon.projetCompositionFacile.Triangle;

class TestBasic {
	private Carre c1, carre;
	private Cercle r1, r2, rMagic;
	private Triangle t1;
	@BeforeEach
	void setUp() throws Exception {
		c1 = new Carre(false);
		carre = new Carre();
		carre.setPleine(true);
		r1 = new Cercle(false);
		r2 = new Cercle(false);
		rMagic = new Cercle(true);
		t1 = new Triangle(true);
		c1.addCarre(carre);
		c1.addCercle(r2);
		c1.addCercle(rMagic);
		c1.addTriangle(t1);
		carre.addCercle(r1);
		//c1.removeCarre(carre);
	}

	@org.junit.jupiter.api.Test
	void TestBasicApplication() {
		//fail("Not yet implemented");
		assertTrue(c1.getCarres().get(0).getCercles().get(0)==r1);
		assertTrue(c1.getCarres().get(0).getCercles().get(0).isPleine()==false);
		assertTrue(c1.nombreCercle()==2);
		assertTrue(c1.testPresenceCarre(carre));
		assertTrue(carre.testPresenceCercle(r1));
		assertTrue(c1.testPresenceCercle(rMagic));
	}
}
