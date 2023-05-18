package com.ojas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ojas.entity.FileUploadEntity;
import com.ojas.repository.FileRepository;

@Service
public class DownloadService {
	@Autowired
	private FileRepository repo;
	public List<FileUploadEntity> getAllFiles() {
		return repo.findAll();
	}
	
	public Optional<FileUploadEntity> getFileById( int id){
		return repo.findById(id);
		
	}

}
