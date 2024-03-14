package com.isc.cse.promotion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isc.cse.promotion.models.entity.Certifications;
import com.isc.cse.promotion.models.entity.Frameworks;
import com.isc.cse.promotion.models.entity.Functions;
import com.isc.cse.promotion.models.entity.Ides;
import com.isc.cse.promotion.models.entity.ProgrammingLanguages;
import com.isc.cse.promotion.models.entity.Skills;
import com.isc.cse.promotion.models.entity.Specialities;
import com.isc.cse.promotion.models.services.CertificationsService;
import com.isc.cse.promotion.models.services.FrameworksService;
import com.isc.cse.promotion.models.services.FunctionService;
import com.isc.cse.promotion.models.services.IdesService;
import com.isc.cse.promotion.models.services.ProgrammingService;
import com.isc.cse.promotion.models.services.SkillsService;
import com.isc.cse.promotion.models.services.SpecialityService;

@CrossOrigin(origins = {"http://localhost:4200"})
//@CrossOrigin(origins = {"http://csepromotion.s3-website.us-east-2.amazonaws.com"})
@RestController
@RequestMapping("/specialities")
public class SpecialitiesCtrl {
	
	@Autowired
	private SpecialityService specialityService;
	
	@Autowired
	private FunctionService functionService;
	
	@Autowired
	private SkillsService skillsService;
	
	@Autowired
	private ProgrammingService programmingService;
	
	@Autowired
	private IdesService ideService;
	
	@Autowired
	private FrameworksService frameworkService;
	
	@Autowired
	private CertificationsService certificationService;
	
	@GetMapping("/all")
	public List<Specialities> getSpecialities(){		
		return specialityService.all();
	}
	
	@GetMapping("/functions/all")
	public List<Functions> getFunctions(){		
		return functionService.all();
	}
	
	@GetMapping("/skills/all")
	public List<Skills> getSkillls(){		
		return skillsService.all();
	}
	
	@GetMapping("/programming/all")
	public List<ProgrammingLanguages> getProgramming(){		
		return programmingService.all();
	}
	
	@GetMapping("/ides/all")
	public List<Ides> getIdes(){		
		return ideService.all();
	}
	
	@GetMapping("/frameworks/all")
	public List<Frameworks> getFrameworks(){		
		return frameworkService.all();
	}
	
	@GetMapping("/certifications/all")
	public List<Certifications> getCertifications(){		
		return certificationService.all();
	}

}
