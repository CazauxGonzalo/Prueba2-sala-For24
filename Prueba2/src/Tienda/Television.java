/**
 * 
 */
package Tienda;

/**
 * @author Gonzalo Guzman
 *clase hija de electrodomesticos
 */
public class Television extends Electrodomestico {

	private int resolucion;
	private boolean sintonizadorTdt;
	
	
	public Television() {
		this.resolucion = 20;
		this.sintonizadorTdt = false;
		
	}

	
	
	

	/**
	 * @param precioBase
	 * @param color
	 * @param consumoElectrico
	 * @param peso
	 */
	public Television(String consumoElectrico, int precioBase, String color, int peso) {
		super(consumoElectrico,precioBase, color, peso);
		
	}





	/**
	 * @param precioBase
	 * @param peso
	 */
	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		
		
	}


	/**
	 * @param precioBase
	 * @param color
	 * @param consumoElectrico
	 * @param peso
	 * @param resolucion
	 * @param sintonizadorTdt
	 */
	public Television(String consumoElectrico, int precioBase, String color, int peso, int resolucion,
			boolean sintonizadorTdt) {
		super(consumoElectrico, precioBase, color, peso);
		this.resolucion = resolucion;
		this.sintonizadorTdt = sintonizadorTdt;
	}


	/**
	 * @return the resolucion
	 */
	public int getResolucion() {
		return resolucion;
	}



	
	

	/**
	 * @param precioBase
	 * incrementa el valor de precioBase 	
	 */
	
	
	public int precioFinal(int precioBase) {
		
		super.precioFinal(getResolucion());
		
	
		 int valor;
         valor = precioBase;
		
		if (resolucion > 40 ) {
			precioBase = (int) (valor + (valor*0.3));
			 					
		}
		
		int valor1;
        valor1 = precioBase;
		
		if (sintonizadorTdt = true) {
			precioBase = valor1+50;
		}
		
		
		return precioBase;
		

		
	}





	
	
	
	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", sintonizadorTdt=" + sintonizadorTdt + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
}
