/*Crie uma classe que simule o acesso a um sistema solicitando login e senha. 

Compare os dados inseridos com os valores "java8". O usuário tem três tentativas para acertar, com mensagens de erro informativas a cada falha.*/


import javax.swing.JOptionPane;

public class login {
	
	public static void main(String[] args) {
		int tentativas = 3, contador = 1;
		
		while(contador < 5) {
			String login = JOptionPane.showInputDialog("Digite o Login:");
			String senha = JOptionPane.showInputDialog("Digite a Senha:");
			
			if(login.equals("java8") && senha.equals("java8")) {
				JOptionPane.showMessageDialog(null, "Login e Senha aceitos!");
				break;
			}else {
					if(tentativas == 0) {
					JOptionPane.showMessageDialog(null, "Voce não tem mais tentaivas");
				}else {
					JOptionPane.showMessageDialog(null, "Falha verifique senha ou loguin\n"+(tentativas--)+" tentativa(s)!");
					}				
			}
			contador++;
		}	
	}
}