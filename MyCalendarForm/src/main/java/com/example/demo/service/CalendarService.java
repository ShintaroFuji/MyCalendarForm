package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Calendar;

public interface CalendarService {

		void save(Calendar calendar);
		
		List<Calendar>getAll();
}
