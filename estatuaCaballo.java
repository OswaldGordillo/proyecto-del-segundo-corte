public class estatuaCaballo extends estatua {
    boolean exterior = true;
    String tipo = "";
    float peso = 0.0f;
    int antiguedad = 0;
    //años de antiguedad
    public estatuaCaballo(){
        super(1990, false, 1.5, "bronce");
    }
    public estatuaCaballo (String tipo, boolean exterior){
        super(1975, false, 23.5, "bronce");
        this.tipo = tipo;
        this.exterior = exterior;
    }
    public estatuaCaballo (float peso, int antiguedad, String tipo){
        super(1952, false, 12.6, "marmol");
        this.peso = peso;
        this.antiguedad = antiguedad;
        this.tipo = tipo;
    }
    public estatuaCaballo (boolean exterior, int antiguedad, String tipo, float peso){
        super(2024, true, 5.6, "madera");
        this.exterior = exterior;
        this.antiguedad = antiguedad;
        this.tipo = tipo;
        this.peso = peso;
    }
    @Override
    public String toString() {
        return "estatua de caballo ( tipo: " + tipo + ", peso: " + peso 
        + ", años de antiguedad" + antiguedad + ", ¿se encuentra en el exterior?: " + exterior
        + ", año de creacion: " + getAnioCreacion() + ", ¿en venta?: " + getVenta()
        + ", altura: " + getAltura() + ", material: " + getMaterial();
    }
}