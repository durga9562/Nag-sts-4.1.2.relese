package com.ojas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entity.FileUploadEntity;
import com.ojas.service.DownloadService;

@RestController
public class FileDownload {
	@Autowired
	private DownloadService downloadService;

	@GetMapping("/getAll")
	public List<FileUploadEntity> getAllFiles() {
		return downloadService.getAllFiles();
	}
	@GetMapping("/file/{id}")
	public Optional<FileUploadEntity> getFileById(@PathVariable int id){
		return downloadService.getFileById(id);
		
	}
	
}
