package com.consulting.app.service;

import com.consulting.app.model.EventoOMG19;
import com.consulting.app.service.HapiEventoOmg19ServiceImpl.clienteHl7Builder;

public interface EventoOmg19Service {

	String objectToEr7(EventoOMG19 obj);
	void enviarEventoOmg19(String er7Omg19);
	clienteHl7Builder config ();
	
}
