package com.arquitecturajava.ejemplo001;

public class Principal {

	public static void main(String[] args) {
		
		
		Galleta g1= new Galleta("chocolate");
		Galleta g2= new Galleta("vainilla");
		Galleta g3= new Galleta("fresa");
		
		Caja<Galleta> cajaGalletas= new Caja<Galleta>(2);
		
		cajaGalletas.add(g1);
		cajaGalletas.add(g2);
		cajaGalletas.add(g3);
		
		for (Galleta g:cajaGalletas.getLista()) {
			
			System.out.println(g.getSabor());
		}
		
		Caja<Bombon> cajaBombones= new Caja<Bombon>(5);
		
		cajaBombones.add(new Bombon("normal"));
		//el tipo generico se ha declarado como Bombon y no se admiten galletas
		//cajaBombones.add(new Galleta("chocolate"));
		
		
		
		

	}

}
