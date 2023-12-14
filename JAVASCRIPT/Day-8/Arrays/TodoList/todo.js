const TodoList = ["Make Diiner", "Vegetables", "Fruits"];
RenderTodolist();


function RenderTodolist() {
    let todolisthtml = ''

    for (let i = 0; i < TodoList.length; i++) {
        const todo = TodoList[i]
        const html = `<p>${todo}</p>`;
        todolisthtml += html
        console.log(todolisthtml)
    }
    console.log(todolisthtml)
    document.querySelector('.js-resulyy').innerHTML = todolisthtml

}


function AddTodo() {
    const Inputss = document.querySelector('.js-text');
    let name = Inputss.value;

    TodoList.push(name);
    console.log(TodoList)
    RenderTodolist()


}
