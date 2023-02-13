package com.theinsideshine.test.springboot.app.springboot_test.services;

import com.theinsideshine.test.springboot.app.springboot_test.models.Banco;
import com.theinsideshine.test.springboot.app.springboot_test.models.Cuenta;

import java.math.BigDecimal;
import java.util.List;

public interface CuentaService {

    List<Cuenta> findAll();
    Cuenta findById(Long id);
    int revisarTotalTransferencias(Long bancoId);

    Cuenta save(Cuenta cuenta);

    void deleteById(Long id);
    BigDecimal revisarSaldo(Long cuentaId);

    void transferir(Long numCuentaOrigen, Long numCuentaDestino, BigDecimal monto, Long bancoId);

}
