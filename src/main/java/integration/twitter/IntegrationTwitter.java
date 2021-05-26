package integration.twitter;

import twitter4j.TwitterException;

/**
 *  //Twitter4J
 *  //https://github.com/Twitter4J/Twitter4J
 */
public class IntegrationTwitter {

    public static void main(String[] args) {

       var twitterCommands = new TwitterCommands(ConfigurationBuilderTwitter.getTwitter());

        try {


            twitterCommands.searchtweets("politica").forEach(System.out::println);
            //twitterCommands.createTweet("Objetivo do dia: Ser uma pessoa melhor, não perfeito, apenas melhor que ontem!");

        } catch (TwitterException e) {
            e.printStackTrace();
        }

    }



}
