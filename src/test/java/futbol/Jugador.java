package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	public Jugador() {
		super();
		golesMarcados=289;
		dorsal=7;
	}
	public Jugador(String nombre,int edad,String posicion,short golesMarcados,byte dorsal) {
		super(nombre,edad,posicion);
		this.golesMarcados=golesMarcados;
		this.dorsal=dorsal;
	}
	   @Override
	    public int compareTo(Object o) {
	        var otroJugador = (Jugador) o;
	        return super.getEdad() - otroJugador.getEdad() ;
	    }
	
	@Override
	public String toString() {
		return("El futbolista " + super.getNombre() + " tiene " + super.getEdad() + ", y juega de " + super.getPosicion() + " con el dorsal " + this.dorsal +". Ha marcado " +this.golesMarcados);
	}
	@Override
	public boolean jugarConLasManos() {
			return false;
			

}
}
