public class estatuaObjeto extends estatua {
    long codigoInventario = 0;
    String objetoRepresentado = "";
    boolean restaurado = false;
    double precioMantenimiento = 0.0;

    public estatuaObjeto(){
        super(2025, true, 1.1, "madera");
    }
    public estatuaObjeto(long codigoInventario, double precioMantenimiento){
        super(2005, false, 7.2, "arcilla");
        this.codigoInventario = codigoInventario;
        this.precioMantenimiento = precioMantenimiento;
    }
    public estatuaObjeto(String objetoRepresentado, boolean restaurado, long codigoInventario){
        super(1950, true, 2.3, "ceramica");
        this.objetoRepresentado = objetoRepresentado;
        this.restaurado = restaurado;
        this.codigoInventario = codigoInventario;
    }
    public estatuaObjeto(boolean restaurado, long codigoInventario, String objetoRepresentado, double precioMantenimiento){
        super(1996, false, 2.9, "yeso");
        this.restaurado = restaurado;
        this.codigoInventario = codigoInventario;
        this.objetoRepresentado = objetoRepresentado;
        this.precioMantenimiento = precioMantenimiento;
    }
    public String toString(){
        return "estatua sobre objeto ( codigo de objeto en el inventario: " + codigoInventario + ", objeto representado: " + objetoRepresentado 
        + ", ¿fue restaurado?" + restaurado + ", costo de mantenimiento: " + precioMantenimiento
        + ", año de creacion: " + getAnioCreacion() + ", ¿en venta?: " + getVenta()
        + ", altura: " + getAltura() + ", material: " + getMaterial();
    }
}
