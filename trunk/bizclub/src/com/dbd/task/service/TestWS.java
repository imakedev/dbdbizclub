package com.dbd.task.service;

import org.apache.axis2.AxisFault;

import com.dbd.task.service.TaskJuristicServiceServiceStub.JuristicDetailByJuristicId;

public class TestWS {
	public static void main(String[] args) {
		try {
			TaskJuristicServiceServiceStub stub =new TaskJuristicServiceServiceStub();
			JuristicDetailByJuristicId id =new JuristicDetailByJuristicId();
			id.setInputData(param);
			stub.juristicDetailByJuristicId(id)
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
