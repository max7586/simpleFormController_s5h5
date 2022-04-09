package com.test.repository;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.entity.User;

@Repository
public class LoginRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Customer findUser(int userId) {
		Session currentSession = sessionFactory.getCurrentSession();
		User user = currentSession.get(User.class, userId);
		return user;
	}
}