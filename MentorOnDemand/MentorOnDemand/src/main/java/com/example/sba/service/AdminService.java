package com.example.sba.service;

import java.util.List;
import java.util.Optional;

import com.example.sba.model.Mentor;
import com.example.sba.model.User;

public interface AdminService {

	List<User> getList();

	Mentor registerMentor(Mentor mentor);

	Mentor getMentor(String username);

	Optional<Mentor> getMentorById(Integer id);

	Mentor getMentor(int id);

List<Mentor> getListMentor();

}