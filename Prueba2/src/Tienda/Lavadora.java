/**
 * 
 */
package Tienda;

/**
 * @author Gonzalo Guzman
 *clase hija de electrodomesticos
 */
public class Lavadora extends Electrodomestico {
	
	private int carga;
	static final int CARGA = 5;
	
	
	/**
	 * @param carga
	 */
	
	
	public Lavadora() {
		super();
		this.carga = CARGA;
	}

	/**
	 * @param precioBase
	 * @param peso
	 * @param carga
	 */
	public Lavadora(int precioBase, int peso, int carga) {
		super(precioBase, peso);
		this.carga = carga;
	}



	/**
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		
	}

	/**
	 * @param precioBase
	 * @param color
	 * @param consumoElectrico
	 * @param peso
	 */
	public Lavadora(String consumoElectrico, int precioBase, String color, int peso) {
		super(consumoElectrico, precioBase, color, peso);
		
	}

	/**
	 * @param precioBase
	 * @param color
	 * @param consumoElectrico
	 * @param peso
	 * @param carga
	 */
	public Lavadora(String consumoElectrico, int precioBase, String color, int peso, int carga) {
		super(consumoElectrico, precioBase, color, peso);
		this.carga = carga;
	}


	/**
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
	}

	
	/**
	 * @param precioBase
	 * incrementa el valor de precioBase 	
	 */
	
	public int precioFinal(int precioBase) {
		
		super.precioFinal(carga);
		
		
		
		
		 int valor;
         valor = precioBase;
		
		if (carga > 30 ) {
			precioBase = valor + 50;
			
					
		}
		
		
		
		return precioBase;
		
	
		
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
