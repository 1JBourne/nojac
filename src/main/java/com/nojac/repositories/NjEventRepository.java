package com.nojac.repositories;

import com.nojac.models.NjEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nickolas on 5/24/17.
 */
@Repository
public interface NjEventRepository extends JpaRepository<NjEvent, Long> {


}
