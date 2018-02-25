#include <stdio.h>
#include <stdbool.h>
#include <time.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
//memoria dinamica no asigna bloque si no donde hallÃƒÂ¡ espacio??
//liberar memoria free() - https://www.tutorialspoint.com/c_standard_library/c_function_free.htm

void punto4f();
void punto4e();
void punto4d();
void punto4c();
void punto4b();
void punto4a();

void punto3l();
void punto3k();
void punto3j();
void punto3i();
void punto3h();
void punto3g();
void punto3f2(int vec[],int buscado,int n);
void punto3f();
void punto3e();
void punto3d();
void punto3c();
void punto3b();
void punto3a();

void punto2c();
void punto2b();
void punto2a();

void punto1b();
void punto1a();
void punto1c();


int main() {
	system("color f4");
	int op;
	printf("\n\n");
	printf("\t+_______________________________________________________+\n");
	printf("\t|              *        Ejercicios       *              |\n");
	printf("\t|___________________________|___________________________|\n");
	printf("\t|                #    Elija una opcion                  |\n");
	printf("\t|___________________________|___________________________|\n");
	printf("\t|   Arreglos con punteros   |     Matriz con punteros   |\n");
	printf("\t|                           |                           |\n");
	printf("\t| (1) Arreglo con decimales | (4) Matriz 3x3 suma Posi. |\n");
	printf("\t| (2) Tamano N1xN2 con cero | (5) Matriz 3x3 llenado aut|\n");
	printf("\t| (3) Matriz + operaciones  | (6) Matriz 3x3 N. Primos  |\n");
	printf("\t|---------------------------|---------------------------|\n");
	printf("\t|    Ejercicios - Punteros  |    Ejercicios - Structs   |\n");
	printf("\t|                           |                           |\n");
	printf("\t| (7) Un N. es par o impar  | (19 Struct competidor     |\n");
	printf("\t| (8) Un N. es primo        | (20 Struct estudiante     |\n");
	printf("\t| (9) arreglo x10 N. par?   | (21 Struct empresa        |\n");
	printf("\t| (10 arreglo xN  N. menor  | (22 Struct Aninados Alu.  |\n");
	printf("\t| (11 arreglo memoria dina. |  (23  ||  N. alumnos      |\n");
	printf("\t| (12 arreglo busqueda N.   | *(24) Struct P. Discapa.  |\n");
	printf("\t| (13 cantidad de vocales   |           Cristian        |\n");
	printf("\t| (14 || en string          |           Alexander       |\n");
	printf("\t| (15 Suma matriz dina.     |           Marin           |\n");
	printf("\t| (16 Opuesta matriz din    |           Aguirre         |\n");
	printf("\t| (17 Struct Alumno         |           ID              |\n");
	printf("\t| (18 Struct Ciclista       |        1.112.792.674      |\n");
	printf("\t|---------------------------|---------------------------|\n");
	printf("\t|_______________________(0)Salir________________________|\n");

	scanf("%i",&op);
	switch(op){
		case 0:
			printf("Bye c:");
break;

case 1:
		system("cls");
		punto1a();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 2:
		system("cls");
		punto1b();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 3:
		system("cls");
		punto1c();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 4:
		system("cls");
		punto2a();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 5:
		system("cls");
		punto2b();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 6:
		system("cls");
		punto2c();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 7:
		system("cls");
		punto3a();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 8:
		system("cls");
		punto3b();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 9:
		system("cls");
		punto3c();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 10:
		system("cls");
		punto3d();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 11:
		system("cls");
		punto3e();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 12:
		system("cls");
		punto3f();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 13:
		system("cls");
		punto3g();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 14:
		system("cls");
		punto3h();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 15:
		system("cls");
		punto3i();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 16:
		system("cls");
		punto3j();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 17:
		system("cls");
		punto3k();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 18:
		system("cls");
		punto3l();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 19:
		system("cls");
		punto4a();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 20:
		system("cls");
		punto4b();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 21:
		system("cls");
		punto4c();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 22:
		system("cls");
		punto4d();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 23:
		system("cls");
		punto4e();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

case 24:
		system("cls");
		punto4f();
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
break;

		default:
		system("cls");
		printf("\n\n presione una Tecla para ir al menu principal\n");
		getch();
		system("cls");
		main();
	}
	return 0;
}
void punto4f(){
	struct persona{
		char nombre[40];
		bool dis;
	};
	int cant=0,i,sino=3,cantDis=0;
	printf("Que cantidad de personas desea ingresar\n");
	scanf("%d\n",&cant);
	struct persona *per[cant];

	for(i=0;i<cant;i++){
		per[i]=(struct persona *) malloc(sizeof(struct persona));
		printf("Ingrese el nombre de la persona # %i\n",i+1);
		scanf("%s\n",&per[i]->nombre);
		printf("Es la persona discapacidad? 1) Si 2) No\n");
		scanf("%i\n",&sino);

		if(sino==1){
			per[i]->dis= true;
			cantDis++;
				}else{
						if (sino==2) {
							per[i]->dis= false;
						}
				}
		}
		// punto4fverdadero(per,cantDis);

}
// void punto4fverdadero(struct per2[],int cantDis){
// 	struct dis{
// 		char nombre[30];
// 		char tipoDis[50];
// 	};
// 	int i;
// 	struct dis *perDis[cantDis];
// 	for (i = 0; i < cantDis; i++) {
// 		perDis[i]=(struct dis *) malloc(sizeof(struct dis));
// 		if(per2[i]->dis==true){
// 			printf("Que discapacidad tiene %s\n",per2[i]->tipoDis);
// 			perDis[i]->nombre=per2[i]->nombre;
// 		}
// 	}
//
// 	printf("Lista de discapacitados y su discapacidad\n");
// 	for (i = 0; i < cantDis; i++) {
// 		printf("%s Sufre de: %s\n",perDis[i]->nombre,perDis[i]->tipoDis);
// 	}
// }
void punto4e(){
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

	printf("Ingrese la cantidad de alumnos:\n");
	scanf("%i",&cant);

	struct alumno *perso[cant];

 for(ciclo=0;ciclo<cant;ciclo++){
		 perso[ciclo]=(struct alumno *) malloc(sizeof(struct alumno));
		fflush( stdin );
		printf("Ingrese el nombre del alumno %i\n",ciclo+1);
		gets(perso[ciclo]->nombre);
		printf("Ingrese el sexo del alumno Masculino o Femenino\n");
		scanf("%s",&perso[ciclo]->sexo);fflush( stdin );
		printf("Ingrese la edad del alumno\n");
		scanf("%i",&perso[ciclo]->edad);fflush( stdin );
		printf("A continuacion ingrese las 3 notas en su respectivo orden\n");
		scanf("%f\n %f\n %f",&perso[ciclo]->estu.nota1,&perso[ciclo]->estu.nota2,&perso[ciclo]->estu.nota3);fflush( stdin );
		printf("\n\n\n");
		perso[ciclo]->estu.promedio=(perso[ciclo]->estu.nota1+perso[ciclo]->estu.nota2+perso[ciclo]->estu.nota3)/3;
	}
 for(ciclo=0;ciclo<cant;ciclo++){
		printf("\t\n\nEl nombre del alumno es: %s\n",perso[ciclo]->nombre);
		printf("\tEl sexo del alumno es: %s\n",perso[ciclo]->sexo);
		printf("\tLa edad del alumno es: %i\n",perso[ciclo]->edad);
		printf("\tLa nota 1 es: %.2f\n",perso[ciclo]->estu.nota1);
		printf("\tLa nota 2 es: %.2f\n",perso[ciclo]->estu.nota2);
		printf("\tLa nota 3 es: %.2f\n",perso[ciclo]->estu.nota3);
		printf("\tEl promedio del alumno es: %.2f\n",perso[ciclo]->estu.promedio);

		if (perso[ciclo]->estu.promedio > merito)
		{
			merito = perso[ciclo]->estu.promedio;
			vuelta=ciclo;
		}
		if(perso[ciclo]->estu.promedio < masbajo){
			masbajo=perso[ciclo]->estu.promedio;
			vueltaBajo=ciclo;
		}
	}fflush( stdin );ciclo=0;


	while(ciclo<cant){
		printf("\t\n\nEl nombre del alumno es: %s\n",perso[ciclo]->nombre);
		printf("\tEl sexo del alumno es: %s\n",perso[ciclo]->sexo);
		printf("\tLa edad del alumno es: %i\n",perso[ciclo]->edad);
		printf("\tEl promedio del alumno es: %f\n",perso[ciclo]->estu.promedio);
		ciclo++;
	}

	printf("\t\t\nEl estudiante con el promedio mas alto fue: %s con: %f\n",perso[vuelta]->nombre,     perso[vuelta]->estu.promedio);
	printf("\t  El estudiante con el promedio mas bajo fue: %s con: %f\n"  ,perso[vueltaBajo]->nombre, perso[vueltaBajo]->estu.promedio);
}
void punto4d(){
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

	int ciclo=0,merito=0,vuelta=0,masbajo=0,vueltaBajo=0;

	struct alumno *perso;

		// perso=malloc(sizeof(struct alumno));
		perso=(struct alumno *) malloc(sizeof(struct alumno));

		fflush( stdin );
		printf("Ingrese el nombre del alumno\n");
		scanf("%s",&perso->nombre);fflush( stdin );
		printf("Ingrese el sexo del alumno Masculino o Femenino\n");
		scanf("%s",&perso->sexo);fflush( stdin );
		printf("Ingrese la edad del alumno\n");
		scanf("%i",&perso->edad);fflush( stdin );
		printf("A continuacion ingrese las 3 notas en su respectivo orden\n");
		scanf("%f\n %f\n %f",&perso->estu.nota1,&perso->estu.nota2,&perso->estu.nota3);fflush( stdin );

		perso->estu.promedio=(perso->estu.nota1+perso->estu.nota2+perso->estu.nota3)/3;

		printf("\t\n\nEl nombre del alumno es: %s\n",perso->nombre);
		printf("\tEl sexo del alumno es: %s\n",perso->sexo);
		printf("\tLa edad del alumno es: %i\n",perso->edad);
		printf("\tLa nota 1 es: %.2f\n",perso->estu.nota1);
		printf("\tLa nota 2 es: %.2f\n",perso->estu.nota2);
		printf("\tLa nota 3 es: %.2f\n",perso->estu.nota3);
		printf("\tEl promedio del alumno es: %.2f\n",perso->estu.promedio);
}
void punto4c(){

	struct empresa{
		float salario;
	};
	int cant=0,i=0;
	float merito=0,masbajo=99999999999;
	int vueltaBajo=0,vuelta=0;
	printf("cuantos trabajadores vas a registrar?\n");
	scanf("%i",&cant);fflush( stdin );

	struct empresa *p_vec[cant];

	for (i=0 ; i < cant ; i++)
	{
		p_vec[i]=(struct empresa *) malloc(sizeof(struct empresa));
		printf("Ingrese el salario del trabajador # %i\n",i+1);
		scanf("%f",&p_vec[i]->salario);fflush(stdin);
	}
	printf("Informacion Ingresada a la empresa:\n");
	for (i=0 ; i < cant ; i++)
	{
		printf("Salario %.3f del trabajador # %i\n",p_vec[i]->salario,i+1);fflush(stdin);
	}
	vueltaBajo=0;
	for (i=0 ; i < cant ; i++)
	{
		if (p_vec[i]->salario > merito)//sirve
		{
			merito = p_vec[i]->salario;
			vuelta=i;
		}
		if(p_vec[i]->salario < masbajo){
			masbajo=p_vec[i]->salario;
			vueltaBajo=i;
		}
	}fflush(stdin);

	printf("\n \t\t El trabajador con el salario mas alto fue: %i con: %.3f \n \n",vuelta+1,p_vec[vuelta]->salario);
	printf("\t El trabajador con el salario mas bajo fue: %i con: %.3f\n"  ,vueltaBajo+1,masbajo);


}
void punto4b(){
	fflush( stdin );
	 struct estudiantes{
 		char nombre[50];
		int edad;
		int grado;
		float promedio;

 };

	int cantidadEstudiantes=0,ciclo=0,merito=0,vuelta=0;
	 	printf("Ingrese la cantidad de estudiantes\n");
	 	scanf("%i",&cantidadEstudiantes);

	 	struct estudiantes *grupo[cantidadEstudiantes];
		system("cls");
	 	while(ciclo < cantidadEstudiantes){
			grupo[ciclo]=(struct estudiantes *) malloc(sizeof(struct estudiantes));//aumenta el tamaÃƒÂ±o del vector como pushback();
	 		fflush( stdin );
	 		printf("\nIngrese el nombre del estudiante # %i  ",ciclo+1);
	 		scanf("%s",&grupo[ciclo]->nombre);

			printf("\nIngrese la edad del estudiante # %s  ",grupo[ciclo]->nombre);
	 		scanf("%d",&grupo[ciclo]->edad);

			printf("\nIngrese el grado del estudiante # %s (numerico Ej: once = 11)  ",grupo[ciclo]->nombre);
	 		scanf("%d",&grupo[ciclo]->grado);

	 		printf("\nIngrese el promedio del estudiante\n");
	 		scanf("%f",&grupo[ciclo]->promedio);

	 		if (grupo[ciclo]->promedio > merito)
	 		{
	 			merito = grupo[ciclo]->promedio;
	 			vuelta=ciclo;
	 		}

			system("cls");
	 		ciclo++;
	 	}
	 	ciclo=0;
	 	printf("\t\tInformacion ingresada\n\n");
	 	while(ciclo < cantidadEstudiantes){
	 		fflush( stdin );
	 		printf("\n\t El nombre del estudiante # %i es: %s\n",ciclo+1,grupo[ciclo]->nombre);
	 		printf("\nLa edad de %s es: %d\n",grupo[ciclo]->nombre,grupo[ciclo]->edad);
	 		printf("\nEl grado de %s es: %d\n",grupo[ciclo]->nombre,grupo[ciclo]->grado);
	 		printf("\nEl promedio de %s es: %.2f\n",grupo[ciclo]->nombre,grupo[ciclo]->promedio);
	 		ciclo++;
	 	}
	getch();
	 	printf("\n\n \t\t El estudiante con el mejor promedio fue: %s, con un promedio de: %.2f\n",grupo[vuelta]->nombre,grupo[vuelta]->promedio);
}
void punto4a(){
	struct competidor{
		char nombre[30];
		int edad;
		char sexo[10];
		char club[30];
		char categoria[10];
	};
	int cant=0,i;
	printf("Ã‚Â¿cuantos jugadores vas a registrar?\n");
	scanf("%i",&cant);fflush( stdin );

	struct competidor *p_perso[cant];

	for (i=0 ; i < cant ; i++)
	{
		p_perso[i]=(struct competidor *) malloc(sizeof(struct competidor));
		printf("\t Informacion sobre jugadores\n");fflush(stdin);
		printf("Ingrese el nombre del jugador\n");fflush(stdin);
		scanf("%s",&p_perso[i]->nombre);fflush(stdin);
		printf("Ingrese La edad del jugador\n");fflush(stdin);
		scanf("%i",&p_perso[i]->edad);fflush( stdin );
		printf("Ingrese el sexo del jugador Masculino - Femenino\n");fflush(stdin);
		scanf("%s",&p_perso[i]->sexo);fflush( stdin );
		printf("Ingrese el nombre del club al que pertenece el jugador\n");fflush(stdin);
		scanf("%s",&p_perso[i]->club);fflush(stdin);
		system("cls");
		if (p_perso[i]->edad <= 15)
		{
			strcpy(p_perso[i]->categoria , "Infantil") ;
		}else
		{
			if (p_perso[i]->edad <= 30)
			{
				strcpy(p_perso[i]->categoria , "joven") ;
			}else
			{
					strcpy(p_perso[i]->categoria , "mayor") ;
			}
		}
		fflush(stdin);
	}
	printf("\t Informacion Final\n\n");
		for (i=0;i<cant;i++)
		{
		printf("El nombre: %s \n La edad: %i \n El sexo: %s \n El club: %s\n La categoria: %s \n ",p_perso[i]->nombre,p_perso[i]->edad,p_perso[i]->sexo,p_perso[i]->club,p_perso[i]->categoria);
			printf("\n");
		}
}

void punto3l(){
		struct ciclista{
		float hora;
		float minuto;
		float segundo;
		float total;
	}*p_ci[3];
	int i;
	float tiempoTotal=0,temp;
	for(i=0;i<3;i++){
		p_ci[i]=(struct ciclista *) malloc(sizeof(struct ciclista));
		printf("\n\nIngrese las horas de la etapa numero: %i\n",i+1);
		scanf("%f",&temp);
		p_ci[i]->hora=temp*60;
		temp=0;
		printf("Ingrese los minutos de la etapa numero: %i\n",i+1);
		scanf("%f",&p_ci[i]->minuto);
		printf("Ingrese los segundos de la etapa numero: %i\n",i+1);
		scanf("%f",&temp);
		p_ci[i]->segundo=temp/60;
		temp=0;
		p_ci[i]->total=(p_ci[i]->hora)+(p_ci[i]->minuto)+(p_ci[i]->segundo);
		printf("\n tiempo total de la  etapa %i: %.2f minutos\n",i+1,p_ci[i]->total);
		tiempoTotal = p_ci[i]->total + tiempoTotal;
	}
	printf("\n\n \t \tEl tiempo total de las 3 etapas fue de: %.1f minutos o %.1f horas \n",tiempoTotal,tiempoTotal/60);

}
void punto3k(){
	int i,ciclo;
	float mayor=0;
	struct alumno{
		char nombre[30];
		int edad;
		float promedio;
	}*p_alu[3];

	for(i=0;i<3 ;i++){
		p_alu[i]=(struct alumno *) malloc(sizeof(struct alumno));
		printf("Ingrese el nombre el estudiante: %i\n",i+1);fflush(stdin);
		printf("Nombre:\n");fflush(stdin);
		scanf("%s",&p_alu[i]->nombre);fflush(stdin);
		printf("Edad:\n");fflush(stdin);
		scanf("%d",&p_alu[i]->edad);fflush(stdin);
		printf("Promedio:\n");fflush(stdin);
		scanf("%f",&p_alu[i]->promedio);fflush(stdin);
	}
	getch();
	system("cls");
	printf("Informacion Ingresada\n");
	for(i=0;i<3;i++){
		printf("\nInformacion del estudiante: %i\n",i+1);
		printf("\nNombre:  %s ",p_alu[i]->nombre);
		printf("\nEdad: %d",p_alu[i]->edad);
		printf("\nPromedio: %.2f",p_alu[i]->promedio);
	}
	for(i=0;i<3;i++){
		if (mayor<p_alu[i]->promedio) {
				mayor = p_alu[i]->promedio;
				ciclo = i;
		}
	}
	getch();
	printf("\n\n\n");
	printf("\t\tEl alumno con mejor promedio es: %s con: %.2f edad: %d\n",p_alu[ciclo]->nombre,mayor,p_alu[ciclo]->edad);
}
void punto3j(){
	int *mat1,*mat2,nf,nc,j,i;
	printf("Ingrese la dimension de la Matriz Cuadrada\n");
	scanf("%i %i",&nf,&nc);
	mat1=(int *)malloc(nf * nc *sizeof(int));
	mat2=(int *)malloc(nf * nc *sizeof(int));
	printf("Ingrese datos a la matriz\n");
	for (i = 0; i < nf; i++) {
			for (j = 0; j < nc; j++) {
				fflush(stdin);
					scanf("%i",&*(mat1 + i + j * nc));
			}
	}
	for (i = 0; i < nf; i++) {
			for (j = 0; j < nc; j++) {
				fflush(stdin);
					*(mat2 + j + i * nc)=*(mat1 + i + j * nc);
			}
		}
	fflush(stdin);
	printf("Matriz Ingresada\n");
	for (i = 0; i < nf; i++) {
			for (j = 0; j < nc; j++) {
					printf("- %i",*(mat1 +i+j*nc));
			}
			printf("\n");
	}
	printf("\n\n");
	printf("Matriz Transpuesta\n");
	for (i = 0; i < nf; i++) {
			for (j = 0; j < nc; j++) {
					printf("- %i",*(mat2 +i+j*nc));
			}
			printf("\n");
	}
	free(mat1);free(mat2);
}
void punto3i(){
	int *mat1,*mat2,*mat3,nf,j,i,nc;
	printf("Ingrese la dimencion de la matriz dinamica para sumar\n");
	scanf("%i %i",&nf,&nc);
	printf("\n");
	mat1 = (int *) malloc(nf * nc *sizeof(int));
	mat2 = (int *) malloc(nf * nc *sizeof(int));
	mat3 = (int *) malloc(nf * nc *sizeof(int));
	for (i = 0; i < nf; i++) {
			for (j = 0; j < nc; j++) {
						*(mat1 +i+j*nc)=rand ()% 21;
						*(mat2 +i+j*nc)=rand ()% 21;
			}
	}
	printf("Matriz 1\n");
	for (i = 0; i < nf; i++) {
			for (j = 0; j < nc; j++) {
						printf("- %i",*(mat1 +i+j*nc));
			}
			printf("\n");
	}
	printf("Matriz 2\n");
	for (i = 0; i < nf; i++) {
			for (j = 0; j < nc; j++) {
						printf("- %i",*(mat2 +i+j*nc));
			}
			 printf("\n");
	}
	for (i = 0; i < nf; i++) {
			for (j = 0; j < nc; j++) {
						*(mat3 +i +j *nc)=(*(mat1 +i+j*nc))+ (*(mat2 +i+j*nc));
			}
	}
	printf("\n");
	printf("Matriz 3 Suma\n");
	for (i = 0; i < nf; i++) {
			for (j = 0; j < nc; j++) {
						printf("- %i",*(mat3 +i+j*nc));
			}
			printf("\n");
		}
	free(mat1);free(mat2);free(mat3);
}
void punto3h(){
	//C NO TIENE COMO TIPO DE DATO STRINGS
	fflush(stdin);
	int laa=0,lae=0,lai=0,lao=0,lau=0;
	int i;
	char pal[100],*p_pal;
	printf("\n\n");
	printf("Ingrese una palabra\n");
	fgets(pal,100,stdin);
	strupr(pal);
	p_pal=&pal[0];

	while(*p_pal){
		switch (*p_pal) {
			case 'A':
			laa++;
			break;
			case 'E':
			lae++;
			break;
			case 'I':
			lai++;
			break;
			case 'O':
			lao++;
			break;
			case 'U':
			lau++;
			break;
			default:
				break;
		}
		p_pal++;
	}
	printf("En la palabra: %s hay:\n %i a's. \n %i e's \n %i i's \n %i o's\n %i u's",pal,laa,lae,lai,lao,lau);
	getch();
}
void punto3g(){
	fflush(stdin);
	int cVol=0,i;
	char pal[25],*p_pal;
	printf("\n\n");
	printf("Ingrese una palabra\n");
	scanf("%s",&pal);
	strupr(pal);
	p_pal=&pal[0];
	while(*p_pal){
		switch (*p_pal) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			cVol++;
			break;
		}
		p_pal++;
	}
	printf("la cantidad de vocales en la palabra: %s es: %i",pal,cVol);
	getch();
}
void punto3f(){
	int *vec,n,i,buscado;
	printf("\n\n");
	printf("\tIngrese el tamano del vector: \n");
	scanf("%d", &n);
	// esto reserva la memoria para el vector
	vec = (int *)(n * sizeof(int));
	//Si el vector no se crea
	if (vec  == NULL) {
		printf("No se pudo reservar memoria\n");
	}
	printf("Llenemos el vector\n");
	for (i = 0; i < n; i++) {
	scanf("%i",&vec[i]);
	}
	printf("Que numero buscas?\n");
	scanf("%i",&buscado);
	punto3f2(vec,buscado,n);
	free(vec);
}
void punto3f2(int vec[],int buscado,int n){
	int i;//system("cls");
	for(i=0;i<n;i++){
		if(vec[i]==buscado){
			printf("El numero buscado: %i sido encontrado en la posicion: %i\n",buscado,i+1);
			}
	}
}
void punto3e(){
	int *vec, n,aux=0,i,j;
	printf("\n\n");
	printf("\tIngrese el tamano del vector: \n");
	scanf("%d", &n);
	// esto reserva la memoria para el vector
	vec = malloc(n * sizeof(int));
	//Si el vector no se crea
	if (vec  == NULL) {
		printf("No se pudo reservar memoria\n");
	}

	for (i = 0; i < n; i++) {
			vec[i]=rand ()% 21;
	}

	for (i = 0; i < n; i++) {
			printf("\tposicion %i valor %i\n",i+1,vec[i]);
	}

	for(i=0;i<n-1;i++){
		for (j=i+1;j<n;j++) {
			if (vec[i]>vec[j]){
				aux = vec[i];
				vec[i] =vec[j];
				vec[j] = aux;
			}
		}
	}

	printf("\n\n");
	printf("\t Ordenando:\n\n");
	for (i = 0; i < n; i++) {
			printf("\tposicion %i valor %i\n",i+1,vec[i]);
	}
}
void punto3d(){
	int tam;
	printf("\n\n");
	printf("Ingrese la dimension del vector\n");
	scanf("%i",&tam);
	int vec[tam],*p_vec,i,menor,ciclo=0;
	*p_vec=&vec[0];
	for (i = 0; i < tam; i++) {
		*(p_vec + i* tam) = rand () % 31;
	}
	for(i=0;i<tam;i++){
		if (menor>=*(p_vec+i * tam)) {
				menor = *(p_vec+i * tam);
				ciclo = i;
		}
	}
	printf("\n\n");
	for(i=0;i<tam;i++){
		printf("\tEl vector contiene: %i  en posicion: %i\n",*(p_vec + i* tam),i+1);
	}
	printf("\n\n");
	printf("Veamos cual es el numero menor, presione una tecla\n");
	printf("\n\n");
	printf("El numero menor es: %i en posicion %i en memoria: %p",*(p_vec+ciclo* tam),ciclo+1,(p_vec+ciclo));
	free(p_vec);

}
void punto3c() {
	int vec[10],*p_vec=&vec[0],i;

	for (i = 0; i < 10; i++) {
		*(p_vec + i) = rand () % 21;
	}
	printf("\n\n");
	for(i=0;i<10;i++){
		printf("\tEl vector contiene: %i en memoria: %p y en posicion: %i\n",*(p_vec + i),(p_vec + i),i+1);
	}
	printf("\n\n");
	printf("Veamos que numeros son pares, presione una tecla\n");getch();
	printf("\n\n");
	for (i = 0; i < 10; i++) {
		if (*(p_vec + i)%2==0){
			printf("\tEl numero %i es par y esta en: %p y en posicion: %i\n",*(p_vec + i),(p_vec + i),i+1);
		}
	}
}
void punto3b(){

	int num,*p_num,con=0,i;
	p_num=&num;
	printf("\n\n");
	printf("\t\tIngrese un numero para saber  es primo\n");
	scanf("%i",&num);

	for(i=1;i<=num;i++){
		if (*p_num%i==0) {
			con++;
		}
	}

	if (con==2) {
		printf("\tEl numero %i es primo\n",*p_num);
	} else {
		printf("\tEl numero %i es no es primo\n",*p_num);
	}



}
void punto3a(){
	int num,*p_num;
	p_num=&num;
	printf("\n\n");
	printf("\t\tIngrese un numero para comprabar si es par o no lo es!\n");
	scanf("%i",&*p_num);

	if (*p_num%2==0) {
		printf("\tSorpresa! El numero es par :o y su posicion en memoria es: %p\n",p_num);
	} else {
		printf("\tMira! El numero es impar c: y su posicion en memoria es: %p\n",p_num);
	}
}

void punto2c(){
	int n,i=3,j,cuenta,c,vec[9],matriz[3][3],ciclo=0;
	int *p_vec=&vec[0],*p_matriz=&matriz[0][0];

	for ( cuenta = 2 ; cuenta <= 10 ;  )
	{
		 for ( c = 2 ; c <= i - 1 ; c++ )
		 {
				if ( i%c == 0 )
					 break;
		 }
		 if ( c==i & ciclo<9)
		 {
				*(p_vec+ciclo)=i;
				ciclo++;
				cuenta++;
		 }
		 i++;
	}  ciclo=0;

		for (i=0;i<3;i++){
			for (j=0;j<3;j++){

			 matriz[i][j]=vec[ciclo];
			 *(p_matriz + i + j * 3)=*(p_vec+ciclo);
			 ciclo++;
			}
		}
	printf("\n");
	printf("\t\t Matriz llenada automaticamente con numeros primos\n\n");
	for (i = 0; i < 3; i++) {
		for (j = 0; j < 3; j++) {
				printf("\t\tFila (%d) Columna (%d) contiene [%d]\n",i+1,j+1,*(p_matriz + i + j * 3));
		}
		printf("\n");
	}


}
void punto2b(){
	srand(time(NULL));
	float matriz[3][3],*p_matriz=&matriz[0][0];
	int i,j;
	printf("\n");
	printf("\t\t Matriz llenada automaticamente\n");

	for (i = 0; i < 3; i++) {
		for (j = 0; j < 3; j++) {
				*(p_matriz + i + j * 3)=rand()%10;
		}
	}

	for (i = 0; i < 3; i++) {
		for (j = 0; j < 3; j++) {
				printf("\t\tFila (%d) Columna (%d) contiene [%.2f]\n",i+1,j+1,*(p_matriz + i + j * 3));
		}
		printf("\n");
	}

}
void punto2a(){
	int *p_matriz,*vec;
	p_matriz=(int *) malloc(3 * 3 * sizeof(int));
	vec=(int *) malloc(9 * sizeof(int));
	int i,j,acum=0;
	printf("Ingrese 9 numero a la matriz\n");
		for ( i = 0; i < 3; i++) {
			for ( j = 0; j < 3; j++) {
									fflush(stdin);
									scanf("%i",&*(p_matriz + i + j * 3));fflush(stdin);
			}
		}
		fflush(stdin);
		for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++) {
					fflush(stdin);
						*(vec+acum) = *(p_matriz + i + j * 3);fflush(stdin);
						printf("\t - [%i]",*(vec + acum));
						acum++;
				}
				printf("\n");
				fflush(stdin);
			}acum=0;
		fflush(stdin);

		for (i = 0; i < 9; i++) {
					fflush(stdin);
						acum  += *(vec+i);
			}

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
			}
			printf("\n");
		}printf("\n");
		printf("La suma de todas las posiciones es: [%i]\n",acum);
}

void punto1c() {
	float matriz[4][4],*p_matriz;
	int i,j;
	fflush(stdin);
	p_matriz=&matriz[0][0];
	printf("Ingrese numeros en la primera fila\n");
	for (i = 0; i < 4; i++) {
			scanf("%f",&*(p_matriz +i+ 0 ));
	}
	fflush(stdin);
	for (i = 0; i < 4; i++) {
			*(p_matriz + i + 1 * 4)=pow(*(p_matriz + i + 0),2);
			*(p_matriz + i + 2 * 4)=pow(*(p_matriz + i + 0),3);
			*(p_matriz + i + 3 * 4)=pow(*(p_matriz + i + 0),4);
	}
	fflush(stdin);
	for (i = 0; i < 4; i++) {
		for (j = 0; j < 4; j++) {
			printf("Columna (%d) Fila (%d) contiene [%.2f]\n",i+1,j+1,*(p_matriz + i + j * 4));
		}
		printf("\n");
	}

}
void punto1b(){
	int n1=2,n2=2;
	srand(time(NULL));
	printf("Ingrese dos numeros para darle Tamano a nuestro matriz\n");
	scanf("%d",&n1);
	scanf("%d",&n2);
	int mat[n1][n2],*p_mat,i,j;
	p_mat = &mat[0][0];
	for(i=0;i<n1;i++){
		for(j=0;j<n2;j++)
		{
					*(p_mat+i+j * n2)=rand()%2;
		}
	}
	for(i=0;i<n1;i++){
		for(j=0;j<n2;j++)
		{
					printf("Contenido - %i\n",*(p_mat+i+j * n2));
		}
		printf("\n");
	}

}
void punto1a(){
	fflush(stdin);
	system("cls");
	float vec[]={32.583,11.239,45.781,22.237};
	float* p_vec=vec;
	int i=0;
	printf("\n\n");
	for (i = 0; i < 4; ++i)
	{
		printf("\tposicion: %i contine: [%.2f] en memoria: %p \n",i+1,*(p_vec+i),(p_vec+i));
	}
}
