package com.spring.boot.chat.word;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "word_table")
public class WordEntity {
	@Id
	private Integer id;
	private String word;
	public WordEntity(Integer id, String word) {
		super();
		this.id = id;
		this.word = word;
	}
	public WordEntity() {}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	
}
