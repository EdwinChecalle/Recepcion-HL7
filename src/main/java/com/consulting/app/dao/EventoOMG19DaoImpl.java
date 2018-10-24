package com.consulting.app.dao;

import com.consulting.app.model.EventoOMG19;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional 
public class EventoOMG19DaoImpl extends AbstractSession implements EventoOMG19Dao {

	@Override
	public void insertevent(EventoOMG19 evento) {
		getSession().persist(evento);

	}

}
