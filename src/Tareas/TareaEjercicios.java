public class TareaEjercicios {
    public static void main(String[] args){
        /*1.3.1.1*/
        String s ="Hola";
        int x = s.length(); //retorna: 4
        System.out.println(s.length());

        /*1.3.1.2*/
        String s1 = "Hola";
        boolean b1 = s1.isEmpty(); //retorna false
        String s2 = "";
        boolean b2 = s2.isEmpty(); //retorna true
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());

        /*1.3.1.3*/
        String t = "Hola";
        for(int i=0; i<t.length(); i++) {
            char c = t.charAt(i);
            System.out.println(c); //Salida: H o l a
        }

        /*1.3.1.4*/
        String x2 = "Hola";
        String y = "Hola";
        x2.equals(y);//Compara sus contenidos, retorna true
        System.out.println(x2.equals(y));
        {
            System.out.println("Si pasa por aqui !");
        }

        /*1.3.1.5*/
        String s3 = "Hola, como estas?";
        int p1 = s3.indexOf('a');              //retorna: 3
        int p2 = s3.lastIndexOf('a');      //retorna: 14
        System.out.println(s3.indexOf('a'));
        System.out.println(s3.lastIndexOf('a'));

        /*1.3.1.6*/
        String s4 = "Hola, como estas?,Estas como querias?";
        int p3 = s4.indexOf("como");         //retorna: 6
        int p4 = s4.indexOf("estas");        //retorna: 11
        int p5 = s4.lastIndexOf("como"); // retorna: 24
        System.out.println(s4.indexOf("como"));
        System.out.println(s4.indexOf("estas"));
        System.out.println(s4.lastIndexOf("como"));

        /*1.3.1.7*/
        String s5 ="Hola, como estas?";
        String may = s5.toUpperCase(); //retorna: HOLA, COMO ESTAS?
        String min = s5.toLowerCase(); //retorna: hola, como estas?
        System.out.println(s5.toUpperCase());
        System.out.println(s5.toLowerCase());

        /*1.3.1.8*/
        String r = "Hola, como estas?";
        String r1 = r.substring(0,4);   //retorna: Hola
        String r2 = r.substring(6,10);  //retorna: como
        String r3 = r.substring(11); //retorna: estas?
        System.out.println(r.substring(0,4));
        System.out.println(r.substring(6,10));
        System.out.println(r.substring(11));


        /*1.3.1.9*/
        //enteros
        String s6 = "1234";
        int i = Integer.parseInt(s6);      //retorna: 1234
        String t1 = Integer.toString(i);   //retorna: "1234"
        System.out.println(Integer.parseInt(s6));
        System.out.println(Integer.toString(i));

        //flotantes
        String s7 = "12345.56";
        double d = Double.parseDouble(s7);  //retorna: 1234.56
        String t2 = Double.toString(d);     //retorna: "1234.56"
        System.out.println(Double.parseDouble(s7));
        System.out.println(Double.toString(d));


        /*1.3.1.10*/
        String s8 = "Hola, ";
        String e ="que tal?";
        String u = s8+e; //retornar: ""Hola, que tal?"
        System.out.println(u);


        /*1.3.2*/
        String w = "Hola";
        w = "chau";
        System.out.println(w); //Salida : chau

        String v = "Hola";
        v+= ", chau";  //concatenamos?
        System.out.println(w);  //SALIDA: Hola, chau


        /*1.3.3.1*/
        StringBuilder sb = new StringBuilder();
        sb.append("Hola, ");
        sb.append("chau");
        System.out.println(sb);  //SALIDA


        /*1.3.3.2*/
        StringBuilder sd = new StringBuilder("Hola");
        sd.setCharAt(2, 'X');
        System.out.println(sd);   //SALIDA: HoXa

    }
}
