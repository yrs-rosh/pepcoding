const num = 3849;

function reverseGivenInteger(num) {
    // write your solution here
    let ans = 0;
    let rem = 0;

    while(num!=0){
        rem = num%10;
        
        ans = ans*10 + rem;
        num = Mathnum/10;
    }

    return ans;
}

console.log(`Reversed integer is: ${reverseGivenInteger(num)}`)
