package com.library.app;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "books")
@Getter
@Setter
public class Books extends AbstractAuditingEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String author;
	
	@Column(nullable = false)
	private String isbn;
	
	@Column(nullable = false)
	private String publisher;
	
	@Column(nullable = false)
	private Integer yearOfPublication;
	
	@Column(nullable = false)
	private String placeOfPublication;
	
	@Column(nullable = false)
	private Integer availableCopies;
	
	@Column(nullable = false)
	private String barcode;
	
}
