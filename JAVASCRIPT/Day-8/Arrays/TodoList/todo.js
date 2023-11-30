const TodoList = ["Make Diiner", "Vegetables", "Fruits"]
let todolisthtml = ''
RenderTodolist();


function RenderTodolist() {
    for (let i = 0; i < length; i++) {
        const access = TodoList[i]
        const html = `<p>${access}</p>`
        todolisthtml += html
        console.log(todolisthtml)

    }
}
let shoow = document.querySelector('.show') = todolisthtml;


function AddTodo() {
    const Inputss = document.querySelector('.js-text');
    let name = Inputss.value;

    TodoList.push(name);
    console.log(TodoList)
    RenderTodolist()
}
