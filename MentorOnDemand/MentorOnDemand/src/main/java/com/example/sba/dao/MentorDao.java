package com.example.sba.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sba.model.Mentor;

public interface MentorDao extends JpaRepository<Mentor,Integer>{
public Mentor findByUserName(String username);
}
