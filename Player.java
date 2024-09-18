import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Pokemon> pokemons;

    public Player(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public void showPokemons() {
        for (Pokemon pokemon : pokemons) {
            System.out.println("Name: " + pokemon.getName() +
                ", Type: " + pokemon.getType() +
                ", Health: " + pokemon.getHealth() +
                ", Power: " + pokemon.getPower());
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }
}
