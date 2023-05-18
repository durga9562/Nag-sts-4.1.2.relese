package com.ojas.service;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ojas.VO.Department;
import com.ojas.VO.ResponseTemplateVO;
import com.ojas.entity.User;
import com.ojas.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private RestTemplate restTemplate;
	
	
	//static Logger log=(Logger) LoggerFactory.getLogger(UserService.class);

	public User saveUser(User user) {
		//log.info("inside saveUser method Of UserService");
		return userRepo.save(user);
	}

	public User findUserById(Integer userId) {
		//log.info("inside findDeparmentById method Of UserService");
		return userRepo.findById(userId).get();
	}



	public ResponseTemplateVO getUserWithDepartment(Integer userId) {
		ResponseTemplateVO vo= new ResponseTemplateVO();
		User user=userRepo.findByUserId(userId);
	///	Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+user.getDepartmentId(),Department.class);
		vo.setUser(user);
		//vo.setDepartment(department);
		return vo;
	}

	
	

}
