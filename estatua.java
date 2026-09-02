public class estatua {

    private int anioCreacion = 0;
    private boolean venta = false;
    private String material = "";
    private double altura = 0.0;
    
    public estatua (){

    }
    public estatua (int anioCreacion, boolean venta){
        this.anioCreacion = anioCreacion;
        this.venta = venta;
    }
    public estatua (double altura, String material, boolean venta){
        this.altura = altura;
        this.material = material;
        this. venta = venta;
    }
    public estatua (int anioCreacion, boolean venta, double altura, String material){
        this(1995, false);
        this.altura = altura;
        this. material = material;
    }
    public int getAnioCreacion(){
        return anioCreacion;
    }
    public void setAnioCreacion(int anioCreacion){
        this.anioCreacion = anioCreacion;
    }
    public boolean getVenta(){
        return venta;
    }
    public void setVenta(boolean venta){
        this.venta = venta;
    }
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
}