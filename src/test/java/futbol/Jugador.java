package futbol;

public class Jugador extends Futbolista implements Comparable<Futbolista>{
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
	public int compareTo(Futbolista otroFutbolista) {
		if (getEdad() != otroFutbolista.getEdad()) {
            return Math.abs(Integer.compare(getEdad(), otroFutbolista.getEdad()));
        }
		return 0;
	}
	@Override
	public String toString() {
		return("El futbolista" + super.getNombre() + "tiene" + super.getEdad() + "y juega de" + super.getPosicion() + "con el dorsal" + this.dorsal +". Ha marcado" +this.golesMarcados);
	}
	@Override
	public boolean jugarConLasManos() {
			return false;
			

}
}
