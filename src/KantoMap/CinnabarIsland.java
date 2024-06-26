package KantoMap;
import Character.GymLeader;
import Pokemon.*;
import Character.Blaine;
public class CinnabarIsland extends City{
    public CinnabarIsland(){
        super("Cinnabar Island");
        //Implement the connection
        this.addConnection("Pallet Town", 7);
        this.addConnection("Fuchsia City", 5);
        //Implement the wild pokemons
        this.addCatchablePokemon(new Grimer());
        this.addCatchablePokemon(new Ponyta());
        this.addCatchablePokemon(new Growlithe());
        //Implement the Challenge Gym Leader
        GymLeader gymLeader = new Blaine();
        this.setGymLeader(gymLeader);
    }
}
