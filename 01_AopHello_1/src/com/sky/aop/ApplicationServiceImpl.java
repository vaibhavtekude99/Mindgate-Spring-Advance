package com.sky.aop;

import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl  implements ApplicationService {

	@Override
	public void proccesApplicationForm() {
		// TODO Auto-generated method stub
		System.out.println("In a processApplication method ApplicationServiceImplclass");
	}

	@Auditable(value="check")
	@Override
	public String processApplicationWithAudit() {

		System.out.println("Process Application in process service");
		return "success";
	}
	

}
