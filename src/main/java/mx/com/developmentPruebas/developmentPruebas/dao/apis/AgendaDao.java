package mx.com.developmentPruebas.developmentPruebas.dao.apis;

import dtos.AgendaDaoDto;
import dtos.FiltroAgendaInDto;

public interface AgendaDao {

	AgendaDaoDto obtenerAgenda(FiltroAgendaInDto filtroAgendaInDto);

}

