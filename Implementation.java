// José Ángel Cardona García
// 29/01/23
// Lenguajes y autómatas II

package implementation;

import javax.swing.JOptionPane;

public class Implementation {
	
	int cont;
	boolean aceptado;
	static char [] cadena;
	
	//METODO INICIO
	
	public void inicio() {
		cont = 0;
		aceptado = false;
		A();
	}
	
	//METODO A()
	
	public void A() {
		System.out.print(" A/ ");
		aceptado = true;
		if(cont < cadena.length) {
			if(cadena[cont] == 'b') {
				cont ++;
				A();
				
			}else if(cadena[cont] == 'f') {
				cont ++;
				B();
			}
		}
		
	}
	
	//METODO B()
	
	public void B() {
		System.out.print(" B/ ");
		aceptado = true;
		if (cont < cadena.length) {
			if(cadena[cont] == 'b') {
				cont ++;
				A();
				
			}else if (cadena[cont] == 'f') {
				cont ++;
				aceptado = false;
				C();
			}
		}
	}
	
	//METODO C()
	
	public void C() {
		System.out.print(" C/ ");
		aceptado = false;
		if(cont < cadena.length) {
			if(cadena[cont] == 'b') {
				cont ++;
				B();
				
			}else if(cadena[cont] == 'f') {
				cont ++;
				D();
			}
		}
	}
	
	//METODO D()
	
	public void D() {
		System.out.print(" D/ ");
		aceptado = false;
		if(cont < cadena.length) {
			if(cadena[cont] == 'b') {
				cont ++;
				C();
				
			}else if(cadena[cont] == 'f') {
				cont ++;
				E();
			}
		}
	}
	
	//METODO E()
	
	public void E() {
		System.out.print(" E/ ");
		aceptado = true;
		if(cont < cadena.length) {
			if(cadena[cont] == 'f') {
				cont++;
				E();
				
			}else if(cadena[cont] == 'b') {
				cont ++;
				aceptado = false;
				D();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementation imp = new Implementation();
		JOptionPane.showMessageDialog(null,"Ejemplo: bffb");
		String alfabeto = JOptionPane.showInputDialog("Alfabeto {b,f}: ");
		cadena = alfabeto.toCharArray();
		
		imp.inicio();
		if(imp.aceptado) {
			System.out.println(": Cadena aceptada");
		}
		else {
			System.out.println(": Error, cadena no aceptada");
		}

	}

}
