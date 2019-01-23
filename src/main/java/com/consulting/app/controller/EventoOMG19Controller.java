package com.consulting.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.consulting.app.config.Configuracion;
import com.consulting.app.dao.EventoOMG19Dao;
import com.consulting.app.model.EventoOMG19;
import com.consulting.app.service.EventoOmg19Service;

@RestController
@RequestMapping("/v1")
@CrossOrigin("*")
public class EventoOMG19Controller {

	private static final Logger log = LoggerFactory.getLogger(EventoOMG19Controller.class);

	@Autowired
	EventoOMG19Dao _eventoOMG19Dao;

	@Autowired
	EventoOmg19Service _eventoOmg19Service;

	@Autowired
	Configuracion _config;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/OMG19", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<?> crearEventoOMG19(@RequestBody EventoOMG19 evento) {
		Object[] resultado = evento.valirCampos();
		log.info(evento.toString());
		if ((boolean) resultado[0]) {
			_eventoOMG19Dao.insertevent(evento);
			/*_eventoOmg19Service.config().setHost(_config.getHost()).setPuero(_config.getPuerto()).build()
					.enviarEventoOmg19(_eventoOmg19Service.objectToEr7(evento));*/
			return new ResponseEntity<EventoOMG19>(evento, HttpStatus.CREATED);
		} else {
			return new ResponseEntity((String) resultado[1], HttpStatus.CONFLICT);
		}

	}
}
