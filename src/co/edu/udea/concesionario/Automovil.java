package co.edu.udea.concesionario;

public class Automovil {
    private String placa;
    private String marca;
    private int modelo;
    private int kilometraje;
    private String color;
    private int precio;
    private String descripcion;

    public Automovil(String placa, String marca, int modelo, int kilometraje, String color, int precio, String descripcion) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.color = color;
        this.precio = precio;
        this.descripcion = descripcion;
    }   
    
    public String obtenerUsoDelAutomovil(){
        String uso = "";
        if (kilometraje == 0){
            uso = "en 0 km";
        } else if (kilometraje > 0 && kilometraje <= 1000){
            uso = "nuevo";
        } else if (kilometraje > 1000 && kilometraje <= 20000){
            uso = "casi nuevo";
        } else if (kilometraje > 20000 && kilometraje <= 100000){
            uso = "usado";
        } else if (kilometraje > 100000){
            uso = "muy usado";
        }
        return "El carro está " + uso;
    }
    
    public String obtenerTipoDeModelo(){
        String modelo = "";
        if (this.modelo >= 2020 && this.modelo <= 2022){
            modelo = "último modelo";
        } else if (this.modelo >= 2018 && this.modelo < 2020){
            modelo = "nuevo";
        } else if (this.modelo >= 2016 && this.modelo < 2018){
            modelo = "intermedio";
        } else if (this.modelo < 2016){
            modelo = "antiguo";
        }
        
        return "El carro es: " + modelo;
    }
}
