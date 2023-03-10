package pt.nosautomation.api;

import io.restassured.authentication.PreemptiveOAuth2HeaderScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.LogConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;

import static io.restassured.http.ContentType.JSON;

public class NosApiRequestSpecification {

    public static final String TOKEN = "b98ad8f9a05959e70f86971960bd385e5bff68111ef7cb7ebf39a7a48e80809d";

    public RequestSpecification getRequestSpecification(String url, String path) {
        PreemptiveOAuth2HeaderScheme oAuth2Scheme = new PreemptiveOAuth2HeaderScheme();
        oAuth2Scheme.setAccessToken(TOKEN);

        return new RequestSpecBuilder()
                .setConfig(
                        new RestAssuredConfig()
                                .sslConfig(
                                        new SSLConfig().relaxedHTTPSValidation()
                                )
                                .logConfig(LogConfig
                                        .logConfig()
                                        .enablePrettyPrinting(true)
                                        .enableLoggingOfRequestAndResponseIfValidationFails(LogDetail.ALL)
                                )
                ).setAuth(oAuth2Scheme)
                .setContentType(JSON)
                .setBaseUri(url)
                .setBasePath(path)
                .setRelaxedHTTPSValidation()
                .setContentType(JSON)
                .log(LogDetail.ALL)
                .build();
    }
}
