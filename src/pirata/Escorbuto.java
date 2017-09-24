package pirata;

public class Escorbuto extends EstadoPirata {
	public Escorbuto() {
		super.tipo = "Escorbuto";
		super.ataque = 2;
		super.defensa = 0;
	}

	@Override
	public EstadoPirata beberGrog() {
		return this;
	}

	@Override
	public EstadoPirata beberJugo()  {
		return new Saludable();
	}
}
