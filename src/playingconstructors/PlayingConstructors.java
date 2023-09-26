package playingconstructors;

/*
* Author: Daniel Barbu: 20024094
* Application: PlayingConstructors
* Version: 1.0
* Date: 26/09/2023
*/

/**
 *
 * @author 20024094
 */

public class PlayingConstructors {
    
    // fields
    String name;
    String country;
    String continent;
    String signature;
    
    public PlayingConstructors() {
        this("German Sheperd", "Germany", "Europe", "Dogg");
    }
    public PlayingConstructors(String continent, String signature) {
        this("German dog", "Germany", continent, signature);
    }
    public PlayingConstructors(String name, String country, String continent, String signature) {
        this.name = name;
        this.country = country;
        this.continent = continent;
        this.signature = signature;
    }

    public static void main(String[] args) {
    }
    
}
