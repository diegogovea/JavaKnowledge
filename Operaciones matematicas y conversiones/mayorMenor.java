
package mayormenor;

public class MayorMenor {
    public static void main(String[] args) {
        //Declaración
        int a = 10, b = 20;
        
        int mayor = Math.max(a, b);
        int menor = Math.min(a, b);
        
        //Mostrar resultados
        System.out.println("Numero 1: "+ a);
        System.out.println("Numero 2: "+ b);
        
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
    }
}
