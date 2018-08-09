#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <cstdio>
#include <time.h>

using namespace std;
// estructuras------------------
struct nodo{
	int num;
	nodo *siguiente;
};
 nodo *fin=NULL;
 nodo *frente=NULL;
 nodo *pila=NULL;

// prototipo funciones principales
void operacionespilas();
void operacionescolas();
// -----------------------------

// prototipo funciones colas----------
void escribirColas(nodo *&,nodo *&,int);
void mostrarColas(nodo *&);

void guardartxt(nodo *&,nodo *&);
void vertxt ();

void ordenarcola(nodo *&);

void buscarelementocolas(nodo *&,nodo *&,int);
void reemplazarelementocolas(nodo *&,nodo *&,int,int);

void borrartodocolas(nodo *&,nodo *&);
void borrarelementocolas(nodo *&,nodo *&);
bool colaVacia(nodo *&frente);
// -----------------------------


// prototipo funciones pilas----------
void escribirpila(nodo *&,int);
void mostrarpila(nodo *&);

void guardartxtpila(nodo *&);
void vertxtpila();

void ordenarpila();

void buscarelementopila(nodo *&pila,int);
void reemplazarelementopilas(nodo *&pila,int,int);

void borrarelementopila(nodo *&);
void borrartodopila(nodo *&);
// -----------------------------


FILE * textocola;
FILE * textopila;
int cantidadColas=0;


int main(){
	fflush(stdin);
	system("color 70");
	int op;
	cout<<"Elija: \n1) Pilas \n2) Colas\n0) Finalizar ejecucion."<<endl;cin>>op;
	switch (op) {
		case 0:
			cout <<"bye D:"<<endl;
			exit(0);
		break;

		case 1:
			operacionespilas();
		break;

		case 2:
			operacionescolas();
		break;

		default:
		cout <<"Opcion invalida D:\n"<<endl;
		system("pause");
		system("cls");
		main();
		break;
	}
		return 0;
}
// *************Pilas********************
void operacionespilas(){
	system("cls");
	system("color f2");
	int op=0,n=0,num=0,i=0,dato=0;
	cout<<"\t\tPILAS"<<endl;
	cout <<"Selecione una opcion:\n1) Generar Numero aleatorios\n2) Mostrar Informacion\n3) Guardar en txt\n4) Ver contenido del txt\n5) Ordenar Pila\n6) Buscar un elemento\n7) Reemplazar un elemento\n8) Borrar un elemento\n9) borrar Todo\n0) Salir a menu"<<endl;
	printf("Escoja una opcion: ");
	scanf("%i",&op);
		switch(op)
		{
			case 1:
					cout << "Cuantos numeros desea generar?\n1) 100\n2) 200\n3) 300\n4) 500\n5) 1000\n" <<endl;
					cin  >> num;
					switch (num) {
						case 1:
							num = 100;
						break;
						case 2:
							num = 200;
						break;
						case 3:
							num = 300;
						break;
						case 4:
							num = 500;
						break;
						case 5:
							num = 1000;
						break;
					}
				for(i=0;i<num;i++)
				{
						n=1+rand()%((100+1)-1);
						dato=n;
						escribirpila(pila,dato);
				}
				cout << "Se han generado "<<num<<" Datos en la cola" << '\n';
				system("pause");
				system("cls");
				operacionespilas();
			break;

			case 2:
				mostrarpila(pila);
			break;

			case 3:
				guardartxtpila(pila);
			break;

			case 4:
				vertxtpila();
			break;

			case 5:
				ordenarpila();
			break;

			case 6:
				cout<<"Ingrese el elemento que desea buscar"<<endl;
				cin >>num;
				buscarelementopila(pila, num);
			break;

			case 7:
				int nuevo;
				cout<<"Ingrese el elemento que desea reemplazar"<<endl;
				cin >>num;
				cout<<"Ingrese el nuevo elemento"<<endl;
				cin >>nuevo;
				reemplazarelementopilas(pila, num,nuevo);
			break;

			case 8:
				borrarelementopila(pila);
			break;

			case 9:
				borrartodopila(pila);
			break;

			case 0:
			system("cls");
			main();
			break;

			default:
			cout <<"Opcion invalida D:\n"<<endl;
			system("pause");
			system("cls");
			operacionespilas();
			break;
		}

		system("pause");
		system("cls");
		main();
}
void borrartodopila(nodo *&pila){
	if(pila==NULL)
	{
			printf("\nOps la pila esta vacia D:\n");
	}
	while(pila!=NULL)
	{
			nodo *aux=pila;
			pila=aux->siguiente;
			delete aux;
	}

	if(pila==NULL){cout <<"Se ha borrado el contenido de la pila"<<endl;};
	system("pause");
	system("cls");
	operacionespilas();
}

void borrarelementopila(nodo *&pila){
	if(pila==NULL)
	{
			printf("\n\nLa pila esta vacia\n");
	}else
	{
			nodo *aux=pila;
			pila=aux->siguiente;
			printf("eliminando el ultimo dato [%d] de la pila\n",aux->num);
			delete aux;
	}

	system("pause");
	system("cls");
	operacionespilas();
}

void reemplazarelementopilas(nodo *&pila,int num,int nuevo){
	int i=0;
	bool estado=false;
	nodo *Nueva_Pila=pila;

	if(pila==NULL)
	{
			cout<<"Debes ingresar informacion a la pila primero\n"<<endl;
			system("pause");
			system("cls");
			operacionespilas();
	}else if(pila!=NULL){
			while(Nueva_Pila!=NULL)
			{
			 if(Nueva_Pila->num==num)
					{
							cout<<"Numero ("<<Nueva_Pila->num<<") ha sido reemplazado por ["<<nuevo<<"] en la pila\n"<<endl;
							Nueva_Pila->num=nuevo;
							estado=true;
					}
					Nueva_Pila=Nueva_Pila->siguiente;
					i++;
			};
	}
	if(!estado)
	{
			printf("\nEl elemento %d no se ha encuentrado en la pila\n",num);
	}

	system("pause");
	system("cls");
	operacionespilas();
}
void buscarelementopila(nodo *&pila,int dato){
	int i=0;
	bool estado=false;
	nodo *Nueva_Pila=pila;

	if(pila==NULL)
	{
			cout<<"Debes ingresar informacion a la pila primero\n"<<endl;
			system("pause");
			system("cls");
			operacionespilas();
	}else if(pila!=NULL){
			while(Nueva_Pila!=NULL)
			{
			 if(Nueva_Pila->num==dato)
					{
							cout<<"Numero ("<<Nueva_Pila->num<<") ha sido encontrado en la posicion ["<<i+1<<"] en la pila\n"<<endl;
							estado=true;
					}
					Nueva_Pila=Nueva_Pila->siguiente;
					i++;
			};
	}
	if(!estado)
	{
			printf("\nEl elemento %d no se ha encuentrado en la pila\n",dato);
	}


	system("pause");
	system("cls");
	operacionespilas();
}

void ordenarpila() {

			// Es el mismo funcionamiento de Cola, con diferencia que P ya no es el frente  si no 
			// la misma pila y J el dato siguiente

			nodo *p=pila;
			nodo *j;

			if(p==NULL){
				  cout<<"Debes ingresar informacion a la pila primero\n"<<endl;
					system("pause");
					system("cls");
					operacionespilas();
			}

			while(p!=NULL)
			{
					j=p->siguiente;
					while(j!=NULL)
					{
							if(p->num > j->num)
							{
									int aux=j->num;
									j->num=p->num;
									p->num=aux;
							}
							j=j->siguiente;
					}
					p=p->siguiente;
			}
			p=pila;
			while(p!=NULL)
			{
					printf("->%d\n",p->num);
					p=p->siguiente;
			}


			printf("\n\n");
			system("pause");
			system("cls");
			operacionespilas();
}

void vertxtpila(){
	int numx=0,i;
	textopila = fopen("textopila.txt","r");
	if(textopila==NULL){cout<<"Error de archivo"<<endl;fclose(textopila);};
	cout<<"\n El archivo textopila.txt contiene:\n"<<endl;
		while (!feof(textopila)){
			fscanf(textopila,"%d\n",&numx);
			printf("%d\n",numx );
			i++;
		}
	fclose(textocola);
	system("pause");
	system("cls");
	operacionespilas();
}
void guardartxtpila(nodo *&pila){
			textopila = fopen("textopila.txt", "w");
			nodo *nuevo_nodo=pila;

			if(textopila==NULL){cout<<"Error de archivo"<<endl;fclose(textopila);};

			if(pila==NULL)
			{
					cout<<"Debes ingresar informacion a la pila primero\n"<<endl;
			}else if(nuevo_nodo!=NULL){

					while(nuevo_nodo!=NULL){
						fprintf(textopila, "%d\n",nuevo_nodo->num);
						nuevo_nodo=nuevo_nodo->siguiente;
					}

			}


			fclose(textopila);
			cout<<"Se guardo correctamente :D"<<endl;
			system("pause");
			system("cls");
			operacionespilas();
}

void escribirpila(nodo *& pila,int n){
	nodo *nuevo_nodo=new nodo();
	nuevo_nodo->num=n;
	nuevo_nodo->siguiente=pila;
	pila=nuevo_nodo;
}
void mostrarpila(nodo *&pila){
	int i=0;
	nodo *Nueva_Pila=pila;
	if(pila==NULL)
	{
			cout<<"Debes ingresar informacion a la pila primero\n"<<endl;
	}else{
			 while(Nueva_Pila!=NULL)
					 {
							 cout<<"("<<i+1<<") Numero: "<<Nueva_Pila->num<<"\n"<<endl;
							 Nueva_Pila=Nueva_Pila->siguiente;
							 i++;
					 }

	}
	system("Pause");
	system("cls");
	operacionespilas();
}





// *************colas********************
void operacionescolas() {
	system("color f1");
	system("cls");
	cout<<"\t\tCOLAS"<<endl;
	int num,num2,op=0;
	cout <<"Selecione una opcion:\n1) Generar Numero aleatorios\n2) Mostrar Informacion\n3) Guardar en txt\n4) Ver contenido del txt\n5) Ordenar Cola \n6) Buscar un elemento\n7) Reemplazar un elemento\n8) Borrar un elemento \n9) borrar Todo\n0) Salir a menu"<<endl;
	cin >> op;
	switch (op) {
		case 0:
			fflush(stdin);
			system("cls");
			main();
		break;

		case 1:
			cout << "Cuantos numeros desea generar?\n1) 100\n2) 200\n3) 300\n4) 500\n5) 1000\n" <<endl;
			cin  >> num;
			switch (num) {
				case 1:
					num = 100;
				break;
				case 2:
					num = 200;
				break;
				case 3:
					num = 300;
				break;
				case 4:
					num = 500;
				break;
				case 5:
					num = 1000;
				break;
			}
			cantidadColas = num;
			while (frente != NULL) {
				borrartodocolas(frente,fin);
			};
			escribirColas(frente,fin,num);
		break;

		case 2:
			mostrarColas(frente);
		break;

		case 3:
			guardartxt(frente,fin);
		break;

		case 4:
			vertxt();
		break;

		case 5:
						ordenarcola(frente);
		break;

		case 6:
			cout<<"Ingrese el elemento a buscar: "<<endl;cin>>num;
			buscarelementocolas(frente,fin,num);
		break;

		case 7:
			cout<<"Ingrese el elemento que quiere reemplazar: "<<endl;cin>>num;
			cout<<"Ingrese el numero por el cual lo quiere reemplazar: "<<endl;cin>>num2;
			reemplazarelementocolas(frente,fin,num,num2);
		break;

		case 8:
					borrarelementocolas(frente,fin);
		break;

		case 9:
				while (frente != NULL) {
					borrartodocolas(frente,fin);
				}
		break;

		default:
		cout <<"Opcion invalida D:\n"<<endl;
		system("pause");
		system("cls");
		operacionescolas();
		break;
	}
}

void borrarelementocolas(nodo *&frente,nodo *&fin){
	int n=0;
		if(frente==NULL)
			{
				printf("La cola esta vacia\n");
			}else
				{
				n=frente->num;
				nodo *aux = frente;
				
					if(frente == fin){
						frente = NULL;
						fin = NULL;
					}else{
						frente = frente -> siguiente;
					}
			printf("Se ha eliminado el dato generado %d\n",aux->num);
			delete aux;
			}


	system("pause");
	system("cls");

 operacionescolas();
}
void borrartodocolas(nodo *&frente , nodo *&fin){
	nodo *aux = frente;
	while (frente!=NULL) {
				if(frente == fin){
					frente = NULL;
					fin = NULL;
				}else{
					frente = frente -> siguiente;
				}
	}
	delete aux;
	system("pause");
	system("cls");
	operacionescolas();
}

void reemplazarelementocolas(nodo *&frente,nodo *&fin,int buscado,int reem){

	nodo *mostrar = frente;
	int i=0;
	bool compro = false;
	if(frente==NULL){
		cout<<"Debes ingresar informacion a la estructura primero\n"<<endl;
	}else if(mostrar!=NULL){
		cout<<"reemplazando elementos:\n"<<endl;
			while(mostrar!=NULL){
				if(mostrar->num==buscado){
					cout<<"Numero ("<<mostrar->num<<") ha sido reemplazado por ["<<reem<<"] en la cola\n"<<endl;
					mostrar->num=reem;
					compro=true;
				}
				mostrar=mostrar->siguiente;
				i++;
			}
	}
	if(!compro){cout<<"El dato ["<<buscado<<"] no ha sido encontrado y reemplazado en la cola"<<endl;};

	system("pause");
	system("cls");
	operacionescolas();
}
void buscarelementocolas(nodo *&frente,nodo *&fin,int dato){
	nodo *mostrar = frente;
	int i=0;
	bool compro = false;
	if(frente==NULL){
		cout<<"Debes ingresar informacion a la estructura primero\n"<<endl;
	}else if(mostrar!=NULL){
			while(mostrar!=NULL){
				if(mostrar->num==dato){
					cout<<"Numero ("<<mostrar->num<<") ha sido encontrado en la posicion ["<<i+1<<"] en la cola\n"<<endl;
					compro=true;
				}
				mostrar=mostrar->siguiente;
				i++;
			}
	}
	if(!compro){cout<<"El dato ["<<dato<<"] no ha sido encontrado en la cola"<<endl;};

	system("pause");
	system("cls");
	operacionescolas();
}



void ordenarcola(nodo *&frente){
	//ordenamiento burbuja
		if(frente != NULL){
				nodo *p = frente;
				nodo *j = fin;
				int aux;
				p = frente;
				while(p != NULL){//hasta que P (frente primera pasada) sea diferente de NULL, P avanza en cada ciclo
					j = p -> siguiente;
					while(j != NULL){//se repite hasta que no hayan datos en J para comparar
						if(p -> num > j -> num){//si P es mayor a J (que esta con el numero siguiente) se hace el cambio
							aux = p -> num;
							p -> num = j -> num;
							j -> num = aux;
						}
						j = j -> siguiente;//avanzao J para el siguiente ciclo
					}
					p = p -> siguiente;//avanzao P para el siguiente ciclo
				}
			}else{
				cout<<"Debes ingresar informacion a la cola primero\n"<<endl;
			}


			system("pause");
			system("cls");
			operacionescolas();
	}

void mostrarColas(nodo *&frente){
		fflush(stdin);
		nodo *mostrar = frente;
		int i=0;
		if(frente == NULL){
			cout<<"Debes ingresar informacion a la estructura primero\n"<<endl;
		}else if(mostrar!=NULL){
			cout<<"La cola contiene:\n"<<endl;
			while(mostrar!=NULL){
				cout<<"("<<i+1<<") Numero: "<<mostrar->num<<"\n"<<endl;
				mostrar=mostrar->siguiente;
				i++;
			}
		}
		system("pause");
		system("cls");
		operacionescolas();
	}
void escribirColas (nodo *&frente,nodo *&fin,int num){
		int aleatorio,i=0;

		while (i<num) {
			aleatorio = rand() % num + 1;
			nodo *escribir = new nodo();
			escribir->num=aleatorio;
			escribir->siguiente=NULL;
			if (colaVacia(frente)){
				frente=escribir;
			}else{
				fin->siguiente=escribir;
			}
			fin = escribir;
			i++;
		}
		// fflush(stdin);
		cout<<"Se han generado "<<i<<" Datos en la cola"<<endl;
		system("pause");
		system("cls");
		operacionescolas();
	}

bool colaVacia(nodo *&frente){
		return (frente==NULL)?true : false;
}

void vertxt(){
	int numx=0,i;
	textocola = fopen("textocola.txt","r");
	if(textocola==NULL){cout<<"Error de archivo"<<endl;fclose(textocola);};
	cout<<"El archivo .txt contiene:\n"<<endl;
		while (!feof(textocola)){
			fscanf(textocola,"%d\n",&numx);
			printf("%d\n",numx );
			i++;
		}
	fclose(textocola);
	system("pause");
	system("cls");
	operacionescolas();
}
void guardartxt(nodo *&frente,nodo *&fin) {
	textocola = fopen("textocola.txt","w");
	nodo *guardar = frente;
	int n=0;
	if(textocola==NULL){cout<<"Error de archivo"<<endl;fclose(textocola);};
		if(frente==NULL) {
				cout << "No se a ingresado datos para guardar" <<endl;
		}else if(guardar !=NULL){
					while(guardar!=NULL){
						cout<<"Escribiendo n-->"<<guardar->num<<endl;
						fprintf(textocola,"%d\n",guardar->num);
						guardar=guardar->siguiente;
					}
		}
		fclose(textocola);
		cout<<"Se guardo correctamente :D"<<endl;
		system("pause");
		system("cls");
		operacionescolas();
}
