/*
 * @overview        {ComponentesComponent}
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
import { GenericComponent } from '@app/module/essential/component/generic.component';
import { ComponentesViewModel } from '../../model/componentes.model';

/**
 * TODO: Description of {@code ComponentesComponent}.
 *
 * @author Dyson Parra
 * @since Angular 19, Node JS 22
 */
@Component({
    selector: 'app-componentes',
    templateUrl: './componentes.component.html',
    standalone: false,
    styleUrls: ['./componentes.component.css']
})
export class ComponentesComponent extends GenericComponent<ComponentesViewModel> {

    /**
     * TODO: Description of method {@code constructor}.
     *
     */
    public constructor(
        entityInstance: ComponentesViewModel) {
        super(entityInstance);
    }

}
