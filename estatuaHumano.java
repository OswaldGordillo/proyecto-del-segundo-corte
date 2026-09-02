public class estatuaHumano extends estatua {
    String creador = "";
    boolean base = true;
    int copias = 0;
    double volumen = 0.0;

    public estatuaHumano(){
        super(2002, false, 3.2, "madera");
    }
    public estatuaHumano(String creador, boolean base){
        super(2023, false, 2.5, "madera");
        this.creador = creador;
        this.base = base;
    }
    public estatuaHumano(int copias, String creador, double volumen){
        super(2005, true, 6.5, "jade");
        this.copias = copias;
        this.creador = creador;
        this.volumen = volumen;
    }
    public estatuaHumano(double volumen, boolean base, int copias, String creador){
        super(1998, true, 3.3, "granito");
        this.volumen = volumen; 
        this.base = base;
        this.copias = copias;
        this.creador = creador;
    }
    public String toString(){
        return "estatua de humano ( creador: " + creador + ", tiene base?: " + base 
        + ", cantidad de copias" + copias + ", volumen que ocupa: " + volumen
        + ", año de creacion: " + getAnioCreacion() + ", ¿en venta?: " + getVenta()
        + ", altura: " + getAltura() + ", material: " + getMaterial();
    }
}