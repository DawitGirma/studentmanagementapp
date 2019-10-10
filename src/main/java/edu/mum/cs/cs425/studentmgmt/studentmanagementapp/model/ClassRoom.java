package edu.mum.cs.cs425.studentmgmt.studentmanagementapp.model;

import javax.persistence.*;

@Entity
@Table(name = "ClassRoom")
public class ClassRoom
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "classroom_id")
    long classroomId;

    @Column(name = "building_name")
    String buildingName;

    @Column(name = "room_number")
    String roomNumber;

    public ClassRoom(String buildingName, String roomNumber) {
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }


    public long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(long classroomId) {
        this.classroomId = classroomId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
