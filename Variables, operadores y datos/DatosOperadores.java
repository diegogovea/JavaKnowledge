package datosoperadores;

public class DatosOperadores {
    public static void main(String[] args) {
        //Declaración
        int edad = 25;
        double altura = 1.75;
        char inicial = 'C';
        boolean esMayorDeEdad = edad>=18;
        
        //Operaciones
        edad = edad+5;
        altura = altura*2;
        inicial = 'D';
        
        System.out.println("La edad es: "+edad);
        System.out.println("La altura es: "+altura);
        System.out.println("Inicial: "+inicial);
        System.out.println(esMayorDeEdad);
    }
    
}
