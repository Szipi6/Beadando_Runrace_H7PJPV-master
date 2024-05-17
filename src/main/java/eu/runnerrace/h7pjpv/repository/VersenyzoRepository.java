package eu.runnerrace.h7pjpv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.runnerrace.h7pjpv.entry.VersenyzoEntry;

public interface VersenyzoRepository extends JpaRepository<VersenyzoEntry,Long > {}