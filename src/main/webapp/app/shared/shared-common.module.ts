import { NgModule } from '@angular/core';

import { GtdSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [GtdSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [GtdSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class GtdSharedCommonModule {}
