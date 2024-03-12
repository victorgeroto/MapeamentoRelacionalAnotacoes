package com.maprelacional.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "produto")

public class Produto {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY )
@Column (name = "id", nullable = false)

	private Integer id;


@Column (name = "nome", nullable = false, length = 100)

	private String nome;


@Column (name = "descricao", nullable = false, length = 100)

	private String descricao;


@Column (name = "preco", nullable = false, length = 100)

	private String preco;

}
