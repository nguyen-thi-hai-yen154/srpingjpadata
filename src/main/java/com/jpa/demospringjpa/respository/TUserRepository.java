package com.jpa.demospringjpa.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.demospringjpa.model.TUser;

@Repository
public interface TUserRepository extends JpaRepository<TUser, Long> {
	
//	public static final String _query1 = "SELECT * from " + " t_user " + " where user_name like %:name% ";

	@Query(value = "SELECT * from " + " t_user " + " where user_name like %:name%", nativeQuery = true)
	List<TUser> searchUser(@Param("name") String name);
	
//	  @Query("SELECT e FROM TUser e WHERE e.userName = :userName")
//	  List<TUser> findByUserName(@Param("userName") String userName);

	  
//    // Đây là Native SQL
//    @Query(value = "select * from TUser u where u.user_name = ?1", nativeQuery = true)
//    User myCustomQuery2(String emailAddress);
}
