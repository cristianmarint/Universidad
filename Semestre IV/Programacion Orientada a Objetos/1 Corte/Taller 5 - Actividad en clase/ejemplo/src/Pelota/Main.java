package Pelota;
import Pelota.Pelota;


class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pelota p = new Pelota(300,600, "verde"); //instanciar la clase
		System.out.println("El peso de la pelota es "+p.ObtenerPeso());
		System.out.println("El radio de la pelota es "+p.ObtenerRadio());
		System.out.println("El color de la pelota es "+p.ObtenerColor());
		p.AtraparPelota();
	p.PatearPelota();
	
	}

}