/*
 * @fileoverview    {RemisionesVentaMaterialesState}
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
import { GenericState } from '@app/module/essential/state/generic.state';
import { RemisionesVentaMaterialesViewModel } from '../model/remisiones-venta-materiales.model';

/**
 * TODO: Description of {@code RemisionesVentaMaterialesState}.
 *
 * @author Dyson Parra
 * @since Angular 19, Node JS 22
 */
@Injectable({
    providedIn: 'root'
})
export class RemisionesVentaMaterialesState extends GenericState<RemisionesVentaMaterialesViewModel> {

}
