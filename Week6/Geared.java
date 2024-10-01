class TwoWheeler {
    protected String company;

    public TwoWheeler(String company) {
        this.company = company;
    }

    public String getType() {
        return "Two Wheeler";
    }

    public String getName() {
        return company + " Two Wheeler";
    }
}

class Geared extends TwoWheeler {
    private int gears;

    public Geared(String company, int gears) {
        super(company);
        this.gears = gears;
    }

    public void average() {
        System.out.println("The average of geared " + getName() + " is 40 km/l");  // Example value, replace with actual calculation
    }
}

class NonGeared extends TwoWheeler {
    public NonGeared(String company) {
        super(company);
    }

    public void average() {
        System.out.println("The average of non-geared " + getName() + " is 50 km/l");  // Example value, replace with actual calculation
    }
}

 class Main {
    public static void main(String[] args) {
        Geared gearedBike = new Geared("Honda", 5);
        NonGeared nonGearedBike = new NonGeared("Suzuki");

        System.out.println(gearedBike.getType());  // Output: Two Wheeler
        System.out.println(gearedBike.getName());  // Output: Honda Two Wheeler
        gearedBike.average();  // Output: The average of geared Honda Two Wheeler is 40 km/l

        System.out.println(nonGearedBike.getType());  // Output: Two Wheeler
        System.out.println(nonGearedBike.getName());  // Output: Suzuki Two Wheeler
        nonGearedBike.average();  // Output: The average of non-geared Suzuki Two Wheeler is 50 km/l
    }
}

