/*
 * @overview        {MaterialesDatosCompraFacade}
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
import { MaterialesDatosCompraViewModel } from '../model/materiales-datos-compra.model';
import { MaterialesDatosCompraState } from '../state/materiales-datos-compra.state';
import { MaterialesDatosCompraService } from '../service/materiales-datos-compra.service';

/**
 * TODO: Description of {@code MaterialesDatosCompraFacade}.
 *
 * @author Dyson Parra
 * @since Angular 19, Node JS 22
 */
@Injectable({
    providedIn: 'root'
})
export class MaterialesDatosCompraFacade extends GenericFacade<MaterialesDatosCompraViewModel> {

    /**
     * TODO: Description of method {@code constructor}.
     *
     */
    public constructor(
        entityService: MaterialesDatosCompraService,
        entityState: MaterialesDatosCompraState) {
        super(entityService, entityState);
    }

}
