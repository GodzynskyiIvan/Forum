package no.work.forum.repository;

import java.util.List;

import no.work.forum.domain.TestEntity;

public interface TestEntityRepository {
	void addTestEntity(TestEntity testEntity);
	TestEntity getTestEntity(int id);
	void removeEntity(TestEntity testEntity);
	TestEntity editTestEntity(TestEntity testEntity);
	List<TestEntity> getAllTestEntities();
}
