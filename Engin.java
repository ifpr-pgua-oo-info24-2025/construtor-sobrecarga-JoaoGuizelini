public class Engin {

    private String tipo;
    private Integer potencia;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Integer getPotencia() {
        return potencia;
    }
    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }
    public Engin (String tipo,Integer potencia){
        this.potencia = potencia;
        this.tipo = tipo;
    }
}
