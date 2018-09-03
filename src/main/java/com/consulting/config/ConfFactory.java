package com.consulting.config;

public abstract class ConfFactory {

	private static final String CONFIGURACION = "com.consulting.config.Configuracion";
	
	
	@SuppressWarnings("unchecked")
	public static <T> T createInstancia(Class<T> type) {
		if(type.getName().equals(CONFIGURACION)) {
			return (T) new CommonsConfiguracionImpl();
		}
		
		return null;
	}
}
