/*
 * @overview        {EstadosMovimientosFacade}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
import { Injectable } from '@angular/core';
import { GenericFacade } from '@app/module/essential/facade/generic.facade';
import { EstadosMovimientosViewModel } from '../model/estados-movimientos.model';
import { EstadosMovimientosState } from '../state/estados-movimientos.state';
import { EstadosMovimientosService } from '../service/estados-movimientos.service';

/**
 * TODO: Description of {@code EstadosMovimientosFacade}.
 *
 * @author Dyson Parra
 * @since Angular 19, Node JS 22
 */
@Injectable({
    providedIn: 'root'
})
export class EstadosMovimientosFacade extends GenericFacade<EstadosMovimientosViewModel> {

    /**
     * TODO: Description of method {@code constructor}.
     *
     */
    public constructor(
        entityService: EstadosMovimientosService,
        entityState: EstadosMovimientosState) {
        super(entityService, entityState);
    }

}
