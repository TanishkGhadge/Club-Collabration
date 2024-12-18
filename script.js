const video = document.getElementById("myVideo");

// Ensure the video plays on page load
window.addEventListener("load", () => {
    video.play().catch(error => {
        console.error("Autoplay failed:", error);
    });
});

// FAQ buttons
document.addEventListener("DOMContentLoaded", () => {
    const faqItems = document.querySelectorAll(".faq-item h3");

    faqItems.forEach(item => {
        item.addEventListener("click", () => {
            const content = item.nextElementSibling;
            content.style.display = content.style.display === "block" ? "none" : "block";
        });
    });
});

// Arrow Buttons For Gallery
const carousel = document.querySelector(".carousel");
const arrowBtns = document.querySelectorAll(".wrap i");
const firstCardWidth = carousel.querySelector(".card").offsetWidth;

let isDragging = false, startX, startScrollLeft;

arrowBtns.forEach(btn => {
    btn.addEventListener("click", () => {
        carousel.scrollLeft += btn.id === "left" ? -firstCardWidth : firstCardWidth;
    });
});

const dragStart = (e) => {
    isDragging = true;
    carousel.classList.add("dragging");
    startX = e.pageX;
    startScrollLeft =carousel.scrollLeft;
}

const dragStop = () => {
    isDragging = false;
    carousel.classList.remove("dragging");
}

const dragging = (e) => {
    if(!isDragging) return;
    carousel.scrollLeft = startScrollLeft - (e.pageX - startX);
}

carousel.addEventListener("mousedown", dragStart);
carousel.addEventListener("mousemove", dragging);
document.addEventListener("mouseup", dragStop);


