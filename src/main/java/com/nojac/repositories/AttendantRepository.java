package com.nojac.repositories;

import com.nojac.models.Attendant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nickolas on 5/23/17.
 */
@Repository
public interface AttendantRepository extends JpaRepository<Attendant, Long> {

}
