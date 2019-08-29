package com.teamtreehouse.control;

import com.teamtreehouse.core.BaseEntity;
import com.teamtreehouse.device.Device;
import com.teamtreehouse.user.User;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Control extends BaseEntity {

    @NotNull
    @Size(min = 2, max = 140)
    private String name;

    @NotNull
    private Integer value;

    @ManyToOne
    @NotNull
    private Device device;

    @ManyToOne
    private User lastModifiedBy;

    protected Control(){
        super();
    }

    public Control(String name, Integer value) {
        this();
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public User getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }
}
