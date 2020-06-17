# Slack Function

This serverless function interacts with the Slack api

## To Run Locally

1. Create an app to run this Fn in 

```
$ fn create app local-app
```

2. Set your webhook url environment variable 

```
$ fn cf a local-app SLACK_WEBHOOK_URL <YOUR WEBHOOK URL>
```

3. Deploy the application

```
fn --verbose deploy --app local-app --local
```

4. Invoke your function with your name

```
$ echo -n 'James' | fn invoke local-app fn-slack-app
```

5. Check your slack channel