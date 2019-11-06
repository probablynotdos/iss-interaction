package com.iss.interaction.api.repository;

import com.iss.interaction.api.resource.IssLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssLocationRepository extends JpaRepository<IssLocation, Integer> {

    //List<IssLocation> findByTimestampGreatherThan(int text);
}
