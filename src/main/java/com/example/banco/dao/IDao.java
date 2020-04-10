package com.example.banco.dao;

import com.example.banco.modelo.Movimiento;

public interface IDao {
int realizarTransferencia(Movimiento movi);
}