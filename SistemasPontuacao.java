import java.util.*;

public class SistemaPontuacao {
	private HashMap<String,Integer> pontuacao;
	
	public SistemaPontuacao() {
		pontuacao = new HashMap<>();
	}
	public void adicionarJogador(String nome, int pontos) {
		pontuacao.put(nome, pontos);
	}
	public void atualizarPontuacao(String nome, int pontos) {
		if(pontuacao.containsKey(nome)) {
			pontuacao.put(nome, pontos);
		}else {
			System.out.println("Jogador não encontrado.");
		}
	}
	public void removerJogador(String nome) {
		if(pontuacao.containsKey(nome)) {
			pontuacao.remove(nome);
		}else {
			System.out.println("Jogador não encontrado.");
		}
	}
	public void listarJogadores() {
		List<Map.Entry<String, Integer>> lista = new ArrayList<>(pontuacao.entrySet());
        Collections.sort(lista, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<String, Integer> entrada : lista) {
            System.out.println("Jogador: " + entrada.getKey() + ", Pontuação: " + entrada.getValue());
        }
        }
	public String determinarVencedor() {
		String vencedor = "";
		int maiorPontuacao = Integer.MIN_VALUE;
		for(Map.Entry<String, Integer>entrada: pontuacao.entrySet()) {
			if(entrada.getValue() > maiorPontuacao) {
				vencedor = entrada.getKey();
				maiorPontuacao = entrada.getValue();
			}
		}
		return vencedor;
	}
	public static void main(String[]args) {
		SistemaPontuacao sistema = new SistemaPontuacao();
		sistema.adicionarJogador("Jogador 1 ",100);
		sistema.adicionarJogador("Jogador 2 ",50);
		sistema.adicionarJogador("Jogador 3 ",200);
		sistema.adicionarJogador("Jogador 4 ",75);
		
		sistema.listarJogadores();
		
		sistema.atualizarPontuacao("Jogador 2: ",150);
		sistema.removerJogador("Jogador 4: ");
		
		sistema.listarJogadores();
		
		String vencedor = sistema.determinarVencedor();
		System.out.printf("O vencedor é: "+ vencedor);
	}


}
