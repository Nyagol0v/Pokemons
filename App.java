import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.Lamboc;

public class App {
    public static void main(String[] args) throws Exception {
        // Създаване на играчи и добавяне на покемони
        Player player1 = new Player("Ash");
        Player player2 = new Player("Misty");
        Player player3 = new Player("Brock");

        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 5, 10);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Grass", 7, 8);
        Pokemon charmander = new Pokemon("Charmander", "Fire", 6, 12);
        Pokemon squirtle = new Pokemon("Squirtle", "Water", 8, 11);


        player1.addPokemon(pikachu);
        player1.addPokemon(bulbasaur);

        player2.addPokemon(charmander);
        player2.addPokemon(squirtle);
        player2.addPokemon(pikachu);

        player3.addPokemon(bulbasaur);


        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

    
        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                return Integer.compare(p2.getPokemons().size(), p1.getPokemons().size()); // Обратен ред
            }
        });


        System.out.println("Players sorted by number of Pokémon:");
        for (Player player : players) {
            System.out.println(player.getName() + " has " + player.getPokemons().size() + " Pokémon(s).");
        }
        
                System.out.println("\nAll Pokémon:");
        for (Player player : players) {
            System.out.println("\nPlayer " + player.getName() + ":");
            player.showPokemons();
        }
    }
}
