package Tarea7.Clasesp2;

import java.awt.*;

public class DriversClases {
    public static void main(String[] args) {
        Pais pais1 = new Pais("Mexico","Ciudad de Mexico", 126750438, 1973000000);
        Pais pais2 = new Pais();
        pais2.setNombre("Japon");
        pais2.setCapital("Tokio");
        pais2.setPoblacion(125790000);
        pais2.setTerritorio(3779673);

        System.out.println(pais1.toString());
        System.out.println(pais2.toString());

        pais1.guerra();
        pais2.InvasiondePais();

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n/////////////////////////////////////////////////////////////////////////////////////////\n");
        Giroscopio giro1 = new Giroscopio(20.2,"Reposo", "Rotatorio");
        Giroscopio giro2 = new Giroscopio();
        giro2.setTamanioAltura(30.6);
        giro2.setEstado("Girado");
        giro2.setTipo("Rotatorio");

        System.out.println(giro1.toString());
        System.out.println(giro2.toString());

        giro1.girar();
        giro2.reposo();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n/////////////////////////////////////////////////////////////////////////////////////////\n");
        Computadora com1 = new Computadora("Escritorio", 2, "Apagada");
        Computadora com2 = new Computadora();
        com2.setTipo("Portatil");
        com2.setPerifericos(3);
        com2.setEstado("Encendida");

        System.out.println(com1.toString());
        System.out.println(com2.toString());

        com1.encender();
        com1.conectarperiferico();
        com2.apagar();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n/////////////////////////////////////////////////////////////////////////////////////////\n");
        CuboDeRubik cub1 = new CuboDeRubik("3x3", "Resuelto", "");
        CuboDeRubik cub2 = new CuboDeRubik();
        cub2.setCantidad("5x5");
        cub2.setEstado("Mezclado");
        cub2.setTipoDeMovimiento("Girar a la izquieda");

        System.out.println(cub1.toString());
        System.out.println(cub2.toString());

        cub1.mezclar();
        cub2.girarderecha();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n/////////////////////////////////////////////////////////////////////////////////////////\n");
        Libro lib1 = new Libro("El principito", "Antoine de Saint-Exupéry",109,0);
        Libro lib2 = new Libro();
        lib2.setNombre("El arte de la Guerra");
        lib2.setAutor("Sun Tzu");
        lib2.setCantPaginas(128);
        lib2.setPagina(25);

        System.out.println(lib1.toString());
        System.out.println(lib2.toString());

        lib1.abrirlibro();
        lib1.pasarPagina();
        lib2.regresarPagina();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n/////////////////////////////////////////////////////////////////////////////////////////\n");
        Balon bal1 = new Balon("Futbol", "Goma de Latex","Inflado");
        Balon bal2 = new Balon();
        bal2.setTipo("Americano");
        bal2.setMaterial("Piel de Vaca");
        bal2.setEstado("Desinflado");

        System.out.println(bal1.toString());
        System.out.println(bal2.toString());

        bal1.desinflar();
        bal2.inflar();
        bal2.ponchar();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n/////////////////////////////////////////////////////////////////////////////////////////\n");
        Lampara lam1 = new Lampara("LED","Apagada",23.2);
        Lampara lam2 = new Lampara();
        lam2.setTipo("Halogeno");
        lam2.setEstado("Encendida");
        lam2.setTamanio(30.4);

        System.out.println(lam1.toString());
        System.out.println(lam2.toString());

        lam1.encender();
        lam2.apagar();
        
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n/////////////////////////////////////////////////////////////////////////////////////////\n");
        Gato gato1 = new Gato("Pepito", "Persa",2, Color.ORANGE, "Feliz");
        Gato gato2 = new Gato();
        gato2.setNombre("Juanito");
        gato2.setRaza("Esfinge");
        gato2.setEdad(5);
        gato2.setColor(Color.BLACK);
        gato2.setAnimo("Triste");

        System.out.println(gato1.toString());
        System.out.println(gato2.toString());

        gato1.reganio();
        gato2.alimentar();
        gato2.acariciar();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
