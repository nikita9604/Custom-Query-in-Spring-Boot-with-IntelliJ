package com.nikita.springbootexample3.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Doctor.class)
public abstract class Doctor_ {

	public static volatile SingularAttribute<Doctor, String> specs;
	public static volatile SingularAttribute<Doctor, String> dname;
	public static volatile SingularAttribute<Doctor, Integer> did;

	public static final String SPECS = "specs";
	public static final String DNAME = "dname";
	public static final String DID = "did";

}

