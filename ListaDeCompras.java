import java.util.Scanner;

	import java.util.ArrayList;

	public class ListaDeCompras {
	    private ArrayList<String> itens = new ArrayList<>();
	    private ArrayList<Integer> quantidades = new ArrayList<>();

	    public void adicionarItem(String item, int quantidade) {
	        itens.add(item);
	        quantidades.add(quantidade);
	    }

	    public void removerItem(String item) {
	        int index = itens.indexOf(item);
	        if (index != -1) {
	            itens.remove(index);
	            quantidades.remove(index);
	        }
	    }

	    public void listarItens() {
	        System.out.println("Lista de compras:");
	        for (int i = 0; i < itens.size(); i++) {
	            System.out.println("- " + itens.get(i) + " (" + quantidades.get(i) + ")");
	        }
	    }

	    public static void main(String[] args) {
	        ListaDeCompras lista = new ListaDeCompras();
	        lista.adicionarItem("Maçã", 2);
	        lista.adicionarItem("Banana", 3);
	        lista.adicionarItem("Leite", 1);
	        lista.removerItem("Banana");
	        lista.listarItens();
	    }
	}
