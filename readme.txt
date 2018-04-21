***********************************************************************************
************                Readme Instructions                           ************
***********************************************************************************
Overview:

	There are three Project folder in this Assignment 3:
		- 1 KennyWesleyManoel_Assignment3_EAR
		- 2 KennyWesleyManoel_Assignment3_JPA
		- 3 KennyWesleyManoel_COMP303_Assignment3_WAR
Set up:
	This project connects with the database MySQL using JNDI
		-> set up the WildFly Configuration->Subsystems->Datasources->Non-XA
		-> make sure to set up the JPA on the 'KennyWesleyManoel_Assignment3_JPA' project with the right connection on the Properties->JPA 
		-> set up the persintence.xml with the correct No-JTA data source tag <non-jta-data-source>

Run:
	To run, go to the 'KennyWesleyManoel_Assignment3_EAR' and run it. 