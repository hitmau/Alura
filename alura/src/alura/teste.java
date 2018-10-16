package alura;

public class teste {

	public static void main(String[] args) {
Conta mauricio = new Conta();
//mauricio.getTitular.setNome("Mauricio Rodrigues");
mauricio.getTitular().setNome("Mauricio Rodrigues");
mauricio.getTitular().setCpf("222.222.222.12");
Conta mariha = new Conta();
mariha.getTitular().setNome("Marihá Rodrigues");
mauricio.Deposita(1000);
System.out.println(mauricio.getSaldo());

mauricio.Transfere(210, mariha);
System.out.println("Mauricio: " + mauricio.getSaldo() + " - cpf: " + mauricio.getTitular().getCpf());
System.out.println("Marihá: " + mariha.getSaldo());

mariha.Transfere(250, mauricio);
 
//mauricio.titular = new Cliente();

	}

}
