package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
 private String Nombre;
 private String Codigo;
 private double Precio;
 private int descuento;
 
public Producto() {
	
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getCodigo() {
	return Codigo;
}
public void setCodigo(String codigo) {
	Codigo = codigo;
}
public double getPrecio() {
	return Precio;
}
public void setPrecio(double precio) {
	Precio = precio;
}
public int getDescuento() {
	return descuento;
}
public void setDescuento(int descuento) {
	this.descuento = descuento;
}
public double calcularDescuento() {
    return this.Precio - (this.Precio * this.descuento / 100.0);
}

}
