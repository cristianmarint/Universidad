//Proyecto realizado en colaboracion con Jehferson Obando Garcia
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void llenar_equipos_datosGuardados_baloncesto();
void llenar_equipos_datosGuardados_futbol();
void mostrar_equipos_baloncesto();
void mostrar_equipos_futbol();
void ingresarInformacionFutbol(int cantidad);
void ingresarInformacionBaloncesto(int cantidad);
void menu();

struct futbol
{
	int numGolesFavor;
	int numGolesContra;
	int numGolesGoleador;
	char nombreGoleador[50];
};

struct baloncesto
{
	int balonPerdido;
	int balonRecogido;
	int numTriple;
	char triplero[50];
};

struct equipos
{
	int victorias;
	int empates;
	int derrotas;

	char nombreEquipo[50];

	struct futbol datosFutbol;
	struct baloncesto datosBalon;

}equiposFutbol[2],equiposBaloncesto[2];

int main()
{
	system("color f0");
	menu();
    return 0;
}

void menu()
{
	int cantidad;
	system("cls");
	int op;
	printf("\t\t Menu Principal \n");
	printf("****************************************************\n");
	printf("\telija una opcion \n**1)Hacer un test con Informacion guardada\n**2)Elija un deporte para ingresar informacion nueva\n**3)Creadores.\n**4)Salir.");
	printf("****************************************************\n");
	scanf("%i",&op);
	switch (op) {
		case 1:
					printf("\t++ Elija un deporte \n 1) futbol 2) baloncesto\n");
					scanf("\t %i",&op);
						switch (op)
						{
							case 1:
							system("cls");
							mostrar_equipos_futbol();
							break;

							case 2:
							system("cls");
							mostrar_equipos_baloncesto();
							break;
						}
		break;

		case 2:
					printf("\t++ Elija un deporte \n 1) futbol 2) baloncesto\n");
					scanf("\t %i",&op);
					int numEquipos;
						switch (op)
						{
							case 1:
							system("cls");
							printf("cuantos equipos tiene la liga\n");
							scanf("%i",&numEquipos);
							printf("-----\n");
							ingresarInformacionFutbol(numEquipos);
							system("cls");
							break;

							case 2:
							system("cls");
							printf("cuantos equipos tiene la liga\n");
							scanf("%i",&numEquipos);
							printf("-----\n");
							ingresarInformacionBaloncesto(numEquipos);
							system("cls");
							break;
						}
		break;
		
		case 3:
		system("color 84");
		system("cls");
		printf("\n\n");
		printf("\t\t \t\tEstudiantes: \n\n");
		printf("\t**************Cristian  Alexander Marin ************** \n\n");
		printf("\t**************Jehferson Obando    Garcia**************\n");
		getch();
		system("cls");
		menu();
		break;

		case 4:
		system("cls");
		break;
		
		
		default:
			system("cls");
			system("color 04");
			printf("\n\n\n\n\t\t\t\topcion invalida\n");
			getch();
			system("color f0");
			system("cls");
			menu();
		break;
	}
}

void ingresarInformacionBaloncesto(int cantidad)
{
	int mayorTriplero=0;
	int pos = 0;
	system("cls");
	struct equipos equiposBaloncestoUsuario[cantidad];
	int i,j;
	system("color f1");
	for (i = 0; i < cantidad; i++) {
		printf("\tIngrese la informacion para el equipo numero %i\n",i+1);
		//datos del equipo
		fflush(stdin);
		printf("Ingrese el nombre del equipo: \n");
		gets(equiposBaloncestoUsuario[i].nombreEquipo);
		fflush(stdin);
		printf("	Ingresa la cantidad de victorias: \n");
		scanf("%i",&equiposBaloncestoUsuario[i].victorias);
		fflush(stdin);
		printf("	Ingresa la cantidad de derrotas: \n");
		scanf("%i",&equiposBaloncestoUsuario[i].derrotas);

		//datos especificos del equipo
		printf("	Ingrese el numero de veces que se perdio el balon: \n");
		scanf("%i",&equiposBaloncestoUsuario[i].datosBalon.balonPerdido);
		fflush(stdin);
		printf("	Ingrese la cantidad de rebotes recuperados \n");
		scanf("%i",&equiposBaloncestoUsuario[i].datosBalon.balonRecogido);
		fflush(stdin);
		printf("	Ingrese la cantidad de triples del mayor triplero \n");
		scanf("%i",&equiposBaloncestoUsuario[i].datosBalon.numTriple);
		fflush(stdin);
		printf("	Cual es el nombre del triplero? \n");
		gets(equiposBaloncestoUsuario[i].datosBalon.triplero);
		system("cls");
	}
	for (j=0;j<cantidad;j++)
	{
		printf("\t Informacion ingresada\n");
		printf("\tNombre del equipo #%i : %s\n",j+1,equiposBaloncestoUsuario[j].nombreEquipo);
		printf("	Cantidad de victorias: %i\n",equiposBaloncestoUsuario[j].victorias );
		printf("	Cantidad de derrotas : %i\n",equiposBaloncestoUsuario[j].derrotas );
		printf("	Cantidad de veces que se perdio el balon : %i\n",equiposBaloncestoUsuario[j].datosBalon.balonPerdido);
		printf("	Cantidad de rebotes recuperados: %i\n",equiposBaloncestoUsuario[j].datosBalon.balonRecogido);
		printf("	Cantidad de triples del tripleador : %i\n",equiposBaloncestoUsuario[j].datosBalon.numTriple);
		printf("	Nombre del triplero            : %s\n",equiposBaloncestoUsuario[j].datosBalon.triplero);
		getch();
		system("cls");
		if (equiposBaloncestoUsuario[j].datosBalon.numTriple  > mayorTriplero)
		{
			mayorTriplero    = equiposBaloncestoUsuario[j].datosBalon.numTriple;
			pos = j;
		}	
	}
	printf("\n\n\t		Listado de tripleadores\n\n");
	for (i =0 ; i < cantidad ;i++)
	{
		printf("	Equipo: %s triplero: %s cantidad de triples: %i\n",equiposBaloncestoUsuario[i].nombreEquipo,equiposBaloncestoUsuario[i].datosBalon.triplero,equiposBaloncestoUsuario[i].datosBalon.numTriple);
		printf("\n");
	}
	getch();
		system("color f4");
		printf("\tEl triplero de la liga es : %s del equipo: %s\n\tCantidad de triples [%i]\n",equiposBaloncestoUsuario[pos].datosBalon.triplero,equiposBaloncestoUsuario[pos].nombreEquipo,mayorTriplero);
		getch();
		printf("\n");
		system("color f0");
		system("cls");
		printf("presiona para volver al menu principal\n");
		getch();
		system("cls");
		menu();

}


void ingresarInformacionFutbol(int cantidad)
{
	int mayorGoleador=0;
	int pos = 0;
	system("cls");
	struct equipos equiposFutbolUsuario[cantidad];
	int i,j;
	system("color f1");
	for (i = 0; i < cantidad; i++) {
		printf("\tIngrese la informacion para el equipo numero %i\n",i+1);
		//datos del equipo
		fflush(stdin);
		printf("Ingrese el nombre del equipo: \n");
		gets(equiposFutbolUsuario[i].nombreEquipo);
		fflush(stdin);
		printf("	Ingresa la cantidad de victorias: \n");
		scanf("%i",&equiposFutbolUsuario[i].victorias);
		fflush(stdin);
		printf("	Ingresa la cantidad de empates: \n");
		scanf("%i",&equiposFutbolUsuario[i].empates);
		fflush(stdin);
		printf("	Ingresa la cantidad de derrotas: \n");
		scanf("%i",&equiposFutbolUsuario[i].derrotas);

		//datos especificos del equipo
		printf("	Ingresa la cantidad de goles a favor: \n");
		scanf("%i",&equiposFutbolUsuario[i].datosFutbol.numGolesFavor);
		fflush(stdin);
		printf("	Ingresa la cantidad de goles en contra \n");
		scanf("%i",&equiposFutbolUsuario[i].datosFutbol.numGolesContra);
		fflush(stdin);
		printf("	Ingresa los goles del goleador \n");
		scanf("%i",&equiposFutbolUsuario[i].datosFutbol.numGolesGoleador);
		fflush(stdin);
		printf("	Cual es el nombre del goleador? \n");
		gets(equiposFutbolUsuario[i].datosFutbol.nombreGoleador);
		system("cls");
	}
	printf("Informacion ingresada\n");
	for (j=0;j<cantidad;j++)
	{
		printf("\tNombre del equipo #%i : %s\n",j+1,equiposFutbolUsuario[j].nombreEquipo);
		printf("	Cantidad de victorias: %i\n",equiposFutbolUsuario[j].victorias );
		printf("	Cantidad de empates  : %i\n",equiposFutbolUsuario[j].empates );
		printf("	Cantidad de derrotas : %i\n",equiposFutbolUsuario[j].derrotas );
		printf("	Cantidad de goles a favor : %i\n",equiposFutbolUsuario[j].datosFutbol.numGolesFavor );
		printf("	Cantidad de goles encontra: %i\n",equiposFutbolUsuario[j].datosFutbol.numGolesContra );
		printf("	Cantidad de goles del goleador : %i\n",equiposFutbolUsuario[j].datosFutbol.numGolesGoleador );
		printf("	Nombre del goleador            : %s\n",equiposFutbolUsuario[j].datosFutbol.nombreGoleador);
		getch();
		system("cls");
		if (equiposFutbolUsuario[j].datosFutbol.numGolesGoleador  > mayorGoleador)
		{
			mayorGoleador    = equiposFutbolUsuario[j].datosFutbol.numGolesGoleador ;
			pos = i;
		}
		
		
	}
fflush(stdin);
	int equipoGanador=0,pos2=0,puntosGanador=0;

	for(i=0;i<cantidad;i++)
	{
		if (equiposFutbolUsuario[i].victorias > equipoGanador)
		{
			equipoGanador = equiposFutbolUsuario[i].victorias;
			pos2=i;
		}
	}
	puntosGanador = (equiposFutbolUsuario[pos2].victorias *3) + equiposFutbolUsuario[pos2].empates;
	fflush(stdin);
	system("color f4");
	system("cls");
	fflush(stdin);
	fflush(stdin);
	printf("El equipo ganador es: %s con [%i] puntos\n",equiposFutbolUsuario[pos2].nombreEquipo,puntosGanador);
	printf("el pos: %i\n",pos);
	printf("\tEl goleador de la liga es : %s \n\tCantidad de goles [%i]\n",equiposFutbolUsuario[pos-1].datosFutbol.nombreGoleador,mayorGoleador);
	fflush(stdin);
	printf("presiona para volver al menu principal\n");
	getch();
	system("color f0");
	system("cls");
	menu();
}


void mostrar_equipos_futbol()
{
int mayorGoleador=0;
int pos = 0;
	system("cls");
	  llenar_equipos_datosGuardados_futbol();
		  int i , j;
			for (i = 0; i < 3; i++)
			{
				printf("\n");
				printf("\t Informacion general del equipo [%s] \n \n",equiposFutbol[i].nombreEquipo);
				printf(" victorias: [%i] empates: [%i] derrotas: [%i]\n",equiposFutbol[i].victorias,equiposFutbol[i].empates,equiposFutbol[i].derrotas);
				printf("\n");
				printf("\t Informacion Especifica \n\n");
				printf("Numero de goles a favor: [%i]\nnumero de goles en contra [%i]\n",equiposFutbol[i].datosFutbol.numGolesFavor,equiposFutbol[i].datosFutbol.numGolesContra);
				printf("Nombre del goleador: %s, cantidad de goles [%i]\n",equiposFutbol[i].datosFutbol.nombreGoleador,equiposFutbol[i].datosFutbol.numGolesGoleador);
				printf("\nPresiona una tecla para ver el siguiente equipo...\n");
				getch();
				system("cls");

					if (equiposFutbol[i].datosFutbol.numGolesGoleador > mayorGoleador)
					{
						mayorGoleador    = equiposFutbol[i].datosFutbol.numGolesGoleador;
						pos = i;
					}
			}
			
	int equipoGanador=0,pos2=0,puntosGanador=0;

	for(i=0;i<3;i++)
	{
		if (equiposFutbol[i].victorias > equipoGanador)
		{
			equipoGanador = equiposFutbol[i].victorias;
			pos2=i;
		}
	}
	puntosGanador = (equiposFutbol[pos2].victorias*3)+equiposFutbol[pos2].empates;
			
			system("color f4");
			system("cls");
			printf("\tEl goleador de la liga es : %s \n\tCantidad de goles [%i]\n",equiposFutbol[pos].datosFutbol.nombreGoleador,mayorGoleador);
			printf("\n");
			printf("El equipo ganador es: %s con [%i] puntos\n",equiposFutbol[pos2].nombreEquipo,puntosGanador);
			printf("presione una tecla para ir al menu principar\n");
			getch();
			system("color f0");
			system("cls");
			menu();
}

void mostrar_equipos_baloncesto()
{
	int numTriples=0;
	int pos = 0;
	system("cls");
		llenar_equipos_datosGuardados_baloncesto();
	//<-------------------baloncesto-------------------------------->
			int i , j;
			for (i = 0; i <3	; i++)
			{
				printf("\n");
				printf("\t Informacion general del equipo [%s] \n \n",equiposBaloncesto[i].nombreEquipo);
				printf(" victorias: [%i] derrotas: [%i]\n",equiposBaloncesto[i].victorias,equiposBaloncesto[i].derrotas);
				printf("\n");
				printf("\t Informacion Especifica \n\n");
				printf("Numero de perdida del balon [%i]\n",equiposBaloncesto[i].datosBalon.balonPerdido);
				printf("cantidad de rebotes recuperados [%i]\n",equiposBaloncesto[i].datosBalon.balonRecogido);
				printf("Nombre del mayor anotador de triples: %s, cantidad de triples: [%i]\n",equiposBaloncesto[i].datosBalon.triplero,equiposBaloncesto[i].datosBalon.numTriple);
				printf("\nPresiona una tecla para ver el siguiente equipo...\n");
				getch();
				system("cls");

				if (equiposBaloncesto[i].datosBalon.numTriple > numTriples)
				{
					numTriples = equiposBaloncesto[i].datosBalon.numTriple;
					pos ++;
				}
			}
			
				printf("\n\n\t		Listado de tripleadores\n\n");
				for (i =0 ; i < 3 ;i++)
				{
					printf("	Equipo: %s triplero: %s cantidad de triples: %i\n",equiposBaloncesto[i].nombreEquipo,equiposBaloncesto[i].datosBalon.triplero,equiposBaloncesto[i].datosBalon.numTriple);
					printf("\n");
				}
			getch();
			system("color f4");
			//system("cls");
			printf("\n");
			printf("\tEl tripleador de la liga es : %s del equipo: %s \n\tCantidad de triples [%i]\n",equiposBaloncesto[pos-1].datosBalon.triplero,equiposBaloncesto[pos-1].nombreEquipo,numTriples);
			printf("\n");
			printf("presione una tecla para ir al menu principar\n");
			getch();
			system("color f0");
			system("cls");
			menu();
}

void llenar_equipos_datosGuardados_futbol()
{
	//<-------------------futbol-------------------------------->
	//datos del equipo *UNO*
	fflush(stdin);
	strcpy(equiposFutbol[0].nombreEquipo,"Las Palomas FC ");
	fflush(stdin);
	equiposFutbol[0].victorias = 15;
	fflush(stdin);
	equiposFutbol[0].empates   = 0;
	fflush(stdin);
	equiposFutbol[0].derrotas  = 5;
	fflush(stdin);

	//datos especificos del equipo
	equiposFutbol[0].datosFutbol.numGolesFavor = 20;
	fflush(stdin);
	equiposFutbol[0].datosFutbol.numGolesContra = 5;
	fflush(stdin);
	equiposFutbol[0].datosFutbol.numGolesGoleador = 15 ;
	fflush(stdin);
	strcpy(equiposFutbol[0].datosFutbol.nombreGoleador,"Juan 'El aimer' rodriguez");
	fflush(stdin);

	//datos del equipo *DOS*
	fflush(stdin);
	strcpy(equiposFutbol[1].nombreEquipo,"Los Corticos FC ");
	fflush(stdin);
	equiposFutbol[1].victorias = 5;
	fflush(stdin);
	equiposFutbol[1].empates   = 5;
	fflush(stdin);
	equiposFutbol[1].derrotas  = 10;
	fflush(stdin);
	//datos especificos del equipo
	equiposFutbol[1].datosFutbol.numGolesFavor = 8;
	fflush(stdin);
	equiposFutbol[1].datosFutbol.numGolesContra = 15;
	fflush(stdin);
	equiposFutbol[1].datosFutbol.numGolesGoleador = 5;
	fflush(stdin);
	strcpy(equiposFutbol[1].datosFutbol.nombreGoleador,"Pedro 'recortado' carrasco");
	fflush(stdin);
	//datos del equipo *TRES*
	fflush(stdin);
	strcpy(equiposFutbol[2].nombreEquipo,"Los de seguridad ");
	equiposFutbol[2].victorias = 10;
	fflush(stdin);
	equiposFutbol[2].empates   = 5;
	fflush(stdin);
	equiposFutbol[2].derrotas  = 5;
	fflush(stdin);
	//datos especificos del equipo
	equiposFutbol[2].datosFutbol.numGolesFavor = 12;
	fflush(stdin);
	equiposFutbol[2].datosFutbol.numGolesContra = 6;
	fflush(stdin);
	equiposFutbol[2].datosFutbol.numGolesGoleador = 6 ;
	fflush(stdin);
	strcpy(equiposFutbol[2].datosFutbol.nombreGoleador,"Uvuvwevwevwe Onyetenyevwe Ugwemuhwem Osas 'el bolinillero' fernandez");
	fflush(stdin);

}

void llenar_equipos_datosGuardados_baloncesto()
{
	//datos del equipo +UNO+
	fflush(stdin);
	strcpy(equiposBaloncesto[0].nombreEquipo,"Milwaukee");
	fflush(stdin);
	equiposBaloncesto[0].victorias = 7;
	fflush(stdin);
	equiposBaloncesto[0].derrotas  = 6;
	fflush(stdin);

	//datos especificos del equipo
	fflush(stdin);
	equiposBaloncesto[0].datosBalon.balonPerdido = 10;
	fflush(stdin);
	equiposBaloncesto[0].datosBalon.balonRecogido = 9;
	fflush(stdin);
	equiposBaloncesto[0].datosBalon.numTriple =  20;
	fflush(stdin);
	strcpy(equiposBaloncesto[0].datosBalon.triplero,"Giannis Antetokounmpo");
	fflush(stdin);

	//datos del equipo +DOS+
	fflush(stdin);
	strcpy(equiposBaloncesto[1].nombreEquipo,"Houston");
	fflush(stdin);
	equiposBaloncesto[1].victorias = 11;
	fflush(stdin);
	equiposBaloncesto[1].derrotas  = 3;
	fflush(stdin);
	//datos especificos del equipo
	fflush(stdin);
	equiposBaloncesto[1].datosBalon.balonPerdido = 9;
	fflush(stdin);
	equiposBaloncesto[1].datosBalon.balonRecogido = 10;
	fflush(stdin);
	equiposBaloncesto[1].datosBalon.numTriple =  19;
	fflush(stdin);
	strcpy(equiposBaloncesto[1].datosBalon.triplero,"James Harden");
	fflush(stdin);

	//datos del equipo +TRES+
	fflush(stdin);
	strcpy(equiposBaloncesto[2].nombreEquipo,"New York");
	fflush(stdin);
	equiposBaloncesto[2].victorias = 7;
	fflush(stdin);
	equiposBaloncesto[2].derrotas  = 5;
	fflush(stdin);
	//datos especificos del equipo
	fflush(stdin);
	equiposBaloncesto[2].datosBalon.balonPerdido = 8;
	fflush(stdin);
	equiposBaloncesto[2].datosBalon.balonRecogido = 11;
	fflush(stdin);
	equiposBaloncesto[2].datosBalon.numTriple =  18;
	fflush(stdin);
	strcpy(equiposBaloncesto[2].datosBalon.triplero,"Kristaps Porzingis");
	fflush(stdin);
}
