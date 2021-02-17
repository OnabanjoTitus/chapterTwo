import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceGeneratorTest {
    SentenceGenerator sentenceGenerator;
    @BeforeEach
    void setUp() {
    sentenceGenerator= new SentenceGenerator();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void getArticleArray(){
        assertNotNull(sentenceGenerator.getArticles());
        assertEquals(5,sentenceGenerator.getArticles().length);
    }
    @Test
    void generateSentence(){
        String sentence=sentenceGenerator.getSentence();
        assertNotNull(sentence);
        assertFalse(sentence.isEmpty());
        System.out.println(sentence);

    }
}