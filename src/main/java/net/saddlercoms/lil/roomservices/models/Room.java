package net.saddlercoms.lil.roomservices.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROOM")
public class Room {

	/*
ROOM_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
NAME VARCHAR(16) NOT NULL,
ROOM_NUMBER CHAR(2) NOT NULL UNIQUE,
BED_INFO CHAR(2) NOT NULL	
*/
	@Id
	@Column(name="ROOM_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="NAME")
	private String name;
	@Column(name="ROOM_NUMBER")
	private String roomNumber;
	@Column(name="BED_INFO")
	private String bedInfo;
	
	/** Gets the room ID property */
	public long getId() { return id; }
	
	/** Sets the room ID property */
	public void setId(long id) { this.id = id; }
	
	/** Gets the name property */
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	/** Gets the room_number property */
	public String getRoomNumber() { return roomNumber; }
	public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
	
	/** Gets the bed_info property */
	public String getBedInfo() { return bedInfo; }
	public void setBedInfo(String bedInfo) { this.bedInfo = bedInfo; }
	
	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", roomNumber=" + roomNumber + ", bedInfo=" + bedInfo + "]";
	}
}
