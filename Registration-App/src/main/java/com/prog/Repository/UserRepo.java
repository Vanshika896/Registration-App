package com.prog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prog.Entity.UserData;

public interface UserRepo extends JpaRepository<UserData, Integer>{

}
