package eu.runnerrace.h7pjpv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.runnerrace.h7pjpv.entry.VersenyEntry;

public interface VersenyRepository extends JpaRepository<VersenyEntry,Long > {}
