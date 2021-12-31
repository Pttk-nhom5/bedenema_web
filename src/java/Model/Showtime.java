/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

//import jdk.vm.ci.meta.Local;

import java.sql.Time;
import java.time.LocalDateTime;

public class Showtime {
    private int id;
    private Room room;
    private Film film;
    private LocalDateTime startTime, endTime;

    public Showtime(){

    }

    public Showtime(int id, Room room, Film film, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = id;
        this.room = room;
        this.film = film;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

//    public void setStartTime(Time startTime) {
//        this.startTime = startTime;
//    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
