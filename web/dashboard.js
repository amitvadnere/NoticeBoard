var d = new Date();
var n = d.getUTCDate();
var y = d.getUTCFullYear();
var monthNames = ["January", "February", "March", "April", "May", "June",
  "July", "August", "September", "October", "November", "December"
];
var m = monthNames[d.getUTCMonth()];

document.getElementById('day').innerHTML = n;
document.getElementById('month').innerHTML = m;
document.getElementById('year').innerHTML = y;

var data = {
    labels: ["January", "February", "March", "April", "May", "June", "July"],
    datasets: [
        {
            
            label: "NoticeBoard Visitors",
            fill: true,
            lineTension: 0.1,
            backgroundColor: "rgba(75,192,192,1)",
            borderColor: "rgba(75,192,192,1)",
            borderCapStyle: 'butt',
            borderDash: [],
            borderDashOffset: 0.0,
            borderJoinStyle: 'miter',
            pointBorderColor: "rgba(75,192,192,1)",
            pointBackgroundColor: "#fff",
            pointBorderWidth: 1,
            pointHoverRadius: 5,
            pointHoverBackgroundColor: "rgba(75,192,192,1)",
            pointHoverBorderColor: "rgba(220,220,220,1)",
            pointHoverBorderWidth: 2,
            pointRadius: 1,
            pointHitRadius: 10,
            data: [65, 59, 80, 81, 56, 55, 40],
            spanGaps: false,
            
        }
    ]
}; 
var data1 = {
    labels: ["January", "February", "March", "April", "May", "June", "July"],
    datasets: [
        {
            
            label: "NoticeBoard-Visitors",
            fill: false,
            lineTension: 0.1,
            backgroundColor: "rgba(75,192,192,1)",
            borderColor: "rgba(75,192,192,1)",
            borderCapStyle: 'butt',
            borderDash: [],
            borderDashOffset: 0.0,
            borderJoinStyle: 'miter',
            pointBorderColor: "rgba(75,192,192,1)",
            pointBackgroundColor: "#fff",
            pointBorderWidth: 1,
            pointHoverRadius: 5,
            pointHoverBackgroundColor: "rgba(75,192,192,1)",
            pointHoverBorderColor: "rgba(220,220,220,1)",
            pointHoverBorderWidth: 2,
            pointRadius: 1,
            pointHitRadius: 10,
            data: [5, 10, 12, 15, 25, 72, 140],
            spanGaps: false,
            
        }
    ]
};
var data = {
    labels: [
        "Notice Read",
        "Notice Unread",
       
    ],
    datasets: [
        {
            data: [300, 50],
            backgroundColor: [
                "rgba(75,192,192,1)", 
                "slategrey"
                
            ],
            hoverBackgroundColor: [
                "#36A2EB",
                "gray"
            ]
        }]
};
var ctx = document.getElementById("myChart");
var myChart = new Chart(ctx, {
    type: 'line',
    data: data1, 
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero:true
                }
            }]
        }
    }
   
});
var cty = document.getElementById("myChart3");    
var myPieChart = new Chart(cty,{
    type: 'doughnut',
    data: data,
    
});
