package com.ojas.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ojas.entity.FileUploadEntity;
import com.ojas.service.FileService;
@RestController
public class FileController {
	@Autowired
	private FileService service;
	@PostMapping("/upload")
	public FileUploadEntity fileUpload(@RequestParam("name") String name,@RequestParam("message") String message,@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		return service.store(file);
		 
		
	}
}
