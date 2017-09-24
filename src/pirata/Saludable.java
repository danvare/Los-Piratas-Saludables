package pirata;

public class Saludable extends EstadoPirata {
	
	public Saludable () {
		super.tipo = "Saludable";
		super.ataque = 5;
		super.defensa = 2;
		super.contador = 0;
	}

	@Override
	public EstadoPirata beberGrog() {
		if(++this.contador == 3)
			return new Escorbuto();
		return this;
	}

	@Override
	public EstadoPirata beberJugo() {
		return new Hipersaludable();
	}
}
