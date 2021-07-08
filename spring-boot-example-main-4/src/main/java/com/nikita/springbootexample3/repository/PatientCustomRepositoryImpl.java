package com.nikita.springbootexample3.repository;

import com.nikita.springbootexample3.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class PatientCustomRepositoryImpl implements PatientCustomRepository {
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Patient> findbyName(String name,Integer age) {

        CriteriaBuilder cb=entityManager.getCriteriaBuilder();
        CriteriaQuery cq=cb.createQuery(Patient.class);

        Root<Patient> employee=cq.from(Patient.class);

        Predicate NamePredicate=cb.equal(employee.get("name"),name);
        Predicate AgePredicate=cb.equal(employee.get("age"),age);

        cq.where(NamePredicate,AgePredicate);

        TypedQuery<Patient> query=entityManager.createQuery(cq);

        return query.getResultList();
    }
}
