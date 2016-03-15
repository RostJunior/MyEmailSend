package ua.com.emailsend.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.emailsend.dao.GeneralDao;

@SuppressWarnings("all")
@Repository
public abstract class GeneralDaoImpl<C, N extends Number> implements GeneralDao<C, N> {

	private Class<C> entityClass;

	public GeneralDaoImpl(Class<C> entityClass) {
		this.entityClass = entityClass;
	}

	public Class<C> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<C> entityClass) {
		this.entityClass = entityClass;
	}

	@PersistenceContext(unitName = "Primary")
	EntityManager em;

	@Transactional
	public void create(C entity) {
		em.persist(entity);

	}

	@Transactional
	public List<C> getAll() {

		return em.createQuery("from " + entityClass.getSimpleName())
				.getResultList();
	}
	
	@Transactional
	public C findById(N id) {

		return (C) em.createQuery(
				"select c from " + entityClass.getSimpleName()
						+ " c where c.id = :id").setParameter("id", id);
	}

	@Transactional
	public void delete(C entity) {
		em.remove(em.merge(entity));

	}

	@Transactional
	public void edit(C entity) {

		em.merge(entity);

	}

}
