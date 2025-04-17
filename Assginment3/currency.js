// function formatCurrency(amount,currencyCode){
//     if(currencyCode=='$'){
//       console.log('$'+amount);
//     }
//     else if(currencyCode=='₹'){
//       console.log('₹'+amount);
//     }
//   }
//   const amount = process.argv[2];          // 3rd argument
//   const currencyCode = process.argv[3];    // 4th argument
//   formatCurrency(amount, currencyCode);


function formatCurrency1(amount,currencyCode){
  return new Intl.NumberFormat('en-US',{
    style:'currency',
    currency:currencyCode,
  }).format(amount);
}
  console.log(formatCurrency1(1234563456.43,'USD'));
  console.log(formatCurrency1(1234564575.43,'INR'));
  // if(process.argv[2]=='IN'){
  //   const amount=parseFloat(process.argv[3]);
  //   const currencyCode=process.argv[4];
  //   formatCurrency1(amount,currencyCode);
  // }
