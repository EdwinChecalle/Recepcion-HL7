package com.consulting.config;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.hibernate.internal.util.config.ConfigurationException;

import com.consulting.utiles.Constante;


public class CommonsConfiguracionImpl implements Configuracion {

	 Configuration config;
	 Configurations configs = new Configurations();
	
	
	public CommonsConfiguracionImpl() {
		super();
		try {
			try {
				config = configs.properties(Constante.FILE_PROPERTIES_CONFIG);
			} catch (org.apache.commons.configuration2.ex.ConfigurationException e) {
				e.printStackTrace();
			}
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public String getDriverClassName() {
		return config.getString("setDriverClassName");
	}

	@Override
	public String getUrl() {
		return config.getString("setUrl");
	}

	@Override
	public String getUsername() {
		return config.getString("setUsername");
	}

	@Override
	public String getPassword() {
		return config.getString("setPassword");
	}

	@Override
	public String getHibernateDialect() {
		return config.getString("hibernate.dialect");
	}

	@Override
	public boolean getShowSql() {
		return config.getBoolean("show_sql");
	}

}
