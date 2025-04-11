public class Car {
    private String marca;
    private String modelo;
    private int placa;
    private Engin motor ;
    private Driver dirigidor;

    public Car(String marca, String modelo, int placa, Engin motor, Driver dirigidor) {
        this.dirigidor = dirigidor;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
    }
    public Car(String marca, String modelo, int placa, Engin motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
    }
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
    public int getPlaca() {
        return placa;
    }
    public void setPlaca(int placa) {
        this.placa = placa;
    }
    public Engin getMotor() {
        return motor;
    }
    public void setMotor(Engin motor) {
        this.motor = motor;
    }
    public Driver getDirigidor() {
        return dirigidor;
    }
    public void setDirigidor(Driver dirigidor) {
        this.dirigidor = dirigidor;
    }

    public String toString() {
        return "Car [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", motor=" + motor + ", dirigidor="
                + dirigidor + "]";
    }
    
}