import java.util.*;
public class SopadeLetras
{
	public static void main (String [] args)
	  {
		  Scanner sc=new Scanner(System.in);
		  int opcion;

	do
	 {
		 System.out.println("");
		 System.out.println("Sopa de Letras");
System.out.println("1.Jugar");
System.out.println("");
	     System.out.println("Seleccione una opción: ");
	     opcion=sc.nextInt();
		 System.out.println("");
		 		 System.out.println("---------------------");
		 		 System.out.println("Escoga un nivel");
		 		 System.out.println("Fácil");
		 		 System.out.println("Medio");
	     System.out.println("----------------------------");
	     System.out.println("");
		 		 System.out.println("----------------------");
		 		 System.out.println("Escriba F para el Nivel Fácil");
		 		 System.out.println("Escriba M para el Nivel Medio");
		 		 String FoM;
		 		 System.out.println("Facil/MEdio");
		 		 FoM=sc.next();
		 		 if(FoM.equalsIgnoreCase("F"))
		 		 {
		 		   System.out.println("Escoga una categoría");
		 		   System.out.println("----------------------");
		 		   System.out.println("1. Animales");
		 		   System.out.println("2. Marca de Autos");
		 		   System.out.println("5. Salir del Juego");
		 	     }
		 	     if(FoM.equalsIgnoreCase("M"))
		 		 		 {
		 		 		   System.out.println("Escoga una categoría");
		 		 		   System.out.println("----------------------");
		 		 		   System.out.println("3. Animales");
		 		 		   System.out.println("4. Marca de Autos");
		 		 		   	     System.out.println("5. Salir del Juego");
	     }
	     	     System.out.println("Seleccione una opción: ");
	     opcion=sc.nextInt();

		 switch(opcion)
		 {
			 case 1:

			 int tamano = 10,cont=0,cont2=0,cont3=0,cont4=0;
			 String caballo="CABALLO",gato="GATO", pajaro="PAJARO", lagarto="LAGARTO",palabra;
			 String nums[][] = new String[tamano][tamano];
			 String letras[] = {"A","B","C","D","E","F","G","H","J","K","L","M","N","O","P","Q","R","S","T","U","V","X","Y","Z"};

 			 for(int i=0; i<tamano; i++)
			 {
			 for(int j=0; j<tamano; j++)
			 {
			  nums[i][j] = letras[(int)(Math.random()*24)];
			 }
			 }
			 nums[0][2]="G";
			 nums[0][3]="A";
			 nums[0][4]="T";
			 nums[0][5]="O";

			 nums[2][1]="C";
			 nums[3][1]="A";
			 nums[4][1]="B";
			 nums[5][1]="A";
			 nums[6][1]="L";
			 nums[7][1]="L";
			 nums[8][1]="O";

			 nums[4][5]="P";
			 nums[5][5]="A";
			 nums[6][5]="J";
			 nums[7][5]="A";
			 nums[8][5]="R";
			 nums[9][5]="O";

			 nums[3][3]="L";
			 nums[3][4]="A";
			 nums[3][5]="G";
			 nums[3][6]="A";
			 nums[3][7]="R";
			 nums[3][8]="T";
			 nums[3][9]="O";
 System.out.print("Palabras a encontrar : ");
											 System.out.println("\n"
											 +"1.GATO \n"
											 +"2.CABALLO \n"
											 +"3.PAJARO \n"
                                             +"4.LAGARTO \n");


			 for(int i=0; i<tamano; i++)
			 {
			 for(int j=0; j<tamano; j++)
			 {
			 System.out.print(nums[i][j] + " " );
			 }
			 System.out.print("\n");
			 }
while (cont<2){
	cont++;
			 System.out.println("Escriba las palabras que encontro: ");
             palabra=sc.next();
             if (palabra.equalsIgnoreCase(gato)){
			 nums[0][2]="$";
			 nums[0][3]="$";
			 nums[0][4]="$";
			 nums[0][5]="$";

			 nums[2][1]="C";
			 nums[3][1]="A";
			 nums[4][1]="B";
			 nums[5][1]="A";
			 nums[6][1]="L";
			 nums[7][1]="L";
			 nums[8][1]="O";

			 nums[4][5]="P";
			 nums[5][5]="A";
			 nums[6][5]="J";
			 nums[7][5]="A";
			 nums[8][5]="R";
			 nums[9][5]="O";

			 nums[3][3]="L";
			 nums[3][4]="A";
			 nums[3][5]="G";
			 nums[3][6]="A";
			 nums[3][7]="R";
			 nums[3][8]="T";
			 nums[3][9]="O";
			  System.out.print("Palabras a encontrar : ");
											 System.out.println("\n"
											 +"1.GATO \n"
											 +"2.CABALLO \n"
											 +"3.PAJARO \n"
                                             +"4.LAGARTO \n");
			          for(int i=0; i<tamano; i++)
			 		 {
			 		 for(int j=0; j<tamano; j++)
			 		 {
			 		   System.out.print(nums[i][j] + " " );
			 		 }

         System.out.print("\n");
}
}
else{
System.out.println ("La palabra no se encuentra en esta sopa de letras");
}
}
while (cont2<2){
	cont2++;
			 System.out.println("Escriba las palabras que encontro: ");
             palabra=sc.next();
             if (palabra.equalsIgnoreCase(caballo)){
				 			 nums[0][2]="G";
				 			 nums[0][3]="A";
				 			 nums[0][4]="T";
				 			 nums[0][5]="O";

				 			 nums[2][1]="$";
				 			 nums[3][1]="$";
				 			 nums[4][1]="$";
				 			 nums[5][1]="$";
				 			 nums[6][1]="$";
				 			 nums[7][1]="$";
				 			 nums[8][1]="$";

				 			 nums[4][5]="P";
				 			 nums[5][5]="A";
				 			 nums[6][5]="J";
				 			 nums[7][5]="A";
				 			 nums[8][5]="R";
				 			 nums[9][5]="O";

				 			 nums[3][3]="L";
				 			 nums[3][4]="A";
				 			 nums[3][5]="G";
				 			 nums[3][6]="A";
				 			 nums[3][7]="R";
				 			 nums[3][8]="T";
				 			 nums[3][9]="O";
				 			  System.out.print("Palabras a encontrar : ");
											 System.out.println("\n"
											 +"1.GATO \n"
											 +"2.CABALLO \n"
											 +"3.PAJARO \n"
                                             +"4.LAGARTO \n");
				 			          for(int i=0; i<tamano; i++)
				 			 		 {
				 			 		 for(int j=0; j<tamano; j++)
				 			 		 {
				 			 		   System.out.print(nums[i][j] + " " );
				 			 		 }

				          System.out.print("\n");
					  }
					  }
					  else{
					  System.out.println ("La palabra no se encuentra en esta sopa de letras");
}
}
while (cont3<2){
	cont3++;
					  			 System.out.println("Escriba las palabras que encontro: ");
					               palabra=sc.next();
					               if (palabra.equalsIgnoreCase(pajaro)){
					  				 			 nums[0][2]="G";
					  				 			 nums[0][3]="A";
					  				 			 nums[0][4]="T";
					  				 			 nums[0][5]="O";

					  				 			 nums[2][1]="C";
					  				 			 nums[3][1]="A";
					  				 			 nums[4][1]="B";
					  				 			 nums[5][1]="A";
					  				 			 nums[6][1]="L";
					  				 			 nums[7][1]="L";
					  				 			 nums[8][1]="O";

					  				 			 nums[4][5]="$";
					  				 			 nums[5][5]="$";
					  				 			 nums[6][5]="$";
					  				 			 nums[7][5]="$";
					  				 			 nums[8][5]="$";
					  				 			 nums[9][5]="$";

					  				 			 nums[3][3]="L";
					  				 			 nums[3][4]="A";
					  				 			 nums[3][5]="G";
					  				 			 nums[3][6]="A";
					  				 			 nums[3][7]="R";
					  				 			 nums[3][8]="T";
					  				 			 nums[3][9]="O";
					  				 			  System.out.print("Palabras a encontrar : ");
											 System.out.println("\n"
											 +"1.GATO \n"
											 +"2.CABALLO \n"
											 +"3.PAJARO \n"
                                             +"4.LAGARTO \n");
					  				 			          for(int i=0; i<tamano; i++)
					  				 			 		 {
					  				 			 		 for(int j=0; j<tamano; j++)
					  				 			 		 {
					  				 			 		   System.out.print(nums[i][j] + " " );
					  				 			 		 }

					  				          System.out.print("\n");
					  }
				  }
				  else{
				  System.out.println ("La palabra no se encuentra en esta sopa de letras");
}
}
while (cont4<2){
	cont4++;
	                        System.out.println("Escriba las palabras que encontro: ");
				               palabra=sc.next();
				               if (palabra.equalsIgnoreCase(lagarto)){
				  				 			 nums[0][2]="G";
				  				 			 nums[0][3]="A";
				  				 			 nums[0][4]="T";
				  				 			 nums[0][5]="O";

				  				 			 nums[2][1]="C";
				  				 			 nums[3][1]="A";
				  				 			 nums[4][1]="B";
				  				 			 nums[5][1]="A";
				  				 			 nums[6][1]="L";
				  				 			 nums[7][1]="L";
				  				 			 nums[8][1]="O";

				  				 			 nums[4][5]="P";
				  				 			 nums[5][5]="A";
				  				 			 nums[6][5]="J";
				  				 			 nums[7][5]="A";
				  				 			 nums[8][5]="R";
				  				 			 nums[9][5]="O";

				  				 			 nums[3][3]="$";
				  				 			 nums[3][4]="$";
				  				 			 nums[3][5]="$";
				  				 			 nums[3][6]="$";
				  				 			 nums[3][7]="$";
				  				 			 nums[3][8]="$";
				  				 			 nums[3][9]="$";
				  				 			  System.out.print("Palabras a encontrar : ");
											 System.out.println("\n"
											 +"1.GATO \n"
											 +"2.CABALLO \n"
											 +"3.PAJARO \n"
                                             +"4.LAGARTO \n");
				  				 			          for(int i=0; i<tamano; i++)
				  				 			 		 {
				  				 			 		 for(int j=0; j<tamano; j++)
				  				 			 		 {
				  				 			 		   System.out.print(nums[i][j] + " " );
				  				 			 		 }

				  				          System.out.print("\n");
					  }
				  }
				  else{
				  System.out.println ("La palabra no se encuentra en esta sopa de letras");
}
}

			  			System.out.println("Felicitaciones completo la sopa de letras ");

				  				 			 nums[0][2]="$";
				  				 			 nums[0][3]="$";
				  				 			 nums[0][4]="$";
				  				 			 nums[0][5]="$";

				  				 			 nums[2][1]="$";
				  				 			 nums[3][1]="$";
				  				 			 nums[4][1]="$";
				  				 			 nums[5][1]="$";
				  				 			 nums[6][1]="$";
				  				 			 nums[7][1]="$";
				  				 			 nums[8][1]="$";

				  				 			 nums[4][5]="$";
				  				 			 nums[5][5]="$";
				  				 			 nums[6][5]="$";
				  				 			 nums[7][5]="$";
				  				 			 nums[8][5]="$";
				  				 			 nums[9][5]="$";

				  				 			 nums[3][3]="$";
				  				 			 nums[3][4]="$";
				  				 			 nums[3][5]="$";
				  				 			 nums[3][6]="$";
				  				 			 nums[3][7]="$";
				  				 			 nums[3][8]="$";
				  				 			 nums[3][9]="$";
											 System.out.println("\n"
											 +"1.GATO \n"
											 +"2.CABALLO \n"
											 +"3.PAJARO \n"
                                             +"4.LAGARTO \n");
				  				 			          for(int i=0; i<tamano; i++)
				  				 			 		 {
				  				 			 		 for(int j=0; j<tamano; j++)
				  				 			 		 {
				  				 			 		   System.out.print(nums[i][j] + " " );
				  				 			 		 }

				  				          System.out.print("\n");
					  }



			 break;

			 case 2:

			 break;

			 case 3:

			 break;

			 case 4:

			 break;

	    } // Fin del switch
} // Fin del Do
	      while(opcion!=5);
	      System.out.println("Has escogido salir del juego");

} // Fin del public static
} //Fin de la clase
