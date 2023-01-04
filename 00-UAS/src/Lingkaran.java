public class Lingkaran {
    float r;
    float diameter;

    public Lingkaran(float r, float diameter){
        this.r = r;
        this.diameter = diameter;
    }

    void display(){
        float luas = (float)(Math.PI*r*r);
        float keliling = (float)(2*3.14*r);
        System.out.println("Keliling Lingkaran " + luas);
        System.out.println("Luas Lingkaran " + keliling);
    }


    public static void main(String[] args) throws Exception {
        Lingkaran lingkaran = new Lingkaran(20, 40);
        System.out.println("Jari-Jari : " + lingkaran.r);
        System.out.println("Diameter : " + lingkaran.diameter);
        lingkaran.display();
    }
}
