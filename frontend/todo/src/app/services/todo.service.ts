import { Todo } from './../models/todo';
import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { enviroment } from "src/enviroments/environment";

@Injectable({
  providedIn: "root",
})
export class TodoService {
  
  baseUrl = enviroment.baseUrl;

  constructor(private http: HttpClient) {

    findAll(): Observable<Todo[]>{
      return this.http.get<Todo[]>(this.baseUrl);
    }
  }
}
