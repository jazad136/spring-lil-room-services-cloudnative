package net.saddlercoms.lil.roomservices.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.saddlercoms.lil.roomservices.data.RoomRepository;
import net.saddlercoms.lil.roomservices.models.Room;

@RestController
@RequestMapping("/rooms")
public class RoomWebServices {
	private final RoomRepository repository;
	
	public RoomWebServices(RoomRepository repository) { this.repository = repository; } 
	
	@GetMapping 
	public Iterable<Room> getAllRooms() { return this.repository.findAll(); } 
	
	@GetMapping("/{id}")
	public Room getRoom(@PathVariable("id") long id) { return this.repository.findById(id).get();  }
}
