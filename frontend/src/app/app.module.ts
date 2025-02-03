import { NgModule } from '@angular/core';
import { HashLocationStrategy, LocationStrategy, PathLocationStrategy } from '@angular/common';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { AppLayoutModule } from './layout/app.layout.module';
import { NotfoundComponent } from './composer/components/notfound/notfound.component';
import { ProductService } from './composer/service/product.service';
import { CountryService } from './composer/service/country.service';
import { CustomerService } from './composer/service/customer.service';
import { EventService } from './composer/service/event.service';
import { IconService } from './composer/service/icon.service';
import { NodeService } from './composer/service/node.service';
import { PhotoService } from './composer/service/photo.service';
import { BusinessUnitService } from './composer/service/businessunit.service';

@NgModule({
    declarations: [AppComponent, NotfoundComponent],
    imports: [AppRoutingModule, AppLayoutModule],
    providers: [
        { provide: LocationStrategy, useClass: PathLocationStrategy },
        BusinessUnitService, CountryService, CustomerService, EventService, IconService, NodeService,
        PhotoService, ProductService
    ],
    bootstrap: [AppComponent],
})
export class AppModule {}
