package _concept.IQ;
// Ancestors class
class Ancestors {
    private String language;
    private String customs;

    // Constructor
    public Ancestors(String language, String customs) {
        this.language = language;
        this.customs = customs;
    }

    // Method to display cultural information
    public void displayCulturalHeritage() {
        System.out.println("Ancestors Cultural Heritage:");
        System.out.println("Language: " + language);
        System.out.println("Customs: " + customs);
    }
}

// Community class inheriting from Ancestors
class Community extends Ancestors {
    private String communityName;

    // Constructor
    public Community(String communityName, String language, String customs) {
        super(language, customs); // Call superclass constructor
        this.communityName = communityName;
    }

    // Method to display community-specific information
    public void displayCommunityInfo() {
        System.out.println("Community: " + communityName);
        displayCulturalHeritage(); // Call superclass method
    }
}

// Main class to demonstrate usage
class Main3 {
    public static void main(String[] args) {
        // Create an instance of Community
        Community community = new Community("Example Community", "Example Language", "Example Customs");

        // Display community-specific information
        community.displayCommunityInfo();
    }
}