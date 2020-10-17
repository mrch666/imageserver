package ru.insnstrumentstore.imageserver.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.insnstrumentstore.imageserver.entity.Brand;
import ru.insnstrumentstore.imageserver.entity.Category;

@RepositoryRestResource(collectionResourceRel = "category", path = "category")
public interface CategoryRepo extends PagingAndSortingRepository<Category,Integer> {
}
