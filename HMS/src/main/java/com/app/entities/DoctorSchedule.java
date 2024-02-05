package com.app.entities;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DoctorSchedule {

	@Column
	private String day;
	@Column
	private Timestamp time;
}
