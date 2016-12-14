package com.github.harivellaturi.customdatasource.repository;
import java.util.List;
import org.springframework.data.repository.Repository;
import com.github.harivellaturi.customdatasource.domain.Tag;

public interface TagRepository extends Repository<Tag, Long> {

    List<Tag> findAll();

}
