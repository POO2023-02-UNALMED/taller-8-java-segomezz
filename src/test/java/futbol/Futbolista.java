package futbol;

public abstract class Futbolista implements Comparable<Futbolista> {
	private String nombre;
	private int edad;
	private String posicion;
	public Futbolista(){
		nombre="Maradona";
		edad= 30;
		posicion="delantero";
		
	}
	public Futbolista(String nombre,int edad,String posicion) {
		this.nombre=nombre;
		this.edad=edad;
		this.posicion=posicion;
	}
	public String getNombre() {
		return nombre;

	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion=posicion;
	}
	@Override
	public String toString() {
		return ("El futbolista"+ getNombre() + "tiene" + getEdad() + ", y juega de " + getPosicion());
	}
public abstract boolean jugarConLasManos(Portero portero) {
	if portero instanceof Portero;
	return True;
}
public boolean equals (Futbolista f) {
	if (this==f) {
		return true;
	}
	return false;
}


}
