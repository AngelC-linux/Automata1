/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automata1;

/**
 *
 * @author ANGEL
 */
public class Nodos {

    int cont;
	boolean aceptado;
	static char []cadena;
	
	
	// METODO INICIO
	
		public void inicio() {
			cont = 0;
			aceptado = false;
			q0();
		}
		
		// METODO Q0
		
		
		public void q0() {
			System.out.print("Q0/");
			aceptado = false;
			if(cont < cadena.length) {
				if(cadena[cont] == 'a') {
					cont ++;
					q0();
					
				}else if (cadena[cont] == 'b') {
					cont ++;
					q1();
				}
			}
			
		}
		
		// METODO Q1
		
		public void q1() {
			System.out.print("Q1/");
			aceptado = true;
			if(cont < cadena.length) {
				if(cadena[cont] == 'b') {
					cont ++;
					q1();
				}
				
				else if(cadena[cont] == 'a') {
					cont ++;
					aceptado = false;
					q0();
				}
			}
		}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodos nd = new Nodos();
		String alfabeto = "ababbb";
		cadena = alfabeto.toCharArray();
		
		nd.inicio();
		
		if(nd.aceptado) {
			System.out.println(": Cadena aceptada");
		}else {
			System.out.println(": Cadena no aceptada");
		}

	}
    
}
