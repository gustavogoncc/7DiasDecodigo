public class PilhaDeLivros {
	private Livro[] livros;
	private int tamanho;
	private int capacidade;
	
	public PilhaDeLivros(int capacidade) {
		this.capacidade = capacidade;
		livros = new Livro[capacidade];
		tamanho = 0;
	}
	public boolean pilhaVazia() {
		return tamanho == 0;
	}
	public boolean pilhaCheia() {
		return tamanho == capacidade;
	}
	
	public void empilhar(Livro livro) {
		if(pilhaCheia()) {
			System.out.println("A pilha está cheia. Não é possivel adicionar mais livros");
			return;
		}
		livros[tamanho]  = livro;
		tamanho++;
	}
	public Livro desempilhar() {
		if(pilhaVazia()) {
			System.out.println("A pilha está cheia. Não há livros para remover.");
			return null;
		}
		tamanho--;
		Livro livroRemovido = livros[tamanho];
		livros[tamanho] = null;
		return livroRemovido;
	}
	public Livro livroDoTopo() {
		if(pilhaVazia()) {
			System.out.println("A pilha está vazia. Não há livros no topo");
			return null;
		}
		return livros[tamanho -1];		
		}
	public void listarLivros() {
		if(pilhaVazia()) {
			System.out.println("A pilha está vazia. Não há livros para listar ");
			return;
		}
		System.out.println("Livros na pilha: ");
		for(int i = tamanho -1; i >= 0; i--) {
			System.out.println(livros[i].getNome()+ "-"+ livros[i].getNumeroDePaginas()+"Páginas");
		}
	}
	
}
