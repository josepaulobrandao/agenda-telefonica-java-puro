package executavel;

import javax.swing.JOptionPane;

import agenda.Pessoa;
import agenda.Telefone;

public class Programa {
	public static void main(String[] args) {
		
		String[] tels = new String[3];
		
		
		tels[0] = "11-95499-7061";
		tels[1] = "11-94911-4444";
		tels[2] = "11-94679-6544";

		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("jose paulo");
		pessoa.setSobreNome("Nascimento Jr");
		pessoa.setCpf("69-664.321.64");
		pessoa.setDataNascimento("08/04/1694");
		pessoa.setRg("444.644.994-7");
		
		Telefone telefone = new Telefone();
		
		telefone.setOperadora("tim");
		telefone.setNumeroTelefone(tels);		
		
		pessoa.getTelefones().add(telefone);

	
		for(String tel : telefone.getNumeroTelefone()) {
			System.out.println(pessoa.toString());
			System.out.println(tel);
		}
		
		
		
	
	
		
		
	}

}
