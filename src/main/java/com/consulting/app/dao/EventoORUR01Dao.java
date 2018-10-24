package com.consulting.app.dao;

import java.util.List;

import com.consulting.app.bean.FiltroEventoORUR01;
import com.consulting.app.model.EventoORUR01;

public interface EventoORUR01Dao {

	List<EventoORUR01> buscarEventosORUR01 (FiltroEventoORUR01 evento);
}
