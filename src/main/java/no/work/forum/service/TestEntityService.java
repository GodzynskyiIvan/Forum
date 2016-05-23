package no.work.forum.service;

import java.util.List;

import no.work.forum.domain.TestEntity;

public interface TestEntityService {
	void addTestEntity(TestEntity testEntity);
	TestEntity getTestEntity(int id);
	void removeEntity(TestEntity testEntity);
	TestEntity editTestEntity(TestEntity testEntity);
	public List<TestEntity> getAllTestEntities();
}
