package Soal1;

class Kucing extends Pet {
    private String color;

    // Constructor dengan parameter untuk subclass Kucing
    public Kucing(String name, int age, double weight, String color) {
        // Memanggil constructor superclass menggunakan super
        super(name, age, weight);
        this.color = color;
    }

    // Method Overriding untuk menampilkan informasi spesifik kucing
    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil method dari superclass
        System.out.println("Color: " + color);
    }
}
