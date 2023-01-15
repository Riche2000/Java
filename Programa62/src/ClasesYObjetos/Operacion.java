package ClasesYObjetos;

public class Operacion {
    // POO - Métodos - Retorno de valores
    
    //Cuando las variables esnta fuera de un metodo se les conoce como variables globales y cuando estan dentro de un metodo se les conoce como variables locales
    //Atributos 
    
    //Métodos
    
    //Método para sumar 2 números
//Le asignamos el terorno int, Parametros, 2 variables locales
    public int sumar(int numero1,int numero2){
        //Usamos la vzariable local suma
        int suma = numero1+numero2;
        //Nos reotrna el valor de suma
        return suma;
    }
    //Método para restar dos números
    //Nos retorna un int   Parametros
    public int restar(int numero1,int numero2){
        int resta = numero1-numero2;
        //Nos retorna el valor de resta
        return resta;
    }
    //Método para multiplicar dos números
                                //Parametros
    public int multiplicar(int numero1,int numero2){
        int multiplicacion = numero1*numero2;
        return multiplicacion;
    }
    //Método para dividir dos números
                            //Parametros
    public int dividir(int numero1,int numero2){
        int division = numero1/numero2;
        return division;
    }
    //Método para mostrar los resultados
                                                   //Parametros como variables locales 
    public void mostrarResultados(int suma, int resta, int multiplicacion, int division){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multipliacaion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}
