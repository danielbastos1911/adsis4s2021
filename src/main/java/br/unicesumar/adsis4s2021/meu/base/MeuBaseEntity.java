package br.unicesumar.adsis4s2021.meu.base;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class MeuBaseEntity {
	@Id
	private String id;
	
	public MeuBaseEntity() {
	}
	
	public MeuBaseEntity(String id) {
		this.id = id;
	}



	public String getId() {
		return id;
	}

}
