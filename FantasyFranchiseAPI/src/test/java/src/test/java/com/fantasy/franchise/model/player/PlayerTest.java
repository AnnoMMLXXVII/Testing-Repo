package src.test.java.com.fantasy.franchise.model.player;

import model.player.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PlayerTest {
    Player name;
    Player name2;

    @BeforeEach
     void setUp() {

        name = new Player();
        name2 = new Player("name","gdafasfsda", new Date(1991,7,9),
                250, "ASU", 42, "LB", 66);

    }

    @Test
    void testNotNull(){
                     // Sets Exception statement                        Then checks if it is null or not
       assertThat(name).as("name was null object").isNotNull();

    }

    @Test
    void checkFistName(){
        assertThat(name.getFirstName()).as("First name not name").isEqualTo("name");
    }

    @Test
    void setLastName(){
        name.setLastName("Bob");
        assertThat(name.getLastName()).as("Last name not bob").isEqualTo("Bob");
    }

    @Test
    void checkEqualObjectAreEqual() {
        assertThat(name.equals(name2)).as("Objects are not equal").isFalse();
    }

    @Test
    void checkBirthDateIsDefault(){

        assertThat(name.getBirthDate()).as("N/a").isEqualTo(new Date(11,11,11));
    }
}