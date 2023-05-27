public class MainLivro {
	    public static void main(String[] args) {
	        PilhaDeLivros pilha = new PilhaDeLivros(5);
	        
	        Livro livro1 = new Livro("A guerra dos Tronos", 684);
	        Livro livro2 = new Livro("A fúria dos Reis", 768);
	        Livro livro3 = new Livro("A tormenta de Espadas", 1216);
	        
	        pilha.empilhar(livro1);
	        pilha.empilhar(livro2);
	        pilha.empilhar(livro3);
	        
	        pilha.listarLivros();
	        
	        Livro livroRemovido = pilha.desempilhar();
	        System.out.println("Livro removido: "+ livroRemovido.getNome());
	    }


}
