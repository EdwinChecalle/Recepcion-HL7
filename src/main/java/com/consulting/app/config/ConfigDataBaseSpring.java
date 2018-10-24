package com.consulting.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.util.Properties;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class ConfigDataBaseSpring {

	static Configuracion _conf = ConfFactory.createInstancia(Configuracion.class);

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(_conf.getDriverClassName());
		dataSource.setUrl(_conf.getUrl());
		dataSource.setUsername(_conf.getUsername());
		dataSource.setPassword(_conf.getPassword());

		return dataSource;
	}

	public Properties hibernetProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", _conf.getHibernateDialect());
		properties.put("show_sql", _conf.getShowSql());

		return properties;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource());
		sessionFactoryBean.setPackagesToScan("com.consulting.app.model");
		sessionFactoryBean.setHibernateProperties(hibernetProperties());
		return sessionFactoryBean;
	}
}