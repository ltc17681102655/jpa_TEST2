package com.jpa.repository;

import com.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserEntityRepo extends CrudRepository<UserEntity, Integer>, JpaRepository<UserEntity, Integer> {

    Optional<UserEntity> findFirstByAge(int i);

    Optional<UserEntity> findFirstByOpenid(String s);
}
