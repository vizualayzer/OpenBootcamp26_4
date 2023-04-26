package openbootcamp;

public class Ciclo_switch {
public static void Ciclo_switch(String[] args) {
	var estacion = "Verano";
	switch (estacion) {
	case "Verano": 
	System.out.println("Es Verano");
	case "Invierno": 
		System.out.println("Es Invierno");

	case "Otoño": 
		System.out.println("Es Otoño");

	case "Primavera": 
		System.out.println("Es Primavera");

	default:
		System.out.println("no es una estacion");;
	}
}
}
