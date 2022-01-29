package agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pessoa {
	
	private String nome;
	private String sobreNome;
	private String rg;
	private String cpf;
	private String dataNascimento;
	private String email;
	
	private Telefone telefone;
	
	List<Telefone> telefones = new ArrayList<Telefone>();
	
	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, dataNascimento, nome, rg, sobreNome, telefone, telefones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(dataNascimento, other.dataNascimento)
				&& Objects.equals(nome, other.nome) && Objects.equals(rg, other.rg)
				&& Objects.equals(sobreNome, other.sobreNome) && Objects.equals(telefone, other.telefone)
				&& Objects.equals(telefones, other.telefones);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobreNome=" + sobreNome + ", rg=" + rg + ", cpf=" + cpf + ", dataNascimento="
				+ dataNascimento + ", telefone=" + telefone + ", telefones=" + telefones + "]";
	}


	
	
	

}
