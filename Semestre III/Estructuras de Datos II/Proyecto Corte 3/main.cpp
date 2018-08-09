

// Proyecto desarrolla por:
// Cristian Alexander Marín Aguirre
// Cristian Steven Gonzalez Arango
// Edwin Lopez




#include <iostream>
// libreria basica de c++ cout,cin,endl,stdin,fflush... etc.

#include <stdlib.h>
// usamos la funcion free();

#include <string.h>
//Usamos strcpy();

using namespace std;

//----- Estructura que contiene los datos de las personas -----//
struct persona{
	int cedula;
	char nombre[60];
	int edad;
};

//----- Estructura que contiene las posiciones del arbol -----//
struct nodo{
	struct persona p;
	nodo * izq;
	nodo * der;
	nodo * padre;
};

//----- Punteros requeridos del arbol -----//
nodo * arbol;
nodo * padre;
nodo * primero;

//----- Contador global que registra cada vez que se crea y elimina un nodo en el arbol -----//
int	nPer=0;

//----- Creacion de la variable datos tipo persona -----//
struct persona datos;


//----- Prototipos de las funciones -----//
nodo *crearnodo(nodo *,persona &datos);
nodo *minimo(nodo * arbol);

void inicio();
void cargarDatos(persona &datos);
void insertar    (nodo *&,nodo *,persona &datos);
void mostrarArbol(nodo *,int);
bool busqueda    (nodo *,int );
bool hayArbol	 (nodo *);
void inorden     (nodo *);
void preorden    (nodo *);
void postorden   (nodo *);

void eliminar	 (nodo *arbol, int cedula);
void eliminarnodo(nodo *);
void destruirNodo(nodo *);
void reemplazar  (nodo * ,nodo * );
void vaciar(nodo *);


int main() {

	char nombre[60];
	int cedula=0;
	int edad=0;
	int cont = 0;
	int dato = 0;
	int op = 0;

	do{

	system("color f1");

	printf("\n\n\t\t\t\t+------------ Gotham City %c -------+\n",154);
	cout<<"\t\t\t\t|                                  |"<<endl;
	cout<<"\t\t\t\t|      Seleccione:                 |"<<endl;
	cout<<"\t\t\t\t|                                  |"<<endl;
	cout<<"\t\t\t\t|    1)Registrar personas          |"<<endl;
	cout<<"\t\t\t\t|    2)Ver Personas Registradas    |"<<endl;
	cout<<"\t\t\t\t|    3)Buscar Persona              |"<<endl;
	cout<<"\t\t\t\t|                                  |"<<endl;
	cout<<"\t\t\t\t+-------------recorridos-----------+"<<endl;
	cout<<"\t\t\t\t|                                  |"<<endl;
	cout<<"\t\t\t\t|    4)IN   - ORDER                |"<<endl;
	cout<<"\t\t\t\t|    5)PRE  - ORDER                |"<<endl;
	cout<<"\t\t\t\t|    6)POST - ORDEN                |"<<endl;
	cout<<"\t\t\t\t|                                  |"<<endl;
	cout<<"\t\t\t\t+----------------------------------+"<<endl;
	cout<<"\t\t\t\t|                                  |"<<endl;
	cout<<"\t\t\t\t|    7)Eliminar Una Persona        |"<<endl;
	cout<<"\t\t\t\t|    8)Eliminar Todos Registros    |"<<endl;
	cout<<"\t\t\t\t|                                  |"<<endl;
	cout<<"\t\t\t\t+----------------------------------+"<<endl;
	cout<<"\t\t\t\t|                                  |"<<endl;
	printf("\t\t\t\t|   0)Salir %c                      |\n",153);
	cout<<"\t\t\t\t|                                  |"<<endl;
	cout<<"\t\t\t\t+----------------------------------+"<<endl;

    cin>>op;fflush(stdin);


	switch(op){
		case 0: exit(-1);
			break;

		case 1: cargarDatos(datos);
				insertar(arbol,padre,datos);
				inicio();
			break;

		case 2:	if(hayArbol(arbol)){
					cout<<"El arbol contiene: "<<endl;
					mostrarArbol(arbol,cont);
					inicio();
				}else{
					cout<<"No hay registros"<<endl;
					inicio();
				}
			break;

		case 3:	if(hayArbol(arbol)){
					cout<<"Ingrese La cedula de la persona que desea buscar:  "<<endl;cin>>dato;
					if(busqueda(arbol,dato)){
						printf("El dato %i esta en el arbol\n",dato);
					}else{
						printf("El dato %i no esta en el arbol\n",dato);
					}
					inicio();
				}else{
					cout<<"No hay registros"<<endl;
					inicio();
				}
			break;

		case 4: if(hayArbol(arbol)){
					system("color f2");
					cout<<"\tIN ORDER"<<endl;
					inorden(arbol);
					inicio();
				}else{
					cout<<"No hay registros"<<endl;
					inicio();
				}
			break;

		case 5: if(hayArbol(arbol)){
					system("color f3");
					cout<<"\tPRE ORDER"<<endl;
					preorden(arbol);
					inicio();
				}else{
					cout<<"No hay registros"<<endl;
					inicio();
				}
			break;

		case 6: if(hayArbol(arbol)){
					system("color f4");
					cout<<"\tPOST ORDER"<<endl;
					postorden(arbol);
					inicio();
				}else{
					cout<<"No hay registros"<<endl;
					inicio();
				}
			break;

		case 7: if(hayArbol(arbol)){
					cout<<"Ingrese la cedula de la persona a eliminar:  "<<endl;cin>>dato;
					eliminar(arbol,dato);
					inicio();
				}else{
					cout<<"No hay registros"<<endl;
					inicio();
				}
			break;

		case 8: vaciar(arbol);
				printf("\nLos registros se han borrado con exito...\n\n");
				arbol=NULL;
				system("pause");
				system("cls");
				main();
			break;

		default: cout<<"Opcion invalida"<<endl;
				 inicio();
			break;
	}

	}while(op!=0);

	return 0;
}

void cargarDatos(persona &datos){
	// se cargan datos en la estructura recibida
	cout<<"\t Llene la siguiente informacion:"<<endl;
	cout<<"Ingrese la cedula de la persona:"<<endl;cin>>datos.cedula;
	cout<<"Ingrese el nombre de la persona:"<<endl;
	fflush(stdin);
	gets(datos.nombre);
	cout<<"Ingrese la edad   de la persona:"<<endl;cin>>datos.edad;
}

void destruirNodo(nodo * nodo){
	nodo -> izq = NULL;
	nodo -> der = NULL;
	free(nodo);
    nPer--;
}

void reemplazar(nodo * arbol,nodo * nuevoNodo){

	if(arbol->padre){
		if(arbol->padre->izq == arbol){
			arbol->padre->izq = nuevoNodo;
		}else if(arbol->padre->der == arbol){
			arbol->padre->der = nuevoNodo;
		}
	}
	if(nuevoNodo){
		nuevoNodo -> padre = arbol->padre;
	}
}

nodo *minimo(nodo * arbol){
	// va hasta lo  mas izquierdo y lo retorna
	if(arbol == NULL){
		return NULL;
	}
	if(arbol->izq){
		return minimo(arbol->izq);
	}else{
		return arbol;
	}
}

void eliminarnodo(nodo * nodoEliminar){
	// recibe el nodo a eliminar
    if(nPer == 1){
        vaciar(arbol);
        arbol = NULL;
        nPer =0;
    }else{
        if(nodoEliminar->izq && nodoEliminar->der){
            nodo *menor = minimo(nodoEliminar->der);

            nodoEliminar->p.cedula = menor->p.cedula;
            strcpy(nodoEliminar->p.nombre , menor->p.nombre);
            nodoEliminar->p.edad = menor->p.edad;

            eliminarnodo(menor);

        }else if(nodoEliminar->izq){
            reemplazar(nodoEliminar,nodoEliminar->izq);
            destruirNodo(nodoEliminar);
        }else if(nodoEliminar->der){
            reemplazar(nodoEliminar,nodoEliminar->der);
            destruirNodo(nodoEliminar);
        }else{
            reemplazar(nodoEliminar,NULL);
            destruirNodo(nodoEliminar);
        }
    }
}


void eliminar(nodo *arbol, int cedula){
	// recibe un INT y lo busca por la izquierda despues derecha.
	if(arbol == NULL){
		return;
	}else if(cedula<arbol->p.cedula){
		eliminar(arbol->izq,cedula);
	}else if(cedula >arbol->p.cedula){
		eliminar(arbol->der,cedula);
	}else{
		eliminarnodo(arbol);
	}
}


void postorden(nodo *arbol){

	// recorre el arbol  de forma izquierda->derecha->RAIZ
	// si el arbol es:
	// 			40
	// 		30
	// 			25
	// 10
	// 		9
	// 			8
	//
	// imprime: 8 - 9 - 25 - 40 - 30 - 10

	if(arbol == NULL){
		return;
	}else{
		postorden(arbol->izq);
		postorden(arbol->der);
		cout <<"\t Persona con cedula: ["<<arbol->p.cedula<<"] , nombre: ["<<arbol->p.nombre<<"] y edad: ["<<arbol->p.edad<<"] del arbol  "<<endl;
	}
}

void preorden(nodo *arbol){

	// recorre el arbol  de forma RAIZ -> izquierda -> derecha
	// si el arbol es:
	// 			40
	// 		30
	// 			25
	// 10
	// 		9
	// 			8
	//
	// imprime: 10 - 9 - 8 - 30 - 25 - 40

	if(arbol == NULL){
		return;
	}else{
		cout <<"\t Persona con Cedula: ["<<arbol->p.cedula<<"] , Nombre: ["<<arbol->p.nombre<<"] y Edad: ["<<arbol->p.edad<<"] en el arbol  "<<endl;
		preorden(arbol->izq);
		preorden(arbol->der);
	}
}

void inorden(nodo *arbol){
	// recorre el arbol  de forma izquierda->RAIZ->derecha
	// si el arbol es:
	// 			40
	// 		30
	// 			25
	// 10
	// 		9
	// 			8
	//
	// imprime: 8 - 9 - 10 - 25 - 30 - 40

	if(arbol == NULL){
		return;
	}else{
		inorden(arbol->izq);
		cout <<"\t Persona con Cedula: ["<<arbol->p.cedula<<"] , Nombre: ["<<arbol->p.nombre<<"] y Edad: ["<<arbol->p.edad<<"] en el arbol  "<<endl;
		inorden(arbol->der);
	}
}

bool hayArbol(nodo *arbol){
	if(arbol != NULL){return true;}else{return false;};
	// (arbol !=NULL)? return true :  false;
}

bool busqueda(nodo *arbol, int cedula){
	// recorre el arbol hasta que encuentra el valor y retorna True o False segun sea el caso.
	if(arbol == NULL){
		return false;
	}else if(arbol->p.cedula == cedula){
		return true;
	}else if(cedula < arbol->p.cedula){
		return busqueda(arbol->izq,cedula);
	}else{
		return busqueda(arbol->der,cedula);
	}
}

void mostrarArbol(nodo *arbol,int cont){
	// cont determina la cantidad de espacios para mostrar la estructura del arbol.
	if(arbol == NULL){
		return;
	}else{
		mostrarArbol(arbol->der, cont+1);
		for(int i=0; i<cont;i++){
			printf("           "); //Pone espacios entre los nodos
		}
		cout <<"\t Persona con Cedula: ["<<arbol->p.cedula<<"] , Nombre: ["<<arbol->p.nombre<<"] y Edad: ["<<arbol->p.edad<<"] en el arbol  "<<endl;
		mostrarArbol(arbol->izq, cont+1);
	}
}

void insertar(nodo *&arbol,nodo * padre,persona &datos){
	// recibe datos de la struct con los datos cargados y los almacena segun la cedula
	if(arbol==NULL){
		nodo * nuevo_nodo=crearnodo(padre,datos);
		arbol = nuevo_nodo;
	}else{
		int aux = arbol->p.cedula;
		if(datos.cedula<aux){
			insertar(arbol->izq,arbol,datos);
		}else{
			insertar(arbol->der,arbol,datos);
		}
	}
}

nodo *crearnodo(nodo *padre,persona &datos){
// recibe datos (que es la estructura con la informacion cargada)
// crea un nodo
// nodo padre es asignado al nodo creado


	nodo * nuevo_nodo = new nodo();


	nuevo_nodo->p.edad=datos.edad;
	strcpy(nuevo_nodo->p.nombre,datos.nombre);
	nuevo_nodo->p.cedula=datos.cedula;

	nuevo_nodo->izq=NULL;
	nuevo_nodo->der=NULL;
	nuevo_nodo->padre=padre;

    nPer++;

	return nuevo_nodo;
}

void inicio(){
	// limpia pantalla
	cout<<"\n"<<endl;
	system("pause");
	system("cls");
}

void vaciar(nodo *arbol)
{
    if(arbol==NULL)
    {
        return;
    }
    vaciar(arbol->izq);
    vaciar(arbol->der);
    free(arbol);

	nPer = 0;
}
