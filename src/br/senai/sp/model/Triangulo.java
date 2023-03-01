package br.senai.sp.model;

public class Triangulo {

	 // Propriedades/Atributos da Classe
   public double base; 
   public double ladob;
   public double ladoc;
   public double altura;
   public String nome;
   
   
   //Métodos da classe
   public void mostrarDimensoes() {
   
	   System.out.println("................................................................................");
	  System.out.println(nome);
	  System.out.println("................................................................................");
	  System.out.println("base: " + base);
	  System.out.println ("ladob:" + ladob);
	  System.out.println ("ladoc: " + ladoc);
	  System.out.println("altura " + altura);
      calcularArea();
   
   }
   
   public void calcularArea() {
	   
	   double area = (base * altura) / 2;
	   System.out.println("Área =" + area);
	  
   }
   
   
}


