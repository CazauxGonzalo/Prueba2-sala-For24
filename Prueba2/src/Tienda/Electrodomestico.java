/**
 * 
 */
package Tienda;

/**
 * @author Gonzalo Guzman
 *clase padre de electrodomesticos
 */
public class Electrodomestico  {
	
	private int precioBase;
	private String color;
	private String consumoElectrico;
	private int peso;
	
	static final int PRECIOBASE = 100;
	static final String COLOR = "Blanco";
	static final String CONSUMOELECTRICO = "F";
	static final int PESO = 5;
	

	
	/**
	 * @param precioBase
	 * @param color
	 * @param consumoElectrico
	 * @param peso
	 */
	public Electrodomestico(String consumoElectrico ,int precioBase, String color, int peso) {
		this.consumoElectrico = consumoElectrico;
		this.precioBase = precioBase;
		this.color = color;		
		this.peso = peso;
	}
	
	public Electrodomestico() {
		this.consumoElectrico = CONSUMOELECTRICO;
		this.precioBase = PRECIOBASE;
		this.color = COLOR;		
		this.peso = PESO;
		
		
	}

	/**
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(int precioBase, int peso) {
		
		this.precioBase = precioBase;
		this.peso = peso;
		
		
	}


	

	/**
	 * @return the precioBase
	 */
	public int getPrecioBase() {
		return precioBase;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the consumoElectrico
	 */
	public String getConsumoElectrico() {
		return consumoElectrico;
	}

	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}


	/**
	 * @param consumoElectrico
	 * valida  la letra asignada a consumoElectrico 	
	 */


	public String comprobarConsumoEnergetico(String consumoElectrico) {
		
		
        if (consumoElectrico.equalsIgnoreCase("A")){
			
		}else {
			if (consumoElectrico.equalsIgnoreCase("B")) {
				
				
			}else {
				if (consumoElectrico.equalsIgnoreCase("C")) {
					
				}else {
					if (consumoElectrico.equalsIgnoreCase("D")) {
						
					}else {
						if (consumoElectrico.equalsIgnoreCase("E")) {
							
						}else {
							if (consumoElectrico.equalsIgnoreCase("F")) {
								
							}else {
								    consumoElectrico = CONSUMOELECTRICO;
							      }
						      }
					      }
						
				     }
				
			     }
			
			
		    }
		return consumoElectrico;
		
		
		
		
			
		
			
		
		
		// comprueba que la letra es correcta,
		//sino es correcta usara la letra por defecto. Se invocará al crear el objeto y no
		//sera visible.

		
		
	}
	
	
	/**
	 * @param color
	 * verifica el color ingresado 	
	 */
	
	public String comprobarColor(String color) {
		
		if (color.equalsIgnoreCase("blanco")){
			
		}else {
			if (color.equalsIgnoreCase("negro")) {
				
				
			}else {
				if (color.equalsIgnoreCase("rojo")) {
					
				}else {
					if (color.equalsIgnoreCase("azul")) {
						
					}else {
						if (color.equalsIgnoreCase("gris")) {
							
						}else {
							color=COLOR;
						}
					      }
						
				     }
				
			     }
			
			
		    }
		return color;
			 
			
		
		
		
		 //comprueba que el color es correcto, sino lo es
		 // usa el color por defecto. Se invocará al crear el objeto y no será visible.
		
		
		
		
	}
	
	
	
	/**
	 * @param precioBase
	 * incrementa el valor de precioBase 	
	 */
	public int precioFinal(int precioBase ) {
      
		
		   int valor;
           valor = precioBase;
		 
			
	if (consumoElectrico.equalsIgnoreCase("a")){
		precioBase = valor + 80;		
		}else {
			if (consumoElectrico.equalsIgnoreCase("b")) {
				precioBase = valor+80;					
			}else {
				if (consumoElectrico.equalsIgnoreCase("c")) {
					precioBase = valor+60; 	
				}else {
					if (consumoElectrico.equalsIgnoreCase("d")) {
						precioBase = valor+50;
					}else {
						if (consumoElectrico.equalsIgnoreCase("e")) {
							precioBase = valor+30;
						}else {
							if (consumoElectrico.equalsIgnoreCase("f")) {
								precioBase = valor+10;
							}else {
								precioBase = valor;   
								      }
							      }
						      }
							
					     }
					
				     }
				
				
			    }
	        
	    
			
		       int valor1;
	           valor1 = precioBase;
	        
	      if (peso > 0 && peso <= 19 ) {
	        	precioBase = valor1 + 10;
				
			}else {
				if (peso >= 20 && peso <= 49 ) {
					precioBase = valor1+50;
					
				}else {
					if (peso >= 50 && peso <= 79 ) {
						precioBase = valor1+80;
					}else {
						if (peso >= 80 ) {
							precioBase = valor1+100;
						}else {
							precioBase = valor1 ;
						}
					}
				}
				
				
			}
	        
			
		
		
	
        
		return precioBase;
        
   
		
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoElectrico="
				+ consumoElectrico + ", peso=" + peso + "]";
	}

	
	
	
	
}
