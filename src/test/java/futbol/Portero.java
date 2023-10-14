package futbol;

public class Portero extends Futbolista implements Comparable<Futbolista> {
	public short golesRecibidos;
	public byte dorsal;
	public Portero(String nombre,int edad,String posicion,short golesRecibidos,byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos=golesRecibidos;
		this.dorsal=dorsal;
		
	}
	@Override
	public String toString() {
		return("El futbolista" + super.getNombre() + "tiene" + super.getEdad() + "y juega de" + super.getPosicion() + "con el dorsal" + this.dorsal +". Le han marcado" +this.golesRecibidos);
	}
	@Override
	public boolean jugarConLasManos(Futbolista jugador) {
		if (jugador instanceof Portero) {
			return true;
			}
			return false;
}
	//@Override
	public int compareTo (Portero otroPortero) {
		if (golesRecibidos != otroPortero.golesRecibidos) {
            return Math.abs(Integer.compare(golesRecibidos, otroPortero.golesRecibidos));
        }
		return 0;
}
	@Override
	public int compareTo(Futbolista o) {
		// TODO Auto-generated method stub
		return 0;
	}
}