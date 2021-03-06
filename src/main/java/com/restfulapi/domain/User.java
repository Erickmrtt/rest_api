package com.restfulapi.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String name;
	private String email;
	private String born;
	private String cpf;
	private String vacina;
	private String data_vacina;
	
	public User() {
		
	}

	public User(String name, String email, String born, String cpf, String data_vacina, String vacina, String id) {
		super();
		this.name = name;
		this.email = email;
		this.born = born;
		this.cpf = cpf;
		this.vacina = vacina;
		this.data_vacina = data_vacina;
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public void setId( String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBorn() {
		return born;
	}

	public void setBorn(String born) {
		this.born = born;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getVacina() {
		return vacina;
	}

	public void setVacina(String vacina) {
		this.vacina = vacina;
	}

	public String getData_vacina() {
		return data_vacina;
	}

	public void setData_vacina(String data_vacina) {
		this.data_vacina = data_vacina;
	}


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data_vacina == null) ? 0 : data_vacina.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((vacina == null) ? 0 : vacina.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (data_vacina == null) {
			if (other.data_vacina != null)
				return false;
		} else if (!data_vacina.equals(other.data_vacina))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (vacina == null) {
			if (other.vacina != null)
				return false;
		} else if (!vacina.equals(other.vacina))
			return false;
		return true;
	}

}
