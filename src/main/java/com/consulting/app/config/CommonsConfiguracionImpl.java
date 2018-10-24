package com.consulting.app.config;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;

import com.consulting.app.utiles.Constante;

public class CommonsConfiguracionImpl implements Configuracion {

	private static Configuration config;
	private static Configurations configs = new Configurations();

	public CommonsConfiguracionImpl() {
		getConfig();
	}

	private static synchronized Configuration getConfig() {
		try {
			if (config == null) {
				config = configs.properties(Constante.FILE_PROPERTIES_CONFIG);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return config;
	}

	@Override
	public String getDriverClassName() {
		return getConfig().getString("setDriverClassName");
	}

	@Override
	public String getUrl() {
		return getConfig().getString("setUrl");
	}

	@Override
	public String getUsername() {
		return getConfig().getString("setUsername");
	}

	@Override
	public String getPassword() {
		return getConfig().getString("setPassword");
	}

	@Override
	public String getHibernateDialect() {
		return getConfig().getString("hibernate.dialect");
	}

	@Override
	public boolean getShowSql() {
		return getConfig().getBoolean("show_sql");
	}

	@Override
	public String getHost() {
		return getConfig().getString("host");
	}

	@Override
	public int getPuerto() {
		return getConfig().getInt("puerto");
	}

}
