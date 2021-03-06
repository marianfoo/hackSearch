//package com.hacksearch;
//
///**
// * Sample Java code for youtube.captions.download
// * See instructions for running these code samples locally:
// * https://developers.google.com/explorer-help/guides/code_samples#java
// */
//
//import com.google.api.client.auth.oauth2.Credential;
//import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
////import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
//import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
//import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
//import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
//import com.google.api.client.googleapis.json.GoogleJsonResponseException;
//import com.google.api.client.http.javanet.NetHttpTransport;
//import com.google.api.client.json.JsonFactory;
//import com.google.api.client.json.jackson2.JacksonFactory;
//import com.google.api.services.youtube.YouTube;
//
//import java.io.*;
//import java.security.GeneralSecurityException;
//import java.util.Arrays;
//import java.util.Collection;
//
////import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
////import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
//
//public class ApiExample {
//    private static final String CLIENT_SECRETS= "client_secret.json";
//    private static final Collection<String> SCOPES =
//        Arrays.asList("https://www.googleapis.com/auth/youtube.force-ssl");
//
//    private static final String APPLICATION_NAME = "API code samples";
//    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
//
//
//    /**
//     * Create an authorized Credential object.
//     *
//     * @return an authorized Credential object.
//     * @throws IOException
//     */
//    public static Credential authorize(final NetHttpTransport httpTransport) throws IOException {
//        // Load client secrets.
//        InputStream in = ApiExample.class.getResourceAsStream(CLIENT_SECRETS);
//        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY,
//            new InputStreamReader(ApiExample.class.getResourceAsStream("/client_secrets.json")));
//        // Build flow and trigger user authorization request.
//        GoogleAuthorizationCodeFlow flow =
//            new GoogleAuthorizationCodeFlow.Builder(httpTransport, JSON_FACTORY, clientSecrets, SCOPES)
//                .build();
//        Credential credential =
//            new AuthorizationCodeInstalledApp(flow, new LocalServerReceiver()).authorize("user");
//        return credential;
//    }
//
//    /** Authorizes the installed application to access user's protected data. */
////    private static Credential authorize() throws Exception {
////        HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
////        // load client secrets
////        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY,
////            new InputStreamReader(ApiExample.class.getResourceAsStream("/client_secrets.json")));
////        // set up authorization code flow
////        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
////            httpTransport, JSON_FACTORY, clientSecrets,
////            Collections.singleton(CalendarScopes.CALENDAR)).setDataStoreFactory(dataStoreFactory)
////            .build();
////        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
////            httpTransport, JSON_FACTORY, clientSecrets,
////            Collections.singleton(PlusScopes.PLUS_ME)).setDataStoreFactory(dataStoreFactory)
////            .build();
////        // authorize
////        return new AuthorizationCodeInstalledApp(flow, new LocalServerReceiver()).authorize("user");
////    }
//
//    /**
//     * Build and return an authorized API client service.
//     *
//     * @return an authorized API client service
//     * @throws GeneralSecurityException, IOException
//     */
//    public static YouTube getService() throws GeneralSecurityException, IOException {
//        final NetHttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
//        Credential credential = authorize(httpTransport);
//        return new YouTube.Builder(httpTransport, JSON_FACTORY, credential)
//            .setApplicationName(APPLICATION_NAME)
//            .build();
//    }
//
//    /**
//     * Call function to create API service object. Define and
//     * execute API request. Print API response.
//     *
//     * @throws GeneralSecurityException, IOException, GoogleJsonResponseException
//     */
//    public static void main(String[] args)
//        throws GeneralSecurityException, IOException, GoogleJsonResponseException {
//        YouTube youtubeService = getService();
//        // TODO: Replace "YOUR_FILE" with the location where
//        //       the downloaded content should be written.
//        OutputStream output = new FileOutputStream("hack1de");
//
//        // Define and execute the API request
//        YouTube.Captions.Download request = youtubeService.captions()
//            .download("892QMdWzj22UErpBl9BBdQ40gsu5HbD5-YKbxSQPWfE=");
//        request.getMediaHttpDownloader();
//        request.executeMediaAndDownloadTo(output);
//
////        YouTube.PlaylistItems.List request = youtubeService.playlistItems()
////            .list("contentDetails");
////        PlaylistItemListResponse response = request.setMaxResults(50L)
////            .setPlaylistId("PLEKG_YBLX5yUsKbhCiOGIBRwXyBsO17bz")
////            .execute();
////        System.out.println(response);
//    }
//}
