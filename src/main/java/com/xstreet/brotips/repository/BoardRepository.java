package com.xstreet.brotips.repository;

import com.xstreet.brotips.models.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board ,Long> {
}
