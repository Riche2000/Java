package ClasesYObjetos;

public class Operacion {
    //POO Métodos - parámetros y argumentos
    //Una clase tiene Atributos y Métodos
    
    //Cuando las variables esnta fuera de un metodo se les conoce como variables globales y cuando estan dentro de un metodo se les conoce como variables locales
    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Métodos
    
    //Método para sumar 2 números
                   //Parametros, 2 variables locales
    public void sumar(int numero1,int numero2){
        //Usamos la vzariable global suma
        suma = numero1+numero2;
    }
    //Método para restar dos números
                        //Parametros
    public void restar(int numero1,int numero2){
        resta = numero1-numero2;
    }
    //Método para multiplicar dos números
                                //Parametros
    public void multiplicar(int numero1,int numero2){
        multiplicacion = numero1*numero2;
    }
    //Método para dividir dos números
                            //Parametros
    public void dividir(int numero1,int numero2){
        division = numero1/numero2; 
    }
    //Método para mostrar los resultados
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multipliacaion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}
