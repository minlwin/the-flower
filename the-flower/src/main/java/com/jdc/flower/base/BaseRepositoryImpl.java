package com.jdc.flower.base;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public class BaseRepositoryImpl<T, ID extends Number> extends SimpleJpaRepository<T, ID> implements BaseRepository<T, ID> {

	private EntityManager em;
	
	public BaseRepositoryImpl(JpaEntityInformation<T, ID> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		this.em = entityManager;
	}

	@Override
	public List<T> search(String jpql, Map<String, Object> params) {
		TypedQuery<T> query = em.createQuery(jpql, getDomainClass());
		
		for(String key : params.keySet()) {
			query.setParameter(key, params.get(key));
		}
		return query.getResultList();
	}

	@Override
	public Long searchCount(String jpql, Map<String, Object> params) {
		TypedQuery<Long> query = em.createQuery(jpql, Long.class);
		
		for(String key : params.keySet()) {
			query.setParameter(key, params.get(key));
		}
		return query.getSingleResult();
	}

}
