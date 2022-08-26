package com.arquitecturajava.ejemplo005;


//fabricante , fabrica muchas tipologias de brazos
public class BrazoAcero implements Rotable {
	
	//rotar no es lo mismo que girar
	
	/* (non-Javadoc)
	 * @see com.arquitecturajava.ejemplo005.Rotable#rotar()
	 */
	@Override
	public void rotar() {
		
		System.out.println("el brazo de acero rota a 70 vueltas/minuto");
	}

}
