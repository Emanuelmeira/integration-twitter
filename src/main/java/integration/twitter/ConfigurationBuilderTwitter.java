package integration.twitter;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class ConfigurationBuilderTwitter {

    public static Twitter getTwitter(){

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("xxxxxxxxxxxxxxxxxxx")
                .setOAuthConsumerSecret("xxxxxxxxxxxxxxxxxxx")
                .setOAuthAccessToken("xxxxxxxxxxxxxxxxxxx-xxxxxxxxxxxxxxxxxxx")
                .setOAuthAccessTokenSecret("xxxxxxxxxxxxxxxxxxx");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        return twitter;
    }

}
