/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_composite;

import static patron_composite.Empresa.costeUnitarioVehiculo;

/**
 *
 * @author Ricardo Carmona
 */
public class EmpresaSinFilial extends Empresa{

    @Override
    public boolean agregaFilial(Empresa filial) {
        return false;
    }

    @Override
    public double calculaCosteMantenimiento() {
        return nVehiculos * costeUnitarioVehiculo;
    }
}
