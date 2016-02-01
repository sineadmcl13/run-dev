package com.bigfoot.rundev.repositories;

import com.bigfoot.rundev.entities.Instructor;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sineadmclaughlin on 30/01/2016.
 */
public interface IInstructorRepo extends CrudRepository<Instructor, Long> {

    Instructor findInstructorById(Long id);

}
