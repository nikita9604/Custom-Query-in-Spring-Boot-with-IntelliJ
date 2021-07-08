package com.nikita.springbootexample3.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Report.class)
public abstract class Report_ {

	public static volatile SingularAttribute<Report, Doctor> doctor;
	public static volatile SingularAttribute<Report, String> test;
	public static volatile SingularAttribute<Report, Patient> patient;
	public static volatile SingularAttribute<Report, Integer> id;
	public static volatile SingularAttribute<Report, String> status;

	public static final String DOCTOR = "doctor";
	public static final String TEST = "test";
	public static final String PATIENT = "patient";
	public static final String ID = "id";
	public static final String STATUS = "status";

}

