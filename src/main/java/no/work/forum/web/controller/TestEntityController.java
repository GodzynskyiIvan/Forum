package no.work.forum.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import no.work.forum.domain.TestEntity;
import no.work.forum.service.TestEntityService;

@Controller
@RequestMapping("/test_entity")
public class TestEntityController {

	@Autowired
	TestEntityService testEntityService;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	String addForm() {
		return "addForm";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	String addHandler(@ModelAttribute TestEntity testEntity,
					Model model) {
		
		testEntityService.addTestEntity(testEntity);
		
		return getEntities(model);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	String editForm(@RequestParam int id,
					Model model) {
		
		TestEntity testEntity = testEntityService.getTestEntity(id);
		model.addAttribute("testEntity", testEntity);
		return "editEntityForm";
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	String editHandler(@ModelAttribute TestEntity testEntity,
					Model model) {
		
		testEntityService.editTestEntity(testEntity);
		return getEntities(model);
	}
	
	@RequestMapping("/")
	String getEntities(Model model) {
		List<TestEntity> entities = testEntityService.getAllTestEntities();
		model.addAttribute("entities", entities);
		return "getEntities";
	}
}
