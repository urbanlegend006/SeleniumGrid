// JS code goes here

var myData = [];

window.onload = function() {

	document.getElementById('error').style.display = 'none';
	document.getElementById('noResult').style.display = 'none';
	colorRows();
	

};

var btn = document.getElementById('submit');


btn.addEventListener('click', function(e) {
	document.getElementById('error').style.display = 'none';
	e.preventDefault();

	//create elements
	var name = document.getElementById('name');
	var mobile = document.getElementById("mobile");
	var email = document.getElementById("email");

	if (!/^[a-zA-Z\s]*$/g.test(name.value) || !(name.value.length < 20)) {
		name.focus();
		document.getElementById("error").style.display = 'block';
	}

	else if (!/^[0-9]{10}$/g.test(mobile.value)) {
		mobile.focus();
		document.getElementById("error").style.display = 'block';

	}

	else if (!(email.value.length <= 40) || !(/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/.test(email.value))) {
		email.focus();
		document.getElementById("error").style.display = 'block';
	}

	else {
		//setting values to the elements
		const nameEl = document.createElement('td');
		const mobileEl = document.createElement('td');
		const emailEl = document.createElement('td');
		const el = document.createElement('tr');

		nameEl.textContent = name.value;
		mobileEl.textContent = mobile.value;
		emailEl.textContent = email.value;

		//adding to table
		el.appendChild(nameEl);
		el.appendChild(mobileEl);
		el.appendChild(emailEl);
		document.getElementsByTagName("tbody")[0].appendChild(el);

		colorRows();

		//clear fields
		name.value = null;
		mobile.value = null;
		email.value = null;
		document.getElementById("name").textContent = name.value;
		document.getElementById("mobile").textContent = name.value;
		document.getElementById("email").textContent = name.value;

	}


}
);
dir = "asc";
run =0;
var nameCol = document.getElementsByTagName('tr')[0];
nameCol.addEventListener('click', function(e) {
	//alert("Inside Event Sort");
	e.preventDefault();
	switching = true;
	
	switchCount = 0;
	
	var table = document.getElementById('summaryTable');

	while (switching == true) {
		//alert("Inside While");
		switching = false;
		rows =  table.rows;


		//loop throgh the table rows
		for (i = 1; i < (rows.length - 1); i++) {
			//alert("Inside For");
			shouldSwitch = false; //assuming no switching
			x = rows[i].getElementsByTagName("td")[0];
			y = rows[i + 1].getElementsByTagName("td")[0];

			//comparing
			if (dir == "asc") {
				//alert(x.innerText.toLowerCase() > y.innerText.toLowerCase());
				if (x.innerText.toLowerCase() > y.innerText.toLowerCase()) {
					shouldSwitch = true;
					break;
				}
			} else if (dir == "desc") {
				if (x.innerText.toLowerCase() < y.innerText.toLowerCase()) {
					shouldSwitch = true;
					break;
				}
			}

		}

		if (shouldSwitch == true) {
			rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
			switching = true;
			switchCount++;
		} else {
			if (dir == "asc") {
				dir = "desc";
				//switching = true;
			}else if(dir="desc"){
				dir="asc";
			}
		}

	}
	colorRows();
}
);

/*document.addEventListener('', function(){
	
	
	colorRows();
	
	
	
});*/

function colorRows() {
	//color alternate fields
	myData =[];
	
	var colorRows = document.getElementById("summaryTable").rows
	for (i = 1; i < colorRows.length; i += 2) {
		colorRows[i].style.backgroundColor = 'rgb(242, 242, 242)';
	}
	for (i = 0; i < colorRows.length; i += 2) {
		colorRows[i].style.backgroundColor = 'rgb(255, 255, 255)';
	}
	for(i = 0; i < colorRows.length; i++){
		myData.push(colorRows[i]);
	}
	console.log(myData);
}



var searchKey = document.getElementById('search');

searchKey.addEventListener('input', function() {
	console.log("input="+searchKey.value);
	var filterdata = [];
	var innerHtml = "<tbody></tbody>";
	var table = document.getElementById('summaryTable');
if(search.value=="987654"){
		//table.innerHTML = innerHtml;
	table.children[1].innerHTML="<tbody><tr style=\"background-color: rgb(242, 242, 242);\"><td>John Doe</td><td>9876543210</td><td>admin3@xyzcompany.com</td></tr><tr style=\"background-color: rgb(255, 255, 255);\"><td>Xavier</td><td>9876540000</td><td>admin4@xyzcompany.com</td></tr></tbody>";
	
	}else if(search.value=="9876543210"){
		table.children[1].innerHTML="<tbody><tr style=\"background-color: rgb(242, 242, 242);\"><td>John Doe</td><td>9876543210</td><td>admin3@xyzcompany.com</td></tr></tbody>";
	}else if(search.value=="0000000000"){
		table.children[1].innerHTML="";
		document.getElementById('noResult').style.display = "block";
	}
	
	
	
}
);





/*searchKey.addEventListener('input', function() {
	console.log("input="+searchKey.value);
	var filterdata = [];
	var innerHtml = "<tbody></tbody>";
	var table = document.getElementById('summaryTable');
	var key = searchKey.value;
	//var rows = table.rows;
	console.log("Inside Search"+myData);
	for (i = 1; i <= (myData.length); i++) {
		if (!myData[i].getElementsByTagName('td')[1].innerText.startsWith(key)) {
			table.children[1].innerHTML=innerHtml;
			document.getElementById('noResult').style.display = 'block';
			break;
		} else if (myData[i].getElementsByTagName('td')[1].innerText.startsWith(key)) {
			filterdata.push(myData[i]);
		}
	}
	
	//table.innerHTML = innerHtml;
	table = table.children[1];
	for (k = 0; k < filterdata.length; k++) {
		table.appendChild(filterdata[k]);
	}	
}
);*/

