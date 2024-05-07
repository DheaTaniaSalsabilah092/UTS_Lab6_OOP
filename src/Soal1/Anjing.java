package Soal1;

class Anjing extends Pet {
    // Variabel instance tambahan untuk subclass Anjing
    private String breed;

    // Constructor dengan parameter untuk subclass Anjing
    public Anjing(String name, int age, double weight, String breed) {
        // Memanggil constructor superclass menggunakan keyword super
        super(name, age, weight);
        this.breed = breed;
    }

    // Method Overriding untuk menampilkan informasi spesifik anjing
    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil method dari superclass
        System.out.println("Breed: " + breed);
    }
}