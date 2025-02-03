import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BusinessUnit } from '../api/businessunit';
import { catchError, Observable, throwError } from 'rxjs';

const baseUrl = "http://localhost:8050/business-units";

@Injectable()
export class BusinessUnitService {

    httpOptions = {
        headers: new HttpHeaders({
          'Content-Type': 'application/json'
        })
      }

    constructor(private http: HttpClient) { }

    getAll(): Observable<BusinessUnit[]> {
        return this.http.get<BusinessUnit[]>(baseUrl, this.httpOptions);
    }

    get(id: any): Observable<BusinessUnit> {
        return this.http.get<BusinessUnit>(`${baseUrl}/${id}`, this.httpOptions);
    }

    delete(id: any): Observable<any> {
        return this.http.delete(`${baseUrl}/${id}`);
    }

    create(data: any): Observable<any> {
        return this.http.post(baseUrl, data);
    }

    update(id: string, data: BusinessUnit): Observable<BusinessUnit> {
        return this.http.put(`${baseUrl}/${id}`, data, this.httpOptions);
    }
}
