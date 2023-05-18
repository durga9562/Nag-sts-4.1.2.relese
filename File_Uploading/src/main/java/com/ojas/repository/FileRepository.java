package com.ojas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.ojas.entity.FileUploadEntity;

@Repository
public interface FileRepository extends JpaRepository<FileUploadEntity, Integer> {

	void save(MultipartFile file);

}
