package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name="user-id")
public class UEntity {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	@JsonIgnore
	private String Passwd;
	@NaturalId
	private int cin;
	@NaturalId
	private String email;
	@NaturalId
	private String adress;
	public UEntity(int cin,String nom,String P,String mail,String adresse) {
		this.cin=cin;
		this.name=nom;
		this.Passwd=P;
		this.email=mail;
		this.adress=adresse;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getcin() {
		return this.cin;
	}
	public void setcin(int cin) {
		this.cin=cin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return Passwd;
	}
	public void setPasswd(String passwd) {
		Passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getadress() {
		return this.adress;
	}
	public void setadress(String adress) {
		this.adress=adress;
	}
	
	
	@Override
	public String toString() {
		return "UEntity [id=" + id + ", name=" + name + ", Passwd=" + Passwd + ", email=" + email + ", adress=" + adress
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Passwd == null) ? 0 : Passwd.hashCode());
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		UEntity other = (UEntity) obj;
		if (Passwd == null) {
			if (other.Passwd != null)
				return false;
		} else if (!Passwd.equals(other.Passwd))
			return false;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	 
	
}
