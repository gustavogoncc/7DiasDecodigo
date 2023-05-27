public class Paciente {
	private String nome;
	private int id;
	private String estadoDeSaude;
	private Paciente proximo;
	
	public Paciente(String nome,int id, String estadoDeSaude) {
		this.nome = nome;
		this.id = id;
		this.estadoDeSaude = estadoDeSaude;
		this.proximo = null;
	}
	
	// Getters e setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstadoDeSaude() {
		return estadoDeSaude;
	}
	public void setEstadoDeSaude(String estadoDeSaude) {
		this.estadoDeSaude = estadoDeSaude;
	}
	public Paciente getProximo() {
		return proximo;
	}
	public void setProximo(Paciente proximo) {
		this.proximo = proximo;
	}

}
