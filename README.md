# SpringBootExample

The project is simple. Be careful with the persistence layer to extend the project.

I will go completing...

## MySQL config:


    If you have a local or remote version of MySQL already configured, you will only have to change the 
    application.yml and adapt it to your connection.

We're going to use a Docker container.

Get the image:
<code>docker pull mysql</code>

Create a container and start it:

<code>docker run -i -t -p 3306:3306 --name {NAME} -e MYSQL_ROOT_PASSWORD={PASSWORD} -d {IMAGE:VERSION}</code>

    {NAME}: Container name.
    {PASSWORD}: Password to root user.
    {IMAGE:VERSION}: Name of our image and its version.

Example:

    docker run -i -t -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=pass -d mysql:5.5
    
    
Enter the container: 

<code>docker exec -i -t {CONTAINER-NAME} {COMMAND} -u {USER} -p</code>

    {CONTAINER-NAME}: :)
    {COMMAND}: Command to execute.
    {USER}: User, necessary to open MySQL console.

Example: 

    docker exec -i -t mysql5 mysql -u root -p
    
Enter the key you defined in the creation of the container.


# By:

[![alt text](https://github.com/Milfist/Docs/blob/master/milfist.JPG)][0]

[0]: https://www.hackerrank.com/MilfisT

