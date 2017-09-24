package pirata;

import org.junit.Assert;
import org.junit.Test;

public class TestPirata {

	@Test
	
	public void probarAtaque() {
		Pirata sparrow = new Pirata();
		Pirata will = new Pirata();
		sparrow.atacarA(will);
		Assert.assertEquals(3, sparrow.getPuntos());
	}
	@Test
	
	public void tenerEscorbuto() {
		Pirata sparrow = new Pirata();
		sparrow.beberGrog();
		Assert.assertEquals("Saludable", sparrow.getEstado());
		sparrow.beberGrog();
		Assert.assertEquals("Saludable", sparrow.getEstado());
		sparrow.beberGrog();
		Assert.assertEquals("Escorbuto", sparrow.getEstado());
	}

	@Test
	
	public void serHipersaludable() {
		Pirata sparrow = new Pirata();
		sparrow.beberJugo();
		Assert.assertEquals("Hipersaludable", sparrow.getEstado());
	}

	@Test
	
	public void volverASerSaludable() {
		Pirata sparrow = new Pirata();
		sparrow.beberGrog();
		Assert.assertEquals("Saludable", sparrow.getEstado());
		sparrow.beberGrog();
		Assert.assertEquals("Saludable", sparrow.getEstado());
		sparrow.beberGrog();
		Assert.assertEquals("Escorbuto", sparrow.getEstado());
		sparrow.beberJugo();
		Assert.assertEquals("Saludable", sparrow.getEstado());
	}
}
