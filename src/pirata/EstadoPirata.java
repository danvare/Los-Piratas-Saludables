package pirata;

public abstract class EstadoPirata {
	protected String tipo;
	protected int ataque;
	protected int defensa;
	protected int contador;

	public abstract EstadoPirata beberGrog();

	public abstract EstadoPirata beberJugo();
}
