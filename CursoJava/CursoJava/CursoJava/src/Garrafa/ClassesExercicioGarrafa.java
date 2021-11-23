package Garrafa;
public class ClassesExercicioGarrafa{
	
	
	public static void main(String[] args){
		
		Garrafa garrafaTeste = new Garrafa(2000);

		System.out.println("A garrafa pode armazenar " + garrafaTeste.capacidade() + " Litros");

		System.out.println("A garrafa tem " + garrafaTeste.nivel() + " litros ocupados");
		garrafaTeste.enche(550);
		System.out.println("A garrafa tem " + garrafaTeste.nivel() + " litros ocupados");	
		garrafaTeste.enche(2500);
		System.out.println("A garrafa tem " + garrafaTeste.nivel() + " litros ocupados");		
		garrafaTeste.despeja(250);
		System.out.println("A garrafa tem " + garrafaTeste.nivel() + " litros ocupados");
		garrafaTeste.despeja(1320);
		System.out.println("A garrafa tem " + garrafaTeste.nivel() + " litros ocupados");
		garrafaTeste.despeja(1000);
		System.out.println("A garrafa tem " + garrafaTeste.nivel() + " litros ocupados");
	}
}