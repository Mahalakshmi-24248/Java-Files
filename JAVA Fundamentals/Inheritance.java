// single inheritance//
    // Superclass
class TataGroup {
    String companyName = "Tata Group";
    
    void displayCompanyInfo() {
        System.out.println("Welcome to " + companyName);
    }
}

// Subclass: Automobiles
class Automobiles extends TataGroup {
    void passenger() {
        System.out.println("Automobiles Division: Passenger Vehicles");
    }

    void transportation() {
        System.out.println("Automobiles Division: Transportation Vehicles");
    }
}

// Subclass: Power
class Power extends TataGroup {
    void solar() {
        System.out.println("Power Division: Solar Energy");
    }

    void wind() {
        System.out.println("Power Division: Wind Energy");
    }

    void thermal() {
        System.out.println("Power Division: Thermal Energy");
    }
}

// Subclass: Jewellery
class Jewellery extends TataGroup {
    void displayJewellery() {
        System.out.println("Jewellery Division: High-Quality Jewellery");
    }
}

// Subclass: FMCG
class FMCG extends TataGroup {
    void displayFMCG() {
        System.out.println("FMCG Division: Fast Moving Consumer Goods");
    }
}

// Main class
public class TataGroupDemo {
    public static void main(String[] args) {
        // Automobiles
        Automobiles automobiles = new Automobiles();
        automobiles.displayCompanyInfo();
        automobiles.passenger();
        automobiles.transportation();
        
        System.out.println();

        // Power
        Power power = new Power();
        power.displayCompanyInfo();
        power.solar();
        power.wind();
        power.thermal();
        
        System.out.println();

        // Jewellery
        Jewellery jewellery = new Jewellery();
        jewellery.displayCompanyInfo();
        jewellery.displayJewellery();

        System.out.println();

        // FMCG
        FMCG fmcg = new FMCG();
        fmcg.displayCompanyInfo();
        fmcg.displayFMCG();
    }
}

}