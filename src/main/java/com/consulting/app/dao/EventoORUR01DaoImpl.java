package com.consulting.app.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.consulting.app.bean.FiltroEventoORUR01;
import com.consulting.app.model.EventoORUR01;

@Repository
@Transactional
public class EventoORUR01DaoImpl extends AbstractSession implements EventoORUR01Dao {

	@SuppressWarnings("unchecked")
	@Override
	public List<EventoORUR01> buscarEventosORUR01(FiltroEventoORUR01 evento) {
//		return getSession().createQuery(
//				"from EventoORUR01 where pid3_1_id_peticion = :pid3_1_id_peticion and pid3_1_id_dni = :pid3_1_id_dni and "
//				+ " CONVERT(DATE, oru01_dt_fecregistro, 103) >= :oru01_dt_fecregistro and CONVERT(DATE, oru01_dt_fecregistro, 103) <= :oru01_dt_fecfinregistro")
//				.setParameter("pid3_1_id_peticion", evento.getPid3_1_id_peticion())
//				.setParameter("pid3_1_id_dni", evento.getPid3_1_id_dni())
//				.setParameter("oru01_dt_fecregistro", evento.getOru01_dt_fecregistro())
//				.setParameter("oru01_dt_fecfinregistro", evento.getOru01_dt_fecfinregistro())
//				.list();
		SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-dd");
		Criteria criteria = getSession().createCriteria(EventoORUR01.class);
		if (evento.getPid3_1_id_dni() != null)
			criteria.add(Restrictions.eq("pid3_1_id_dni", evento.getPid3_1_id_dni()));
		if (evento.getPid3_1_id_peticion() != null)
			criteria.add(Restrictions.eq("pid3_1_id_peticion", evento.getPid3_1_id_peticion()));
		if (evento.getOru01_dt_fecregistro() != null)
			criteria.add(Restrictions.between("oru01_dt_fecregistro", new Date(evento.getOru01_dt_fecregistro().getTime() - TimeUnit.DAYS.toMillis(1)) ,
					new Date(evento.getOru01_dt_fecfinregistro().getTime() + TimeUnit.DAYS.toMillis(1))));
		return criteria.list();
	}
}
