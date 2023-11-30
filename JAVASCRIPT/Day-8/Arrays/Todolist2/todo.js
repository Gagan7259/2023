let todoliust = []

function AddWork() {
    const inpuuut = document.querySelector('.js-input');
    let Value = inpuuut.value;

    todoliust.push(Value)
    console.log(todoliust)
}
document.querySelector('.js-show').innerHTML = todoliust;