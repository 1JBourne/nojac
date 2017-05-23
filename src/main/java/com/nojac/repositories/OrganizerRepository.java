package com.nojac.repositories;

import com.nojac.models.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by nickolas on 5/23/17.
 */
@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, Long> {

}
