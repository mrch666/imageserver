package ru.insnstrumentstore.imageserver.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.insnstrumentstore.imageserver.entity.ProduktImage;

@RepositoryRestResource(collectionResourceRel = "produktimage", path = "produktimage")
public interface Produktimagerestrepo extends PagingAndSortingRepository<ProduktImage,Long> {


}
