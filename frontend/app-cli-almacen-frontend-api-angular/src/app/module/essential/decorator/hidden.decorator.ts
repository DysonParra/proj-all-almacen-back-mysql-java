/*
 * @overview        {FileName}
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
import { FieldViewModel } from "../model/field.model";

/**
 * TODO: Description of {@code Hidden}.
 *
 * @author Dyson Parra
 * @since Angular 19, Node JS 22
 */
export function Hidden(target: any, propertyKey: string): void {

    // Get the existing getter if exists
    const existingGetter = Object.getOwnPropertyDescriptor(target, 'hiddenFields')?.get;

    // Define the hiddenFields getter and based on the property marked with @Hidden
    const getter = function (this: any): FieldViewModel[] {
        return [{
            "name": propertyKey,
            "value": this[propertyKey]
        }];
    };

    // Combine the result of exising getter and the new defined
    const combinedGetter = function (this: any): FieldViewModel[] {
        if (existingGetter)
            return [...existingGetter.call(this), ...getter.call(this)];
        return getter.call(this);
    };

    // Define the hiddenFields getter based on the property marked with @Hidden
    Object.defineProperty(target, 'hiddenFields', {
        get: combinedGetter,
        enumerable: true,
        configurable: true
    });

}
