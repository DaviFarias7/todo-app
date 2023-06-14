import { TodoService } from "src/app/services/todo.service";
import { Todo } from "src/app/models/todo";
import { Router } from "@angular/router";
import { Component } from "@angular/core";

@Component({
  selector: "app-create",
  templateUrl: "./create.component.html",
  styleUrls: ["./create.component.css"],
})
export class CreateComponent {
  todo: Todo = {
    titulo: "",
    descricao: "",
    dataParaFinalizar: new Date(),
    finalizado: false,
  };

  constructor(private router: Router, private service: TodoService) {}

  ngOnInit(): void {}

  create(): void {
    this.formataData();
    this.service.create(this.todo).subscribe(
      () => {
        this.service.message("To-do criado com sucesso");
        this.router.navigate([""]);
      },
      (err) => {
        this.service.message("Falha ao criar To-do");
        this.router.navigate([""]);
      }
    );
  }

  cancel(): void {
    this.router.navigate([""]);
  }

  formataData(): void {
    let data = this.todo.dataParaFinalizar.split('-')
    this.todo.dataParaFinalizar = `${data[2]}/${data[1]}/${data[0]}}`;
    console.log(data[2]);
  }
}
