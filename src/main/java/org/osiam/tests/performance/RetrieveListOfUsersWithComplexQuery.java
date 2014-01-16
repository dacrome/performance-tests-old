package org.osiam.tests.performance;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.junit.Test;

public class RetrieveListOfUsersWithComplexQuery extends AbstractPerformanceTest {

    @Test
    public void run() throws UnsupportedEncodingException {
        String queryString = "filter=meta.created gt \"2011-10-10 00:00:00\""
                + " and (userName co \"er3\" or userName co \"4\")"
                + " and (email sw \"email3\" and email.type eq \"work\")";

        osiamConnector.searchUsers(URLEncoder.encode(queryString, "UTF-8"), accessToken);
    }
}
