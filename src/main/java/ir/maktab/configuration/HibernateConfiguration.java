package ir.maktab.configuration;


import ir.maktab.configuration.properties.DBProperties;
import ir.maktab.data.domain.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Properties;
@Configuration
public class HibernateConfiguration {
    private final DBProperties dbProperties;

    public HibernateConfiguration(DBProperties dbProperties) {
        this.dbProperties = dbProperties;
    }

    @Bean(value = "sessionFactory")
    public SessionFactory getSessionFactory() {
        try {
            org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
            configuration.addAnnotatedClass(CustomerOrder.class);
            configuration.addAnnotatedClass(Customer.class);
            configuration.addAnnotatedClass(CustomerComment.class);
            configuration.addAnnotatedClass(Manager.class);
            configuration.addAnnotatedClass(SpecialistOffer.class);
            configuration.addAnnotatedClass(SpecialistComment.class);
            configuration.addAnnotatedClass(Service.class);
            configuration.addAnnotatedClass(Specialist.class);
            configuration.addAnnotatedClass(SubService.class);
            configuration.setProperties(new Properties() {
                {
                    put("hibernate.connection.driver_class",
                            dbProperties.getDriverClass());
                    put("hibernate.connection.url",
                            dbProperties.getUrl());
                    put("hibernate.connection.username",
                            dbProperties.getUsername());
                    put("hibernate.connection.password",
                            dbProperties.getPassword());
                    put("hibernate.hbm2ddl.auto",
                            dbProperties.getHbm2ddl());
                    put("hibernate.show_sql",
                            dbProperties.getShowSql());
                    put("hibernate.format_sql",
                            dbProperties.getFormatSql());
                }
            });
            return configuration.buildSessionFactory(new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

