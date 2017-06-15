var d = new Date();
var n = d.getUTCDate();
var y = d.getUTCFullYear();
var monthNames = ["January", "February", "March", "April", "May", "June",
  "July", "August", "September", "October", "November", "December"
];
var m = monthNames[d.getUTCMonth()];

document.getElementById('date').innerHTML = n +" "+ m +" "+ y;

