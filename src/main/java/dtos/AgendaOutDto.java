package dtos;

public class AgendaOutDto {

	private String id_agenda;
	private String titulo;
	private String evento;
	private String fechaDeRegistro;
	private String fechaDeEvento;

	public String getId_agenda() {
		return id_agenda;
	}

	public void setId_agenda(final String id_agenda) {
		this.id_agenda = id_agenda;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(final String titulo) {
		this.titulo = titulo;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(final String evento) {
		this.evento = evento;
	}

	public String getFechaDeRegistro() {
		return fechaDeRegistro;
	}

	public void setFechaDeRegistro(final String fechaDeRegistro) {
		this.fechaDeRegistro = fechaDeRegistro;
	}

	public String getFechaDeEvento() {
		return fechaDeEvento;
	}

	public void setFechaDeEvento(final String fechaDeEvento) {
		this.fechaDeEvento = fechaDeEvento;
	}

}
