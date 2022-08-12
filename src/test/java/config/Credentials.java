package config;

import org.aeonbits.owner.Config;


@Config.Sources("classpath:credentials.properties")
public interface Credentials extends Config {

    @Key("login")
    String getLogin();

    @Key("password")
    String getPassword();

    @Key("appUrl")
    String getAppUrl();
}
