package com.bigfoot.rundev.repositories;

import com.bigfoot.rundev.entities.Courses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sineadmclaughlin on 29/01/2016.
 */
@Service
public interface ICourseRepo extends CrudRepository<Courses, Long> {

    List<Courses> findAll();

}
