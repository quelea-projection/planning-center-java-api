# Planning Center API

This is a Java implementation of the planning center API (v2). It's written to be used with Quelea, but has no Quelea-specific dependencies, so can easily be used elsewhere.

At present only a subset of the "services" API is implemented, as that's all Quelea needs. We're more than happy to accept PR's for expanding this, however.

Basic "getting started" example:

    ClientDetails cd = ClientDetails.builder()
            .clientId("OAUTH_APP_CLIENT_ID")
            .clientSecret("OAUTH_APP_SECRET")
            .build();
    AuthToken token = OAuthRedirectFlow.builder()
            .clientDetails(cd)
            .redirect("http://localhost:61937") //Just for a demo example
            .build()
            .listenLocally(Duration.ofSeconds(10), Main::openBrowser)
            .get()
            .withRefreshTokenUpdater(t -> System.out.println("New refresh token: " + t));

    PlanningCenterClient client = new PlanningCenterClient(token);

    Organization org = client.services().api().get().execute().body().get();

...with the following utility method:
    
    private static void openBrowser(String url) {
        try {
            Desktop.getDesktop().browse(URI.create(url));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
