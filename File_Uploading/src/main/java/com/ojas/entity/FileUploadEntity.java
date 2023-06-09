package com.ojas.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "files")
public class FileUploadEntity {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "filename")
	private String name;
	@Column(name = "description")
	private String message;
	@Column(name = "filepath")
	private String file;
	@Column(name="filesize")
	private double fileSize;
	
	
	@Column(name = "filetype")
	private String type;
	@Column(name = "uploader")
	private String uploader;
	
	
	@Column(name = "uploaddate")
	private Date uploaddDate;


	public FileUploadEntity(String name, String message, String file, double fileSize, String type, String uploader,
			Date uploaddDate) {
		super();
		this.name = name;
		this.message = message;
		this.file = file;
		this.fileSize = fileSize;
		this.type = type;
		this.uploader = uploader;
		this.uploaddDate = uploaddDate;
	}


	public FileUploadEntity() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getFile() {
		return file;
	}


	public void setFile(String file) {
		this.file = file;
	}


	public double getFileSize() {
		return fileSize;
	}


	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getUploader() {
		return uploader;
	}


	public void setUploader(String uploader) {
		this.uploader = uploader;
	}


	public Date getUploaddDate() {
		return uploaddDate;
	}


	public void setUploaddDate(Date uploaddDate) {
		this.uploaddDate = uploaddDate;
	}
	

	

}
