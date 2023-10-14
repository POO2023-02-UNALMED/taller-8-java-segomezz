package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	public Portero(String nombre,int edad,short golesRecibidos,byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos=golesRecibidos;
		this.dorsal=dorsal;
		
	}
	@Override
	public String toString() {
		return("El futbolista" + super.getNombre() + "tiene" + super.getEdad() + "y juega de" + super.getPosicion() + "con el dorsal" + this.dorsal +". Le han marcado" +this.golesRecibidos);
	}
	@Override
	public boolean jugarConLasManos() {
			return true;
}
	@Override
    public int compareTo (Object other) {
        var otroPortero = (Portero) other;
        return otroPortero.golesRecibidos - golesRecibidos;
    }

}