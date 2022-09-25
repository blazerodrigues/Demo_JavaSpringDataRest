# Spring-Data-Rest DEMO

Spring Data Rest is used for quickly developing REST APIs using Java Spring Boot. <br/>
It automatically exposes REST API endpoints for our Entity. <br/>
We can skip creating the REST Controller and Service implementation classes using Spring Data Rest, thus reducing boilerplate code and reducing development time. <br/>
<br/>
Steps: (Using 'Employee' for demo purpose)<br/>
1. Create 'Employee' entity.<br/>
2. Create JPA repository for Employee entity.<br/>
3. Add Spring Data Rest dependency to the project<br/>
<br/>
Spring Data Rest will automatically PRODUCE the below REST API endpoints for us.<br/>
<img width="326" alt="image" src="https://user-images.githubusercontent.com/96373227/192149595-8348ea84-3eb9-41b6-9ffd-d017a4e8f1c7.png"><br/>

Create a new Employee<br/>
<img width="960" alt="image" src="https://user-images.githubusercontent.com/96373227/192149899-5469c5ae-6eff-43f6-8027-e7634e420544.png">
<br/>
Read a list of Employees<br/>
<img width="960" alt="image" src="https://user-images.githubusercontent.com/96373227/192149922-ae1a2cba-1aaf-4211-a255-e728dd6b6c9a.png">
<br/>
Read a single Employee<br/>
<img width="959" alt="image" src="https://user-images.githubusercontent.com/96373227/192149938-5de246bf-4c11-4df2-aa2b-43516d1aafa3.png">
<br/>
Update an existing Employee<br/>
<img width="960" alt="image" src="https://user-images.githubusercontent.com/96373227/192150013-205c0575-48fa-492d-82fa-11cde1da5baa.png">
<br/>
Delete an existing Employee<br/>
<img width="960" alt="image" src="https://user-images.githubusercontent.com/96373227/192150055-8217197e-9d61-4eab-9ac2-e3375a0641d1.png">
<br/>
Final database screenshot<br/>
<img width="960" alt="image" src="https://user-images.githubusercontent.com/96373227/192150075-170892ed-9edc-4552-9ccf-b6b021fddf77.png">
<br/>
