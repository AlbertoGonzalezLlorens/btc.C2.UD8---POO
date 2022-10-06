package ud08ej04;

public class Serie {
	private String titulo;
	private int n_temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		this.titulo="";
		this.n_temporadas=3;
		this.entregado=false;
		this.genero="";
		this.creador="";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo=titulo;
		this.n_temporadas=3;
		this.entregado=false;
		this.genero="";
		this.creador=creador;
	}
	
	public Serie(String titulo, String creador, int n_temporadas, String genero) {
		this.titulo=titulo;
		this.n_temporadas= n_temporadas;
		this.entregado=false;
		this.genero=genero;
		this.creador=creador;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getN_temporadas() {
		return n_temporadas;
	}

	public void setN_temporadas(int n_temporadas) {
		this.n_temporadas = n_temporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
}
