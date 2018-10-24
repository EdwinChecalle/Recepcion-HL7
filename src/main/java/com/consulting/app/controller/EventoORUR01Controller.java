package com.consulting.app.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.consulting.app.bean.FiltroEventoORUR01;
import com.consulting.app.dao.EventoORUR01Dao;
import com.consulting.app.model.EventoORUR01;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController
@RequestMapping("/v1")
@CrossOrigin("*")
public class EventoORUR01Controller {

	private static final Logger log = LoggerFactory.getLogger(EventoORUR01Controller.class);
	//private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	//private static final Gson gson = new Gson();
	final Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();
	
	@Autowired
	EventoORUR01Dao _eventoORUR01Dao;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/ORUR01", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<EventoORUR01>> listarEventORUR01(@RequestParam(value = "evento") String evento)  {
		log.trace(" parametro : {}", evento);
		FiltroEventoORUR01 parametros =gson.fromJson(evento, FiltroEventoORUR01.class);
		log.info("llamando al metodo listarEventORUR01... => {}",parametros.toString());
		List<EventoORUR01> lista = new ArrayList<EventoORUR01>();
		lista = _eventoORUR01Dao.buscarEventosORUR01(parametros);

		if (lista.isEmpty()) {
			log.info("no hay contenido...");
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<EventoORUR01>>(lista, HttpStatus.OK);
	}
}
