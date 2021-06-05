package com.ite.riskadventureSPRING.modelo.dao;

import org.springframework.beans.factory.annotation.Autowired;


import com.ite.riskadventureSPRING.modelo.beans.Reserva;
import com.ite.riskadventureSPRING.modelo.repository.ReservaRepository;

public class ReservaDaoImpl implements IntReservaDao{
	
	@Autowired
	ReservaRepository rerepo;

	@Override
	public String insertarReserva(Reserva miReserva) {
		
		String insertarRdo = "Error desconocido";
		try {
			rerepo.save(miReserva);
			insertarRdo = "Reserva "+miReserva.getIdReserva()+" insertada correctamente";
		} catch (Exception e) {
			insertarRdo = "Error al insertar la reserva. Posible error de BBDD";
			e.printStackTrace();
		}
		return insertarRdo;
	}

	
	

}
