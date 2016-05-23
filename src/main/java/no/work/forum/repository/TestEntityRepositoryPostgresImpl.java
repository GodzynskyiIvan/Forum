package no.work.forum.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import no.work.forum.domain.TestEntity;

@Repository
public class TestEntityRepositoryPostgresImpl implements TestEntityRepository {

	@PersistenceContext
	EntityManager em;
	
	public void addTestEntity(TestEntity testEntity) {
		em.persist(testEntity);
	}

	public TestEntity getTestEntity(int id) {
		return em.find(TestEntity.class, id);
	}

	public void removeEntity(TestEntity testEntity) {
		em.remove(testEntity);
	}

	public TestEntity editTestEntity(TestEntity testEntity) {
		return em.merge(testEntity);
	}

	public List<TestEntity> getAllTestEntities() {
		return em.createQuery("Select t from TestEntity t").getResultList();
	}

}
