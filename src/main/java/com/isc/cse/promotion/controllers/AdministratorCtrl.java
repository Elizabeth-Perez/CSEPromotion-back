package com.isc.cse.promotion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isc.cse.promotion.models.entity.Academy;
import com.isc.cse.promotion.models.entity.Carousels;
import com.isc.cse.promotion.models.entity.CarouselsLogin;
import com.isc.cse.promotion.models.entity.Carrer;
import com.isc.cse.promotion.models.entity.Categories;
import com.isc.cse.promotion.models.entity.Entities;
import com.isc.cse.promotion.models.entity.Opportunities;
import com.isc.cse.promotion.models.entity.Participants;
import com.isc.cse.promotion.models.entity.ProgramType;
import com.isc.cse.promotion.models.entity.Programs;
import com.isc.cse.promotion.models.entity.ProjectMembers;
import com.isc.cse.promotion.models.entity.Projects;
import com.isc.cse.promotion.models.entity.Specialities;
import com.isc.cse.promotion.models.entity.Stays;
import com.isc.cse.promotion.models.services.AcademyService;
import com.isc.cse.promotion.models.services.CareerService;
import com.isc.cse.promotion.models.services.CarouselLoginService;
import com.isc.cse.promotion.models.services.CarouselService;
import com.isc.cse.promotion.models.services.CategoriesService;
import com.isc.cse.promotion.models.services.EntityService;
import com.isc.cse.promotion.models.services.OpportunityService;
import com.isc.cse.promotion.models.services.ParticipantService;
import com.isc.cse.promotion.models.services.ProgramService;
import com.isc.cse.promotion.models.services.ProgramTypeService;
import com.isc.cse.promotion.models.services.ProjectMembersService;
import com.isc.cse.promotion.models.services.ProjectService;
import com.isc.cse.promotion.models.services.SpecialityService;
import com.isc.cse.promotion.models.services.StayService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/administrator")
public class AdministratorCtrl {
	
	@Autowired
	private CareerService careerService;
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private AcademyService academyService;
	
	@Autowired
	private ProjectMembersService projectMemberService;
	
	@Autowired
	private CategoriesService categoryService;
	
	@Autowired
	private ProgramService programService;
	
	@Autowired
	private ProgramTypeService programTypeService;
	
	@Autowired
	private SpecialityService specialityService;
	
	@Autowired
	private OpportunityService opportunityService;
	
	@Autowired
	private EntityService entityService;
	
	@Autowired
	private StayService stayService;
	
	@Autowired
	private ParticipantService participantService;
	
	@Autowired
	private CarouselLoginService carouselLoginService;
	
	@Autowired
	private CarouselService carouselService;
	
	@GetMapping("/careers/all")
	public List<Carrer> allCareers(){
		return careerService.all();
	}
	
	@PostMapping("/careers/create")
	public Carrer createCareer(@RequestBody Carrer carrer) {
		return careerService.add(carrer);
	}
	
	@PutMapping("/careers/update/{studyProgram}")
	public Carrer updateCarrer(@RequestBody Carrer career, @PathVariable String studyProgram) {
		Carrer careerCurrent = careerService.findById(studyProgram);
		careerCurrent.setExtension(career.getExtension());
		careerCurrent.setPhone(career.getPhone());
		careerCurrent.setEmail(career.getEmail());
		careerCurrent.setStudyGridUrl(career.getStudyGridUrl());
		careerCurrent.setChartUrl(career.getChartUrl());
		careerCurrent.setMission(career.getMission());
		careerCurrent.setVision(career.getVision());
		careerCurrent.setProgramPurpose(career.getProgramPurpose());
		careerCurrent.setActionField(career.getActionField());
		careerCurrent.setAdmissionProfile(career.getAdmissionProfile());
		careerCurrent.setGraduationProfile(career.getGraduationProfile());
		careerCurrent.setSnFacebook(career.getSnFacebook());
		careerCurrent.setSnYoutube(career.getSnYoutube());
		careerCurrent.setSnLinkedin(career.getSnLinkedin());
		careerCurrent.setStatus(career.getStatus());
		return careerService.add(careerCurrent);
	}
	
	@GetMapping("/careers/{id}")
	public Carrer findCareer(@PathVariable String id) {
		return careerService.findById(id);
	}
	
	@DeleteMapping("/careers/{id}")
	public void deleteCareer(@PathVariable String id) {
		careerService.delete(id);
	}
	
	@GetMapping("/projects/all")
	public List<Projects> allProjects(){
		return projectService.all();
	}
	
	@PostMapping("/projects/create")
	public Projects createProject(@RequestBody Projects project) {
		return projectService.add(project);
	}
	
	@PutMapping("/projects/update/{idProject}")
	public Projects updateProject(@RequestBody Projects project, @PathVariable Long idProject) {
		Projects projectCurrent = projectService.findById(idProject);
		projectCurrent.setCarrer(project.getCarrer());
		projectCurrent.setAcademy(project.getAcademy());
		projectCurrent.setProjectMember(project.getProjectMember());
		projectCurrent.setCategory(project.getCategory());
		projectCurrent.setName(project.getName());
		projectCurrent.setDescription(project.getDescription());
		projectCurrent.setImageUrl(project.getImageUrl());
		return projectService.add(projectCurrent);
	}
	
	@GetMapping("/projects/{id}")
	public Projects findProject(@PathVariable Long id) {
		return projectService.findById(id);
	}
	
	@DeleteMapping("/projects/{id}")
	public void deleteProject(@PathVariable Long id) {
		projectService.delete(id);
	}
	
	@GetMapping("/academy/all")
	public List<Academy> allAcademy(){
		return academyService.all();
	}
	
	@PostMapping("/academy/create")
	public Academy createAcademy(@RequestBody Academy academy) {
		return academyService.add(academy);
	}
	
	@PutMapping("/academy/update/{teacherEnrollment}")
	public Academy updateCategory(@RequestBody Academy academy, @PathVariable String teacherEnrollment) {
		Academy academyCurrent = academyService.findById(teacherEnrollment);
		academyCurrent.setCarrer(academy.getCarrer());
		academyCurrent.setFirstName(academy.getFirstName());
		academyCurrent.setLastName(academy.getLastName());
		academyCurrent.setDegree(academy.getDegree());
		academyCurrent.setRol(academy.getRol());
		academyCurrent.setEmail(academy.getEmail());
		return academyService.add(academyCurrent);
	}
	
	@GetMapping("/academy/{id}")
	public Academy findAcademy(@PathVariable String id) {
		return academyService.findById(id);
	}
	
	@DeleteMapping("/academy/{id}")
	public void deleteAcademy(@PathVariable String id) {
		academyService.delete(id);
	}
	
	@GetMapping("/project-members/all")
	public List<ProjectMembers> allProjectMembers(){
		return projectMemberService.all();
	}
	
	@PostMapping("/project-members/create")
	public ProjectMembers createProjectMembers(@RequestBody ProjectMembers projectMembers) {
		return projectMemberService.add(projectMembers);
	}
	
	@PutMapping("/project-members/update/{controlNumber}")
	public ProjectMembers updateProjectMembers(@RequestBody ProjectMembers projectMember, @PathVariable String controlNumber) {
		ProjectMembers projectMembersCurrent = projectMemberService.findById(controlNumber);
		projectMembersCurrent.setFirstName(projectMember.getFirstName());
		projectMembersCurrent.setLastName(projectMember.getLastName());
		return projectMemberService.add(projectMembersCurrent);
	}
	
	@GetMapping("/project-members/{id}")
	public ProjectMembers findProjectMember(@PathVariable String id) {
		return projectMemberService.findById(id);
	}
	
	@DeleteMapping("/project-members/{id}")
	public void deleteProjectMember(@PathVariable String id) {
		projectMemberService.delete(id);
	}
	
	@GetMapping("/categories/all")
	public List<Categories> allCategories(){
		return categoryService.all();
	}
	
	@PostMapping("/categories/create")
	public Categories createCategory(@RequestBody Categories category) {
		return categoryService.add(category);
	}
	
	@PutMapping("/categories/update/{idCategory}")
	public Categories updateCategory(@RequestBody Categories category, @PathVariable Long idCategory) {
		Categories categoryCurrent = categoryService.findById(idCategory);
		categoryCurrent.setName(category.getName());
		return categoryService.add(categoryCurrent);
	}
	
	@GetMapping("/categories/{id}")
	public Categories findCategory(@PathVariable Long id) {
		return categoryService.findById(id);
	}
	
	@DeleteMapping("/categories/{id}")
	public void deleteCategory(@PathVariable Long id) {
		categoryService.delete(id);
	}
	
	@GetMapping("/programs/all")
	public List<Programs> allPrograms(){
		return programService.all();
	}
	
	@PostMapping("/programs/create")
	public Programs createProgram(@RequestBody Programs program) {
		return programService.add(program);
	}
	
	@PutMapping("/programs/update/{idProgram}")
	public Programs updateProgram(@RequestBody Programs program, @PathVariable Long idProgram) {
		Programs programCurrent = programService.findById(idProgram);
		programCurrent.setCarrer(program.getCarrer());
		programCurrent.setProgramType(program.getProgramType());
		programCurrent.setName(program.getName());
		programCurrent.setDescription(program.getDescription());
		programCurrent.setImageUrl(program.getImageUrl());
		programCurrent.setHyperlink(program.getHyperlink());
		return programService.add(programCurrent);
	}
	
	@GetMapping("/programs/{id}")
	public Programs findProgram(@PathVariable Long id) {
		return programService.findById(id);
	}
	
	@DeleteMapping("/programs/{id}")
	public void deleteProgram(@PathVariable Long id) {
		programService.delete(id);
	}
	
	@GetMapping("/program-type/all")
	public List<ProgramType> allProgramType(){
		return programTypeService.all();
	}
	
	@GetMapping("/specialities/all")
	public List<Specialities> allSpecialities(){
		return specialityService.all();
	}
	
	@PostMapping("/specialities/create")
	public Specialities createSpeciality(@RequestBody Specialities speciality) {
		return specialityService.add(speciality);
	}
	
	@PutMapping("/specialities/update/{keySpeciality}")
	public Specialities updateSpeciality(@RequestBody Specialities speciality, @PathVariable String keySpeciality) {
		Specialities specialityCurrent = specialityService.findById(keySpeciality);
		specialityCurrent.setCarrer(speciality.getCarrer());
		specialityCurrent.setName(speciality.getName());
		specialityCurrent.setDefinition(speciality.getDefinition());
		specialityCurrent.setImageUrl(speciality.getImageUrl());
		return specialityService.add(specialityCurrent);
	}
	
	@GetMapping("/specialities/{id}")
	public Specialities findSpeciality(@PathVariable String id) {
		return specialityService.findById(id);
	}
	
	@DeleteMapping("/specialities/{id}")
	public void deleteSpeciality(@PathVariable String id) {
		specialityService.delete(id);
	}
	
	@GetMapping("/opportunities/all")
	public List<Opportunities> allOpportunities(){
		return opportunityService.all();
	}
	
	@PostMapping("/opportunities/create")
	public Opportunities createOpportunity(@RequestBody Opportunities opportunity) {
		return opportunityService.add(opportunity);
	}
	
	@PutMapping("/opportunities/update/{idOpportunity}")
	public Opportunities updateSpeciality(@RequestBody Opportunities opportunity, @PathVariable Long idOpportunity) {
		Opportunities opportunityCurrent = opportunityService.findById(idOpportunity);
		opportunityCurrent.setCarrer(opportunity.getCarrer());
		opportunityCurrent.setEntity(opportunity.getEntity());
		opportunityCurrent.setStay(opportunity.getStay());
		opportunityCurrent.setParticipant(opportunity.getParticipant());
		opportunityCurrent.setImageURL(opportunity.getImageURL());
		opportunityCurrent.setHyperlink(opportunity.getHyperlink());
		return opportunityService.add(opportunityCurrent);
	}
	
	@GetMapping("/opportunities/{id}")
	public Opportunities findSpeciality(@PathVariable Long id) {
		return opportunityService.findById(id);
	}
	
	@DeleteMapping("/opportunities/{id}")
	public void deleteOpportunity(@PathVariable Long id) {
		opportunityService.delete(id);
	}
	
	@GetMapping("/entities/all")
	public List<Entities> allEntities(){
		return entityService.all();
	}
	
	@PostMapping("/entities/create")
	public Entities createEntity(@RequestBody Entities entity) {
		return entityService.add(entity);
	}
	
	@PutMapping("/entities/update/{idEntity}")
	public Entities updateEntity(@RequestBody Entities entity, @PathVariable Long idEntity) {
		Entities entityCurrent = entityService.findById(idEntity);
		entityCurrent.setName(entity.getName());
		return entityService.add(entityCurrent);
	}
	
	@GetMapping("/entities/{id}")
	public Entities findEntity(@PathVariable Long id) {
		return entityService.findById(id);
	}
	
	@DeleteMapping("/entities/{id}")
	public void deleteEntity(@PathVariable Long id) {
		entityService.delete(id);
	}

	@GetMapping("/stays/all")
	public List<Stays> allStays(){
		return stayService.all();
	}
	
	@PostMapping("/stays/create")
	public Stays createStays(@RequestBody Stays stay) {
		return stayService.add(stay);
	}
	
	@PutMapping("/stays/update/{idStay}")
	public Stays updateStays(@RequestBody Stays stay, @PathVariable Long idStay) {
		Stays stayCurrent = stayService.findById(idStay);
		stayCurrent.setName(stay.getName());
		return stayService.add(stayCurrent);
	}
	
	@GetMapping("/stays/{id}")
	public Stays findStays(@PathVariable Long id) {
		return stayService.findById(id);
	}
	
	@DeleteMapping("/stays/{id}")
	public void deleteStays(@PathVariable Long id) {
		stayService.delete(id);
	}
	
	@GetMapping("/participants/all")
	public List<Participants> allParticipants(){
		return participantService.all();
	}
	
	@GetMapping("/carousels-login/all")
	public List<CarouselsLogin> allCarouselsLogin(){
		return carouselLoginService.all();
	}
	
	@PostMapping("/carousels-login/create")
	public CarouselsLogin createCarouselLogin(@RequestBody CarouselsLogin carouselLogin) {
		return carouselLoginService.add(carouselLogin);
	}
	
	@PutMapping("/carousels-login/update/{idCarouselLogin}")
	public CarouselsLogin updateCarouselLogin(@RequestBody CarouselsLogin carouselLogin, @PathVariable Long idCarouselLogin) {
		CarouselsLogin carouselLoginCurrent = carouselLoginService.findById(idCarouselLogin);
		carouselLoginCurrent.setCarousel(carouselLogin.getCarousel());
		carouselLoginCurrent.setTitle(carouselLogin.getTitle());
		carouselLoginCurrent.setDescription(carouselLogin.getDescription());
		return carouselLoginService.add(carouselLoginCurrent);
	}
	
	@GetMapping("/carousels-login/{id}")
	public CarouselsLogin findCarouselLogin(@PathVariable Long id) {
		return carouselLoginService.findById(id);
	}
	
	@DeleteMapping("/carousels-login/{id}")
	public void deleteCarouselLogin(@PathVariable Long id) {
		carouselLoginService.delete(id);
	}
	
	@GetMapping("/carousels/all")
	public List<Carousels> allCarousels(){
		return carouselService.all();
	}
	
	@PostMapping("/carousels/create")
	public Carousels createCarousel(@RequestBody Carousels carousels) {
		return carouselService.add(carousels);
	}
	
	@PutMapping("/carousels/update/{idCarousel}")
	public Carousels updateCarousel(@RequestBody Carousels carousel, @PathVariable Long idCarousel) {
		Carousels carouselCurrent = carouselService.findById(idCarousel);
		carouselCurrent.setCarrer(carousel.getCarrer());
		carouselCurrent.setImageUrl(carousel.getImageUrl());
		carouselCurrent.setOwner(carousel.getOwner());
		return carouselService.add(carouselCurrent);
	}
	
	@GetMapping("/carousels/{id}")
	public Carousels findCarousel(@PathVariable Long id) {
		return carouselService.findById(id);
	}
	
	@DeleteMapping("/carousels/{id}")
	public void deleteCarousel(@PathVariable Long id) {
		carouselService.delete(id);
	}
}
