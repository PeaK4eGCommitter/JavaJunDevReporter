package ru.levelup.nm.tests;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import ru.levelup.nm.web.configurations.ConfigurationProd;
import ru.levelup.nm.web.configurations.ConfigurationWeb;

@Configuration
@ComponentScan(basePackages = {"ru.levelup.nm.web", "ru.levelup.nm.dao"},
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ASSIGNABLE_TYPE,
                classes = {ConfigurationProd.class, ConfigurationWeb.class }
        ))
public class TestConfiguration {
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setPersistenceUnitName("TestPersistenceUnit");
        return bean;
    }
}
