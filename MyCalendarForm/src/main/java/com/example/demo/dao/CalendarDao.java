package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Calendar;

public interface CalendarDao {
	
		void insertCalendar(Calendar calendar);
		
		List<Calendar>getAll();

}
