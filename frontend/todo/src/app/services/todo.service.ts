import { MatSnackBar } from '@angular/material/snack-bar';
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

  constructor(private http: HttpClient, private snack: MatSnackBar) {}

  findAll(): Observable<Todo[]> {
    return this.http.get<Todo[]>(this.baseUrl);
  }

  update(todo: Todo): Observable<Todo> {
    const url = `${this.baseUrl}/${todo.id}`
    return this.http.put<Todo>(url, todo);
  }

  delete(id: any): Observable<void> {
    const url = `${this.baseUrl}/${id}`
    return this.http.delete<void>(url);
  }
  
  message(msg: string): void {
    this.snack.open(`${msg},`, 'OK', {
      horizontalPosition: 'end',
      verticalPosition: 'top',
      duration: 4000
    })
  }
}
