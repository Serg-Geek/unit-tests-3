package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TestDrivenDevelopment {
    private MoodAnalyser moodAnalyser;

    @BeforeEach
    void setUp(){
        moodAnalyser = new MoodAnalyser();
    }


    //3.5. Red-Green-Refactor

    @Test
    void testMoodAnalisIsHappy(){
      assertThat(moodAnalyser.analyseMood("хорошее настроение!!")).isEqualTo("happy");

    }


    @Test
    void testMoodAnalisIsSad(){
        assertThat(moodAnalyser.analyseMood("плохое настроение!!")).isEqualTo("sad");

    }


    @Test
    void testMoodAnalisIsSoso(){
       assertThat(moodAnalyser.analyseMood("нейтральное настроение!!")).isEqualTo("so so");

    }

}