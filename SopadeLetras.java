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
	     			 else{
		 		 	     System.out.println("No existe esa opcion");
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
while (cont<1){
	cont++;
			 System.out.println("Escriba las palabras que encontro: ");
             palabra=sc.next();
             if (palabra.equalsIgnoreCase(gato)){
			 nums[0][2]="$";
			 nums[0][3]="$";
			 nums[0][4]="$";
			 nums[0][5]="$";

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
while (cont2<1){
	cont2++;
			 System.out.println("Escriba las palabras que encontro: ");
             palabra=sc.next();
             if (palabra.equalsIgnoreCase(caballo)){


				 			 nums[2][1]="$";
				 			 nums[3][1]="$";
				 			 nums[4][1]="$";
				 			 nums[5][1]="$";
				 			 nums[6][1]="$";
				 			 nums[7][1]="$";
				 			 nums[8][1]="$";

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
while (cont3<1){
	cont3++;
					  			 System.out.println("Escriba las palabras que encontro: ");
					               palabra=sc.next();
					               if (palabra.equalsIgnoreCase(pajaro)){


					  				 			 nums[4][5]="$";
					  				 			 nums[5][5]="$";
					  				 			 nums[6][5]="$";
					  				 			 nums[7][5]="$";
					  				 			 nums[8][5]="$";
					  				 			 nums[9][5]="$";


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
while (cont4<1){
	cont4++;
	                        System.out.println("Escriba las palabras que encontro: ");
				               palabra=sc.next();
				               if (palabra.equalsIgnoreCase(lagarto)){

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
        int taman = 12;
        String nissan="NISSAN", audi="AUDI", mercedes="MERCEDES", toyota="TOYOTA",plabra; // Variables que se van a usar para los IF
        String num[][] = new String[taman][taman];
        String letra[] = {"A","B","C","D","E","F","G","H","J","K","L","M","N","O","P","Q","R","S","T","U","V","X","Y","Z"};
        //llenar la tabla
        for(int i=0; i<taman; i++)
        {
        for(int j=0; j<taman; j++)
        {
         num[i][j] = letra[(int)(Math.random()*24)];
        }
        }
        num[0][2]="A";
        num[0][3]="U";
        num[0][4]="D";
        num[0][5]="I";

        num[2][1]="T";
        num[3][1]="O";
        num[4][1]="Y";
        num[5][1]="O";
        num[6][1]="T";
        num[7][1]="A";


        num[4][11]="N";
		num[5][11]="I";
		num[6][11]="S";
		num[7][11]="S";
		num[8][11]="A";
        num[9][11]="N";

        num[3][3]="M";
        num[3][4]="E";
        num[3][5]="R";
        num[3][6]="C";
        num[3][7]="E";
        num[3][8]="D";
        num[3][9]="E";
        num[3][10]="S";
         System.out.print("Palabras a encontrar : ");
													 System.out.println("\n"
													 +"1.TOYOTA \n"
													 +"2.AUDI \n"
													 +"3.NISSAN\n"
		                                             +"4.MERCEDES \n");

        //mostar la tabla
        for(int i=0; i<taman; i++)
        {
        for(int j=0; j<taman; j++)
        {
          System.out.print(num[i][j] + " " );
        }
          System.out.print("\n");
        }
         // Declaración de las Variables y sus funciones
			System.out.println("Escriba las palabras que encontro: ");
				plabra=sc.next();


        if(plabra.equalsIgnoreCase(toyota)) //Todos estos "If" son para que cuando el usuario escriba la palabra que encontro que son 4 se cambien por *
        {

			num[2][1]="*";
			num[3][1]="*";
			num[4][1]="*";
		    num[5][1]="*";
			num[6][1]="*";
			num[7][1]="*";
            num[8][1]="*";
                     System.out.print("Palabras a encontrar : ");
																 System.out.println("\n"
																 +"1.TOYOTA \n"
																 +"2.AUDI \n"
																 +"3.NISSAN\n"
		                                                         +"4.MERCEDES \n");

			for(int i=0; i<taman; i++){
				for(int j=0; j<taman; j++){
				  System.out.print(num[i][j] + " " );
				}
			  System.out.print("\n");
			}
        }
        			System.out.println("Escriba las palabras que encontro: ");
				plabra=sc.next();
        if(plabra.equalsIgnoreCase(audi))
		{

			num[0][2]="*";
			num[0][3]="*";
			num[0][4]="*";
            num[0][5]="*";
                     System.out.print("Palabras a encontrar : ");
																 System.out.println("\n"
																 +"1.TOYOTA \n"
																 +"2.AUDI \n"
																 +"3.NISSAN\n"
		                                                         +"4.MERCEDES \n");
                    for(int i=0; i<taman; i++)
			        {
			        for(int j=0; j<taman; j++)
			        {
			          System.out.print(num[i][j] + " " );
			        }
			          System.out.print("\n");
        }
        }
        			System.out.println("Escriba las palabras que encontro: ");
				plabra=sc.next();
        if(plabra.equalsIgnoreCase(nissan))
		{

		    num[4][11]="*";
		    num[5][11]="*";
		    num[6][11]="*";
		    num[7][11]="*";
		    num[8][11]="*";
            num[9][11]="*";
                     System.out.print("Palabras a encontrar : ");
																 System.out.println("\n"
																 +"1.TOYOTA \n"
																 +"2.AUDI \n"
																 +"3.NISSAN\n"
		                                                         +"4.MERCEDES \n");
                    for(int i=0; i<taman; i++)
			        {
			        for(int j=0; j<taman; j++)
			        {
			          System.out.print(num[i][j] + " " );
			        }
			          System.out.print("\n");
        }

        }
		System.out.println("Escriba las palabras que encontro: ");
		plabra=sc.next();
        if(plabra.equalsIgnoreCase(mercedes))
		{

			num[3][3]="*";
			num[3][4]="*";
			num[3][5]="*";
			num[3][6]="*";
			num[3][7]="*";
			num[3][8]="*";
            num[3][9]="*";
            num[3][10]="*";
                     System.out.print("Palabras a encontrar : ");
																 System.out.println("\n"
																 +"1.TOYOTA \n"
																 +"2.AUDI \n"
																 +"3.NISSAN\n"
		                                                         +"4.MERCEDES \n");
                    for(int i=0; i<taman; i++)
			        {
			        for(int j=0; j<taman; j++)
			        {
			          System.out.print(num[i][j] + " " );
			        }
			          System.out.print("\n");
        }
        }
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
