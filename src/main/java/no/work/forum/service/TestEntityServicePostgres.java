package no.work.forum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import no.work.forum.domain.TestEntity;
import no.work.forum.repository.TestEntityRepository;

@Service
public class TestEntityServicePostgres implements TestEntityService{
	
	@Autowired
	TestEntityRepository testEntityRepository;

	@Transactional
	public void addTestEntity(TestEntity testEntity) {
		testEntityRepository.addTestEntity(testEntity);
	}

	public TestEntity getTestEntity(int id) {
		return testEntityRepository.getTestEntity(id);
	}

	@Transactional
	public void removeEntity(TestEntity testEntity) {
		testEntityRepository.removeEntity(testEntity);
	}

	@Transactional
	public TestEntity editTestEntity(TestEntity testEntity) {
		return testEntityRepository.editTestEntity(testEntity);
	}

	public List<TestEntity> getAllTestEntities() {
		return testEntityRepository.getAllTestEntities();
	}
	
	
	
}
