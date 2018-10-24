package com.consulting.app.config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.stereotype.Service;

import com.consulting.app.utiles.Constante;

@Service("Configuracion")
public class PropertiesConfiguracionImpl implements Configuracion {

	Properties prop = new Properties();
	InputStream  input = null;
	
	public PropertiesConfiguracionImpl() {
		
		try {
			input = new FileInputStream(Constante.FILE_PROPERTIES_CONFIG);
			prop.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getDriverClassName() {
		// TODO Auto-generated method stub
		return prop.getProperty("setDriverClassName").trim();
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return prop.getProperty("setUrl").trim();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return prop.getProperty("setUsername").trim();
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return prop.getProperty("setPassword").trim();
	}

	@Override
	public String getHibernateDialect() {
		// TODO Auto-generated method stub
		return prop.getProperty("hibernate.dialect").trim();
	}

	@Override
	public boolean getShowSql() {
		// TODO Auto-generated method stub
		return prop.getProperty("show_sql").trim().equals("true");
	}

	@Override
	public String getHost() {
		return prop.getProperty("host").trim();
	}

	@Override
	public int getPuerto() {
		return Integer.parseInt(prop.getProperty("puerto").trim());
	}

}
