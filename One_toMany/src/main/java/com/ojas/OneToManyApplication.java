package com.ojas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ojas.entity.CourceEntity;
import com.ojas.entity.StudentEntity;
import com.ojas.repo.CourceRepository;
import com.ojas.repo.StudentRepository;

@SpringBootApplication
public class OneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(OneToManyApplication.class, args);
		CourceRepository courceRepo = ctx.getBean(CourceRepository.class);
		StudentRepository studentRepo = ctx.getBean(StudentRepository.class);
		//to store the cource information
		StudentEntity stu=new StudentEntity();
		stu.setStudent_name("nagaraju");
		stu.setStudent_address("Warangal");
		StudentEntity stu1=new StudentEntity();
		stu.setStudent_name("Arjun");
		stu1.setStudent_address("Hyd");
		CourceEntity crs=new CourceEntity();
		crs.setCource_name("JavaFull Stack");
		crs.setDuration("6 months");
		crs.setCourcefee(6000);
		courceRepo.save(crs);
	}

}
