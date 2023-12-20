package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.CalendarDao;
import com.example.demo.entity.Calendar;

@Service
public class CalendarServiceImpl implements CalendarService {
	
	private final CalendarDao dao;
	
	CalendarServiceImpl(CalendarDao dao){
		this.dao = dao;
	}

	@Override
	public void save(Calendar calendar) {
		dao.insertCalendar(calendar);
		
	}

	@Override
	public List<Calendar> getAll() {
		return dao.getAll();
	}

}
