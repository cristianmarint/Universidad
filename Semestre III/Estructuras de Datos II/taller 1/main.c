#include <stdio.h>
#include <math.h>// funciones de matematica
#include <string.h>//para el gets 
#include <stdlib.h>
#include <Windows.h> //para la fecha

void punto1a();
void punto1b();
void punto1c();

void punto2a();
void punto2b();
void punto2c();

void punto3a();
void punto3b();
void punto3c();

void punto4a();
void punto4b();
void punto4c();

void punto5a();
void punto5b();
void punto5c();

void punto6a();
void punto6b();
void punto6c();
void punto6d();


int main() {
	int op=0;
	system("color f4");
	printf("\t Seleccione un ejercicio del taller #1\n");
	printf(" * 1)punto 1.a  *2) punto 1.b  *3)punto 1.c \n");
	printf(" * 4)punto 2.a  *5) punto 2.b  *6)punto 2.c \n");
	printf(" * 7)punto 3.a  *8) punto 3.b  *9)punto 3.c \n");
	printf(" *10)punto 4.a  *11)punto 4.b  *12)punto 4.c \n");
	printf(" *13)punto 5.a  *14)punto 5.b  *15)punto 5.c \n");
	printf(" *16)punto 6.a  *17)punto 6.b  *18)punto 6.c \n");
	printf(" *19)punto 6.d  *0)Salir   \n");
	
	scanf("%i",&op);
	switch(op)
	{
		case 1:
		system("cls");
		punto1a();
		getch();
		system("cls");main();
		break;
	
		case 2:
		system("cls");
		punto1b();
		getch();
		system("cls");main();
break;
		case 3:
		system("cls");
		punto1c();
		getch();
		system("cls");main();

break;
		case 4:
		system("cls");
		punto2a();
		getch();
		system("cls");main();

break;
		case 5:
		system("cls");
		punto2b();
		getch();
		system("cls");main();

break;
		case 6:
		system("cls");
		punto2c();
		getch();
		system("cls");main();

break;
		case 7:
		system("cls");
		punto3a();
		getch();
		system("cls");main();

break;
		case 8:
		system("cls");
		punto3b();
		getch();
		system("cls");main();

break;
		case 9:
		system("cls");
		punto3c();
		getch();
		system("cls");main();
break;

		case 10:
		system("cls");
		punto4a(); //https://www.codingunit.com/c-tutorial-how-to-use-time-and-date-in-c
		getch();
		system("cls");main();
break;

		case 11:
		system("cls");
		punto4b();
		getch();
		system("cls");main();

break;
		case 12:
		system("cls");
		punto4c();
		getch();system("cls");main();
break;
		case 13:
		system("cls");
		punto5a();
		getch();
		system("cls");main();
break;
		case 14:
		system("cls");
		punto5b();
		getch();
		system("cls");main();
break;
		case 15:
		system("cls");
		punto5c();
		getch();
		system("cls");main();
break;
		case 16:
		system("cls");
		punto6a();
		getch();
		system("cls");main();
break;
		case 17:
		system("cls");
		punto6b();
		getch();
		system("cls");main();
break;
		case 18:
		system("cls");
		punto6c();
		getch();
		system("cls");main();
break;
		case 19:
		system("cls");
		punto6d();
		getch();
		system("cls");main();
break;
		
		case 0:
			printf("Bye! c:");
break;
			default: 
			printf("Opcion no valida");
			getch();system("cls");main();

	}
	
	
	return 0;
}
void punto6d(){
	struct promedio{
		float nota1;
		float nota2;
		float nota3;
		float promedio;
	};
	struct alumno
	{
		char nombre[30]	;
		char sexo[10];
		int  edad;
		struct promedio estu;
	};	
	
	int cant=0,ciclo=0,merito=0,vuelta=0,masbajo=0,vueltaBajo=0;
	printf("Ingrese la cantidad de alumnos que desea registrar\n");
	scanf("%i",&cant);fflush( stdin );
	struct alumno perso[cant];
	while(ciclo<cant){
		fflush( stdin );
		printf("Ingrese el nombre del alumno\n");	
		gets(perso[ciclo].nombre);fflush( stdin );
		printf("Ingrese el sexo del alumno Masculino o Femenino\n");
		gets(perso[ciclo].sexo);fflush( stdin );
		printf("Ingrese la edad del alumno\n");
		scanf("%i",&perso[ciclo].edad);fflush( stdin );
		printf("A continuacion ingrese las 3 notas en su respespectivo orden\n");
		scanf("%f\n %f\n %f",&perso[ciclo].estu.nota1,&perso[ciclo].estu.nota2,&perso[ciclo].estu.nota3);fflush( stdin );
		perso[ciclo].estu.promedio = (perso[ciclo].estu.nota1+perso[ciclo].estu.nota2+perso[ciclo].estu.nota3)/3;fflush( stdin );

		if (perso[ciclo].estu.promedio > merito)
		{
			merito = perso[ciclo].estu.promedio;
			vuelta=ciclo;
		}
		if(perso[ciclo].estu.promedio < masbajo){
			masbajo=perso[ciclo].estu.promedio;
			vueltaBajo=ciclo;
		}
	ciclo++;system("cls");
	}fflush( stdin );ciclo=0;
	

	while(ciclo<cant){
		printf("\t\n\nEl nombre del alumno es: %s\n",perso[ciclo].nombre);	
		printf("\tEl sexo del alumno es: %s\n",perso[ciclo].sexo);
		printf("\tLa edad del alumno es: %i\n",perso[ciclo].edad);
		printf("\tEl promedio del alumno es: %f\n",perso[ciclo].estu.promedio);
		ciclo++;
	}
	
	printf("\t\t\nEl estudiante con el promedio mas alto fue: %s con: %f\n",perso[vuelta].nombre,     perso[vuelta].estu.promedio);
	printf("\t  El estudiante con el promedio mas bajo fue: %s con: %f\n"  ,perso[vueltaBajo].nombre, perso[vueltaBajo].estu.promedio);
	
}
void punto6c(){
fflush( stdin );
	struct promedio{
		float nota1;
		float nota2;
		float nota3;
		float promedio;
	};
	struct alumno
	{
		char nombre[30]	;
		char sexo[10];
		int  edad;
		struct promedio estu;
	}perso;	

	printf("Ingrese el nombre del alumno\n");	
	gets(perso.nombre);fflush( stdin );
	printf("Ingrese el sexo del alumno Masculino o Femenino\n");
	gets(perso.sexo);fflush( stdin );
	printf("Ingrese la edad del alumno\n");
	scanf("%i",&perso.edad);fflush( stdin );
	printf("A continuacion ingrese las 3 notas en su respespectivo orden\n");
	scanf("%f\n %f\n %f",&perso.estu.nota1,&perso.estu.nota2,&perso.estu.nota3);fflush( stdin );
	perso.estu.promedio = (perso.estu.nota1+perso.estu.nota2+perso.estu.nota3)/3;fflush( stdin );
	printf("El nombre del alumno es: %s\n",perso.nombre);	
	printf("El sexo del alumno es: %s\n",perso.sexo);
	printf("La edad del alumno es: %i\n",perso.edad);
	printf("El promedio del alumno es: %f\n",perso.estu.promedio);
}
void punto6b(){
	struct competidor
	{
	char nombre [30];
	int  edad;
	char sexo[10];
	char club[30];
	char categoria[10];
	};
	
	fflush( stdin );
	int i,cant=0;
	printf("¿cuantos jugadores vas a registrar?\n");
	scanf("%i",&cant);
	struct competidor vector[cant];
	for (i=0 ; i < cant ; i++)
	{fflush( stdin );
		printf("\t Informacion sobre jugadores\n");
		printf("Ingrese el nombre del jugador\n");
		gets(vector[i].nombre);
		fflush(stdin);
		printf("Ingrese La edad del jugador\n");
		scanf("%i",&vector[i].edad);fflush( stdin );
		printf("Ingrese el sexo del jugador Masculino - Femenino\n");
		gets(vector[i].sexo);fflush( stdin );
		printf("Ingrese el nombre del club al que pertenece el jugador\n");
		gets(vector[i].club);fflush(stdin);
		system("cls");
		if (vector[i].edad <= 15)
		{
			strcpy(vector[i].categoria , "Infantil") ;
		}else
		{
			if (vector[i].edad <= 30)
			{
				strcpy(vector[i].categoria , "joven") ;
			}else
			{
					strcpy(vector[i].categoria , "mayor") ;
			}
		}
		fflush(stdin);
	}
	printf("\t Informacion Final\n\n");
	for (i=0;i<cant;i++)
	{
	printf("El nombre: %s \n La edad: %i \n El sexo: %s \n El club: %s\n La categoria: %s \n ",vector[i].nombre,vector[i].edad,vector[i].sexo,vector[i].club,vector[i].categoria);
		printf("\n");
	}

}
void punto6a(){
	fflush( stdin );
	 struct estudiantes{
 	char nombre[50];
 	float nota1;
 	float nota2;
 	float nota3;
 	float promedio;
 };
 
	int cantidadEstudiantes=0,ciclo=0,merito=0,vuelta=0;
	 	printf("Ingrese la cantidad de estudiantes\n");
	 	scanf("%i",&cantidadEstudiantes);
	
	 	struct estudiantes grupo[cantidadEstudiantes];
		system("cls");
	 	while(ciclo < cantidadEstudiantes){
	 		fflush( stdin );
	 		printf("\nIngrese el nombre del estudiante # %i ",ciclo+1);
	 		gets(grupo[ciclo].nombre);
	 		printf("\nIngrese la primera nota del estudiante\n");
	 		scanf("%f",&grupo[ciclo].nota1);
	 		printf("\nIngrese la segunda nota del estudiante\n");
	 		scanf("%f",&grupo[ciclo].nota2);
	 		printf("\nIngrese la tercera nota del estudiante\n");
	 		scanf("%f",&grupo[ciclo].nota3);
	 		grupo[ciclo].promedio=(grupo[ciclo].nota1+grupo[ciclo].nota2+grupo[ciclo].nota3)/3;
	
	 		if (grupo[ciclo].promedio > merito)
	 		{
	 			merito = grupo[ciclo].promedio;
	 			vuelta=ciclo;
	 		}
	
			system("cls");
	 		ciclo++;
	 	}
	 	ciclo=0;
	 	printf("\t\tInformacion ingresada\n\n");
	 	while(ciclo < cantidadEstudiantes){
	 		fflush( stdin );
	 		printf("\n\t El nombre del estudiante # %i es: %s\n",ciclo+1,grupo[ciclo].nombre);
	 		printf("\nLa primera nota del estudiante es: %.2f\n",grupo[ciclo].nota1);
	 		printf("\nLa segunda nota del estudiante es: %.2f\n",grupo[ciclo].nota2);
	 		printf("\nLa tercera nota del estudiante es: %.2f\n",grupo[ciclo].nota3);
	 		printf("\nEl promedio del estudiante es: %.2f\n",grupo[ciclo].promedio);
	 		ciclo++;
	 	}
	getch();
	 	printf("\n\nEl estudiante con el mejor promedio fue: %s, con un promedio de: %.2f\n",grupo[vuelta].nombre,grupo[vuelta].promedio);

getch();
}

void punto5c(){
   int n,i=3,j,cuenta,c,vec[9],matriz[3][3],ciclo=0;
   for ( cuenta = 2 ; cuenta <= 10 ;  )
   {
      for ( c = 2 ; c <= i - 1 ; c++ )
      {
         if ( i%c == 0 )
            break;
      }
      if ( c==i & ciclo<9)
      {
         vec[ciclo]=i;
         ciclo++;
         cuenta++;
      }
      i++;
   }  ciclo=0;
   
   for (i=0;i<3;i++){
	   for (j=0;j<3;j++){
	   	matriz[i][j]=vec[ciclo];
	   	ciclo++;
	   }   	
   }
   
   for (i=0;i<3;i++){
	   for (j=0;j<3;j++){
	   	printf("- %i",matriz[i][j]);
	   }   
	   printf("\n")	;
   }   
}
void punto5b(){
		int i,j,numero;system("color f4");
	numero = rand() % 10; 	
	int vec[3][3];
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
		numero = rand() % (0+2);
		vec[i][j]=numero;
		}		
	}
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
		printf(" - %i",vec[i][j]);
		}		
		printf("\n");
	}

}
void punto5a(){
	
	int matriz[3][3],j=0,i=0,temp=0;	
	printf("Llenemos la matriz de dimension 3x3\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			scanf("%i",&temp);
			matriz[i][j]=temp;
		}		
	}temp=0;
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
		temp+=matriz[i][j];
		printf("- %i ",matriz[i][j]);
		}		
		printf("\n");
	}
	printf("\nla suma de todas las posiciones es: %i\n",temp);
}


void punto4c(){
	fflush( stdin );
	char num;
	printf("Ingrese un numero entre 0 y 9\n");
	scanf("%c",&num);
	int nnum = num;

	switch(nnum){
		case '0':
			printf("El numero en codigo Ascii es: %d",num);
		break;

		case '1':
			printf("El numero en codigo Ascii es: %d",num);
		break;
		
		case '2':
			printf("El numero en codigo Ascii es: %d",num);
		break;
		
		case '3':
			printf("El numero en codigo Ascii es: %d",num);
		break;

		case '4':
			printf("El numero en codigo Ascii es: %d",num);
		break;

		case '5':
			printf("El numero en codigo Ascii es: %d",num);
		break;
		
		case '6':
			printf("El numero en codigo Ascii es: %d",num);
		break;
		
		case '7':
			printf("El numero en codigo Ascii es: %d",num);
		break;
		
		case '8':
			printf("El numero en codigo Ascii es: %d",num);
		break;
		
		case '9':
			printf("El numero en codigo Ascii es: %d",num);
		break;
	}

}
void punto4b(){
	system("cls");
	char voc;
	printf("Ingrese una vocal\n");
	scanf("%c",&voc);
	switch(voc){
		case 'a':
			printf("La vocal en Ascii es: %d",voc);
		break;
		
		case 'e':
			printf("La vocal en Ascii es: %d",voc);
		break;
		
		case 'i':
			printf("La vocal en Ascii es: %d",voc);
		break;
		
		case 'o':
			printf("La vocal en Ascii es: %d",voc);
		break;
		
		case 'u':
			printf("La vocal en Ascii es: %d",voc);
		break;
		default:
			printf("la letra ingresada no es una vocal");
			punto4b();
			break;
	}

}
void punto4a(){


  int mes;
	
	SYSTEMTIME str_t;
	GetSystemTime(&str_t);
  	mes = str_t.wMonth;	
 
  
  switch(mes)
  {  
  	case 1:
  		printf("\t Este mes es: Enero");
  	break;
	  
  	case 2:
  		printf("\t Este mes es: Febrero");
  	break;
	  
  	case 3:
  		printf("\t Este mes es: Marzo");
  	break;

  	case 4:
  		printf("\t Este mes es: Abril");
  	break;
  	
  	case 5:
  		printf("\t Este mes es: Mayo");
  	break;
	  
  	case 6:
  		printf("\t Este mes es: Junio");
  	break;
	  
  	case 7:
  		printf("\t Este mes es: Julio");
  	break;
	  
  	case 8:
  		printf("\t Este mes es: Agosto");
  	break;

  	case 9:
  		printf("\t Este mes es: Septiembre");
  	break;
  	
  	case 10:
  		printf("\t Este mes es: Octubre");
  	break;
	  
  	case 11:
  		printf("\t Este mes es: Noviembre");
  	break;
	  
  	case 12:
  		printf("\t Este mes es: Diciembre");
  	break;	  	    	
  }
  getch();
	
}


void punto3c(){
		int matriz[4][4],i,j,numU;
	printf("Llenemos la primero columna 4 con numeros  :) \n");
	for(i=0;i<4;i++){
	scanf("%i",&numU);		
	matriz[0][i]=numU;
	}
	for(i=0;i<4;i++){
		matriz[1][i]=pow(matriz[0][i],2);
		matriz[2][i]=pow(matriz[0][i],3);
		matriz[3][i]=pow(matriz[0][i],4);
	}system("cls");system("color f4");
	printf("\nel resultado es:\n\n");
		for(i=0;i<4;i++){
		printf(" \tNumero ingresado: %i \t Elevando a 2: %i \t Elevado a 3: %i \t Elevado a 4: %i \t \n",matriz[0][i],matriz[1][i],matriz[2][i],matriz[3][i]);
		}
}
void punto3b(){
		int tamX=0,tamY=0,i,j,numero;system("color f4");
	numero = rand() % 10; 	
	printf("Ingrese el tamaño en X (filas) y Y (Columnas)\n");
	scanf("%i %i",&tamX,&tamY);
	int vec[tamX][tamY];
	for(i=0;i<tamX;i++){
		for(j=0;j<tamY;j++){
		numero = rand() % (0+2);
		vec[i][j]=numero;
		}		
	}
	for(i=0;i<tamX;i++){
		for(j=0;j<tamY;j++){
		printf(" - %i",vec[i][j]);
		}		
		printf("\n");
	}
  getch();system("cls");main();
}
void punto3a(){
 	int i=0;
	float vec[4]={32.583,11.239,45.781,22.237};
	printf("el vector contiene:\n");
	for(i=0;i<4;i++)
	{
		printf("%f\n",vec[i]);
	}
	
}


void punto2c(){
	  int x=0,y=1,z=0,cont;

  printf("0 \n 1 \n");
 
  for (cont=1;cont<=20;cont++)
  {
      z=x+y;
      printf("%d\n",z);
      x=y;
      y=z;
  }
  getch();

}

void punto2b(){
		int res=1,num=0,i=0;
	printf("Ingrese el numero del cual desea conocer su factorial\n");
	scanf("%i",&num);
	
	for(i=1;i<=num;i++){
		res=res*i;
	}
	printf("el factorial de: %i es: %d \n",num,res);

}

void punto2a(){
	int j=0,num=0;system("color f4");
	printf("Ingrese el numero\n");
	scanf("%i",&num);
	
	if(num>=0 & num<=20)
	{
		printf("La table del %i es:\n",num);
		for(j=1;j<21;j++)
		{
			printf("%i * %i = %i\n",num,j,num*j);
		}
		printf("Enter para reiniciar");
		getch();system("cls");main();
	}else{
		printf("numero invalido,Enter para reiniciar");
		getch();system("cls");main();	
	}
	
}


void punto1a()
{
	int c=0,n=0;
	while (c<=100){
		n=n+c;
		printf("%i\n",n);
		c++;
	}
}

void punto1b(){
	
		int n=0,con=0;
	while(con<=50){
		n=con+n;
		printf("%i\n",n);
		con=con+2;
	}

}

void punto1c(){
		int n=0,con=1;
	while(con < 50){
		if(con%2!=0){
			n=n+con;
		printf("%i \n",n);		
		}
	con++;
	}

}





