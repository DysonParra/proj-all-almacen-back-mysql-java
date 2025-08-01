/*
 * @overview        {ListaDeMaterialesContainerComponent}
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
import { Component } from '@angular/core';
import { GenericContainerComponent } from '@app/module/essential/container/generic-container.component';
import { ListaDeMaterialesViewModel } from '../../model/lista-de-materiales.model';
import { ListaDeMaterialesFacade } from '../../facade/lista-de-materiales.facade';

/**
 * TODO: Description of {@code ListaDeMaterialesContainerComponent}.
 *
 * @author Dyson Parra
 * @since Angular 19, Node JS 22
 */
@Component({
    selector: 'app-lista-de-materiales-container',
    templateUrl: './lista-de-materiales-container.component.html',
    standalone: false,
    styleUrls: ['./lista-de-materiales-container.component.css']
})
export class ListaDeMaterialesContainerComponent extends GenericContainerComponent<ListaDeMaterialesViewModel> {

    /**
     * TODO: Description of method {@code constructor}.
     *
     */
    public constructor(
        entityInstance: ListaDeMaterialesViewModel,
        entityFacade: ListaDeMaterialesFacade) {
        super(entityInstance, entityFacade);
    }

}
