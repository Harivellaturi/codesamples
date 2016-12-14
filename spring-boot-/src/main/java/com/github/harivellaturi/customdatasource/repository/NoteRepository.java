package com.github.harivellaturi.customdatasource.repository;
import java.util.List;
import org.springframework.data.repository.Repository;
import com.github.harivellaturi.customdatasource.domain.Note;

public interface NoteRepository extends Repository<Note, Long> {

    List<Note> findAll();

}
