package com.wjsguddnr.SecLog.study.repository;

import com.wjsguddnr.SecLog.study.domain.Study;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyRepository extends JpaRepository<Study, Long> {
}
