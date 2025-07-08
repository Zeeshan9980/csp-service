package com.logistics.csp_service.repository;

import com.logistics.csp_service.entity.CspPolicy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CspPolicyRepository extends JpaRepository<CspPolicy,Long> {
    Optional<CspPolicy> findByServiceName(String serviceName);
}
