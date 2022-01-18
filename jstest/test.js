var audio = new Audio("123.mp3");
var play = document.getElementById("play")
play.onmouseover = function() {
  audio.play();
  document.body.style.backgroundColor ='black';
}

play.onmouseout = function() {
    audio.pause();
    document.body.style.backgroundColor ='white';
  }