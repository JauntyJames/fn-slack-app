package com.example.fn;

import com.slack.api.Slack;
import com.slack.api.methods.SlackApiException;
import com.slack.api.webhook.WebhookResponse;

import java.io.IOException;

public class HelloFunction {

    public String handleRequest(String input) throws IOException, SlackApiException {
        Slack slack = Slack.getInstance();
        String name = (input == null || input.isEmpty()) ? "world" : input;
        String webhookUrl = System.getenv("SLACK_WEBHOOK_URL");
        String payload = "{\"text\":\"Hello " + name + " from Oracle Functions!\"}";

        WebhookResponse response = slack.send(webhookUrl, payload);
        System.out.println(response);
        return payload;
    }

}