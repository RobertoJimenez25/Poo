package Tarea8.MaquinaCafe;

public class MaquinaCafe {
        private int agua;

        private int cafe;

        private int crema;

        private int vasos;
        private int Americano;
        private int Expreso;
        private int Capuchino;


        public MaquinaCafe() {
            this.agua = 5000;
            this.cafe = 1000;
            this.crema = 1500;
            this.vasos = 50;
            this.Americano = 0;
            this.Expreso = 0;
            this.Capuchino = 0;
        }

    public MaquinaCafe(int agua, int cafe, int crema, int vasos, int americano, int expreso, int capuchino) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
        Americano = americano;
        Expreso = expreso;
        Capuchino = capuchino;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    @Override
    public String toString() {
        return "MaquinaCafe{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                ", Americano=" + Americano +
                ", Expreso=" + Expreso +
                ", Capuchino=" + Capuchino +
                '}';
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    public int getAmericano() {
        return Americano;
    }

    public void setAmericano(int americano) {
        Americano = americano;
    }

    public int getExpreso() {
        return Expreso;
    }

    public void setExpreso(int expreso) {
        Expreso = expreso;
    }

    public int getCapuchino() {
        return Capuchino;
    }

    public void setCapuchino(int capuchino) {
        Capuchino = capuchino;
    }

    public void Americano() {
        if (this.agua >= 180 && this.cafe >= 15 && this.vasos >= 1) {
            this.agua -= 180;
            this.cafe -= 15;
            this.vasos--;
            Americano++;
            System.out.println("Americano Preparado");
        } else {
            System.out.println("No hay los ingredientes suficientes para preparar un café Americano ");
        }
    }

        public void Expreso() {
            if (this.agua >= 120 && this.cafe >= 20 && this.vasos >= 1) {
                this.agua -= 120;
                this.cafe -= 20;
                this.vasos--;
                Expreso++;
                System.out.println("Expresso Preparado");
            } else {
                System.out.println("No hay los ingredientes suficientes para preparar un café Expresso");
            }
        }


    public void Capuchino() {
        if (this.agua >= 100 && this.cafe >= 14 && this.crema >= 70 && this.vasos >= 1) {
            this.agua -= 100;
            this.cafe -= 14;
            this.crema -= 70;
            this.vasos--;
            Capuchino++;
            System.out.println("Capuchino Preparado ");
        } else {
            System.out.println("No hay los ingredientes suficientes para preparar un café Capucchino");
        }
    }

        public void MostrarInventario() {
            System.out.println("\nEn esta maquina quedan: ");
            System.out.println("Quedan " + this.agua + " ml de agua");
            System.out.println("Quedan " + this.cafe + " g de cafe");
            System.out.println("Quedan " + this.crema + " ml de crema");
            System.out.println("Quedan " + this.vasos + " vasos");
        }
    public void TotalCafes() {
        System.out.println("\nEn total se sirvieron: ");
        System.out.println(Americano + " Americanos");
        System.out.println(Expreso + " Expresos ");
        System.out.println(Capuchino + " Capuchinos");
    }
}
