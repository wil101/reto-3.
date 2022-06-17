
package co.edu.udea.concesionario;

/**
 *
 * @author wilmar.osorio1
 */
public class Vendedor {
    private String nombre, apellido, descripcion;
    private int numeroDeDocumento, edad, totalVendido, anioDeIngreso = 0;

    public Vendedor(String nombre, String apellido, String descripcion, 
            int numeroDeDocumento, int edad, int totalVendido, int anioDeIngreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.numeroDeDocumento = numeroDeDocumento;
        this.edad = edad;
        this.totalVendido = totalVendido;
        this.anioDeIngreso = anioDeIngreso;
    }
   
    public String calcularProductividad(){
        if(totalVendido == 0){
            return "Novato";
        }else if(totalVendido > 0 && totalVendido <= 500000000){
            return "Principiante";
        }else if(totalVendido > 500000000 && totalVendido <= 2000000000){
            return "Intermedio";
        }else if(totalVendido > 2000000000){
            return "Avanzado";
        }else{
            return null;
        }
    }
   
    public boolean verificarAno(){
        return anioDeIngreso != 0;
    }
   
    public String definirVendedor(){
        String cal;
        int a, b, c, anios;
        while(verificarAno()){
            cal = calcularProductividad();
            if(null == cal){
                a = 0;
            }else switch (cal) {
                case "Novato":
                    a = 1;
                    break;
                case "Principiante":
                    a = 2;
                    break;
                case "Intermedio":
                    a = 3;
                    break;
                case "Avanzado":
                    a = 4;
                    break;
                default:
                    a = 0;
                    break;
            }
            anios = 2022 - anioDeIngreso;
            if(anios >= 0 && anios < 2){
                b = 4;
            }else if(anios >= 2 && anios < 5){
                b = 3;
            }else if(anios >= 5 && anios < 10){
                b = 2;
            }else if(anios >= 10){
                b = 1;
            }else{
                b = 0;
            }
            c = a*b;
            if(c > 0 && c <= 4){
                return "Malo";
            }else if(c > 4 && c <= 8){
                return "Regular";
            }else if(c > 8 && c <= 12){
                return "Bueno";
            }else if(c > 12 && c <= 16){
                return "Excelente";
            }else{
                return null;
            }
           
        }
        return null;
    }
}
