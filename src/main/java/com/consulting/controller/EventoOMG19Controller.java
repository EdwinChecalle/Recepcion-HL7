package com.consulting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.consulting.dao.EventoOMG19Dao;
import com.consulting.model.EventoOMG19;

@Controller
@RequestMapping("/v1")
public class EventoOMG19Controller {

	@Autowired 
	EventoOMG19Dao _eventoOMG19Dao;
	
	
	@RequestMapping(value = "/OMG19", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<?> crearEventoOMG19 (@RequestBody EventoOMG19 evento){
		_eventoOMG19Dao.insertevent(evento);
		return new ResponseEntity<EventoOMG19>(evento, HttpStatus.CREATED);
	}
}
