package com.example.demo.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Calendar;

@Repository
public class CalendarDaoImpl implements CalendarDao {
	
	private final JdbcTemplate jdbcTemplate;
	
	//@Autowired 省略できる
	public CalendarDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertCalendar(Calendar calendar) {
	    jdbcTemplate.update("INSERT INTO schedule(date, startTime, endTime, description, created) VALUES(?, ?, ?, ?, ?)",
	            calendar.getDate(), calendar.getStartTime(), calendar.getEndTime(), calendar.getDescription(), calendar.getCreated());
	}


	@Override
	public List<Calendar> getAll() {
		String sql = "SELECT id, date, startTime, endTime, description,  created FROM schedule";
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);
		List<Calendar> list = new ArrayList<Calendar>();
		
		for(Map<String, Object> result : resultList) {
			Calendar calendar = new Calendar();
			calendar.setId(((Number)result.get("id")).longValue());
			
			java.sql.Date sqlDate = (java.sql.Date) result.get("date");
	        calendar.setDate(sqlDate != null ? sqlDate.toLocalDate() : null);
	        
	        java.sql.Time sqlStartTime = (java.sql.Time) result.get("startTime");
	        calendar.setStartTime(sqlStartTime != null ? sqlStartTime.toLocalTime() : null);
	        
	        java.sql.Time sqlEndTime = (java.sql.Time) result.get("endTime");
	        calendar.setEndTime(sqlEndTime != null ? sqlEndTime.toLocalTime() : null);
	        
			calendar.setDescription((String)result.get("description"));
			
			Timestamp timestamp = (Timestamp) result.get("created");
	        calendar.setCreated(timestamp != null ? timestamp.toLocalDateTime() : null);
			list.add(calendar);
		}
		return list;
	}

}
