package com.fis.proiectFis.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int schedule_id;

    @ElementCollection
    private List<String> operatingDays;

    public Schedule(List<String> operatingDays) {
        this.operatingDays = operatingDays;
    }

    public Schedule() {
    }

    public int getId() {
        return schedule_id;
    }

    public void setId(int id) {
        this.schedule_id = id;
    }

    public List<String> getOperatingDays() {
        return operatingDays;
    }

    public void setOperatingDays(List<String> operatingDays) {
        this.operatingDays = operatingDays;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + schedule_id +
                ", operatingDays=" + operatingDays +
                '}';
    }
}
