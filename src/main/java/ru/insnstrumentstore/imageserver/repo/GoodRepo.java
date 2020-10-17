package ru.insnstrumentstore.imageserver.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.insnstrumentstore.imageserver.entity.Good;
import ru.insnstrumentstore.imageserver.entity.ProduktImage;


@RepositoryRestResource(collectionResourceRel = "goods", path = "goods")
public interface GoodRepo extends PagingAndSortingRepository<Good,Integer> {
}
