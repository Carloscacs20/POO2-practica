public class Automovil {
    private String  marca = "Mercedes Benz"; //todo esto es el molde
    private String modelo; // estos datos solo sirve para la clase
    private String color = "Verde";
    private double cilindraje;
    private float consumo=40;
    static String tipo = "SUV"; // esto solo sirve a la clase Automovil
    // Constructores

    public Automovil(){

    }

    public Automovil(String marca){
        this.marca = marca;
    }

    public Automovil(String marca, String modelo){
        this(marca);
        this.modelo = modelo;
    }

    public Automovil(String marca, String modelo, String color){
        this(marca, modelo);
        this.color = color;
    }

    public Automovil(String marca, String color , String modelo, int cilindraje) {
        this(marca, color, modelo);
        this.cilindraje = cilindraje;
    }

    public Automovil(String marca, String color, String modelo, int cilindraje, float consumo){
        this(marca, color, modelo, cilindraje);
        this.consumo = consumo;
    }

    // Getter y los Setter gett leer y sett asignar

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    /*public void leerMarca(String marca){ el leer no necesita parametros
        this.marca = marca;  // a la propiedad marca asigna la variable marca
    }

    public void escribirMarca(String marca){ el escribir si necesita parametros
        this.marca = marca;

    }*/


    public String verDetalle(){
        String mark = "BMW";

        String dv = "La marca es "+ this.marca + "\n"+
                "El modelo es " + this.modelo + "\n"+
                "El color es " + this.color + "\n" +
                "El tipo de auto es " + Automovil.tipo + "\n" + // static solo se accede a esta clase
                "El cilindraje es " + this.cilindraje;
        return  dv;
    }
    public String acelerar(){
        return "El auto marca " + this.marca + "\tEsta acelerando"; // retorna
    }

    public String frenar(int kmph){
        return "El auto modelo " + this.modelo + "\tEsta frenando a " + kmph; // resirve y retorna
    }

    public  float capacidadTanque(int cap, float pconsumo){ // resirve

        float cm = consumo/ (cap*pconsumo);
        return cm;
    }

    public float capacidadTanque(int cap, int pconsumo ){

        float cm = consumo / (cap*(pconsumo/100));
        return cm;
    }
}
