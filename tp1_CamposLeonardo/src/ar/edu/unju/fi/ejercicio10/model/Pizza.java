package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
    private double diametro;
    private int precio;
    private double area;
    private boolean ingredientes_especiales;
    private static final int especiales20=500;
    private static final int especiales30=750;
    private static final int especiales40=1000;
    
	public Pizza() {

	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredientes_especiales() {
		return ingredientes_especiales;
	}
	public void setIngredientes_especiales(boolean ingredientes_especiales) {
		this.ingredientes_especiales = ingredientes_especiales;
	}
	public static int getEspeciales20() {
		return especiales20;
	}
	public static int getEspeciales30() {
		return especiales30;
	}
	public static int getEspeciales40() {
		return especiales40;
	}
    public int calcularPrecio(int diametro, boolean ingredientes) {
    	if (diametro==20 & ingredientes==false) {
			return precio=4500;
		} else if (diametro==20 & ingredientes==true){
			return precio=5000;
		}else if (diametro==30 & ingredientes==false) {
			return precio=4800;
			
		}else if (diametro==30 & ingredientes==true){
			return precio=5550;
			
		}else if (diametro==40 & ingredientes==false) {
			return precio=5500;
			
		}
		return precio=6500;
    	
    }
    public double calcularArea(int diamtro) {
    	return area=(3.14*Math.pow(diamtro, 2))/4;
    	
    }
    
}