package com.example.demo.app;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CalendarForm {

	@NotNull
	private LocalDate date;
	
	@NotNull
	private LocalTime startTime;
	
	@NotNull
	private LocalTime endTime;
	
	@Size(min = 1, max = 200)
	private String description;

	public LocalDate getDate() {	
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



}
