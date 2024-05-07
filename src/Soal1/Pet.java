package Soal1;

class Pet {

    private String name;
    private int age;
    private double weight; // Berat badan dalam kilogram

    // Constructor
    public Pet(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Method untuk menampilkan informasi pet
    public void displayInfo() {
        System.out.println("Pet Name: " + name);
        System.out.println("Pet Age: " + age + " years old");
        System.out.println("Weight: " + weight + " kg");
    }


    // Method untuk menampilkan informasi pet dengan jenis makanan dan jumlah makanan (method overloading)
    public void displayInfo(String food, double foodAmount) {
        displayInfo(); // Memanggil method displayInfo() tanpa parameter
        System.out.println("Favorite Food: " + food);
//        displayInfo(food); // Memanggil method displayInfo() dengan satu parameter
        System.out.println("Food Amount: " + foodAmount + " grams");
    }

    // Method untuk menghitung berat badan setelah makan
    public void eatFood(double foodWeight) {
        weight += foodWeight * 0.01; // Dianggap bahwa setiap 100 gram makanan menambah 1% dari berat badan
    }

    // Method setter untuk mengatur nilai variabel instance
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method getter untuk mengambil nilai variabel instance
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}

