import java.util.Scanner;
public class altar_virtual {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] homenajeados = new String[10];
        String[] mensajes = new String[10];
        String[] fechas = new String[10];
        String[] recuerdos = new String[10];
        String[] elementos = new String[10];
        int[] duraciones = new int[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //-------------------------------------//
        //--|menu_principal_de_altar_virtual|--//
        //-------------------------------------//
        do {
            System.out.println("menu principal de altar virtual");
            System.out.println("1) Registrar homenaje");
            System.out.println("2) Editar homenaje");
            System.out.println("3) Listar homenajes");
            System.out.println("4) Buscar homenaje");
            System.out.println("5) Eliminar homenaje");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //------------------------//
                //--|registrar_homenaje|--//
                //------------------------//
                case 1:
                    if (total >= homenajeados.length) {
                        System.out.println("No hay espacio para registrar mas homenajes.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de homenaje");
                    System.out.println("id del homenaje a registrar: " + id);
                    System.out.print("nombre del homenajeado: ");
                    homenajeados[total] = entrada.nextLine();
                    System.out.print("mensaje o dedicatoria: ");
                    mensajes[total] = entrada.nextLine();
                    System.out.print("fecha del homenaje: ");
                    fechas[total] = entrada.nextLine();
                    System.out.print("tipo de recuerdo: ");
                    recuerdos[total] = entrada.nextLine();
                    System.out.print("elemento simbolico: ");
                    elementos[total] = entrada.nextLine();
                    System.out.print("duracion del homenaje (dias): ");
                    duraciones[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("estado del homenaje: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Homenaje registrado correctamente.");
                    total++;
                    break;
                //---------------------//
                //--|editar_homenaje|--//
                //---------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen homenajes registrados.");
                        break;
                    }
                    System.out.println("Datos de los homenajes");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Homenajeado: " + homenajeados[i] + " | Mensaje: " + mensajes[i] + " | Fecha: " + fechas[i] + " | Recuerdo: " + recuerdos[i] + " | Elemento: " + elementos[i] + " | Duracion: " + duraciones[i] + " dias | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del homenaje: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("Editar el dato del homenaje");
                        System.out.print("Nuevo nombre del homenajeado: ");
                        homenajeados[posicion] = entrada.nextLine();
                        System.out.print("Nuevo mensaje o dedicatoria: ");
                        mensajes[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha del homenaje: ");
                        fechas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de recuerdo: ");
                        recuerdos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo elemento simbolico: ");
                        elementos[posicion] = entrada.nextLine();
                        System.out.print("Nueva duracion del homenaje (dias): ");
                        duraciones[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Nuevo estado del homenaje: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Homenaje actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|listar_homenajes|--//
                //----------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen homenajes registrados.");
                    } else {
                        System.out.println("Lista de homenajes");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Homenajeado: " + homenajeados[i] + " | Mensaje: " + mensajes[i] + " | Fecha: " + fechas[i] + " | Recuerdo: " + recuerdos[i] + " | Elemento: " + elementos[i] + " | Duracion: " + duraciones[i] + " dias | Estado: " + estados[i]);
                        }
                    }
                    break;
                //---------------------//
                //--|buscar_homenaje|--//
                //---------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen homenajes registrados.");
                        break;
                    }
                    System.out.println("busqueda de homenaje");
                    System.out.print("ingresa la id para buscar homenaje: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del homenaje encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Homenajeado: " + homenajeados[posicion] + " | Mensaje: " + mensajes[posicion] + " | Fecha: " + fechas[posicion] + " | Recuerdo: " + recuerdos[posicion] + " | Elemento: " + elementos[posicion] + " | Duracion: " + duraciones[posicion] + " dias | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-----------------------//
                //--|eliminar_homenaje|--//
                //-----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen homenajes registrados.");
                        break;
                    }
                    System.out.println("Datos de los homenajes");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Homenajeado: " + homenajeados[i] + " | Mensaje: " + mensajes[i] + " | Fecha: " + fechas[i] + " | Recuerdo: " + recuerdos[i] + " | Elemento: " + elementos[i] + " | Duracion: " + duraciones[i] + " dias | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del homenaje a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            homenajeados[i] = homenajeados[i + 1];
                            mensajes[i] = mensajes[i + 1];
                            fechas[i] = fechas[i + 1];
                            recuerdos[i] = recuerdos[i + 1];
                            elementos[i] = elementos[i + 1];
                            duraciones[i] = duraciones[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Homenaje eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen homenajes registrados.");
                        break;
                    }
                    int activos = 0;
                    int finalizados = 0;
                    int otrosEstados = 0;
                    int duracionTotal = 0;
                    for (int i = 0; i < total; i++) {
                        duracionTotal += duraciones[i];
                        if (estados[i].equalsIgnoreCase("Activo")) {
                            activos++;
                        } else if (estados[i].equalsIgnoreCase("Finalizado")) {
                            finalizados++;
                        } else {
                            otrosEstados++;
                        }
                    }
                    double duracionPromedio = (double) duracionTotal / total;
                    String recuerdoMayor = recuerdos[0];
                    int cantidadRecuerdoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadRecuerdo = 0;
                        for (int j = 0; j < total; j++) {
                            if (recuerdos[i].equalsIgnoreCase(recuerdos[j])) {
                                cantidadRecuerdo++;
                            }
                        }
                        if (cantidadRecuerdo > cantidadRecuerdoMayor) {
                            cantidadRecuerdoMayor = cantidadRecuerdo;
                            recuerdoMayor = recuerdos[i];
                        }
                    }
                    String elementoMayor = elementos[0];
                    int cantidadElementoMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadElemento = 0;
                        for (int j = 0; j < total; j++) {
                            if (elementos[i].equalsIgnoreCase(elementos[j])) {
                                cantidadElemento++;
                            }
                        }
                        if (cantidadElemento > cantidadElementoMayor) {
                            cantidadElementoMayor = cantidadElemento;
                            elementoMayor = elementos[i];
                        }
                    }
                    System.out.println("resumen de altar virtual");
                    System.out.println("Homenajes registrados: " + total);
                    System.out.println("Homenajes activos: " + activos);
                    System.out.println("Homenajes finalizados: " + finalizados);
                    System.out.println("Otros estados: " + otrosEstados);
                    System.out.println("Recuerdo mas utilizado: " + recuerdoMayor);
                    System.out.println("Elemento mas utilizado: " + elementoMayor);
                    System.out.println("Duracion promedio: " + duracionPromedio + " dias");
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Altar Virtual.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}