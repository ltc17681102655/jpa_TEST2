package com.jpa.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDomainRepo extends CrudRepository<User, Integer>, JpaRepository<User, Integer>, QuerydslPredicateExecutor<User> {

}
