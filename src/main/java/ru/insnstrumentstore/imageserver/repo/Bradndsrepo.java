package ru.insnstrumentstore.imageserver.repo;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.insnstrumentstore.imageserver.entity.Brand;
import ru.insnstrumentstore.imageserver.entity.ProduktImage;

@RepositoryRestResource(collectionResourceRel = "brands", path = "brands")
public interface Bradndsrepo extends PagingAndSortingRepository<Brand, Integer> {
}
