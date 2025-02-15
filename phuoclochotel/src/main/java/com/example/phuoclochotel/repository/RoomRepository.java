package com.example.phuoclochotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.phuoclochotel.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{
	
	

}
