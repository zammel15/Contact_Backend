package org.zl.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contact  implements Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long id ; 
	private String nom ;
	private String prenom ;
	@Temporal(TemporalType.DATE)
	private Date DateNaissance ; 
	private String email ; 
	private int  tel ; 
	private String photo ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return DateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		DateNaissance = dateNaissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Contact(String nom, String prenom, Date dateNaissance, String email, int tel, String photo) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		DateNaissance = dateNaissance;
		this.email = email;
		this.tel = tel;
		this.photo = photo;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}