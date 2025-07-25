/*
 * @overview        {PlanCompraContainerComponent}
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
import { PlanCompraViewModel } from '../../model/plan-compra.model';
import { PlanCompraFacade } from '../../facade/plan-compra.facade';

/**
 * TODO: Description of {@code PlanCompraContainerComponent}.
 *
 * @author Dyson Parra
 * @since Angular 19, Node JS 22
 */
@Component({
    selector: 'app-plan-compra-container',
    templateUrl: './plan-compra-container.component.html',
    standalone: false,
    styleUrls: ['./plan-compra-container.component.css']
})
export class PlanCompraContainerComponent extends GenericContainerComponent<PlanCompraViewModel> {

    /**
     * TODO: Description of method {@code constructor}.
     *
     */
    public constructor(
        entityInstance: PlanCompraViewModel,
        entityFacade: PlanCompraFacade) {
        super(entityInstance, entityFacade);
    }

}
