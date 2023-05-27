public class ListaDePacientes {
	private Paciente primeiro;
	private int tamanho;
	
	public ListaDePacientes() {
		this.primeiro = null;
		this.tamanho = 0;
	}
	
	public void adicionarPaciente(String nome, int id,String estadoDeSaude) {
		Paciente novoPaciente = new Paciente(nome, id, estadoDeSaude);
		if(primeiro == null) {
			primeiro = novoPaciente;
		}else {
			Paciente atual = primeiro;
			while(atual.getProximo()!= null) {
				atual = atual.getProximo();
			}
			atual.setProximo(novoPaciente);
		}
		tamanho++;
	}
	public void removerPaciente(int id) {
		if(primeiro == null) {
			return;
		}
		if(primeiro.getId() == id) {
			primeiro = primeiro.getProximo();
			tamanho--;
			return;
		}
		Paciente atual = primeiro;
		while(atual.getProximo() != null && atual.getProximo().getId() != id) {
			atual = atual.getProximo();
		}
		if(atual.getProximo() == null) {
			return;
		}
		atual.setProximo(atual.getProximo().getProximo());
		tamanho --;
	}
	public void listarPacientes() {
		Paciente atual = primeiro;
		while(atual != null) {
			System.out.println("Nome:"+ atual.getNome());
			System.out.println("ID:"+ atual.getId());
			System.out.println("Estado de saúde:"+ atual.getEstadoDeSaude());
			atual = atual.getProximo();
		}
	}
	public int getTamanho() {
		return tamanho;
	}

}
