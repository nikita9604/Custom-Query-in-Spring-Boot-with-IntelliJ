package com.nikita.springbootexample3.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Patient.class)
public abstract class Patient_ {

	public static volatile SingularAttribute<Patient, String> name;
	public static volatile SingularAttribute<Patient, Integer> pid;
	public static volatile SingularAttribute<Patient, Integer> age;

	public static final String NAME = "name";
	public static final String PID = "pid";
	public static final String AGE = "age";

}

