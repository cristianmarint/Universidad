#include <iostream>
#include <stdio.h>
#include <string.h>//strncmp y strlen usado en linea: 179
#include <windows.h>
#include <vector>

using namespace std;
// Prototipo de funciones
void inforDefectoClientes();
void mostrarClientes();
void ingresarClientes();
void modificarClientes();

void inforDefectoProductos();
void mostrarProductos();
void ingresarProductos();
void modificarProductos();

void factDefecto();
void mostrarFacturar();
void crearFacturas();

void facturaDeCliente();
void facturasPagasONoPagas();

// Estructuras
struct cliente {
	int id;
	float cedula;
	char nombre[30];
	char direccion[30];
	float telefono;

};
struct productos{
	int id;
	char nombre[30];
	float valor;
};
struct factura{
	int id;
	char cliente[30];
	char producto[30];
	int cantidad;
	float valor;
	//1 = pagado 0=Impago
	bool estado;
};
//
int cicloClientes=3;
int cicloProductos=3;
int cicloFactura=3;

struct cliente client[1000],*clientes=client;
struct productos product[1000],*productos=product;
struct factura fact[1000],*factura=fact;

int main() {
	system("color f4");
	inforDefectoClientes();
	inforDefectoProductos();
	factDefecto();
	int op;
	printf("\n\n");
	printf("\t ---------------------------------------\n");
	printf("\t -            PROYECTO CORTE 1         -\n");
	printf("\t ---------------------------------------\n");
	printf("\t - 1)   Visualizar clientes            -\n");
	printf("\t - 2)   Ingresar clientes              -\n");
	printf("\t - 3)   Modificar clientes             -\n");
	printf("\t ---------------------------------------\n");
	printf("\t - 4)   Visualizar productos           -\n");
	printf("\t - 5)   Ingresar productos             -\n");
	printf("\t - 6)   Modificar productos            -\n");
	printf("\t ---------------------------------------\n");
	printf("\t - 7)   Visualizar facturas            -\n");
	printf("\t - 8)   Crear Factura                  -\n");
	printf("\t ---------------------------------------\n");
	printf("\t - 9)   Facturas de un cliente         -\n");
	printf("\t - 10   Facturas pagas o no pagas      -\n");
	printf("\t ---------------------------------------\n");
	printf("\t - 0)   Salir                          -\n");
	printf("\t ---------------------------------------\n");

	scanf("%i",&op);
	switch (op) {
case 0:
	printf("Bye c:\n");
break;
case 1:
		system("cls");
		mostrarClientes();
		system("pause");
		system("cls");
		main();
break;

case 2:
		system("cls");
		ingresarClientes();
		system("pause");
		system("cls");
		main();
break;

case 3:

		if(cicloClientes>3){
			// printf("Conoce\n", );
			modificarClientes();
			system("cls");
		}else{
			printf("Ingrese primero clientes para modificarlos\n");
		}

		system("pause");
		system("cls");
		main();
break;

case 4:
		system("cls");
		mostrarProductos();
		system("pause");
		system("cls");
		main();
break;

case 5:
		system("cls");
		ingresarProductos();
		system("pause");
		system("cls");
		main();
break;

case 6:
		if(cicloProductos>3){
			modificarProductos();
			system("cls");
		}else{
			printf("Ingrese primero productos para modificarlos\n");
		}

		system("pause");
		system("cls");
		main();
break;

case 7:
		system("cls");
		mostrarFacturar();
		system("pause");
		system("cls");
		main();
break;

case 8:
		system("cls");
		crearFacturas();
		system("pause");
		system("cls");
		main();
break;

case 9:
		system("cls");
		facturaDeCliente();
		system("pause");
		system("cls");
		main();
break;

case 10:
		system("cls");
		facturasPagasONoPagas();
		system("pause");
		system("cls");
		main();
break;

default:
		printf("Opcion desconocida\n");
		system("pause");
		system("cls");
		main();
	}

	return 0;
}


void facturasPagasONoPagas() {
	int op=0,i=0;
	printf("Que deseas ver? Facturas pagadas->1  Facturas no pagadas->2\n");
	scanf("%i",&op);

	switch (op) {
		case 1:
			for ( i = 0; i < cicloFactura; i++) {
				if( (factura+i)->estado==1 ){
					printf("Id factura: %i \n",(factura+i)->id);
					printf("Cantidad %i \n",(factura+i)->cantidad);
					printf("Valor producto %.1f \n",(factura+i)->valor);
					printf("Nombre del cliente %s \n",(factura+i)->cliente);
					printf("Nombre del producto %s \n",(factura+i)->producto);
					printf("Estado factura %d \n",(factura+i)->estado);
					printf("\n\n");
				}
			}
		break;
		case 2:
		for ( i = 0; i < cicloFactura; i++) {
			if( (factura+i)->estado==0 ){
				printf("Id factura: %i \n",(factura+i)->id);
				printf("Cantidad %i \n",(factura+i)->cantidad);
				printf("Valor producto %.1f \n",(factura+i)->valor);
				printf("Nombre del cliente %s \n",(factura+i)->cliente);
				printf("Nombre del producto %s \n",(factura+i)->producto);
				printf("Estado factura %d \n",(factura+i)->estado);
				printf("\n\n");
			}
		}
		break;
	}
}
void facturaDeCliente() {
	int idClienteBusquedaFacturas,i=0,largoChar=0,op=0;
	char nombreClienteBusquedaFacturas[30];

	system("cls");
	printf("Conoce el ID del Cliente? 1)Si 2)No\n");
	scanf("%i",&op);
	if (op==2) {
		mostrarClientes();
	}
	system("pause");
	system("cls");

	printf("Ingrese el ID del cliente para consultar sus facturas\n");
	scanf("%i",&idClienteBusquedaFacturas);
	for ( i = 0; i < cicloClientes; i++) {
		if(	idClienteBusquedaFacturas == (clientes+i)->id){
			strcpy(nombreClienteBusquedaFacturas,(clientes+i)->nombre);
		}
	}

	printf("\n\n");
	for ( i = 0; i < cicloFactura; i++) {
		if( strncmp(nombreClienteBusquedaFacturas,(factura+i)->cliente,30) == 0 ){
			printf("Id factura: %i \n",(factura+i)->id);
			printf("Nombre del cliente: %s \n",(factura+i)->cliente);
			printf("Cantidad %i \n",(factura+i)->cantidad);
			printf("Valor producto %.1f \n",(factura+i)->valor);
			printf("Nombre del producto: %s \n",(factura+i)->producto);
			printf("Estado factura %d \n",(factura+i)->estado);
			printf("\n\n");
		}
	}
}

void crearFacturas(){
	int clienteEstado=0,cantidadFacturas=0,cantidadProductosCompra=0,i=0,j=0,k=0,queProducto=0,x,op=0;
	float id=0;
	printf("Esta el cliente registrado? 1) si 2) no\n");
	scanf("%i",&clienteEstado);
	if (clienteEstado==2) {
			printf("Desea registrarlo? 1) si 2) no\n" );
			scanf("%i",&op);
				if (op==1) {
					ingresarClientes();
					clienteEstado=1;
				}
	}
	system("cls");
	printf("\n\n");
	printf("Cuantas facturas va a ingresar?\n");
	scanf("%i",&cantidadFacturas);
	//guarda la cantidad anterior de...facturas
	x=cicloFactura;
	switch (clienteEstado) {
		case 1:
		printf("*************************************************\n\n");
				for(i=cicloFactura;i<cantidadFacturas+x;i++){
					printf("Ingrese el C.C. del cliente\n" );
					scanf("%f",&id);
					(factura+i)->id=cicloFactura;
					for ( k = 0; k < cicloClientes; k++) {
						if(id== (clientes+k)->cedula){
							j=k;
						}
					}
					strcpy((factura+i)->cliente,(clientes+j)->nombre);

					printf("Ingrese el id del producto que compra %s\n",(factura+i)->cliente);
					scanf("%i",&queProducto);
					strcpy((factura+i)->producto,(productos+queProducto)->nombre);

					printf("Ingrese la cantidad de %s que va a comprar %s\n",(productos+queProducto)->nombre,(clientes+j)->nombre);
					scanf("%i",&cantidadProductosCompra);
					(factura+i)->cantidad=cantidadProductosCompra;
					(factura+i)->valor =(productos+queProducto)->valor * cantidadProductosCompra;

					printf("Ingrese el estado de la compra 1) pagado 0) no pago de %s\n",(clientes+j)->nombre);
					scanf("%i",&(factura+i)->estado);
					cicloFactura++;
					printf("\n\n");
				}
		break;

		case 2:
				printf("*************************************************\n\n");
				for(i=cicloFactura;i<cantidadFacturas+x;i++){
					(factura+i)->id=cicloFactura;

					printf("Ingrese el nombre del cliente\n");
					scanf("%s",&(factura+i)->cliente);

					printf("Ingrese el id del producto que compra %s\n",(factura+i)->cliente);
					scanf("%i",&queProducto);
					strcpy((factura+i)->producto,(productos+queProducto)->nombre);

					printf("Ingrese la cantidad de %s que va a comprar %s\n",(factura+i)->producto,(factura+i)->cliente);
					scanf("%i",&cantidadProductosCompra);
					(factura+i)->cantidad=cantidadProductosCompra;
					(factura+i)->valor =(productos+queProducto)->valor * cantidadProductosCompra;

					printf("Ingrese el estado de la compra 1) pagado 0) no pago de %s\n",(factura+i)->cliente);
					scanf("%i",&(factura+i)->estado);
					printf("\n\n");
					cicloFactura++;
				}
		break;
	}
}
void mostrarFacturar(){
	int i;
	for(i=0;i<cicloFactura;i++){
		printf("Id factura: %i \n",(factura+i)->id);
		printf("Cantidad %i \n",(factura+i)->cantidad);
		printf("Valor producto %.1f \n",(factura+i)->valor);
		printf("Nombre del cliente %s \n",(factura+i)->cliente);
		printf("Nombre del producto %s \n",(factura+i)->producto);
		printf("Estado factura %d \n",(factura+i)->estado);
		printf("\n\n");
	}
}
void factDefecto(){
	(factura+0)->id=0;
	(factura+0)->cantidad=10;
	(factura+0)->valor= ((factura+0)->cantidad)*((productos+0)->valor);
	strcpy((factura+0)->cliente,(clientes+0)->nombre);
	strcpy((factura+0)->producto,(productos+0)->nombre);
	(factura+0)->estado=1;

	(factura+1)->id=1;
	(factura+1)->cantidad=5;
	(factura+1)->valor= ((factura+1)->cantidad)*((productos+1)->valor);
	strcpy((factura+1)->cliente,(clientes+1)->nombre);
	strcpy((factura+1)->producto,(productos+1)->nombre);
	(factura+1)->estado=0;

	(factura+2)->id=2;
	(factura+2)->cantidad=1;
	(factura+2)->valor= ((factura+2)->cantidad)*((productos+2)->valor);
	strcpy((factura+2)->cliente,(clientes+2)->nombre);
	strcpy((factura+2)->producto,(productos+2)->nombre);
	(factura+2)->estado=0;
}

void modificarProductos() {
	int id,op;
	system("cls");
	printf("Conoce el ID del producto? 1)Si 2)No\n");
	scanf("%i",&op);
	if (op==2) {
		mostrarProductos();
	}
	system("pause");
	system("cls");
	op=0;
	printf("Que producto ingresado (ID) deseas modificar?\n");
	scanf("%i",&id);

	printf("Que desea modificar: \n 1)Nombre\n 2)Valor\n 3)Todo\n");
	scanf("%i",&op);
	switch (op) {
		case 1:
		printf("Ingrese el nombre del del producto\n");
		scanf("%s",&(productos+id)->nombre);
		break;

		case 2:
		printf("Ingrese el valor del del producto\n");
		scanf("%f",&(productos+id)->valor);
		break;

		case 3:
			printf("\n\n");
			printf("Ingrese el valor del del producto\n");
			scanf("%f",&(productos+id)->valor);

			printf("Ingrese el nombre del del producto\n");
			scanf("%s",&(productos+id)->nombre);
			printf("\n\n");
		break;
	}

}
void ingresarProductos(){
	int i,n=0,x;
	printf("Cuantos productos va a Ingresar?\n");
	scanf("%i",&n);
	//guarda la cantidad anterior de... productos
	x=cicloProductos;
	printf("\n\n");
	for(i=cicloProductos;i<x+n;i++){
		(productos+i)->id=cicloProductos;
		printf("Ingrese el valor del producto\n");
		scanf("%f",&(productos+i)->valor);
		printf("Ingrese el nombre del producto\n");
		scanf("%s",&(productos+i)->nombre);
		printf("\n\n");
		cicloProductos++;
	}
}
void mostrarProductos(){
	int i;
	for(i=0;i<cicloProductos;i++){
		printf("Id producto: %i \n",(productos+i)->id);
		printf("Valor producto %.1f \n",(productos+i)->valor);
		printf("Nombre producto %s \n",(productos+i)->nombre);
		printf("\n\n");
	}
}
void inforDefectoProductos(){
	(productos+0)->id= 0;
	(productos+0)->valor=1000 ;
	strcpy((productos+0)->nombre,"papas");

	(productos+1)->id= 1;
	(productos+1)->valor=2000 ;
	strcpy((productos+1)->nombre,"bombones");

	(productos+2)->id= 2;
	(productos+2)->valor=3000 ;
	strcpy((productos+2)->nombre,"Churros");
}

void modificarClientes(){
	// no cuenta los que creador por mi
	int id,op;
	system("cls");
	printf("Conoce el ID del cliente? 1)Si 2)No\n");
	scanf("%i",&op);
	if (op==2) {
		mostrarClientes();
	}
	system("pause");
	system("cls");
	printf("Que cliente ingresado (id) deseas modificar?\n");
	scanf("%i",&id);
	op=0;
	printf("Que desea modificar?\n 1)Cedula \n 2)Nombre\n 3)Direccion\n 4)Telefono \n 5)Todo\n" );
	scanf("%i",&op);
	printf("\n\n");

	switch (op) {
		case 1:
		printf("Ingrese la cedula del cliente\n");
		scanf("%f",&(clientes+id)->cedula);
		break;

		case 2:
		printf("Ingrese el nombre del cliente\n");
		scanf("%s",&(clientes+id)->nombre);
		break;

		case 3:
		printf("Ingrese la direccion del cliente\n");
		scanf("%s",&(clientes+id)->direccion);
		break;

		case 4:
		printf("Ingrese el telefono del cliente\n");
		scanf("%f",&(clientes+id)->telefono);
		break;

		case 5:
		printf("Ingrese la cedula del cliente\n");
		scanf("%f",&(clientes+id)->cedula);
		printf("Ingrese el nombre del cliente\n");
		scanf("%s",&(clientes+id)->nombre);
		printf("Ingrese la direccion del cliente\n");
		scanf("%s",&(clientes+id)->direccion);
		printf("Ingrese el telefono del cliente\n");
		scanf("%f",&(clientes+id)->telefono);
		printf("\n\n");
		break;
	}


}
void ingresarClientes(){
	int i,n=0,x;
	printf("Cuantos clientes va a Ingresar?\n");
	scanf("%i",&n);
	//guarda la cantidad anterior de... clientes
	x=cicloClientes;
	printf("\n\n");
	for(i=cicloClientes;i<x+n;i++){
		(clientes+i)->id=cicloClientes;
		printf("Ingrese la cedula del cliente\n");
		scanf("%f",&(clientes+i)->cedula);
		printf("Ingrese el nombre del cliente\n");
		scanf("%s",&(clientes+i)->nombre);
		printf("Ingrese la direccion del cliente\n");
		scanf("%s",&(clientes+i)->direccion);
		printf("Ingrese el telefono del cliente\n");
		scanf("%f",&(clientes+i)->telefono);
		printf("\n\n");
		cicloClientes++;
	}
}
void mostrarClientes(){
	int i;
	for(i=0;i<cicloClientes;i++){
		printf("Id cliente: %i \n",(clientes+i)->id);
		printf("Cedula Cliente %.1f \n",(clientes+i)->cedula);
		printf("Nombre cliente %s \n",(clientes+i)->nombre);
		printf("Direccion cliente %s\n",(clientes+i)->direccion);
		printf("telefono cliente %.1f\n",(clientes+i)->telefono);
		printf("\n\n");
	}
}
void inforDefectoClientes(){
	(clientes+0)->id= 0;
	(clientes+0)->cedula=111 ;
	strcpy((clientes+0)->nombre,"uno");
	strcpy((clientes+0)->direccion,"crr uno");
	(clientes+0)->telefono= 11111;

	(clientes+1)->id= 1;
	(clientes+1)->cedula= 222;
	strcpy((clientes+1)->nombre,"dos");
	strcpy((clientes+1)->direccion,"crr dos");
	(clientes+1)->telefono= 22222;

	(clientes+2)->id=  2;
	(clientes+2)->cedula= 333;
	strcpy((clientes+2)->nombre,"tres");
	strcpy((clientes+2)->direccion, "crr tres");
	(clientes+2)->telefono= 33333;

}


























//Code with good vibes Cristian Mar�n
