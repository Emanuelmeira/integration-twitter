package integration.twitter;


import twitter4j.*;

import java.util.List;
import java.util.stream.Collectors;

public class TwitterCommands {

    private Twitter twitter;

    public TwitterCommands(Twitter twitter) {
        this.twitter = twitter;
    }

    public String createTweet(String tweet) throws TwitterException {
        Status status = twitter.updateStatus(tweet);
        return status.getText();
    }

    public List<String> getTimeLine() throws TwitterException {
        return twitter.getHomeTimeline().stream()
                .map(item -> item.getText())
                .collect(Collectors.toList());
    }

    public List<String> searchtweets(String termo) throws TwitterException {

        Query query = new Query(termo);
        QueryResult result = twitter.search(query);

        return result.getTweets().stream()
                .map(item -> item.getText())
                .collect(Collectors.toList());
    }

}
