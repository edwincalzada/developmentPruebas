package mx.com.developmentPruebas.developmentPruebas.dao.apis;

import dtos.AgendaOutDto;
import dtos.FiltroAgendaInDto;

public interface AgendaDao {

	AgendaOutDto obtenerAgenda(FiltroAgendaInDto filtroAgendaInDto);

}

