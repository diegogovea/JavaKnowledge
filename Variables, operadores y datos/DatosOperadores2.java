
package datosoperadores2;

public class DatosOperadores2 {
    public static void main(String[] args) {
        //Declaración
        double precio = 199.99;
        int cantidad = 3;
        boolean hayDescuento = true;
        double total;

        //operaciones
        total = precio*cantidad;
        
        System.out.println("Total sin descuento: "+total);
        
        //Descuento
        if(hayDescuento && cantidad>2){
            total = total - (total * 0.10);
        }
        //Precio final
        System.out.println("Total CON descuento (solo si aplica): "+total);
        
    }
    
}
