package com.example.server.repo;


import com.example.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ServerRepo extends JpaRepository<Server, Long> {
    default Server findByIpAddress(String ipAddress) {
        return null;
    }
}
