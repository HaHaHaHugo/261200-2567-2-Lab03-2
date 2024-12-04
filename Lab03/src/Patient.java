
public class Patient{
    // Private fields
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodGroup;
    private String phoneNumber ;

    // Parameterized constructor
    public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber) {
        // Validate and set the fields
        this.id = id;
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;

        // Validate birthYear (should not be less than or equal to 0)
        if (birthYear > 0) {
            this.birthYear = birthYear;
        } else {
            System.out.println("Invalid birth year");
            this.birthYear = 1900; // Set to a default value for invalid input
        }

        // Validate height (should be greater than 0)
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Invalid height");
            this.height = 0.0; // Set to a default value for invalid input
        }

        // Validate weight (should be greater than 0)
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight");
            this.weight = 0.0; // Set to a default value for invalid input
        }
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Method to calculate age based on current year
    public int getAge(int currentYear) {
        // Validate current year
        if (currentYear < 0) {
            System.out.println("Invalid current year");
            return -1; // Return -1 to indicate invalid input
        }

        // Calculate age
        return currentYear - birthYear;
    }

    public double getBMI(double weight, double height) {
        // Validate if divide by 0
        if (height <= 0) {
            System.out.println("Invalid weight or height for Calculate BMI");
            return 0.0; // Return -1 to indicate invalid input
        }
        // Calculate BMI
        return weight/(height*height*10000);
    }

    // Method to display patient's details
    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient BMI: " + getBMI(weight, height));
        System.out.println("Patient bloodGroup: " + bloodGroup);
        System.out.println("Patient phoneNumber: " + phoneNumber);
    }

    public static void main(String[] args) {
        int currentYear = 2024;
        Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0, "A", "0996068282");
        patient.displayDetails(currentYear);
        Patient invalidPatient = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0, "AB", "0667698008");
        invalidPatient.displayDetails(currentYear);
    }
}
