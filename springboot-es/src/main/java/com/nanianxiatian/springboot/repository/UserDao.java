package com.nanianxiatian.springboot.repository;

import com.nanianxiatian.springboot.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author nanianxiatian
 * @date 2021-2-23 18:59
 */
public interface UserDao extends CrudRepository<UserEntity,String> {
}
