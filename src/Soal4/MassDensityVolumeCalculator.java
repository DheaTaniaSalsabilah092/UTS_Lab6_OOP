package Soal4;

class MassDensityVolumeCalculator {
    private double result;

    // Constructor
    public MassDensityVolumeCalculator() {
        result = 0;
    }

    // Method untuk menghitung massa jenis dari massa dan volume
    public double calculateDensity(double mass, double volume) {
        result = mass / volume;
        return result;
    }

    // Method Overloading
    public double calculateDensity(double mass, double volume, String unit) {
        if (unit.equalsIgnoreCase("gram")) {
            mass /= 1000.0; // ubah massa dari gram ke kilogram
        }
        result = mass / volume;
        return result;
    }

    // Method untuk menghitung massa benda dari massa jenis dan volume
    public double calculateMass(double density, double volume) {
        result = density * volume;
        return result;
    }

    // Method Overloading
    public double calculateMass(double density, double volume, String unit) {
        if (unit.equalsIgnoreCase("gram")) {
            density *= 1000.0; // ubah massa jenis dari g/cm^3 ke kg/m^3
        }
        result = density * volume;
        return result;
    }

    // Method untuk menghitung volume dari massa dan massa jenis
    public double calculateVolume(double mass, double density) {
        result = mass / density;
        return result;
    }

    // Method Overloading
    public double calculateVolume(double mass, double density, String unit) {
        if (unit.equalsIgnoreCase("gram")) {
            mass /= 1000.0; // ubah massa dari gram ke kilogram
        }
        result = mass / density;
        return result;
    }


    public void displayResult(String type) {
        switch (type) {
            case "density":
                System.out.println("Massa jenis yang dihitung adalah: " + result + " kg/m^3");
                break;
            case "mass":
                System.out.println("Massa benda yang dihitung adalah: " + result + " kg");
                break;
            case "volume":
                System.out.println("Volume yang dihitung adalah: " + result + " m^3");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}

