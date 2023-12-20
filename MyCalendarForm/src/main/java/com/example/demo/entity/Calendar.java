package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Calendar {
		private Long id;
		private LocalDate date;
		private LocalTime startTime;
		private LocalTime endTime;
		private String description;
		private  LocalDateTime created;
		public Calendar() {

		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public LocalDate getDate() {
			return date;
		}
		public void setDate(LocalDate date) {
			this.date = date;
		}
		public LocalTime getStartTime() {
			return startTime;
		}
		public void setStartTime(LocalTime localTime) {
			this.startTime = localTime;
		}
		public LocalTime getEndTime() {
			return endTime;
		}
		public void setEndTime(LocalTime localTime) {
			this.endTime = localTime;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String string) {
			this.description = string;
		}
		public LocalDateTime getCreated() {
			return created;
		}
		public void setCreated(LocalDateTime created) {
			this.created = created;
		}
	
		
		
}
