function Subscribed() {
    let btns = document.querySelector('.js-subscribe');
    if (btns.innerHTML === 'Subscribe') {
        btns.innerHTML = "Subscribed";
        btns.classList.add('is-its-ok')
    }else{
        btns.classList.remove('is-its-ok')
    }
}



function AmezonCalCi() {
    let inputNum = document.querySelector('.inpt')
    let inputValue = Number(inputNum.value);


    if (inputValue < 40) {
        inputValue = inputValue + 10;
        console.log(inputValue)
    }
    document.querySelector('.result').innerHTML = `Your Order Cost Is:${inputValue}`
}