<%-- 
    Document   : heartattack
    Created on : Feb 5, 2016, 3:54:51 PM
    Author     : zaru
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Heart-attack detection meter</title>
		<meta name="description" content="chart created using amCharts live editor" />

		<!-- amCharts custom font -->
		<link href='http://fonts.googleapis.com/css?family=Covered+By+Your+Grace' rel='stylesheet' type='text/css'>

		<!-- amCharts javascript sources -->
		<script type="text/javascript" src="http://www.amcharts.com/lib/3/amcharts.js"></script>
		<script type="text/javascript" src="http://cdn.amcharts.com/lib/3/gauge.js"></script>
		<script type="text/javascript" src="http://www.amcharts.com/lib/3/themes/chalk.js"></script>

		<!-- amCharts javascript code -->
		<script type="text/javascript">
			AmCharts.makeChart("chartdiv",
				{
					"type": "gauge",
					"clockWiseOnly": true,
					"faceBorderColor": "#FF8000",
					"faceBorderWidth": 0,
					"gaugeX": 409,
					"gaugeY": 174,
					"marginTop": 40,
					"minRadius": 29,
					"startDuration": 6,
					"startEffect": "bounce",
					"autoDisplay": true,
					"classNamePrefix": "CC",
					"color": "#F9F900",
					"handDrawScatter": 1,
					"handDrawThickness": 3,
					"path": "CC/",
					"theme": "chalk",
					"arrows": [
						{
							"alpha": 0,
							"axis": "GaugeAxis-1",
							"color": "#FFFF00",
							"id": "GaugeArrow-1",
							"innerRadius": 21,
							"radius": "88%",
							"startWidth": 30,
							"value": 54
						}
					],
					"axes": [
						{
							"axisThickness": 1,
							"bottomText": "54 %",
							"bottomTextYOffset": -20,
							"endValue": 100,
							"id": "GaugeAxis-1",
							"valueInterval": 10,
							"bands": [
								{
									"alpha": 0.7,
									"color": "#00CC00",
									"endValue": 30,
									"id": "GaugeBand-1",
									"startValue": 0
								},
								{
									"alpha": 0.7,
									"color": "#F9F900",
									"endValue": 70,
									"id": "GaugeBand-2",
									"startValue": 31
								},
								{
									"alpha": 0.7,
									"color": "#ea3838",
									"endValue": 100,
									"id": "GaugeBand-3",
									"innerRadius": "95%",
									"startValue": 71
								},
								{
									"id": "GaugeBand-4"
								}
							]
						}
					],
					"allLabels": [
						{
							"align": "center",
							"alpha": 0.9,
							"bold": true,
							"color": "#FF8000",
							"id": "Label-1",
							"size": 20,
							"text": "HEart-Attack Meter"
						}
					],
					"balloon": {
						"animationDuration": 0.66,
						"color": "#FF8000",
						"fadeOutDuration": 0.76
					},
					"titles": []
				}
			);
		</script>
	</head>
	<body>
		<div id="chartdiv" style="width: 100%; height: 400px; background-color: #282828;" ></div>
	</body>
</html>