package pirata;

public class Hipersaludable extends EstadoPirata {

	public Hipersaludable() {
		super.tipo = "Hipersaludable";
		super.ataque = 10;
		super.defensa = -2;
	}

	@Override
	public EstadoPirata beberGrog() {
		return new Saludable();
	}

	@Override
	public EstadoPirata beberJugo() {
		return this;
	}
}
