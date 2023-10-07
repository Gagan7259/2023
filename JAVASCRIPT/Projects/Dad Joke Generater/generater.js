const btne1 = document.getElementById("btn");

const apiKey = "4kqGcJx8uDXo3XIskcbzokAz7rN8nWJs3PL9Mcll";

const options = {
   method: "GET",
   headers: {
      "X-Api-Key": apiKey,
   },
};

const apiURL = "https://api.api-ninjas.com/v1/dadjokes?limit=1";

async function getjoke() {
   const response = await fetch(apiURL, options);
   const data = await response.json();
   console.log(data)

}

btne1.addEventListener("click", getjoke)