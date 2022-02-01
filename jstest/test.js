let audio = new Audio("123.mp3");
let btn = document.getElementById("play");
let flag = true;
const player = () => {
    if(audio.paused){
        btn.onclick = () =>{
            document.body.style.backgroundColor="grey";
            btn.innerHTML = '<i class="fas fa-pause-circle"></i>'
            console.log("jdhgysf");
            audio.play();
        }
    } else{
        btn.onclick = () =>{
            document.body.style.backgroundColor="white";
            btn.innerHTML = '<i class="fas fa-play-circle"></i>'
            console.log("playing");
            audio.pause()/*hhuu */; 
        }
    }
    
}
// audio.play();

player();