package com.jdc.flower.base;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Number> extends JpaRepository<T, ID> {

	List<T> search(String jpql, Map<String, Object> params);
	
	Long searchCount(String jqpl, Map<String, Object> params);
}
