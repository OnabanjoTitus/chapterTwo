import java.security.SecureRandom;

public class SentenceGenerator {
private  String []articles={ "the", "a", "one", "some" ,"any"};
private String[]nouns={"boy","girl","dog","town","car"};
private String[]verbs={"drove","jumped","ran","walked","skipped"};
private String[]prepositions={"to","from","over","under","on"};

    public String[] getArticles() {
        return articles;
    }

    public void setArticles(String[] articles) {
        this.articles = articles;
    }

    public String[] getNouns() {
        return nouns;
    }

    public void setNouns(String[] nouns) {
        this.nouns = nouns;
    }

    public String[] getVerbs() {
        return verbs;
    }

    public void setVerbs(String[] verbs) {
        this.verbs = verbs;
    }

    public String[] getPrepositions() {
        return prepositions;
    }

    public void setPrepositions(String[] prepositions) {
        this.prepositions = prepositions;
    }

    public String getSentence() {
        StringBuilder builder= new StringBuilder();
        SecureRandom random= new SecureRandom();
        int randomIndex= random.nextInt(5);
        String article= getArticles()[randomIndex];
        char firstLetter=article.charAt(0);
        firstLetter=Character.toUpperCase(firstLetter);
        article = article.replace(article.charAt(0),firstLetter);

        builder.append(article).append(" ");

        String noun= getNouns()[randomIndex];
        builder.append(noun).append(" ");

        String verb= getVerbs()[randomIndex];
        builder.append(verb).append(" ");

        String preposition= getPrepositions()[randomIndex];
        builder.append(preposition).append(" ");
        randomIndex=random.nextInt(5);
        article=articles[randomIndex];

        builder.append(article).append(" ");

        noun= getNouns()[randomIndex];
        builder.append(noun).append(".");



        return builder.toString();
    }
}
