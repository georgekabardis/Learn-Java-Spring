package com.oss.webbackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
//@EnableJpaRepositories(basePackages = "opsw.erp.items.jpa")
public class DataSourceConfig {




  /*  @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("oracle.jdbc.OracleDriver");
        dataSourceBuilder.url("jdbc:oracle:thin:@10.2.1.6:1521:ORCL");
        dataSourceBuilder.username("AGRAMPE");
        dataSourceBuilder.password("AGRAMPE");
        return dataSourceBuilder.build();
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);
        return transactionManager;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory()
            throws NamingException {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(false);
        vendorAdapter.setShowSql(false);
        vendorAdapter.setDatabase(Database.ORACLE);
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(getDataSource());
        em.setPackagesToScan("com.oss.webbackend.model");
        em.setPersistenceUnitName("oss");
        em.setJpaVendorAdapter(vendorAdapter);
//        em.setPackagesToScan("opsw.erp.items.jpa.Items");
        em.setPersistenceProviderClass(HibernatePersistenceProvider.class);
        // rest of entity manager configuration
        return em;
    }*/

//    @Bean
//    public CatEjbConnectionBridge connectionBridge(){
//        CatEjbConnectionBridge connectionBridge = new CatEjbConnectionBridge();
//        connectionBridge.setConnection(em);
//    }



//    @Bean
//    public EntityManagerFactory entityManagerFactory() {
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        vendorAdapter.setGenerateDdl(false);
//        vendorAdapter.setShowSql(false);
//        vendorAdapter.setDatabase(Database.MYSQL);
//
//        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//        factory.setJpaVendorAdapter(vendorAdapter);
//        factory.setPackagesToScan("add packages here");
//        return factory.getObject();
//    }

//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory()
//            throws NamingException {
//
//        LocalContainerEntityManagerFactoryBean em
//                = new LocalContainerEntityManagerFactoryBean();
//        em.setDataSource(getDataSource());
//        em.setPackagesToScan("com.oss.webbackend.model");
//        em.setPersistenceUnitName("oss");
//        em.setPersistenceProviderClass(HibernatePersistenceProvider.class);
//        // rest of entity manager configuration
//        return em;
//    }

//    @Bean
//    public CatEjbConnectionBridge getCatEjbConnectionBridge(){
//        CatEjbConnectionBridge connectionBridge = new CatEjbConnectionBridge();
//        try {
//            connectionBridge.setConnection(entityManagerFactory());
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        connectionBridge.setPoolName("TestDB");
//        return connectionBridge;
//    }

//
//    @Bean
//    public DataSource getDataSource(){
//
//        DataSource dataSource = null;
//        Context ctx = null;
//        try {
//            ctx = new InitialContext();
//            dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/TestDB");
//        } catch (NamingException e) {
//            e.printStackTrace();
//        }
//        return dataSource;
//    }

//    @Bean
//    public DataSource getDataSource() {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//
//        Path propertyPath = Paths.get("src\\tenants\\db1.properties");
//        File propertyFile = propertyPath.toAbsolutePath().toFile();
//        Properties tenantProperties = new Properties();
//        try {
//            FileInputStream propertyFileStream = new FileInputStream(propertyFile);
//            tenantProperties.load(propertyFileStream);
//            dataSourceBuilder.driverClassName(properties.getDriverClassName());
//            dataSourceBuilder.url(tenantProperties.getProperty("datasource.url"));
//            dataSourceBuilder.username(tenantProperties.getProperty("datasource.username"));
//            dataSourceBuilder.password(tenantProperties.getProperty("datasource.password"));
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return dataSourceBuilder.build();
//    }



//    @Bean
//    public DataSource getDataSource() {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName("oracle.jdbc.OracleDriver");
//        dataSourceBuilder.url("jdbc:oracle:thin:@10.2.1.6:1521:ORCL");
//        dataSourceBuilder.username("AGRAMPE");
//        dataSourceBuilder.password("AGRAMPE");
//        return dataSourceBuilder.build();
//    }
}