# AUV_Control
Android app to control custom built AUV

BRIEF OVERVIEW OF THE APP

Display Page:
Contents:
	•	Background wallpaper
	•	List of cards depicting the model of the AUV
	•	The card link to a pdf explaining the model in detail

Navigation Page:
Contents:
	•	Button: AutoPilot switch (ON/OFF)
	•	TextView: AutoPilot Status
	•	Navigation Controller with Joystick
	•	TextView: Joystick angle and strength

IMU Control Page:
Contents:
	•	TextView: Name and Part Number for R Pi database
	•	Button: Send to database the values to be stored

Settings Page:
Contents:
	•	Label: KillSwitch
	•	Button: Kill the AUV and shut down

Exit Menu:
Exit the app


USE

This application is used to control the Autonomous Underwater Vehicle (AUV). 

	•	The user can understand the working of the model by clicking on the cards and viewing the PDF
	•	The drawbar menu helps in navigating to different pages
	•	The navigation page helps in moving the AUV around with joystick or switching to autopilot
	•	The IMU control helps in controlling the gyro and accelerometer along with the depth sensors by accessing a remote database and updating the values
	•	The Settings page acts as a fail safe by providing a kill button to prevent any untoward incident by shutting the AUV down completely
	•	The Exit menu exits the app
