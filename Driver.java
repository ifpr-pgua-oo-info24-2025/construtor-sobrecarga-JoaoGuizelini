public class Driver{
    private String name;
    private int cnh;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCnh() {
        return cnh;
    }
    public void setCnh(int cnh) {
        this.cnh = cnh;
    }
    public Driver(String name,int cnh){
        this.cnh = cnh;
        this.name = name;
    }
}