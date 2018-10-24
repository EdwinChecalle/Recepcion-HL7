package com.consulting.app.config;

public interface Configuracion {
	
	public String getDriverClassName();
	public String getUrl();
	public String getUsername();
	public String getPassword();
	public String getHibernateDialect();
	public boolean getShowSql();
	public String getHost();
	public int getPuerto();

}
