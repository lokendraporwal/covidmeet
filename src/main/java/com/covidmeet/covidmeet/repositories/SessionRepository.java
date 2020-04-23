package com.covidmeet.covidmeet.repositories;

import com.covidmeet.covidmeet.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
