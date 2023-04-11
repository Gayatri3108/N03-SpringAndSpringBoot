package org.tnsif.placementmanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmanagement.entites.Placement;

public interface PlacementRepository extends JpaRepository<Placement,Integer> {

}
