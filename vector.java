
package analisis;

public class vector {

    public static int sumPair(int[] v) {
        int n = v.length; 
        int result = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n; j++) {
                if (((v[i] + v[j]) % 2) == 1) { 
                    result = result + 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
       
        int[] array = {1, 2, 3, 4};

      
        long tiempoInicial = System.nanoTime();

       
        int resultado = sumPair(array);

       
        long tiempoFinal = System.nanoTime();

        
        long tiempoEjecucion = tiempoFinal - tiempoInicial;

  
        System.out.println("Tiempo de ejecución en nanosegundos: " + tiempoEjecucion);

       
        double tiempoEjecucionMs = tiempoEjecucion / 1_000_000.0;
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempoEjecucionMs);

        
        System.out.println("El número de pares con suma impar es: " + resultado);
    }
}

       

               
    
        
    
