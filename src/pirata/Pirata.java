package pirata;

public class Pirata {
	
	private EstadoPirata estado;
	private int puntos;
	
	public Pirata() {
		this.estado = new Saludable();
		this.puntos = 0;
	}
//Original
/*	
	public void atacarA(Pirata enemigo) {
		this.puntos = this.ataque - enemigo.defensa;
	}
	
	public void beber(String bebida){
		if(this.estado == "Saludable" && bebida == "Jugo") {
			this.estado = "HiperSaludable";
			this.dieta = 0;
			this.ataque = 10;
			this.defensa = -2;
			return;
		}
		if(this.estado == "Saludable" && bebida == "Grog") {
			this.dieta+=1;
			if(this.dieta==3) {
				this.estado = "Escorbuto";
				this.ataque = 2;
				this.defensa = 0;
				this.dieta = 0;
				return;
			}
		}
		if(this.estado == "Escorbuto" && bebida == "Jugo") {
			this.dieta = 0;
			this.estado = "Saludable";
			this.ataque = 5;
			this.defensa = 2;
			return;
		
		}
		
		
	}


*/
	public void atacarA(Pirata enemigo) {
		this.puntos = this.estado.ataque - enemigo.estado.defensa;
	}
	
	public void beberGrog(){
		this.estado = estado.beberGrog();
	}
	
	public void beberJugo(){
		this.estado = estado.beberJugo();
	}
	
	public int getPuntos() {
		return this.puntos;
	}

	public String getEstado() {
		return this.estado.tipo;
	}
}
