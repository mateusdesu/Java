import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String name;
		int agencia,numeroConta;
		float saldo;
		
		JOptionPane.showMessageDialog(null, "Insira os dados a seguir para criar sua conta.");
		name = JOptionPane.showInputDialog(null,"Qual o seu nome?");
		agencia = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o número da agência?"));
		numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o número da conta?"));
		saldo = Float.parseFloat(JOptionPane.showInputDialog(null,"Qual o seu saldo?"));
		JOptionPane.showMessageDialog(null, "Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numeroConta + " e seu saldo R$" + saldo + " já está disponivel para saque.");


	}

}
