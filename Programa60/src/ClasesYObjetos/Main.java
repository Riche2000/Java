package ClasesYObjetos;

public class Main {
    //Creamos el metodo main
    public static void main(String [] args){
        //En la clase main vamos a crear un objeto de la clase Operacion
      //Clase   Objeto 
        Operacion op = new Operacion();
        //Primero leemos los números con el metodo leerNumeros
        op.leerNumeros();
        //Realizamos las operaciones con sus metodos
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        //Mostamos los resultados con el metodo mostrarResultados
        op.mostrarResultados();
    }  
}
