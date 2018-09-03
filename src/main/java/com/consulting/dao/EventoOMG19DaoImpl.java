package com.consulting.dao;

import com.consulting.model.EventoOMG19;

public class EventoOMG19DaoImpl extends AbstractSession implements EventoOMG19Dao {

	@Override
	public void insertevent(EventoOMG19 evento) {
		getSession().persist(evento);

	}

}
