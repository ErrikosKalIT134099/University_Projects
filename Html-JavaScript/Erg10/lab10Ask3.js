var paragraphs;

function addToListBox() {
	paragraphs = document.getElementsByTagName("p"); // Επιστρέφει μία συλλογή από όλες τις παραγράφους.
	var listBox = document.getElementById("listBox");
	var count = 0;
	for (var i in paragraphs) { //Για κάθε παράγραφο.
		if (paragraphs[i].innerText) { // Αν η παράγραφος έχει κείμενο.
		var newOption = document.createElement("option"); //Δημηοθργείται επιλοιγή για το listBox
		newOption.innerHTML = i + ". " + paragraphs[i].innerText.substring(0, 50); //Θέτεται το κείμενο που θα εμφανίζεται.
		newOption.setAttribute("onclick", "scrollToElement(paragraphs[" + i + "])"); //Θέτεται η κλήση της συνάρτησης.
		listBox.appendChild(newOption); //Προστίθεται η επιλογή στο listBox.
		count++;
		}
	}
}

function scrollToElement(node) {
	clearBolds();
	makeBold(node);
	node.scrollIntoView();
	/*
	 "ScrollIntoView() is an experimental technology"
	 https://developer.mozilla.org/en-US/docs/Web/API/Element/scrollIntoView
	*/
}

function makeBold(node) {
	node.style.fontWeight = "Bold";
}

function clearBolds() {
	for (var i in paragraphs) {
		if (paragraphs[i].style) {
			paragraphs[i].style.fontWeight = "normal";			
		}
	}
}	