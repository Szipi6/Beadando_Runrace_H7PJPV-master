package eu.runnerrace.h7pjpv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.runnerrace.h7pjpv.entry.EredmenyEntry;

public interface EredmenyRepository extends JpaRepository<EredmenyEntry,Long > {
    List<EredmenyEntry> findAllByVerseny_VersenyId(Long id);
}