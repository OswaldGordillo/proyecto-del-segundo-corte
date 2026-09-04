public class main{
    public static void main(String[] args) {
        /*se uso un constructor de 2 parametros ya que se busca saber su año de creacion y si esta la venta
        para determinar si un museo la puede comprar y añadir a su coleccion*/
        estatua estatua1 = new estatua(1992, false);
        estatua1.setMaterial("hierro");
        estatua1.setAltura(5.4);
        /*se utilizo un cosntructor de 3 parametros para examinar si vale la pena comprar la estatua
        analizandola por material y altura.*/
        estatua estatua2 = new estatua(2.3, "vidrio", true);
        estatua2.setAnioCreacion(2020);
        /*se uso un constructor de 2 parametros para examinar el tipo de estatua y que tan facil puede ser transportada
        teniendo en cuenta si esta o no en el exterior.*/
        estatuaCaballo estatua3 = new estatuaCaballo("equina", true);
        estatua3.setAltura(3.3);
        estatua3.setAnioCreacion(1994);
        estatua3.setMaterial("bronce");
        estatua3.setVenta(false);
        estatua3.peso = 30;
        estatua3.antiguedad = 32;
        /*se uso un constructor de 3 parametros para examinar el tiempo de antiguedad y que funcion cumplia la estatua
        con base el tipo, esto para analizar su valor historico y tener en cuenta su peso para transporte.*/
        estatuaCaballo estatua4 = new estatuaCaballo(45, 258, "ecuestre");
        estatua4.setAltura(5.5);
        estatua4.setAnioCreacion(1768);
        estatua4.setMaterial("hierro con piezas de plata y oro");
        estatua4.setVenta(false);
        estatua4.exterior = true;
        /*se uso un constructor de 4 parametros para calcular el posible precio de la estatua teniendo en cuneta
        cuantas copias tiene, si tiene una base, etc.*/
        estatuaHumano estatua5 = new estatuaHumano(43, true, 2, "tomas stallin");
        estatua5.setAltura(0.32);
        estatua5.setAnioCreacion(1892);
        estatua5.setMaterial("plata");
        estatua5.setVenta(true);
        /*se uso un constructor de 3 parametros para verificar que la estatua sea realmente del artista
        carlos kant*/
        estatuaHumano estatua6 = new estatuaHumano(1, "carlos kant", 22);
        estatua6.setAltura(2.1);
        estatua6.setAnioCreacion(1994);
        estatua6.setMaterial("yeso");
        estatua6.setVenta(false);
        estatua6.base = false;
        /*se uso un constructor de 2 parametros para mantener control del inventario de estatuas 7 y cuanto cuesta mantenerlas
        individualmente*/
       estatuaObjeto estatua7 = new estatuaObjeto(1843, 253.234);
       estatua7.setAltura(1.4);
       estatua7.setAnioCreacion(1987);
       estatua7.setMaterial("ceramica");
       estatua7.setVenta(true);
       estatua7.objetoRepresentado = "manzana";
       estatua7.restaurado = false;
       /*se uso un constructor de 3 parametros para mantener control de calidad de estatuas especificos*/
       estatuaObjeto estatua8 = new estatuaObjeto(false, 1784, null, 0);
       estatua8.setAltura(2.9);
       estatua8.setAnioCreacion(2020);
       estatua8.setMaterial("marmol");
       estatua8.setVenta(true);

       System.out.println("======= PRUEBA DE OBJETOS =======");

       System.out.println("estatua 1:  " + estatua1);
       System.out.println("estatua 2:  " + estatua2);
       System.out.println("estatua 3:  " + estatua3);
       System.out.println("estatua 4:  " + estatua4);
       System.out.println("estatua 5:  " + estatua5);
       System.out.println("estatua 6:  " + estatua6);
       System.out.println("estatua 7:  " + estatua7);
       System.out.println("estatua 8:  " + estatua8);

    }
}