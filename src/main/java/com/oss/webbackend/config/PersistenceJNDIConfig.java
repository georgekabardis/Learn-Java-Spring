package com.oss.webbackend.config;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
/*
@Configuration
@EnableTransactionManagement
//@PropertySource("classpath:persistence-jndi.properties")
@ComponentScan("com.oss.webbackend.model")
@EnableJpaRepositories(basePackages = "com.oss.webbackend.repository")

 */
public class PersistenceJNDIConfig {
/*
    @Autowired
    private Environment env;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory()
            throws NamingException {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(false);
        vendorAdapter.setShowSql(false);
        vendorAdapter.setDatabase(Database.ORACLE);
        vendorAdapter.setDatabasePlatform("org.hibernate.dialect.Oracle12cDialect");
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPackagesToScan("com.oss.webbackend.model");
        em.setPersistenceUnitName("webbackend");
        em.setJpaVendorAdapter(vendorAdapter);
        em.setPersistenceProviderClass(HibernatePersistenceProvider.class);

        // rest of entity manager configuration
        return em;
    }

    @Bean
    public DataSource dataSource() throws NamingException {
        return (DataSource) new JndiTemplate().lookup("ORCLH_MINLO");
//        return (DataSource) new JndiTemplate().lookup("java:comp/env/jdbc/ORCLH_MINLO");
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);
        return transactionManager;
    }
    
 */
}
