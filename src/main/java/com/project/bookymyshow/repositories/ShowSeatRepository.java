package com.project.bookymyshow.repositories;

import com.project.bookymyshow.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
}