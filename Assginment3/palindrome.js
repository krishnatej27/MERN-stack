function palindrome(s){
  let l=0,r=s.length-1;
  while(l<r){
    if(s[l]!=s[r]){
      return false;
    }
    l++;
    r--;
  }
  return true;
}
function lon(s){
  let l="";
  for(let i=0;i<s.length;i++){
    for(let j=i+1;j<s.length;j++){
      let sub=s.substring(i,j);
        if(palindrome(sub) && sub.length > l.length){
          l=sub;
        }
    }
  }
  return l;
}
let s='racecar';
console.log(lon(s));