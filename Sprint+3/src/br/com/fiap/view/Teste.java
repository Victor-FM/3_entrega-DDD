package br.com.fiap.view;
import br.com.fiap.models.Chamado;
import br.com.fiap.models.Formulario;
import br.com.fiap.models.Funcionario;
import br.com.fiap.models.Guinchos;
import br.com.fiap.models.Localizacao;
import br.com.fiap.models.Mecanico;
import br.com.fiap.models.Solicitacao;
import br.com.fiap.models.Usuario;
import br.com.fiap.models.Veiculo;
import br.com.fiap.models.Apolice;
import javax.swing.JOptionPane;

 
public class Teste {
	public static void main(String[] args) {
		//Usuario
		Chamado abreChamado = new Chamado(123321);
		Usuario usuario = new Usuario("Rick", "54915362884", 321123, "Rickzin1200", "RickOnFiap@123");
		Localizacao localizacao = new Localizacao("Avenida Lins", "São Paulo", "IDK", "proximo a fiap, onde vende churros");
		Apolice apolice = new Apolice(12321);	
		Veiculo veiculo = new Veiculo("FIAT", "Uno", (short) 1994, "EAWE-213", "idk", (float) 1000.50, (float) 3.70, (float) 20.5, "Tombou legal");
		
		//Funcionario
		Solicitacao abreSolicitacao = new Solicitacao(132231);
		Funcionario func = new Funcionario("Henrique213", "opsfugi", "Henrique", 51359);
		Guinchos guincho = new Guinchos("JOWD-912", "Guincho de Reboque", 15152);
		Mecanico mecanico = new Mecanico("seu Jorge", 6146);
		Localizacao localizacaoMecanico = new Localizacao("Aqui", "perto", "de", "voce");
		
		// Método rastrearLocalizacao utilizado abaixo
		try {
			//Digite o ID do mecânico para o sistema funcionar da maneira correta. Caso incorreta, irá entrar no else ou nas exceptions.
			int id;
			id = Integer.parseInt(JOptionPane.showInputDialog("Coloque aqui o id desejado para o rastreio : "));
			if (id == mecanico.getId()) {
				System.out.println(localizacaoMecanico.rastrearLocalizacao(id));
			} else {
				System.err.println("ID não encontrado!");
			}
			
		} catch (NumberFormatException e) {
			System.err.println("ID inválido!");
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println("Index inválido!");
			System.err.println(e.getMessage());
		}
		
		// Método cadastratFuncionario para manter uma lista dos logins e senhas.
		func.cadastrarFuncionario("Henrique213", "opsfugi");
		
		// Método solicitarMecanico, a localização do usuário é enviada para ele e retorna uma confirmação.
		System.out.println(func.solicitarMecanico(localizacao));
		
		// Método logarFuncionario utilizado abaixo
		String login;
		String senha;
		login = JOptionPane.showInputDialog("Coloque aqui o seu login: ");
		senha = JOptionPane.showInputDialog("Coloque aqui a sua senha: ");
		JOptionPane.showMessageDialog(null, func.logarFuncionario(login, senha));
		
		// Método preencherFormulario utilizado abaixo
		try{
			func.preencherFormulario(JOptionPane.showInputDialog("Informe aqui o nome para o formulário : "), JOptionPane.showInputDialog("Informe aqui a data do ocorrido : "), Float.parseFloat(JOptionPane.showInputDialog("Coloque o peso do veículo : ")), Float.parseFloat(JOptionPane.showInputDialog("Coloque a altura do veículo :")), Float.parseFloat(JOptionPane.showInputDialog("Coloque a largura do veículo : ")), JOptionPane.showInputDialog("Coloque informações adicionais : "));
		} catch (NumberFormatException e) {
			System.err.println("Valores informados inválidos!");
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println("Index inválidos!");
			System.err.println(e.getMessage());
		}
		
		
	}//main
}//class
