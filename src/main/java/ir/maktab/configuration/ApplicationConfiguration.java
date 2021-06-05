package ir.maktab.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"ir.maktab"})
@PropertySource("classpath:database.properties")
@Import({
        HibernateConfiguration.class,
        SpringDataConfiguration.class
})
public class ApplicationConfiguration {
}
