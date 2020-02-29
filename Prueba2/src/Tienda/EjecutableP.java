/**
 * 
 */
package Tienda;

/**
 * @author Gonzalo Guzman
 *
 */
public class EjecutableP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Electrodomestico electrodomesticos [] = new Electrodomestico[10];
	
		/**
		 * 
		 * se crea el array de electrodomesticos
		 */
		
		Lavadora lavadora = new Lavadora();
		Television television = new Television();
		Electrodomestico electro = new Electrodomestico();
	
		/**
		 * 
		 * se ingresan datos al array de electrodomesticos
		 */	
		
		
		    electrodomesticos[0] = new Lavadora(lavadora.comprobarConsumoEnergetico("F"), lavadora.precioFinal(345), lavadora.comprobarColor("Azul"), 50, 3);
		    electrodomesticos[1] = new Lavadora(lavadora.comprobarConsumoEnergetico("A"), lavadora.precioFinal(300), lavadora.comprobarColor("Rojo"), 30, 6);
		    electrodomesticos[2] = new Electrodomestico();
		    electrodomesticos[3] = new Television();
		    electrodomesticos[4] = new Television(television.comprobarConsumoEnergetico("Z"),television.precioFinal(500), television.comprobarColor("Amarillo"), 40, 300, true);
			electrodomesticos[5] = new Electrodomestico(electro.comprobarConsumoEnergetico("B"),electro.precioFinal(250), electro.comprobarColor("Blanco"), 5);
			electrodomesticos[6] = new Electrodomestico(electro.comprobarConsumoEnergetico("F"), electro.precioFinal(450), electro.comprobarColor("Morado"), 20);
			electrodomesticos[7] = new Lavadora(lavadora.comprobarConsumoEnergetico("C"),lavadora.precioFinal(100), lavadora.comprobarColor("Negro"),  20, 15);
			electrodomesticos[8] = new Television(television.comprobarConsumoEnergetico("E"), television.precioFinal(150), television.comprobarColor("Gris"), 30, 300, false);
			electrodomesticos[9] = new Television(television.comprobarConsumoEnergetico("X"), television.precioFinal(230), television.comprobarColor("Naranjo"),  5, 100, false);
			

			/**
			 * 
			 * se recorre electrodomesticos
			 */
			
			for (int i = 0; i < electrodomesticos.length; i++) {
				System.out.println(electrodomesticos[i].precioFinal(0));
			}
			
			
			
			
			/**
			 * 
			 * se almacena el total de Lavadora
			 */
		
		
		int suma=0;
		for (Electrodomestico electrodomestico : electrodomesticos) {
			if (electrodomestico instanceof Lavadora) {
				Lavadora bin = (Lavadora) electrodomestico; 
				bin.getPrecioBase();
				suma = (bin.getPrecioBase()+suma);
				
				
			}
			
		}
		
		
		/**
		 * 
		 * se almacena el total de Television
		 */
		
		int suma1=0;
		for (Electrodomestico electrodomestico : electrodomesticos) {
			if (electrodomestico instanceof Television) {
				Television bin = (Television) electrodomestico; 
				bin.getPrecioBase();
				suma1 = (bin.getPrecioBase()+suma1);
				
				
			}
			
		}
		
		
		/**
		 * 
		 * se almacena el total de Electrodomesticos
		 */
		int suma2=0;
		for (Electrodomestico electrodomestico : electrodomesticos) {
			if (electrodomestico instanceof Electrodomestico) {
				Electrodomestico bin = (Electrodomestico) electrodomestico; 
				bin.getPrecioBase();
				suma2 = (bin.getPrecioBase()+suma2);
				
				
			}
			
			
			
		}

		
		/**
		 * 
		 * se imprimen los resultados de los totales 
		 */
		
		
		System.out.println("El Precio Total de la Clase Lavadora es = " + suma);
		System.out.println("El Precio Total de la Clase Television es = " + suma1);
		System.out.println("El Precio Total de la Clase Electrodomestico es = " + suma2);
		

		
		
		

			
		}	
			
		    
	
	
	
}
