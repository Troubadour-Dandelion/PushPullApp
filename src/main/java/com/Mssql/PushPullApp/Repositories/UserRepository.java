package com.Mssql.PushPullApp.Repositories;

import com.Mssql.PushPullApp.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
