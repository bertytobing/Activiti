package com.student.model.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "students", uniqueConstraints = @UniqueConstraint(columnNames = { "nik" }))
public class Student {

	@Id
	@Column(columnDefinition = "char(36)", nullable = false)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	@NotEmpty
	private String id;

	@Column(nullable = false)
	@Length(max = 255)
	@NotEmpty
	private String name;

	@Column(nullable = false)
	@Length(max = 255)
	@NotEmpty
	private String nik;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

}
