document.getElementById("checkBtn").addEventListener("click", function () {

    const review = document.getElementById("review").value;

    fetch("http://localhost:8080/reviews/check", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ review })
    })
        .then(res => res.json())
        .then(data => {
            document.getElementById("result").innerText =
                data.spam ? "Spam" : "Genuine";
        });
});
