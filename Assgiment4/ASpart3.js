Task 2

function createGreeting(greeting) {
  return function(name) {
    return `${greeting}, ${name}!`;
  };
}

const helloGreet = createGreeting("Hello");
console.log(helloGreet("World")); 

Task 4,5

function createSecretHolder(secret) {
  let _secret = secret;

  return {
    getSecret: function() {
      return _secret;
    },
    setSecret: function(newSecret) {
      _secret = newSecret;
    }
  };
}

const secretBox = createSecretHolder("mySecret");
console.log(secretBox.getSecret()); 
secretBox.setSecret("newSecret");
console.log(secretBox.getSecret()); 
