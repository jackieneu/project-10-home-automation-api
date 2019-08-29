package com.teamtreehouse.control;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.security.access.prepost.PreAuthorize;

public interface ControlRepository extends PagingAndSortingRepository<Control, Long> {
    @RestResource(rel = "control-name", path = "controlName")
    Page<Control> findByNameContaining(@Param("name") String name, Pageable page);

    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN') or #control?.device?.room?.hasAdministrator(authentication.name)")
    <S extends Control> S save(@Param("control") S entity);
}
