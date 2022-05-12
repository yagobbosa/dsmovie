package com.yagobbosa.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagobbosa.dsmovie.entities.Score;
import com.yagobbosa.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
