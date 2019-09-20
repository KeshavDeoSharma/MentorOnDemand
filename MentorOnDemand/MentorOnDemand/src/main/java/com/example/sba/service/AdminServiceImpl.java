package com.example.sba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sba.dao.MentorDao;
import com.example.sba.dao.UserDao;
import com.example.sba.model.Mentor;
import com.example.sba.model.User;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private MentorDao mentorDao;
	
	@Override
	public List<User> getList()
	{
		return userDao.findAll();
	}
	
	
	@Override
	public List<Mentor> getListMentor()
	{
		return mentorDao.findAll();
	}
	
	@Override
	public Mentor registerMentor(Mentor mentor)
	{
		return mentorDao.save(mentor);
	}
	@Override
	public Mentor getMentor(String username)
	{
		return mentorDao.findByUserName(username);
	}
	@Override
	public Optional<Mentor> getMentorById(Integer id)
	{
		return mentorDao.findById(id);
	}
@Override
public Mentor getMentor(int id)
{
	System.out.println("ion the service======================"+id);
	

			System.out.println("from mentor function==========="+mentorDao.getOne(id));
			return mentorDao.getOne(id);
}



}
