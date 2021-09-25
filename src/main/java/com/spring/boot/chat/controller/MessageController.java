package com.spring.boot.chat.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.chat.message.Message;
import com.spring.boot.chat.word.WordEntity;
import com.spring.boot.chat.word.WordRepository;

@CrossOrigin("*/*")
@RestController
public class MessageController {

	@Autowired
	private WordRepository repo;
	private String word ;
	private Optional<WordEntity> obj;
	
	@PostMapping("/message")
	Message appendWord(@RequestBody Message msg)
	{
		obj = repo.findById(1);
		word = obj.isPresent() ? obj.get().getWord() : " word not retrived from db ";
		msg.setMessage(msg.getMessage().concat(" "+word));
		return msg;
	}
}
