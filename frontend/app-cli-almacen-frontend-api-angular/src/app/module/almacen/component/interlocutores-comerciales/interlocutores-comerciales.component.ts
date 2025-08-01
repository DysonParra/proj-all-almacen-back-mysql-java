/*
 * @overview        {InterlocutoresComercialesComponent}
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
import { InterlocutoresComercialesViewModel } from '../../model/interlocutores-comerciales.model';

/**
 * TODO: Description of {@code InterlocutoresComercialesComponent}.
 *
 * @author Dyson Parra
 * @since Angular 19, Node JS 22
 */
@Component({
    selector: 'app-interlocutores-comerciales',
    templateUrl: './interlocutores-comerciales.component.html',
    standalone: false,
    styleUrls: ['./interlocutores-comerciales.component.css']
})
export class InterlocutoresComercialesComponent extends GenericComponent<InterlocutoresComercialesViewModel> {

    /**
     * TODO: Description of method {@code constructor}.
     *
     */
    public constructor(
        entityInstance: InterlocutoresComercialesViewModel) {
        super(entityInstance);
    }

}
