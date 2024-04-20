package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
      private String nombre_persona;
      private Calendar fechaNacimiento;
	
	public Persona() {
	
	}
	public String getNombre_persona() {
		return nombre_persona;
	}
	public void setNombre_persona(String nombre_persona) {
		this.nombre_persona = nombre_persona;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fecha_nacimiento) {
		this.fechaNacimiento = fecha_nacimiento;
	}
      
	public int calcularEdad() {
        Calendar hoy = Calendar.getInstance();
        int edad = hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (hoy.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }
	public String obtenerSignoZodiaco() {
	    int mes = fechaNacimiento.get(Calendar.MONTH) + 1;
	    int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
	    if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
	        return "Acuario";
	    } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
	        return "Piscis";
	    } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
	        return "Aries";
	    } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
	        return "Tauro";
	    } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
	        return "Géminis";
	    } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
	        return "Cáncer";
	    } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
	        return "Leo";
	    } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
	        return "Virgo";
	    } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
	        return "Libra";
	    } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
	        return "Escorpio";
	    } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
	        return "Sagitario";
	    } else {
	        return "Capricornio";
	    }
	}

	public String obtenerEstacion() {
	    int mes = fechaNacimiento.get(Calendar.MONTH) + 1;
	    if (mes >= 3 && mes <= 5) {
	        return "Primavera";
	    } else if (mes >= 6 && mes <= 8) {
	        return "Verano";
	    } else if (mes >= 9 && mes <= 11) {
	        return "Otoño";
	    } else {
	        return "Invierno";
	    }
	}

      
      
      
}
