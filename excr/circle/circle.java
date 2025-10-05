
public class Circle {
    // ku buat private smua
    private double radius;              // Jari-jari lingkaran
    private static final double PI = 3.14159265359;  // Konstanta PI
    
    // constructor 
    public Circle() {
        this.radius = 8.0;
    }
    
    public Circle(double radius) {
        this.setRadius(radius);  //  setter untuk validasi
    }
    
    public double getRadius() {
        return this.radius;
    }
    
   // tidak digunakan(karena inputn cuma radius)
    public double getDiameter() {
        return 2 * this.radius;
    }
    
   // getter PI
    public static double getPI() {
        return PI;
    }
    
    // SETTER METHODS 
    public void setRadius(double radius) {
        // check 
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius harus lebih besar dari 0!");
        }
    }
    
    public void setDiameter(double diameter) {
        if (diameter > 0) {
            this.radius = diameter / 2.0;
        } else {
            System.out.println("Diameter harus lebih besar dari 0!");
        }
    }
    
    // hitung Method 
    
    /*
     * Menghitung keliling lingkaran
     * Rumus: K = 2 * π * r
     * @return keliling lingkaran
     */
    public double hitungKeliling() {
        return 2 * PI * this.radius;
    }
    
    /*
     * Menghitung luas lingkaran
     * Rumus: L = π * r²
     * @return luas lingkaran
     */
    public double hitungLuas() {
        return PI * this.radius * this.radius;
    }    
    
    // method untuk nampilin dalam console nya , kalau ga pake GUi
    public void display(){
        System.out.printf("Radius\t: %.2f\n", this.radius);
        System.out.printf("Luas\t: %.2f\n" , this.hitungLuas());
        System.out.printf("Keliling: %.2f" , this.hitungKeliling());
    }
  
    
    public static void main(String[] args) {
        
       Circle lingkaran1 = new Circle();
       
       lingkaran1.setRadius(12.0);
       lingkaran1.display();
       
       //System.out.println("Luas Lingkaran : " + lingkaran1.hitungLuas());
       
       //System.out.println("Keliling Lingkaran: " + lingkaran1.hitungKeliling());
       
       GUILingkaran pf = new GUILingkaran();
       pf.setVisible(true);
        
    }
}

