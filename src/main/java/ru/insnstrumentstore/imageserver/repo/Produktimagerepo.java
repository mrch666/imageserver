package ru.insnstrumentstore.imageserver.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.insnstrumentstore.imageserver.entity.ProduktImage;

//@RepositoryRestResource(collectionResourceRel = "image-list.php", path = "image-list.php")
public interface Produktimagerepo extends JpaRepository<ProduktImage,Long> {

    ProduktImage findProduktImageByArtAndBrand(String art,String brand);
}
