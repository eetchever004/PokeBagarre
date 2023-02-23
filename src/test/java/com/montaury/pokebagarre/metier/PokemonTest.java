package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    @Test
    void pokemon1_gagne_attaque(){
        //GIVEN
        ConstructeurDePokemon pokemon1 = new ConstructeurDePokemon();
        pokemon1.avecAttaque(15);
        pokemon1.avecDefense(15);

        ConstructeurDePokemon pokemon2 = new ConstructeurDePokemon();
        pokemon2.avecAttaque(10);
        pokemon2.avecDefense(15);

        //WHEN
        boolean result = pokemon1.construire().estVainqueurContre(pokemon2.construire());

        //THEN
        assertEquals(true, result);
    }

    @Test
    void pokemon2_gagne_attaque(){
        //GIVEN
        ConstructeurDePokemon pokemon1 = new ConstructeurDePokemon();
        pokemon1.avecAttaque(10);
        pokemon1.avecDefense(15);

        ConstructeurDePokemon pokemon2 = new ConstructeurDePokemon();
        pokemon2.avecAttaque(15);
        pokemon2.avecDefense(15);

        //WHEN
        boolean result = pokemon1.construire().estVainqueurContre(pokemon2.construire());

        //THEN
        assertEquals(false, result);
    }

    @Test
    void pokemon1_gagne_defense(){
        //GIVEN
        ConstructeurDePokemon pokemon1 = new ConstructeurDePokemon();
        pokemon1.avecAttaque(15);
        pokemon1.avecDefense(15);

        ConstructeurDePokemon pokemon2 = new ConstructeurDePokemon();
        pokemon2.avecAttaque(15);
        pokemon2.avecDefense(10);

        //WHEN
        boolean result = pokemon1.construire().estVainqueurContre(pokemon2.construire());

        //THEN
        assertEquals(true, result);
    }

    @Test
    void pokemon2_gagne_defense(){
        //GIVEN
        ConstructeurDePokemon pokemon1 = new ConstructeurDePokemon();
        pokemon1.avecAttaque(15);
        pokemon1.avecDefense(10);

        ConstructeurDePokemon pokemon2 = new ConstructeurDePokemon();
        pokemon2.avecAttaque(15);
        pokemon2.avecDefense(15);

        //WHEN
        boolean result = pokemon1.construire().estVainqueurContre(pokemon2.construire());

        //THEN
        assertEquals(false, result);
    }

    @Test
    void pokemon1_gagne_egalite(){
        //GIVEN
        ConstructeurDePokemon pokemon1 = new ConstructeurDePokemon();
        pokemon1.avecAttaque(15);
        pokemon1.avecDefense(15);

        ConstructeurDePokemon pokemon2 = new ConstructeurDePokemon();
        pokemon2.avecAttaque(15);
        pokemon2.avecDefense(15);

        //WHEN
        boolean result = pokemon1.construire().estVainqueurContre(pokemon2.construire());

        //THEN
        assertEquals(true, result);
    }
}