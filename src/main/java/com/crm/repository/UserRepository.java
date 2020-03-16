package com.crm.repository;

import com.crm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {



   // @Query(value = "SELECT * FROM USER u WHERE u.project_id = 1 ",nativeQuery = true)
    //Set<User> findUsersByProjects();

}
