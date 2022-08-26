package com.arquitecturajava.ejemplo005;

public class Principal2 {

	public static void main(String[] args) {
	
		Girable g= new BrazoNormal();
		Rotable r= new BrazoAcero();
		
		
		RobotPro rp= new RobotPro();
		//rp.setBrazoPro(r);
		//rp.rotarBrazoPro();
		
		rp.setBrazo(new SuperBrazo());
		rp.setBrazoPro(new SuperBrazo());
		
		rp.girarBrazo();
		rp.rotarBrazoPro();
		

	}

}
