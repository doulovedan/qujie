package com.jizhiwei.entity;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

@Repository
public class Department {
    @Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + "]";
	}

	private Integer dId;

    private String dName;

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }
}