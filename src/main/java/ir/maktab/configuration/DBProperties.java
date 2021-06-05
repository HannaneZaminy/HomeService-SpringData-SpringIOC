package ir.maktab.configuration;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Base64;

@Component
public class DBProperties {
    private final Environment environment;

    public DBProperties(Environment environment) {
        this.environment = environment;
    }

    private String driverClass;
    private String url;
    private String username;
    private String password;
    private String hbm2ddl;
    private String formatSql;
    private String showSql;
    @PostConstruct
    public void afterPropertiesSet() {
        driverClass = environment.getRequiredProperty("hibernate.connection.driver_class");
        url = environment.getRequiredProperty("hibernate.connection.url");
        username = environment.getRequiredProperty("hibernate.connection.username");
        password = decodePassword();
        hbm2ddl = environment.getRequiredProperty("hibernate.hbm2ddl.auto");
        formatSql = environment.getRequiredProperty("hibernate.format_sql");
        showSql = environment.getRequiredProperty("hibernate.show_sql");
    }

    private String decodePassword() {
        String pass = environment.getRequiredProperty("hibernate.connection.password");
        Base64.Decoder decoder = Base64.getDecoder();
        return new String(decoder.decode(pass));
    }

}
