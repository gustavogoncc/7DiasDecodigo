public class MainPaciente {
	public static void main(String []args) {
		ListaDePacientes lista = new ListaDePacientes();
		
		// Adicionando pacientes na lista
		lista.adicionarPaciente("João",1,"estável");
		lista.adicionarPaciente("Maria",2,"em tratamento intensivo");
		lista.adicionarPaciente("José",3,"em estado critico");
		
		// Listando todos os pacientes
		
		lista.listarPacientes();
		
		//Removendo paciente pelo número de identificação
		
		lista.removerPaciente(1);
		
		// Listando todos os pacientes após a remnoção
		
		lista.listarPacientes();
		
		// Adicionando mais pacientes
		
		lista.adicionarPaciente("Pedro", 4,"estável");
		lista.adicionarPaciente("Ana",5,"em tratamento intensivo");
		
		//Listando todos os pacientes após a edição
		
		lista.listarPacientes();
		
		  // Removendo o primeiro paciente da lista
        lista.removerPaciente(1);
        
        // Listando todos os pacientes após a remoção
        lista.listarPacientes();
        
        // Removendo um paciente que não existe na lista
        lista.removerPaciente(6);
        
        // Listando todos os pacientes após a tentativa de remoção
        lista.listarPacientes();
	}
}
