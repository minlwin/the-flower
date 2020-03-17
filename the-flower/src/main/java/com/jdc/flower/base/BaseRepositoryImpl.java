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
		return getList(em.createQuery(jpql, getDomainClass()), params);
	}

	@Override
	public Long searchCount(String jpql, Map<String, Object> params) {
		return getSingle(em.createQuery(jpql, Long.class), params);
	}


	@Override
	public List<T> findByNamedQuery(String query, Map<String, Object> params) {
		return getList(em.createNamedQuery(query, getDomainClass()), params);
	}
	
	@Override
	public Long findCountByNamedQuuery(String query, Map<String, Object> params) {
		return getSingle(em.createQuery(query, Long.class), params);
	}
	
	private List<T> getList(TypedQuery<T> query, Map<String, Object> params) {
		for(String key : params.keySet()) {
			query.setParameter(key, params.get(key));
		}
		return query.getResultList();
	}

	private<L> L getSingle(TypedQuery<L> query, Map<String, Object> params) {
		for(String key : params.keySet()) {
			query.setParameter(key, params.get(key));
		}
		return query.getSingleResult();
	}
}
