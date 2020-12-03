package com.java.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "image_model")
public class ImageModel {

	public ImageModel() {
		super();
	}

	public ImageModel(String name, String type, byte[] picByte) {
		this.name = name;
		this.type = type;
		this.picByte = picByte;
	}

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "type")
	private String type;

	@Column(name = "picByte", length = 1000)
	private byte[] picByte;
}