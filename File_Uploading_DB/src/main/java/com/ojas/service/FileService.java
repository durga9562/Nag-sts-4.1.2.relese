package com.ojas.service;

import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ojas.entity.FileUploadEntity;
import com.ojas.repository.FileRepository;

@Service
public class FileService {
	private FileRepository repo;

	public FileUploadEntity store(MultipartFile file) throws IOException {
		String fileName = file.getOriginalFilename();
		FileUploadEntity entity = new FileUploadEntity(UUID.randomUUID(), fileName, file.getContentType(),
				file.getBytes());
		return repo.save(entity);
	}
}
